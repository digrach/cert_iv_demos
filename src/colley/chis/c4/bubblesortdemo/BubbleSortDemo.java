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

		int nums[] = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600};
		int nums2[] = {1040,2010,1300,6400,15100,11600,2700,4800,5900,310300,111100,21200,41300,981400,221500,21600};


		print(topScores, "Print *UNSORTED* topScores array");
		bubbleSort(topScores, userNames);
		print(topScores, "Print *SORTED* topScores array");
		binarySearch(topScores, 100000);
		sequentialSearch(topScores, 100000);
		
//		print(nums, "Print unsorted nums array");
//		print(nums2, "Print unsorted nums2 array");


	}

	public static void bubbleSort(int a[], String s[]) {
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
					int tempTopScore = a[innerLoop];
					a[innerLoop] = a[innerLoop + 1];
					a[innerLoop + 1] = tempTopScore;
					if (s != null) {
						String tempUserName = s[innerLoop];
						s[innerLoop] = s[innerLoop + 1];
						s[innerLoop + 1] = tempUserName;
					}
				}
			}
		}
	}

	public static void binarySearch(int[] a, int target) {

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
				return;
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

			System.out.println("   " + target + " Not found");

	}
	
	public static void sequentialSearch(int a[], int target) {
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println("***** Sequential search for " + target);
		System.out.println();

		for (int x = 0; x < a.length; x++) {
			if (a[x] == target) {
				System.out.println("   " + target + " found at index " + x);
				System.out.println("   ***** Total search loop count: " + (x + 1));
				return;
			}
		}
		
		System.out.println(target + " not found");
		
	}

	public static void print(int[] a, String header) {

		System.out.println();
		System.out.println("********** " + header + " **********");

		for (int x = 0; x < a.length; x ++ ) {
			System.out.print(a[x] + ", ");
		}

		System.out.println();

	}

}
