/* #############################################################################
 * @Filename        : Employee.java
 * @Created         : Tue 2026-02-24 18:37:42-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Employee.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class Employee {
  private String lName;
  private String fName;
  private byte age;
  private char gender;

  // default
  public Employee() {
    this("TBD", "TBD", (byte)-1, 'u');
  } // Employee default
 
  public Employee(String lName, String fName, byte age, char gender) {
    this.lName = lName;
    this.fName = fName;
    this.age = age;
    this.gender = gender;
  } // Employee

  void set_lName(String lname) {
    lName = lname;
  }

  public void set_fName(String fname) {
    fName = fname;
  }

  void setAge(byte newAge) {
    age = newAge;
  }

  void setGender(char newGender) {
    gender = newGender;
  }

  String get_lName() {
    return lName;
  }

  String get_fName() {
    return fName;
  }

  public byte getAge() {
    return age;
  }

  public char getGender() {
    return gender;
  }
} // Employee

