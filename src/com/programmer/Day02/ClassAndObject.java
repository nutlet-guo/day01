package com.programmer.Day02;

public class ClassAndObject extends Object{
	
	
       private String name;
       private int age;
       
      public String getName() {
    	  return name;
      }
     
      public void setName(String name) {
    	  this.name = name;
      }
      
       //this�ؼ�����������
       public ClassAndObject() {
    	   
       } //�޲���ʽ
       public ClassAndObject(String name,int age) {
         
          this.name = name;//has no effect ������
          this.age = age;
         
       }
       
       
   
       public void showInfos() { 
    	   System.out.println(this.name);
    	  
    	   System.out.println(age);
       }
       
       
}








