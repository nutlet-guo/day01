package com.programmer.Day02;

import java.util.Scanner;

/**
 * ������
 * @author JKMaster
 *
 */
public class Calendar {
    public static void main(String[] args) {
    	//1.
		 System.out.println("��������:");
		 Scanner input = new Scanner(System.in);
		 int year = input.nextInt();
		 System.out.println("��������:");
		 int month = input.nextInt();
		 //6.
		 int totalYear = getFormYearTo1900TotalDays(year);
		 int totalMonth = getNowYearToDays(year, month);
		 
		 int week = (totalMonth+totalYear+1)%7;
         //��װһ������  ����������и�ʽ���
		 FormatCalendar(year, month, week);
	}
    /**
     * ��ʽ������
     * @param year  �������
     * @param month ������·�
     * @param week ���������
     */
    public static void FormatCalendar(int year,int month,int week) {
    	 //���ִ�ӡ�����Ƿ�7����
    	int cut = 0; //ͳ�Ƽ���
    	System.out.println("������\t\t����һ\t\t"
    			+ "���ڶ�\t\t������\t\t������"
    			+ "\t\t������\t\t������");
    	//0 - 6֮�� //��ӡ����
    	for(int i = 1 ; i<=6;i++) {
    		System.out.print("\t\t");
    		//ͳ�Ƽ���
    		cut++;
    	}
    	//��ӡ��������
    	for(int i = 1;i<=getNowMonthDays(year, month);i++) {
    		 //��ӡֵ
    		 System.out.print(i+"\t\t");
    		 cut++;
    		 if(cut % 7 == 0) {
    			 System.out.println();
    		 }
    	}
    }
    
    
    
    
    
    
    //��̬����
    /**
     * �ж�����
     * @param year ���
     * @return true ������ false ����
     */
    public static boolean isLeapYear(int year) {
//    	if((year%4==0 && year%100!=0)||(year%400==0)) {
//    		return true;
//    	}else {
//    		return false;
//    	}
    	return (year%4==0 && year%100!=0)||(year%400==0);
    	
    }
    /**
     * ͨ���·ݻ�ȡ��Ӧ������
     * @param year  ��Ӧ�����
     * @param month ��Ӧ���·�
     * @return  �·ݶ�Ӧ������
     */
	public static int getNowMonthDays(int year, int month) {
		switch (month) {
		case 2:
			return isLeapYear(year) ? 29 : 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}

	}
	/**
	 * ����ݾ���1900���������
	 * @param year ��ǰ���
	 * @return ������(��)
	 */
	public static int getFormYearTo1900TotalDays(int year) {
		  //��һ��������������������
		  int sum  = 0;
		  for(int i = 1900; i<year;i++) {
			  // isLeapYear(year);//ʼ����ͬһ�����
			   sum += isLeapYear(i) ? 366 : 365;
		  }
		  return sum;
	}
	/**
	 * ��ǰ�·ݾ���1��1�յ�������
	 * @param year ��ǰ���
	 * @param month ��ǰ�·�
	 * @return  ������(��)
	 */
	public static int getNowYearToDays(int year,int month) {
		 //��һ��������������������
		  int sum  = 0;
		  for(int i = 1; i<month;i++) {
			 sum += getNowMonthDays(year, i);
		  }
		  return sum;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
