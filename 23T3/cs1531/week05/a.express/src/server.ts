import express, { json, Request, Response } from 'express';
import cors from 'cors';
import morgan from 'morgan';
import { port, url } from './config.json';
import {
  clear,
  peopleAdd,
  personView,
  personEdit,
  peopleList,
  personRemove,
  peopleStats,
} from './people';

const app = express();

// Use middleware that allows for access from other domains (needed for frontend to connect)
app.use(cors());
// Use middleware that allows us to access the JSON body of requests
app.use(json());
// Use middleware to log (print to terminal) incoming HTTP requests (OPTIONAL)
app.use(morgan('dev'));

app.get('/', (req: Request, res: Response) => {
  res.json({ message: 'Welcome to the root URL of names ages!' });
});

// TODO TUTOR 0: Clear
app.delete('/clear', (req: Request, res: Response) => {
  res.json(clear());
});

// TODO GROUP 1: Add a person
app.post('/people/add', (req: Request, res: Response) => {
  const { name, age } = req.body;
  const result = peopleAdd(name, age);
  if ('error' in result) {
    return res.status(400).json(result);
  }

  res.json(result);
});

// TODO GROUP 2: Read a person's details
app.get('/person/:personid', (req: Request, res: Response) => {
  const result = personView(parseInt(req.params.personid));
  if ('error' in result) {
    return res.status(400).json(result);
  }
  res.json(result);
});

// TODO GROUP 3: List all people
app.get('/people/list', (req: Request, res: Response) => {
  const result = peopleList(parseInt(req.query.minAge as string));
});

// TODO GROUP 4: Update a person

// TODO GROUP 5: Remove a person

// TODO GROUP 6: Get stats

app.listen(port, () => {
  console.log(
    `Express Server started and awaiting requests at the URL: '${url}:${port}'`
  );
});
