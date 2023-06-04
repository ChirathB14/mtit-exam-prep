package com.Lambda.MultiInheritance;

interface ITestTable1{
	public default void readAnn() {
		System.out.println("Read anno 1");
	}
}

interface ITestTable2{
	public default void readAnn() {
		System.out.println("Read anno 2");
	}
}

public class Annotate implements ITestTable1, ITestTable2 {
	public static void main(String[] args) {
		Annotate diff = new Annotate();
		diff.readAnn();
	}
	
	@Override
	public void readAnn() {
		ITestTable1.super.readAnn();
		ITestTable2.super.readAnn();
	}
}
