package com.programmer.Day02;

import java.util.ArrayList;


public class AbstractClass {
    public static void main(String[] args) {
		  ArrayList<String> list = new ArrayList<>();
		  list.add("1");
		  list.add("2");
		  list.add("3");
		  list.add("4");
		  list.add("5");
		  for(String str : list) {
			  System.out.println(str);
		  }
		  //研究 函数式编程
		  list.forEach(a->System.out.println(a));
		  list.forEach(System.out::println);
		  list.sort((a1,a2)->a1.compareTo(a2));
	}
}

abstract class Student{
   
	abstract void sleep();
 }

 class MiddleStudent extends Student{

	void sleep() {
	
	}

 }
