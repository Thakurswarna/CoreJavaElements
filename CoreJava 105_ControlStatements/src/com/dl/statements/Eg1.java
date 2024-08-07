package com.dl.statements;

import java.util.Scanner;

//Types of Statements
//1.Selection Statements(if, else, else-if, switch), 
//2.Iteration Statements(for, while, do-while), 
//3.Transfer Statements(break and continue)


public class Eg1 {
public static void main(String[] args) {
	
	//passing the boolean default value as condition
	if(true) {
		System.out.println("If condition is true");
	}
	
	if(true) {
		System.out.println("If condition 2");
	}else {
		System.out.println("else block 3");
	}
	
	//validating the some conditions
	int a=10;
	int b=20;
	if(a<b) {System.out.println("If condition 4");
}else {
	System.out.println("else block 4");
}
	
	if(a>b) {
		System.out.println("If condition 5");
	}else {System.out.println("else block 5");
}
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of a");
	System.out.println("Enter the value of b");
	int var_a=scan.nextInt();
	int var_b=scan.nextInt();
	
	if(var_a>var_b) {
		System.out.println("If condition 6");
	}else {System.out.println("else block 6");}
	scan.close();
	
	String UserName="Sai";
	String UserPassword="admin123";
	
	if(UserName=="Sai" && UserPassword=="admin123") {
		System.out.println("Login Success");
	}else {
		System.out.println("Login failure");
	}
	
	}}
