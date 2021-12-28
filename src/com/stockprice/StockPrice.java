package com.stockprice;

import java.util.Scanner;

import com.driver.Driver;

public class StockPrice {
	Driver driver= new Driver();
	static double pricearr[];
	static double com_price;
	static boolean[] up;
	static Scanner s;
	public static int countup;
	public static int countdown;
	public static int pricedown(String[] args) {
		countdown=0;
		for (int i=0; i<Driver.num; i++) {
			if(up[i]==false) {
				countdown=countdown+1;
		}			
		 }
		return countdown;
	}
	public static int priceup(String[] args) {
		up= Driver.up;
		countup=0;
		for (int i=0; i<Driver.num; i++) {
			if(up[i]==true) {
				countup=countup+1;
		}
			
		 }
		return countup;
	}
	public static void isstock(String[] args) {
		s = new Scanner(System.in);
		com_price=s.nextDouble();
		pricearr= Driver.pricearr;
		for (int i=0; i<Driver.num; i++) {
			if(pricearr[i]==com_price) {
				System.out.println("Stock of value " +com_price+ " is present");
			}
			else {
				System.out.println("No match found");
				break;
			}
		}
	}
}
