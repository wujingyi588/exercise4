package exercise4;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+CircleWithStaticMembers.numberOfObjects);
		
		CircleWithStaticMembers c1=new CircleWithStaticMembers();
		
		System.out.println("After creating c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+
		  CircleWithStaticMembers.numberOfObjects+")");
		
		CircleWithStaticMembers c2=new CircleWithStaticMembers(5);
		
		c1.radius=9;
		
		System.out.println("After creating c2 and modifying c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+
				  CircleWithStaticMembers.numberOfObjects+")");
		System.out.println("c2: radius ("+c2.radius+") and number of Circle objects ("+
				  CircleWithStaticMembers.numberOfObjects+")");
	}

}
