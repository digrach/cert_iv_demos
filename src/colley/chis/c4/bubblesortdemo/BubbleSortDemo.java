// Rachael Colley
// Implementation of bubble sort, sequential search and binary search algorithms
// and tasks @ https://docs.google.com/document/d/1jxTQIBM_KHLEp4fSrJ-PjHgzGLkRGhSJrjRqiMwQC3M/

package colley.chis.c4.bubblesortdemo;

public class BubbleSortDemo {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * * ");
		System.out.println("******************************************");
		System.out.println("********* Sorting and searching **********");
		System.out.println("*********** THE FUN NEVER ENDS ***********");
		System.out.println("******************************************");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * ");
		System.out.println();

		// Arrays are in parallel with each other - this means that
		// the first top score in topScores belongs to the first username in userNames.

		// Array of top scores.
		int topScores[] = {100000, 34987, 55876, 45264, 41345, 88900, 87667, 67467, 75449, 71989};
		// Array of usernames.
		String userNames[] = {"straven", "kiddthunda", "boingboing", "tunzapun", "soonami", "straven", "kiddthunda", "slasher", "kiddthunda", "shanus"};


		print(topScores, "Print *UNSORTED* topScores array");
		
		bubbleSort(topScores, userNames);
		
		print(topScores, "Print *SORTED* topScores array");
		
		boolean ss1 = sequentialSearch(topScores, 87667);
		System.out.println("87667 found = " + ss1);
		boolean ss2 = sequentialSearch(topScores, 41345);
		System.out.println("41345 found = " + ss1);
		boolean ss3 = sequentialSearch(topScores, 50000);
		System.out.println("50000 found = " + ss1);
		
		boolean bs1 = binarySearch(topScores, 87667);
		System.out.println("87667 found = " + bs1);
		boolean bs2 = binarySearch(topScores, 41345);
		System.out.println("41345 found = " + bs1);
		boolean bs3 = binarySearch(topScores, 50000);
		System.out.println("50000 found = " + bs1);
		
		print(topScores, userNames, "Final *SORTED* data");
		
		
		System.out.println();
		System.out.println("* * * * * * * * * * * * * * * * * * * * * ");
		System.out.println("******************************************");
		System.out.println("**************** KTHXBAI *****************");
		System.out.println("******************************************");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * ");
		System.out.println();



	}

	public static void bubbleSort(int a[], String s[]) {
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println("**** Bubble sorting right now!! *****");
		System.out.println("*************************************");
		System.out.println();
		
		// Bubble sort the top scores from greatest to lowest.
		// The usernames are also sorted but only after a topscore sort happens.
		// The outer loop compares gets the current score
		// In the loop primer, we subtract 1 from the length of the array.
		// This is because we need not check the last number against the next number
		// because there is no next number!
		for (int outerLoop = 0; outerLoop < a.length - 1 ; outerLoop ++) {
			// The inner loops compares the score in the outer loop
			// to each score in the inner loop.
			for (int innerLoop = 0; innerLoop < a.length - 1; innerLoop ++) {
				// If the current topscore is less than the next topscore, do the swap.
				if (a[innerLoop] > a[innerLoop + 1]) {
					int tempTopScore = a[innerLoop]; // Store current index value in a temp variable.
					a[innerLoop] = a[innerLoop + 1]; // Assign the next index value to the current index.
					a[innerLoop + 1] = tempTopScore; // Assign temp to the next index.
					// Keep the String array in parallel with the int array.
					if (s != null) {
						String tempUserName = s[innerLoop];
						s[innerLoop] = s[innerLoop + 1];
						s[innerLoop + 1] = tempUserName;
					}
				}
			}
		}
	}

	public static boolean binarySearch(int[] a, int target) {

		int first = 0;
		int last = a.length - 1;

		System.out.println();
		System.out.println("*************************************");
		System.out.println("***** Binary search for " + target);
		System.out.println();
		
		int countSearchLoops = 1;

		while (first <= last) {

			int middle = (first + last) / 2;

			System.out.println("   first index: " + first);
			System.out.println("   last index: " + last);
			System.out.println("   middle index: " + middle);
			System.out.println("   middle value: " + a[middle]);
			System.out.println("   Comparing " + target + " to " + a[middle]);

			if (target == a[middle]) {
				System.out.println();
				System.out.println("   FOUND " + target + " at index " + middle);
				System.out.println("   ***** Total search loop count: " + countSearchLoops);
				return true;
			} else if (target < a[middle]) {
				System.out.println("   " + target + " is less than " + a[middle]);
				last = middle - 1;
				System.out.println("   < changing last index to " + last);
			} else if (target > a[middle]) {
				System.out.println("   " + target + " is greater than " + a[middle]);
				first = middle + 1;
				System.out.println("   > changing first index to " + first);
			}

			countSearchLoops ++;
			
			System.out.println();

		}
			
			return false;

	}
	
	public static boolean sequentialSearch(int a[], int target) {
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println("***** Sequential search for " + target);
		System.out.println();

		for (int x = 0; x < a.length; x++) {
			if (a[x] == target) {
				System.out.println("   " + target + " found at index " + x);
				System.out.println("   ***** Total search loop count: " + (x + 1));
				return true;
			}
		}
				
		return false;
	}

	public static void print(int[] a, String header) {

		System.out.println();
		System.out.println("********** " + header + " **********");

		for (int x = 0; x < a.length; x ++ ) {
			System.out.print(a[x] + ", ");
		}

		System.out.println();

	}
	
	public static void print(int[] a, String[] s, String header) {

		System.out.println();
		System.out.println("********** " + header + " **********");

		for (int x = 0; x < a.length; x ++ ) {
			System.out.println(s[x] + "'s score " + a[x]);
		}

		System.out.println();

	}

}
