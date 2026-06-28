/* #############################################################################
 * @Filename        : mod020203_objects_practice.js
 * @Created         : Sat 2026-06-27 20:35:03-0400
 * @Modified        :
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Description     : 
 * ###########################################################################*/

"use strict";

// Question 1: Create an object that describes a train ticket and store it in
//  the ticket variable. The object must have three fields:
//    starting station (key name from, give the name of the nearest station in
//      your area as a value);
//    end station (key name to, give any other station within 100km as a value);
//    the price of the ticket (key name price, give the amount you would like
//      to pay for this ticket as a value).
// The object must be created using curly brackets, in which all created fields
//  will be listed immediately. Then display the values of all fields of the
//  ticket on the console.
let ticket = {
  from: "Mebane",
  to: "CHarlotte",
  price: 75.00
}

console.log(ticket.from);
console.log(ticket.to);
console.log(ticket.price);
console.log("");

// Question 2: Declare an empty object and save it to a person variable. Using
//  dot notation, add the name and surname fields to the object by entering your
//  data as values. Try to display the individual fields on the console.

let person = {};

person.name = "dave";
person.surname = "montigny";

console.log(person.name);
console.log(person.surname);
console.log("");

// Question 3: We are setting up our small library of books about JavaScript
//   programming. We have three books and want to prepare a list of them. We
//   will store three pieces information about each book: title, author, and
//   number of pages:
//
//    Speaking JavaScript, Axel Rauschmayer, 460;
//    Programming JavaScript Applications, Eric Elliott, 254;
//    Understanding ECMAScript 6, Nicholas C. Zakas, 352.
//
// Create an array of three objects representing the books. Each object must
//  have the following properties: title, author, pages.

let library = [
  {
    title: "Speaking JavaScript",
    author: "Axel Rauschmayer",
    pages: 460
  },
  {
    title: "Programming JavaaScript Applications",
    author: "Eric Elliott",
    pages: 254
  },
  {
    title: "Understanding ECMAScript 6",
    author: "Nicolas C. Zakas",
    pages: 352
  }
]

console.log(library[0].title);
console.log(library[1].author);
console.log(library[2].pages);
console.log("");

// Question 4: Add a new book to the collection: Learning JavaScript Design
//  Patterns, by Addy Osmani, 254 pages. Use the appropriate method to do this,
//  which will attach the book at the end of the array. Display the length of
//  the array and, in turn, all the book names in the collection.
library.push(
  {
    title: "Learning JavaScript Design Patterns",
    author: "Andy Osmani",
    pages: 254
  }
)

console.log(library.length);
console.log(library[0].title);
console.log(library[1].title);
console.log(library[2].title);
console.log(library[3].title);
console.log("");

// Question 5: Use the slice command to copy the last two books to the
//  new array.
let new_arr = library.slice(-2);

console.log(new_arr);
console.log("");

// Question 6: The first book from the collection is lost in unexplained
//  circumstances. You have already accepted the loss, so remove it from the
//  array. Which method will you use for this purpose? Display the length of
//  the array and all the names of the books from the collection in turn.

console.log(library.length);
library.shift();
console.log(library.length);
console.log("");

console.log(library[0].pages + library[1].pages + library[2].pages);
console.log("");





