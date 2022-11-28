package task1;

public class CostCalculator implements Visitor {
	
	public void visitGlass(Glass g) {
		String name = g.getName();
		double cost = 0;
		if(g.getThickness() == 1) {
			cost = 2*((double) g.getLength()/100);
		} else if(g.getThickness() == 2) {
			cost = 1.2*((double)g.getLength()/100);
		} else if(g.getThickness() == 3) {
			cost = 0.7*((double)g.getLength()/100);
		} 
		printCost(name, cost);
	}
	
	public void visitFurniture (Furniture f) {
		String name = f.getName();
		double cost = 5*((double)f.getWeight()/20);
		printCost(name, cost);
	}
	
	public void visitElectronic(Electronic e) {
		String name = e.getName();
		double cost = 0;
		if(e.getFragile()) {
			cost = 5*((double)e.getWeight()/10);
		}else {
			cost = 5*((double)e.getWeight()/15);
		}
		printCost(name, cost);
	}
	
	public void calculateCost(HouseholdItem h) {
		h.accept(this);
	}
	
	public void printCost(String name, double cost) {
		System.out.println("Total Cost for " + name + " is " + cost + " Euros ");
	}
}
