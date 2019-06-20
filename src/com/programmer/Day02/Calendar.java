package com.programmer.Day02;

import java.util.Scanner;

/**
 * 万年历
 * @author JKMaster
 *
 */
public class Calendar {
    public static void main(String[] args) {
    	//1.
		 System.out.println("请输入年:");
		 Scanner input = new Scanner(System.in);
		 int year = input.nextInt();
		 System.out.println("请输入月:");
		 int month = input.nextInt();
		 //6.
		 int totalYear = getFormYearTo1900TotalDays(year);
		 int totalMonth = getNowYearToDays(year, month);
		 
		 int week = (totalMonth+totalYear+1)%7;
         //封装一个方法  这个方法进行格式输出
		 FormatCalendar(year, month, week);
	}
    /**
     * 格式化日历
     * @param year  输入的年
     * @param month 输入的月份
     * @param week 输入的星期
     */
    public static void FormatCalendar(int year,int month,int week) {
    	 //发现打印规律是逢7换行
    	int cut = 0; //统计计数
    	System.out.println("星期日\t\t星期一\t\t"
    			+ "星期二\t\t星期三\t\t星期四"
    			+ "\t\t星期五\t\t星期六");
    	//0 - 6之间 //打印星期
    	for(int i = 1 ; i<=6;i++) {
    		System.out.print("\t\t");
    		//统计计数
    		cut++;
    	}
    	//打印日历天数
    	for(int i = 1;i<=getNowMonthDays(year, month);i++) {
    		 //打印值
    		 System.out.print(i+"\t\t");
    		 cut++;
    		 if(cut % 7 == 0) {
    			 System.out.println();
    		 }
    	}
    }
    
    
    
    
    
    
    //静态方法
    /**
     * 判断闰年
     * @param year 年份
     * @return true 是闰年 false 不是
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
     * 通过月份获取对应的天数
     * @param year  对应的年份
     * @param month 对应的月份
     * @return  月份对应的天数
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
	 * 当年份距离1900年的总天数
	 * @param year 当前年份
	 * @return 总天数(年)
	 */
	public static int getFormYearTo1900TotalDays(int year) {
		  //定一个变量用来计算总天数
		  int sum  = 0;
		  for(int i = 1900; i<year;i++) {
			  // isLeapYear(year);//始终是同一个年份
			   sum += isLeapYear(i) ? 366 : 365;
		  }
		  return sum;
	}
	/**
	 * 当前月份距离1月1日的总天数
	 * @param year 当前年份
	 * @param month 当前月份
	 * @return  总天数(月)
	 */
	public static int getNowYearToDays(int year,int month) {
		 //定一个变量用来计算总天数
		  int sum  = 0;
		  for(int i = 1; i<month;i++) {
			 sum += getNowMonthDays(year, i);
		  }
		  return sum;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
