package in.co.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Addition {

	//Addition
		@Test
		void testAddTwoPositives() {
			Maths math=new Maths();
			int ans=math.add(2,3);
			Assert.assertEquals(5,ans);
		}

		@Test
		void testAddTwoNegatives() {
			Maths math=new Maths();
			int ans=math.add(-2,-2);
			Assert.assertEquals(-4,ans);
		}
		@Test
		void testAddOnePositiveAndOneNegative() {
			Maths math=new Maths();
			int ans=math.add(2,-3);
			Assert.assertEquals(-1,ans);
		}
		@Test
		void testAddTwoZeros() {
			Maths math=new Maths();
			int ans=math.add(0,0);
			Assert.assertEquals(0,ans);
		}
}
