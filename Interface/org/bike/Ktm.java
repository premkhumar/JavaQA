package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {

		System.out.println("Cost: $1,80,000");
	}
	@Override
	public void speed() {

		System.out.println("Speed: 90kmph ");
		
	}
	public static void main(String[] args) {
		
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}

}
