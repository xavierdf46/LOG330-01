import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class ParserTest {

	@Test
	public void fileExistsTest() {
		File test = new File("Donnees_de_test.csv");
		assertTrue(test.exists());
	}
	
	@Test
	public void parseTest() {
		
		int[] values = {186, 699, 132, 272, 291, 331, 199, 1890, 788, 1601};
		int[] test = Parser.parse("Donnees_de_test.csv");
		
		assertTrue(test.length == values.length);
		
		for (int i = 0; i < values.length; i++) {
			assertTrue(test[i] == values[i]);
		}

	}

}
