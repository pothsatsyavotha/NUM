import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class WriteAndReadToFile {
    // Method to input data into a file
    public static void inputDataToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("/home/votha/Documents/text/text.txt");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n (number of records to input):");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter fullname:");
            String name = input.next();
            System.out.println("Enter amount:");
            double amount = input.nextDouble();
            writer.println(name + " " + amount);
        }

        System.out.println("Your data has been input.");
        writer.close();
    }

    // Method to read and display data from the file
    public static void readDataFromFile() {
        File file = new File("/home/votha/Documents/text/text.txt");

        try (Scanner fileScan = new Scanner(file)) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                System.out.println(line);  // Print each line
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            // Input data into file
            inputDataToFile();

            // Read and display data from file
            readDataFromFile();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
