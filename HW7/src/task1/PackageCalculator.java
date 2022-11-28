package task1;

public class PackageCalculator implements Visitor{

	public void visitGlass(Glass g) {
		System.out.println(g.getName()+ ": \n >should be wrapped with Bubble warps and paked in a box with dimension: " 
				+ (g.getLength()+1) +"x"+ (g.getWidth()+1) +"x"+ (g.getHeight()+1));
	}
	
	public void visitFurniture(Furniture f) {
		System.out.println(f.getName()+ ": \n >should be covered with waterproff covers with area of: " 
				+ f.getLength() +"x"+ f.getWidth());
	}
	
	public void visitElectronic(Electronic e){
		System.out.println(e.getName()+ ": \n >should be covered with Polyethylene foam film and paked in a box with dimension: " 
				+ (e.getLength()+1) +"x"+ (e.getWidth()+1) +"x"+ (e.getHeight()+1));
	}
	
	public void calculatePackage(HouseholdItem h) {
		h.accept(this);
	}
}
