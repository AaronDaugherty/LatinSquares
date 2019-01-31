import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LatinSquaresGame {
	
	LatinSquaresGame(String config){
		int n;
		String squareComp;
		int k;
		
		
		try {
			  File configFile = new File(config);
			  Scanner configScanner = new Scanner(configFile);
			  n = configScanner.nextInt();
			  System.out.println(n);
			} catch (FileNotFoundException e) {
			  // handle the exception here
			  System.err.println(e);
			  e.printStackTrace();
			} // try
			
	}
	
	public static void printWelcome(){
		System.out.println("  _           _   _        _____\r\n" + 
				" | |         | | (_)      / ____|\r\n" + 
				" | |     __ _| |_ _ _ __ | (___   __ _ _   _  __ _ _ __ ___  ___\r\n" + 
				" | |    / _` | __| | '_ \\ \\___ \\ / _` | | | |/ _` | '__/ _ \\/ __|\r\n" + 
				" | |___| (_| | |_| | | | |____) | (_| | |_| | (_| | | |  __/\\__ \\\r\n" + 
				" |______\\__,_|\\__|_|_| |_|_____/ \\__, |\\__,_|\\__,_|_|  \\___||___/\r\n" + 
				"                          CSCI 1302 | | v2019.sp\r\n" + 
				"                                    |_|");
	}
	
	void displaySquare() {
		
	}
	
	void promptUser() {
		
	}
	
	boolean isLatinSquare() {
		return true;
	}
	void printWin() {
		
	}
	void play() {
		
	}

}
