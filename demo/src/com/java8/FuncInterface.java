package com.java8;

//Java program to demonstrate lambda expressions
//to implement a user defined functional interface.

//A sample functional interface (An interface with
//single abstract method
public interface FuncInterface {
	// An abstract function
    void abstractFun(int x);
  
    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
}
