/* #############################################################################
 * @Filename        : mod020201_complex_types.js
 * @Created         : Fri 2026-06-26 17:34:58-0400
 * @Modified        :
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Description     : 
 * ###########################################################################*/

"use strict";

let testObj1 = {};
let testObj2 = {
  nr: 600,
  str: "text"
};


console.log("testObj1: " + typeof testObj1);

console.log("testObj2: " + typeof testObj2);
console.log(testObj2.nr);
console.log(testObj2.str);
console.log("testObj2: " + testObj2);

let user1 = {
  name: "Calvin",
  surname: "Hart",
  age: 66,
  email: "CalvinMHart@teleworm.us"
};
   
let user2 = {
  name: "Mateus",
  surname: "Pinto",
  age: 21,
  email: "MateusPinto@dayrep.com"
};


console.log(user1.name);
console.log(user2.name);

