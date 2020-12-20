package org.override;

public class AxisBank extends Rbi {
	
	@Override
	public void savings() {
		float repo = 7.2f;
		System.out.println(repo);
	}
	@Override
	public void deposit() {

		System.out.println("10%");
		super.deposit();//Super is used to call parent property
	}
	
	
	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.savings();
		a.deposit();
	}

}
