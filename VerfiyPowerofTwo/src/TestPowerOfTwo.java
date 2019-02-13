/* Test cases for Verifying Power of 2 for a given number
* It includes all possible test cases
* @Author Tanvir Hossain
* @Version v1.1, 5th Jan, 2018
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPowerOfTwo {
	verifyPowerofTwo input = new verifyPowerofTwo();
	
	
	//Test Valid Input
	@Test
	void testValidInput() {
		
		int validinput = 16;
		int knownpower = 4;
		
		String result = input.verifyPowerOf(validinput);
		String expected = "The input is a power of 2 and the power is " + knownpower ;
		
		assertEquals(result, expected);
		}
	
	//Test Invalid Input
	@Test
	void testInvalidInput() {
		int invalidinput = -1;
		
		String result = input.verifyPowerOf(invalidinput);
		String expected = "ERROR: Enter a non-zero, positive number" ;
		assertEquals(result, expected);
	}
	
	@Test
	void testOddInput() {
		int oddinput = 5;
		
		String result = input.verifyPowerOf(oddinput);
		String expected = "ERROR: Please input an even number" ;
		assertEquals(result, expected);
	}
	
	
	@Test
	void testForOne() {
		int one = 1;
		
		String result = input.verifyPowerOf(one);
		String expected = "ERROR: Input is 1, not a power of 2" ;
		assertEquals(result, expected);
	}
	
	
	@Test
	void testForNotPowerofTwo() {
		int evennumber = 10;
		
		String result = input.verifyPowerOf(evennumber);
		String expected = "The input is NOT a power of 2" ;
		assertEquals(result, expected);
	}
	
	
	
	
	
	
	

}
