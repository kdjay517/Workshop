package com.bridgelabz.demo;
import java.util.*;

public class Application {
	
	SweetStore sweetStore = new SweetStore();
	UserInterface userInterface = new UserInterface(); 

	public static void main(String[] args) {
		System.out.println("Welcome to Sweet Shop");
/*		
		Modak modak = new Modak();
		modak.price = 50;
		Kesari kesari = new Kesari();
		kesari.price = 74;
		MothichurLaddu mothichurLaddu = new MothichurLaddu();
		mothichurLaddu.price = 57;
		Jamun jamun = new Jamun();
		jamun.price = 55;
		
		SweetStore sweetStore = new SweetStore();
		sweetStore.add(jamun);
		sweetStore.add(kesari);
		sweetStore.add(modak);
		sweetStore.add(mothichurLaddu);
		
		
		UserInterface userInterface = new UserInterface(); //Constructor has the same has the class name
		
	userInterface.printAllSweets(sweetStore.getList());  */
		SweetStore sweetStore = new SweetStore();
		UserInterface userInterface = new UserInterface(); 
		int input = userInterface.showUserMenu();
		Application application = new Application();
		application.handleUserSelection(input);
		
	}
	public void handleUserSelection(int input) {
		switch(input) {
			case 1:
				Modak modak = new Modak();
				modak.price = 50;
				Kesari kesari = new Kesari();
				kesari.price = 74;
				MothichurLaddu mothichurLaddu = new MothichurLaddu();
				mothichurLaddu.price = 57;
				Jamun jamun = new Jamun();
				jamun.price = 55;
				
				SweetStore sweetStore = new SweetStore();
				sweetStore.add(jamun);
				sweetStore.add(kesari);
				sweetStore.add(modak);
				sweetStore.add(mothichurLaddu);
				break;
			case 2:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Sweet Name to Delete:");
				String deleteSweet = sc.nextLine();
				SweetStore name = new SweetStore();
				name.getSweet(deleteSweet);
				break;
			case 3:
				UserInterface userInterface = new UserInterface(); 
				userInterface.printAllSweets(sweetStore.getList());
			
		}
	}

}
