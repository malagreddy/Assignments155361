package in.co.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.Assert;

 class Division {

	@Test
	void testDivTwoPositives() {
		Maths math=new Maths();
		int ans=math.div(12,3);
		Assert.assertEquals(4,ans);
	}

	@Test
	void testDivTwoNegatives() {
		Maths math=new Maths();
		int ans=math.div(-2,-2);
		Assert.assertEquals(1,ans);
	}
	@Test
	void testDivOnePositiveAndOneNegative() {
		Maths math=new Maths();
		int ans=math.div(10,-2);
		Assert.assertEquals(-5,ans);
	}
	@Test
	void testDivOneNegativeAndOnePositive() {
		Maths math=new Maths();
		int ans=math.div(-20,4);
		Assert.assertEquals(-5,ans);
	}
	@Test(expected=java.lang.ArithmeticException.class)
	void testDivTwoZeros() {
		Maths math=new Maths();
		int ans=math.div(3,0);
	}

}
