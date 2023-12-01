package cafeProject;

public class MenuManager {
//make array for 50 items

	private FoodItem[] menuFull = new FoodItem[50];
	private int i=0;
	
	public MenuManager() {
		
	}
	public void addFoodItem(FoodItem foodItem) {
		menuFull[i] = foodItem;
		i++;
		if(i>49) {
			System.out.print("Menu is Full");
		}
	}
	public void editFoodItem(String foodItem, FoodItem newItem) {
		for(int j = 0; j<i; ++j) {
			if(foodItem.equals(menuFull[j].returnName())){
				menuFull[j] = newItem;
			}
		}
	}
	public void removeFoodItem(String FoodItem) {
		for(int j = 0; j<i; ++j) {
			if(FoodItem.equals(menuFull[j].returnName())){
				menuFull[j] = null;
				for(int x = j; x<menuFull.length; ++x) {
					menuFull[x] = menuFull[x+1]; 
				}
			}
		}
	}
	public void displayMenu() {
		for(int x=0;x<menuFull.length;++x) {
			System.out.println(menuFull[x].returnName() + " - " + menuFull[x].returnDescription() + " - " + menuFull[x].returnPrice());
		}
	}
	
	
	
}
