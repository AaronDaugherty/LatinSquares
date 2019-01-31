import java.util.Arrays;

public class LatinSquaresDriver {

	public static void main(String[] args) {
		
		LatinSquaresGame.printWelcome();
		LatinSquaresGame game = new LatinSquaresGame("/home/ugrads/acd/cs1302-latin-squares/tests/tc01.config.txt");
		int n;
		String squareComp;
		int k;
		String threeK;
		char[][] tokens;
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
		tokens = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int k1 = 0; k1 < n; k1++) {
				tokens[i][k1] = ' ';
			}
		}
		System.out.println(Arrays.deepToString(tokens));
			

	}

}
