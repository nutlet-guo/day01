package com.programmer.Day02;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class MethodDemo2 extends Object{
    public static void main(String[] args) {
		 int a = 1;
		 int b = 2;
	
		 
		 System.out.println("------------------------------�����ķָ���------------------------");
		 //���÷���
		 swap(a,b);
		 System.out.println("swap�������ú󽻻��Ľ��:");
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 
		 int[] arr = new int[10]; 
		 
		 show(arr);
		 
		 
		 System.out.println(arr);
		
		 Object[] arr1 = new Object[10];
		
		 arr1[0] = 1;
		 arr1[1] = "�׺�";
		 
		
	}
    
    public static void swap(int a, int b) {
    	 int tmp = a;
    	 a = b;
    	 b = tmp;
    	 System.out.println("�����е�a��b");
    	 System.out.println("a="+a);
    	 System.out.println("b="+b);
    }
    
    public static void show(int[] arr) {
    	
    }
    
    
    
    
    
    
    
    
}
