package com.Person;
/*
 * Always remember to send the class to the condition
 * not the particular field if you do so you might get a type mismatch exception
 * if you want to sent a primitive the write your lambda accordingly.
 */
public interface Condition {
public boolean test ( Person p);
//public boolean test ( int p);
}
