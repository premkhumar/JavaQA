package org.test;

public class Desktop extends Computer{
	
	private void desktopSize() {

		String size="27\" inch";
		System.out.println(size);
		
	}
	
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
