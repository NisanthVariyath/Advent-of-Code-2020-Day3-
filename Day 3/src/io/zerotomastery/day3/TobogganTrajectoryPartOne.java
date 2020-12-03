package io.zerotomastery.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TobogganTrajectoryPartOne {

	public static void main(String[] args) {
		String recordString;
		int numberOfTrees = 0;
		int counter = 0;
		int index = 0;
	

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
                
				// find tree
				if (String.valueOf(recordString.charAt(index)).equals("#")) {
					numberOfTrees++;
				
				}

				index += 3;

			}
			br.close();
			System.out.println(" Number of trees = " + numberOfTrees);

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

}
