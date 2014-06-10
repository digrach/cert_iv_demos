package colley.chis.c4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndWrite {

	static String usernames[] = {"straven","kiddthunda","maverick","killeremmy","rakky"};
	static int scores[] = {98000,97830,88654,127343,39098};
	static boolean qualified[] = {true,true,false,true,false};

	public static void main(String[] args) {
		printToFile();
		readFromFile();
	}

	public static void printToFile() {

		File myFile = new File("mytextfile.txt");
		PrintWriter myPrintWriter = null;

		try {
			myPrintWriter = new PrintWriter(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int x = 0; x < usernames.length; x ++) {
			myPrintWriter.print(usernames[x]);
			myPrintWriter.print(",");
			myPrintWriter.print(scores[x]);
			myPrintWriter.print(",");
			myPrintWriter.print(qualified[x]);
			myPrintWriter.print(";");
		}

		myPrintWriter.close();

	}

	public static void readFromFile() {
		File myFile = new File("mytextfile.txt");
		Scanner myScanner = null;
		try {
			myScanner = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		int count = 0;
		myScanner.useDelimiter(";");
		while (myScanner.hasNext()) {
			String originalString = myScanner.next();
			String userData[] = originalString.split(",");

			usernames[count] = userData[0];
			scores[count] = Integer.parseInt(userData[1]);
			qualified[count] = Boolean.parseBoolean(userData[2]);

			count ++;
		}



	}

}



