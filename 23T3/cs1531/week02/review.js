/*
1. What does it do?
 - Print out the average IQ
 - A string array of people who have an IQ over 120

2. What style could be improved here?

3. How can we modify the code to be less like 'C' and more 'Javascripty'?

*/
const IQ_SMART_THRESHOLD = 120;

let people = [
  {
    name: "Tammy",
    iq: -92,
  },
  {
    name: "Juliana",
    iq: 160,
  },
  {
    name: "Runy",
    iq: 128,
  },
];

let sumOfIQs = 0;
const smartPeople = [];
// smartPeople = [7,2,1,2,3];

for (const person of people) {
  sumOfIQs += person.iq;
  if (person.iq > IQ_SMART_THRESHOLD) {
    smartPeople.push(person.name);
  }
}

let average = Math.floor(sumOfIQs / people.length);
console.log(average);
console.log(smartPeople);
