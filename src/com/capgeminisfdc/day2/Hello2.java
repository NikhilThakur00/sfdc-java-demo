package com.capgeminisfdc.day2;

import java.util.Scanner;

public class Hello2 {
	public double Areasqr (double len, double brth) 
	{ double A= len*brth;
			return A ;
	}
	public double Areacircle (double rad) 
	{  double pi=3.14;
			double AC=pi*rad*rad ;
			return AC;
	}
	
	
    public static void main(String[] args) 
	{   Scanner cs= new Scanner(System.in);
    	System.out.println("you want to find the area of Circle Type'Circle' "
			+ "and if you want to find the area of Square the Type 'Square'");
	    
	}
}
