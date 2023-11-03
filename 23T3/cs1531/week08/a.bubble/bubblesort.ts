function bubblesort(array: any[]) {
  for (let i = 0; i < array.length - 1; i++) {
    for (let j = 0; j < array.length - i - 1; j++) {
      if (array[j].age > array[j + 1].age) {
        // current person older than next person, swap them!
        const temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
      } else if (array[j].age === array[j + 1].age) {
        if (array[j].name.localeCompare(array[j + 1].name) > 0) {
          // equal age, but swap since we are sorting by lexiographical
          const temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
  return array;
}

interface Person {
  name: string;
  age: number;
}

const people: Person[] = [
  { name: 'Miyoung', age: 8 },
  { name: 'Danny', age: 7 },
  { name: 'Bill', age: 7 },
  { name: 'Aaron', age: 7 },
  { name: 'Miyoung', age: 20 },
  { name: 'Jack', age: 20 },
  { name: 'Cherrie', age: 7 },
  { name: 'Iktimal', age: 19 },
];

console.log(bubblesort(people));
