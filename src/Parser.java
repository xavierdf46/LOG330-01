
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Parser {
	
	public static int[] parse(String fileName) {
		
		int[] inputs = null;
		
	  try {
			BufferedReader reader = new BufferedReader(new FileReader(
						 new File(fileName)));
			
			inputs = new int[Integer.parseInt(reader.readLine())];
			
			for (int i = 0; i < inputs.length; i++) {
				inputs[i] = Integer.parseInt(reader.readLine());
			}
			
			reader.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	  
		return inputs;
	}
}