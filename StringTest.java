/*
 * Class: CMSC201 
 * Instructor:
 * Description: JUnit class for testing the String class.
 * Methods: .length(), charAt(), subString(), indexOf() are being tested
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
/** This class tests the java.lang.String class
 * @author Kaleb Eshetu
 *  @version 4/30/24
 *  
 *  */
public class StringTest {

	//Should test length, charAt, substring, and indexOf 
	/** Tests the set up 
	 * @Exception e*/
	@BeforeEach
	void setUp() throws Exception {
	}
	
	/** Tests the tear down 
	 * @Exception e*/
	@AfterEach
	void tearDown() throws Exception {
	}

	/** Tests the functionality of the .length() method */
	@Test
	void testLength() {
		String str = "I am 8 characters long";
					//1234567891234567891234
		//str length = 22
								
		int strLength = str.length();
		assertEquals(str.length(), strLength);
		assertEquals(strLength,22);
	}
	
	/** Tests the effectiveness of the charAt() method */
	@Test
	void testCharAt()
	{
		String str = "abcdefghi";
		//			  012345678
				//str.charAt(4) = e
		assertEquals('e', str.charAt(4));
	}
	
	/** tests the .substring() method */
	@Test
	void testSubstring()
	{
		String str = "abcdefghij";
					//0123456789
		
		assertTrue(str.equals(str.substring(0)));
		
			//abcdefghij
			//0123456789
		assertTrue(str.substring(2,7).equals("cdefg"));
	}
	
	/** Tests the indexOf() method */
	@Test
	void testIndexOf()
	{
		String str = "aabbccdefg";
					//0123456789
		String str2 = "Hello World";
					 //0123456789
		assertTrue(str.indexOf("a") == 0);
		assertTrue(str.indexOf("def") == 6);
		assertTrue(str.indexOf('c') == 4);
		assertTrue(str2.indexOf('o', 4) == 4);
		assertTrue(str2.indexOf('o', 5) == 7);
		assertTrue(str2.indexOf("o", 4) == 4);
		assertTrue(str2.indexOf("o", 5) == 7);
					 
	}
}
