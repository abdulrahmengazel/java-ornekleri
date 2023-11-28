import java.io.*;
import java.util.*;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            ArrayList<String> tokens = new ArrayList<String>();

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] lineTokens = line.split("\\s+|,");
                tokens.addAll(Arrays.asList(lineTokens));
            }

            fileReader.close();

            for (String token : tokens) {
                System.out.println(token);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
