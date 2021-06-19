package com.java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import com.collection.arraylist.Student;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (x)->System.out.println(3*x);
        fobj.abstractFun(5);
        
        ArrayList<Student> arraylist = new ArrayList<Student>();
		   Student s1 = new Student(223, "Mayur", 26);
		   Student s2 = new Student(245, "Nikhil", 24);
		   Student s3 = new Student(209, "Nilesh", 32);
		   
		   
		   arraylist.add(s1);
		   arraylist.add(s2);
		   arraylist.add(s3);
		   
		   arraylist.forEach(s->{
			   System.out.println("Name :"+s.getStudentname());
			   System.out.println("Roll no :"+s.getRollno());
			   System.out.println("Roll no :"+(s.getStudentage()+5-4-1));
			   System.out.println("-----------------");
		   });
		   
	}

}
