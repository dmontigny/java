/* #############################################################################
 * @Filename        : mod020202_array_length.js
 * @Created         : Sat 2026-06-27 08:06:58-0400
 * @Modified        :
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Description     : 
 * ###########################################################################*/

"use strict";

let names = ["Olivia", "Emma", "Mateo", "Samuel"];
console.log(names.length);

names[5] = "Amelia";
console.log(names.length); // -> 6
    
console.log(names);
console.log(names[3]); // -> Samuel
console.log(names[4]); // -> undefined
console.log(names[5]); // -> Amelia
console.log("");



