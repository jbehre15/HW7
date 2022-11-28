package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client{
	
public static void main(String[] args) {
		

		//Initialize some household
		List<HouseholdItem> householdItems= new ArrayList<>();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true);
		
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);

		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);
		
		CostCalculator c = new CostCalculator();
		PackageCalculator p = new PackageCalculator();
		
		
        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItems.addAll(namesList);
        
        
        for(int i=0; i< householdItems.size(); i++) {
        	c.calculateCost(householdItems.get(i));
        }
        for(int i=0; i< householdItems.size(); i++) {
        	p.calculatePackage(householdItems.get(i));
        }
  
}

}
