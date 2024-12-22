package PICO_Container_TestNG;

import org.testng.annotations.Test;

public class Runner_01 {

	private POM y;
	
	public Runner_01() {
		y = new POM();
	}
	
	@Test
	private void R1() {
		y.add(5, 2);
		System.out.println(y.getResult());
	}
	
	@Test
	private void R2() {
		int ans1 = y.getResult();
		
		System.out.println("ans 1 --> "+ans1);

	}
	


}
