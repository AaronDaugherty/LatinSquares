import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LatinSquaresGame {
	
	int n;
	String squareComp;
	int k;
	String threeK;
	private String[][] gameBoard;
	private String[] tokens;
	
	LatinSquaresGame(String config){
		n = 2;
		squareComp = "ab";
		k = 2;
		threeK = "00a10b";

		/*
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
			*/
		tokens = new String[n];
		
		for(int i = 0; i < n; i++) {
			tokens[i] = squareComp.substring(i, i+1);
		}
		
		
		gameBoard = new String[n][n];
		int p;
		String space = "";
		if (n <= 10) {
			p = 1;
		}
		else if(n <= 100) {
			p = 2;
		}
		else if(n <= 1000) {
			p = 3;
		}
		else {
			p = 4;
		}
		
		int numSpaces = p + 2;
		
		for(int i = 0; i < numSpaces; i++) {
			space = space + " ";
		}
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				gameBoard[i][k] = space;
			}
		}
		
			
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
