package inheritance;

//This concept is called Inheritance, Here child class is extending parent that means we can directly create an object with child class reference and we can call parent methods 
public class Child extends Parent {

	public static void main(String[] args) {
        //This object can call only parent methods
		//Parent obj = new Parent();
		
		//This object can call all the methods included parent and child because used the inheritance in the child class
		//Child obj = new Child();
		
		//This object can call only parent methods and here reference is all matters and parent is reference
		Parent obj = new Child();
		
			
		//This object cannot be created becuase child class object cannot be referenced by parent
		//Child obj = new Parent();
		
		obj.add();
	    obj.sub();
		//obj.mul();
		//obj.div();
		
	}
public void mul() {
		
		System.out.println("Child multiplication");
	}
public void div() {
	
	System.out.println("Child division");
}
}
