package com.seleco.main;

import java.util.Random;


public class AppIntArray {
public static void main(String[] args) {
	int[] intArray= {10,100,20,30,40,50,60,70,80,90};
	Random random=new Random();
	for(int i=0;i<intArray.length;i++) {
		int randomValue=random.nextInt(intArray.length-1);
		System.out.println(intArray[randomValue]);
		
	}
}
}
