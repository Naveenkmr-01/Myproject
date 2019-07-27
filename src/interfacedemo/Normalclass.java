package interfacedemo;

import stringclassDemo.InterfaceDemo;

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