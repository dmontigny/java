/* #############################################################################
 * @Filename        : mod020202_arrays.js
 * @Created         : Fri 2026-06-26 17:46:55-0400
 * @Modified        :
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Description     : 
 * ###########################################################################*/

"use strict";

let days = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

console.log(days[0]);
console.log(days[2]);
console.log(days[5]);
    
days[0] = "Sunday";
console.log(days[0]);
console.log("");

let emptyArray = [];

console.log(emptyArray[0]); // undefined
console.log("");

let animals = [];

console.log(animals[0]); // undefined
    
animals[0] = "dog";
animals[2] = "cat";
       
console.log(animals[0]);
console.log(animals[1]);  // undefined
console.log(animals[2]);
console.log("");

let names = [["Olivia", "Emma", "Mia", "Sofia"], ["William", "James", "Daniel"]];

console.log(names[0]);
console.log(names[0][1]);
console.log(names[1][1]);
console.log("");
   
let femaleNames = names[0];

console.log(femaleNames[0]);
console.log(femaleNames[2]);
console.log("");

let users =[
  {
    name: "Calvin",
    surname: "Hart",
    age: 66,
    email: "CalvinMHart@teleworm.us"
  },
  {
    name: "Mateus",
    surname: "Pinto",
    age: 21,
    email: "MateusPinto@dayrep.com"
  }
];
   
console.log(users[0].name);
console.log(users[1].age);
console.log("");

users[2] = {
      name: "Irene",
      surname: "Purnell",
      age: 32,
      email: "IreneHPurnell@rhyta.com"
}
   
console.log(users[0].name);
console.log(users[1].name);
console.log(users[2].name);
console.log("");

let days2 = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
let day = "Sunday";
   
console.log(typeof days2);
console.log(typeof day);
   
console.log(days2 instanceof Array);
console.log(day instanceof Array);




