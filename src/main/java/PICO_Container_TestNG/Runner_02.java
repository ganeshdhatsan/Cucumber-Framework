package PICO_Container_TestNG;

import org.testng.annotations.Test;

public class Runner_02 {
	
	private POM x;

	public Runner_02(POM ref) {
		 x = ref;
	}


	@Test
	private void S1() {
		x.add(5, 2);
		System.out.println(x.getResult());
	}
	
	@Test
	private void S2() {
		int ans1 = x.getResult();
		
		System.out.println("ans 1 --> "+ans1);

	}


}
