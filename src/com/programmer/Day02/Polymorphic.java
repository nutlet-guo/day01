package com.programmer.Day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Polymorphic {
	//既可以接受ArrayList也可以接受LinkedList
    public static void show(List list) {
    	
    }
    public static void display() {
    	show(new ArrayList());
    	show(new LinkedList());
    }
}









