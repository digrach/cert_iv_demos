package colley.chis.c4.bubblesortdemo;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {

		// Arrays are in parallel with each other - this means that
		// the first top score in topScores belongs to the first username in userNames.

		// Array of top scores.
		int topScores[] = {100000, 34987, 55876, 45264, 41345, 88900, 87667, 67467, 75449, 71989};
		// Array of usernames.
		String userNames[] = {"straven", "kiddthunda", "boingboing", "tunzapun", "soonami", "straven", "kiddthunda", "slasher", "kiddthunda", "shanus"};

		// Print the unsorted arrays.
		System.out.println("Unsorted arrays...");
		for (int x = 0; x < topScores.length; x ++) {
			System.out.println(userNames[x] + ": " + topScores[x]);
		}
		System.out.println();

		// Bubble sort the top scores from greatest to lowest.
		// The usernames are also sorted but only after a topscore sort happens.
		// The outer loop compares gets the current score
		// In the loop primer, we subtract 1 from the length of the array.
		// This is because we need not check the last number against the next number
		// because there is no next number!
//		for (int outerLoop = 0; outerLoop < topScores.length - 1 ; outerLoop ++) {
//			// The inner loops compares the score in the outer loop
//			// to each score in the inner loop.
//			for (int innerLoop = 0; innerLoop < topScores.length - 1; innerLoop ++) {
//				// If the current topscore is less than the next topscore, do the swap.
//				if (topScores[innerLoop] < topScores[innerLoop + 1]) {
//					int tempTopScore = topScores[innerLoop];
//					topScores[innerLoop] = topScores[innerLoop + 1];
//					topScores[innerLoop + 1] = tempTopScore;
//					String tempUserName = userNames[innerLoop];
//					userNames[innerLoop] = userNames[innerLoop + 1];
//					userNames[innerLoop + 1] = tempUserName;
//				}
//			}
//		}
		
		Arrays.sort(topScores);

		// Print the sorted arrays.
		System.out.println("Sorted arrays...");
		for (int x = 0; x < topScores.length; x ++) {
			System.out.println(userNames[x] + ": " + topScores[x]);
		}
		System.out.println();

//		int first = 0;
//		int last = topScores.length - 1;
		//int middle = 0;// = (first + last) / 2;
//		int search = 45264;
		
		int nums[] = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600};
		int search = 87667;
		
		int a[] = topScores;
		
		int first = 0;
		int last = a.length - 1;
		
		boolean found = false;
		
		
		
		System.out.println("********************************");
		System.out.println("Search target is " + search);
		System.out.println("********************************");
		System.out.println();
		
		while (first <= last) {
			
			int middle = (first + last) / 2;
			
			System.out.println("first index: " + first);
			System.out.println("last index: " + last);
			System.out.println("middle index: " + middle);
			System.out.println("middle value: " + a[middle]);
			
			System.out.println("   Comparing " + search + " to " + a[middle]);
			if (search == a[middle]) {
				System.out.println("   FOUND " + search + " at index " + middle);
				found = true;
				break;
			} else if (search < a[middle]) {
				System.out.println("   " + search + " is less than " + a[middle]);
				last = middle - 1;
				System.out.println("   < changing last index to " + last);
			} else if (search > a[middle]) {
				System.out.println("   " + search + " is greater than " + a[middle]);
				first = middle + 1;
				System.out.println("   > changing first index to " + first);
			}
			
			System.out.println();
			
		}
		
		if (found == false) {
			System.out.println(search + " Not found");
		}

//		while (first <= last) {
//			
//			if (search == topScores[middle]) {
//				System.out.println("FOUND in the MIDDLE");
//				break;
//			} else if (search < topScores[middle]) {
//				middle /= 2;
//				first ++;
//				last = topScores[middle - first];
//				if (search == first) {
//					System.out.println("FOUND at " + first);
//				}
//			} else if (search > topScores[middle]) {
//				first = topScores[middle + 1] {
//					
//				}
//			}
//			while (first <= last) {
//			
//			if (search == topScores[middle]) {
//				System.out.println("FOUND in the MIDDLE");
//				break;
//			} else if (search < topScores[middle]) {
//				middle /= 2;
//				first ++;
//				last = topScores[middle - first];
//				if (search == first) {
//					System.out.println("FOUND at " + first);
//				}
//			} else if (search > topScores[middle]) {
//				first = topScores[middle + 1] {
//					
//				}
//		}

	}


}
