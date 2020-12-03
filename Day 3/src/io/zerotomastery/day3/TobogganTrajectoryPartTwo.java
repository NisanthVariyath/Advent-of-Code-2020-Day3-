package io.zerotomastery.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TobogganTrajectoryPartTwo {

	public static void main(String[] args) {
		String recordString;
		int numberOfTreesType1 = 0;
		int numberOfTreesType2 = 0;
		int numberOfTreesType3 = 0;
		int numberOfTreesType4 = 0;
		int numberOfTreesType5 = 0;
		int counter = 0;
		int indexType1 = 0;
		int indexType2 = 0;
		int indexType3 = 0;
		int indexType4 = 0;
		int indexType5 = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\io\\zerotomastery\\day3\\input.txt"));
			String line;
			while ((line = br.readLine()) != null) {

				recordString = "";
				counter++;

				// pattern repeats to the right
				for (int j = 0; j <= counter; j++) {

					recordString = recordString.concat(line);

				}

				// find tree slop type1
				if (String.valueOf(recordString.charAt(indexType1)).equals("#")) {
					numberOfTreesType1++;

				}

				// find tree slop type2
				if (String.valueOf(recordString.charAt(indexType2)).equals("#")) {
					numberOfTreesType2++;

				}

				// find tree slop type3
				if (String.valueOf(recordString.charAt(indexType3)).equals("#")) {
					numberOfTreesType3++;

				}

				// find tree slop type4
				if (String.valueOf(recordString.charAt(indexType4)).equals("#")) {
					numberOfTreesType4++;

				}

				// find tree slop type5

				if ((counter % 2) == 0) {

					indexType5 += 1;

					// System.out.println("counter " + counter +" index =" + indexType5 + " char =
					// "+ recordString.charAt(indexType5));

					if (String.valueOf(recordString.charAt(indexType5)).equals("#")) {
						numberOfTreesType5++;

					}

				}

				indexType1 += 1;
				indexType2 += 3;
				indexType3 += 5;
				indexType4 += 7;

			}
			br.close();
			System.out.println(" Number of trees Slop Type1 = " + numberOfTreesType1);
			System.out.println(" Number of trees Slop Type2 = " + numberOfTreesType2);
			System.out.println(" Number of trees Slop Type3 = " + numberOfTreesType3);
			System.out.println(" Number of trees Slop Type4 = " + numberOfTreesType4);
			System.out.println(" Number of trees Slop Type5 = " + numberOfTreesType5);
			System.out.println(" Puzzle 2 result : " + numberOfTreesType1 * numberOfTreesType2 * numberOfTreesType3
					* numberOfTreesType4 * numberOfTreesType5);

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
