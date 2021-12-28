package com.driver;

import java.util.*;
import com.sort.Sort;
import com.stockprice.StockPrice; 


public class Driver {

	static Sort sort= new Sort();
	static StockPrice stockprice= new StockPrice();
	public static double[] pricearr;
	public static boolean[] up;
	static Scanner s;
	public static int num;
	static double[] dep;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no of companies");
		s = new Scanner(System.in);
		num = s.nextInt();
		pricearr=new double[num];
		up=new boolean[num];
		for (int i=0; i<num; i++) {
			System.out.println("Enter current stock price of the company "+ (i+1));
			pricearr[i]=s.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			up[i] = s.nextBoolean();
		};
		System.out.println(Arrays.toString(pricearr));  
		System.out.println(Arrays.toString(up));
		int option;
		do {

			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform.");
			System.out.println("1. Display the companies stock prices in ascending order.");
			System.out.println("2. Display the companies stock prices in descending order.");
			System.out.println("3. Display the total no of companies for which stock prices rose today.");
			System.out.println("4. Display the total no of companies for which stock prices declined today.");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			option = s.nextInt();
			
			switch (option) {

			case 0:
				option = 0;
				break;
				
			case 1: {
				System.out.println("Stock prices in ascending order are :");
				dep=sort.sortasc(args);

			}
			
			break;
			
			case 2: {
				System.out.println("Stock prices in descending order are :");
				dep=sort.sortdsc(args);
			}
			break;
			
			case 3: {
				System.out.println("Total no of companies whose stock price rose today : "+ stockprice.priceup(args));
			}
			break;
			
			case 4: {
				System.out.println("Total no of companies whose stock price declined today : "+ stockprice.pricedown(args));
			}
			break;
			
			case 5: {
				System.out.println("enter the key value ");
				stockprice.isstock(args);
				
			}
			break;
			
			default:
				System.out.println("enter valid option ");
			}

		} while (option != 0);
		System.out.println("Exited successfully ");
		s.close();
	}
		
}

