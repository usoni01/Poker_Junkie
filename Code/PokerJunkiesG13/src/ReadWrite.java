import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
	
	/*
	public static void main(String[] bvc) throws IOException
	{
		
		read();
		write("20");
		read();
	}
	*/
	
	public  String read() throws IOException 
	{  String line = null;
		try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader("File/score.txt");

	        // Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);

	        line = bufferedReader.readLine();
			/*while((line = bufferedReader.readLine()) != null) {
	           // System.out.println(line);
	        }   */

	        // Always close files.
	        
				bufferedReader.close();
			    
	    }
	    catch(FileNotFoundException ex) {
	        System.out.println(
	            "Unable to open file");                
	    }
		return line;

	}
	
	
	
	public  void write(String data) 
	{
		
		 try {
	            // Assume default encoding.
	            FileWriter fileWriter =
	                new FileWriter("File/score.txt");

	            // Always wrap FileWriter in BufferedWriter.
	            BufferedWriter bufferedWriter =
	                new BufferedWriter(fileWriter);

	            // Note that write() does not automatically
	            // append a newline character.
	            bufferedWriter.write(data);
	           

	            // Always close files.
	            bufferedWriter.close();
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error writing to file");
	            // Or we could just do this:
	            // ex.printStackTrace();
	        }
	}
	
}


