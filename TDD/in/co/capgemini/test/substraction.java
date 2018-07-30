package in.co.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class substraction {

	//Subtraction
		@Test
		void testSubTwoPositives() {
			Maths math=new Maths();
			int ans=math.sub(2,3);
			Assert.assertEquals(-1,ans);
		}

		@Test
		void testSubTwoNegatives() {
			Maths math=new Maths();
			int ans=math.sub(-2,8);
			Assert.assertEquals(-10,ans);
		}
		@Test
		void testSubPositiveAndOneNegative() {
			Maths math=new Maths();
			int ans=math.sub(2,-3);
			Assert.assertEquals(5,ans);
		}
		@Test
		void testTwoZeros() {
			Maths math=new Maths();
			int ans=math.sub(0,0);
			Assert.assertEquals(0,ans);
		}

}
