package cafeProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	MenuManager menu = new MenuManager();
	String response;
	Scanner scnr = new Scanner(System.in);
	FoodItem tempItem;
	String tempName;
	String tempDescription;
	int tempPrice;
	String editName;
	String removeName;
	
	
	
	
	System.out.println("Enter \"add\", \"edit\", \"remove\", \"display\", \"exit\" ");
	response = scnr.next();
	
	while(!response.equals("exit")) {
		switch(response) {
		
		case "add":
			System.out.println("Enter a food name");
			tempName = scnr.next();
			System.out.println("Enter a food description");
			tempDescription = scnr.next();
			System.out.println("Enter a price");
			tempPrice = scnr.nextInt();
			tempItem = new FoodItem(tempName, tempDescription, tempPrice);
			menu.addFoodItem(tempItem);
			
			break;
		
		case "edit":
			System.out.println("Enter the name of the item you would like to edit");
			editName = scnr.next();
			System.out.println("Enter a food name");
			tempName = scnr.next();
			System.out.println("Enter a food description");
			tempDescription = scnr.next();
			System.out.println("Enter a price");
			tempPrice = scnr.nextInt();
			tempItem = new FoodItem(tempName, tempDescription, tempPrice);
			menu.editFoodItem(editName, tempItem);
			break;
		
		case "remove":
			System.out.println("Enter a food items name to remove");
			removeName = scnr.next();
			menu.removeFoodItem(removeName);
			break;
		
		case "display":
			menu.displayMenu();
			
			break;

		
		
		
		}
		System.out.println("Enter \"add\", \"edit\", \"remove\", \"display\", \"exit\" ");
		response = scnr.next();
	}
	
	}

}
