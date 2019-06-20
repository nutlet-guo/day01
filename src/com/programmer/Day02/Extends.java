package com.programmer.Day02;

public class Extends {
     public static void main(String[] args) {
    	 //子类实例化过程
    	 //先创建父类对象,然后在创建子类对象
		SubClass sc = new SubClass();
	}
}

class SuperClass{
	int age;
   //父类是需要提供无参构造方法的
//	public SuperClass() {
//		System.out.println("父类的无参构造方法");
//	}
//若父类中不提供无参构造方法,但是提供了有参有参构造方法	
// 子类就需要显示调用父类的有参构造方法不然会报错	
	public SuperClass(int age) {
		this.age  = age;
	}
}

class SubClass extends SuperClass{
	 //子类是不能继承父类的构造方法
		//所以子类必须提供自己的构造方法
	public SubClass() {
		super(18);
		//默认调用父类的无参构造方法
		System.out.println("子类的无参构造方法");
		
	}
	
	
}







