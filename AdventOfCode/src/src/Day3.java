package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {
		// Input memory (corrupted program memory)
        String memory = "]select(23,564)/$!where()>%mul(747,16)*why()mul(354,748)how()<?mul(29,805)where()mul(480,119)!,why()mul(685,393)(~'&[what()what()mul(376,146)-,<)..."; // Truncated for brevity

        // Regex pattern to match valid "mul(X,Y)" instructions
        String pattern = "mul\\((\\d{1,3}),(\\d{1,3})\\)";

        // Compile the regex pattern
        Pattern regex = Pattern.compile(pattern);

        // Create a matcher for the input memory
        Matcher matcher = regex.matcher(memory);

        // Lists to store parsed X and Y values
        ArrayList<Integer> xValues = new ArrayList<>();
        ArrayList<Integer> yValues = new ArrayList<>();

        try {
            while (matcher.find()) {
                // Extract the two numbers (X and Y) from each match
                int x = Integer.parseInt(matcher.group(1));
                int y = Integer.parseInt(matcher.group(2));

                // Add them to the respective lists
                xValues.add(x);
                yValues.add(y);
            }

            // Calculate the total sum of the products
            long totalSum = 0;
            for (int i = 0; i < xValues.size(); i++) {
                totalSum += xValues.get(i) * yValues.get(i);
            }

            // Output the total sum
            System.out.println("Total sum of valid mul operations: " + totalSum);

        } catch (NumberFormatException e) {
            // Handle any parsing errors
            System.err.println("Error parsing numbers: " + e.getMessage());
        }
    }
}
