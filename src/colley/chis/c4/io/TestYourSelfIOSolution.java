package colley.chis.c4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestYourSelfIOSolution {

	static String ipaddress[] = {"192.168.1.1","192.168.1.2","192.168.1.3","192.168.1.4","192.168.1.4"};
	static String realmName[] = {"Sydney","Brisbane","Darwin","Beijing","Tokyo"};
	static double latitude[] = {35.673343,-27.4702796,-33.7969235,-12.5948609,39.9388838};
	static double longitude[] = {139.710388,153.023036,150.9224326,131.0078759,116.3974589};

	public static void main(String[] args) {
		printToFile();
		readFromFile();
		print();
	}

	public static void printToFile() {

		File myFile = new File("serverdata.txt");
		PrintWriter myPrintWriter = null;

		try {
			myPrintWriter = new PrintWriter(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int x = 0; x < ipaddress.length; x ++) {
			myPrintWriter.print(ipaddress[x]);
			myPrintWriter.print("#");
			myPrintWriter.print(realmName[x]);
			myPrintWriter.print("#");
			myPrintWriter.print(latitude[x]);
			myPrintWriter.print("#");
			myPrintWriter.print(longitude[x]);
			myPrintWriter.print("@");
		}

		myPrintWriter.close();

	}

	public static void readFromFile() {
		File myFile = new File("serverdata.txt");
		Scanner myScanner = null;
		try {
			myScanner = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		int count = 0;
		myScanner.useDelimiter("@");
		while (myScanner.hasNext()) {
			String originalString = myScanner.next();
			String serverData[] = originalString.split("#");

			ipaddress[count] = serverData[0];
			realmName[count] = serverData[1];
			latitude[count] = Double.parseDouble(serverData[2]);
			longitude[count] = Double.parseDouble(serverData[3]);

			count ++;
		}

	}


	public static void print() {
		for (int x = 0; x < ipaddress.length; x++) {
			System.out.print("Server address: " + ipaddress[x]);
			System.out.print(" Realm name: " + realmName[x]);
			System.out.print(" Latitude: " + latitude[x]);
			System.out.println(" Longitude: " + longitude[x]);
		}
	}

}
