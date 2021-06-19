/**
 * Application to process data
 * Interface with name DeliverOutput
 * Class with name SaveDataInDb to save data in database 
 * Class with name SaveDataInFile to save data in file
 * Both classes implements Interface
 * Here we can get inputs from user. 1. Data to save and 2. Option to save data
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

interface DeliverOutput{
	public void processData(String dataString);
}
class SaveDataInDb implements DeliverOutput{

	@Override
	public void processData(String dataString) {
		// Here we can write code to save data in database. 
		System.out.println("SaveDataInDb.processData() :: "+dataString);
	}
}
class SaveDataInFile implements DeliverOutput{
	@Override
	public void processData(String dataString) {
		// TODO Code to save data in text file
		FileWriter fw = null;
		BufferedWriter bw =null;
		try {
			fw = new FileWriter("E:\\DataFile.txt");
			bw = new BufferedWriter(fw);
			bw.write(dataString);
			System.out.println("SaveDataInFile.processData() :: Success");
		} catch (IOException e) {
			System.out.println("Exception in SaveDataInFile.processData() :: "+e.getMessage());
		}
		finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
public class Application {
	//Main method 
	public static void main(String args[]) {
		DeliverOutput deliverOutput = null;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Data To save :: \n");
		String dataStr = in.nextLine();
		
		System.out.println("Press 'F' for save in File or 'D' for save in Database :: \n");
		String saveIn = in.nextLine();
		while(!(saveIn.equalsIgnoreCase("F") || saveIn.equalsIgnoreCase("D"))) {
			System.out.println("Worng Endry !! \nPress 'F' for save in File or 'D' for save in Database :: \n");
			saveIn = in.nextLine();
		}
		in.close();
		// create instance according to input given by user.
		if(saveIn.equalsIgnoreCase("D")) {
			deliverOutput = new SaveDataInDb();
			deliverOutput.processData(dataStr); // method call to process and save data in database
		}
		else {
			deliverOutput = new SaveDataInFile();
			deliverOutput.processData(dataStr); // method call to process and save data in file
		}
	}
}
