package in.co.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Multiplication {
	
	//Multiplication
		@Test
		void testMulTwoPositives() {
			Maths math=new Maths();
			int ans=math.mul(2,3);
			Assert.assertEquals(6,ans);
		}

		@Test
		void testMulTwoNegatives() {
			Maths math=new Maths();
			int ans=math.mul(-2,-2);
			Assert.assertEquals(4,ans);
		}
		@Test
		void testMulOnePositiveAndOneNegative() {
			Maths math=new Maths();
			int ans=math.mul(2,-3);
			Assert.assertEquals(-6,ans);
		}
		@Test
		void testMulTwoZeros() {
			Maths math=new Maths();
			int ans=math.mul(0,0);
			Assert.assertEquals(0,ans);
		}
}
