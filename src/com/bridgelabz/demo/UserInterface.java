package com.bridgelabz.demo;
import java.util.*;

public class UserInterface {

	public void printAllSweets(List sweetList) {
		for (int i = 0; i < sweetList.size();i++) {
			System.out.println(sweetList.get(i));
		}
		
	}
	
	public int showUserMenu(){
		System.out.println("Enter \n1. Add Sweet \n2. Remove Sweet \n3."
				+ "Update Sweet \n4. Print Sweet \n5. Exit");
		Scanner sc = new Scanner(System.in) ;
		int input = sc.nextInt();
		return input;
	}
}