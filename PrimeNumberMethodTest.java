/*
 * Class: CMSC201 
 * Instructor:
 * Description: JUnit class for testing the PrimeNumberMethod.java class
 * Will test method isPrime
 * Due: 05/05/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Kaleb Eshetu
*/


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** This class tests the PrimeNumberMethod class 
 * @author Kaleb Eshetu
 * @version 4/30/24*/
public class PrimeNumberMethodTest {
	
	/** Testing the set up
	 * @exception e
	 *  */
	@BeforeEach
	void setUp() throws Exception {
	}

	/** Testing the tear down 
	 * @exception e*/
	@AfterEach
	void tearDown() throws Exception {
	}

	/** testing if the isPrime method works correctly */
	@Test
	void testIsPrime() {
		PrimeNumberMethod prime = new PrimeNumberMethod();
		assertTrue(prime.isPrime(7));
		assertEquals(prime.isPrime(22), false);
		assertTrue(prime.isPrime(2));
		assertEquals(prime.isPrime(50),false);
		
	}

}
