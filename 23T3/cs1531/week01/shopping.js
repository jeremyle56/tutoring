const shoppingList = [
  { name: "Milk", cost: 3.99 },
  { name: "Butter", cost: 4.49 },
  { name: "Tuna", cost: 1.99 },
  { name: "Tomato", cost: 5.95 },
  { name: "TooHak", cost: 1530.99 },
];

for (let i = 0; i < shoppingList.length; i++) {
  console.log(shoppingList[i].cost);
}

for (const item of shoppingList) {
  console.log(item, item.name, item.cost);
}

for (const index in shoppingList) {
  console.log(index);
}
