package com.programmer.Day02;

public class Extends {
     public static void main(String[] args) {
    	 //����ʵ��������
    	 //�ȴ����������,Ȼ���ڴ����������
		SubClass sc = new SubClass();
	}
}

class SuperClass{
	int age;
   //��������Ҫ�ṩ�޲ι��췽����
//	public SuperClass() {
//		System.out.println("������޲ι��췽��");
//	}
//�������в��ṩ�޲ι��췽��,�����ṩ���в��вι��췽��	
// �������Ҫ��ʾ���ø�����вι��췽����Ȼ�ᱨ��	
	public SuperClass(int age) {
		this.age  = age;
	}
}

class SubClass extends SuperClass{
	 //�����ǲ��ܼ̳и���Ĺ��췽��
		//������������ṩ�Լ��Ĺ��췽��
	public SubClass() {
		super(18);
		//Ĭ�ϵ��ø�����޲ι��췽��
		System.out.println("������޲ι��췽��");
		
	}
	
	
}







