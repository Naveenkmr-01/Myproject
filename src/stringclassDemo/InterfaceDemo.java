package stringclassDemo;

public interface InterfaceDemo {
	
	public void add();
	public void sub();
	public void mul();
	
		
}



class calc implements InterfaceDemo{
	

	@Override
	public void add() {
		System.out.println("This is add");
		
	}

	@Override
	public void sub() {
	
		System.out.println("This is sub");
		
	}

	@Override
	public void mul() {
		System.out.println("This is mul");
		
	}
	
}


	
	class clac2 {
		
		public static void main(String[] args) {
		
		InterfaceDemo object = new calc();
		
		object.add();
		
	}}


