import request from 'sync-request-curl';
import { port, url } from './config.json';

const SERVER_URL = `${url}:${port}`;

/**
 * Use the imported `request` library to send a request to the server and retrieve a response
 * Documentation:
 * - GitHub: https://github.com/nktnet1/sync-request-curl
 * - NPM: https://www.npmjs.com/package/sync-request-curl
 */

beforeEach(() => {
  request('DELETE', SERVER_URL + '/clear', { json: {} });
});

// TODO: add tests
