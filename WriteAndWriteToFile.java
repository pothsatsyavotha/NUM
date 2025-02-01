import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteAndWriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("/home/votha/Documents/text/text.txt");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        for (int i =1;i<=n;i++){
            System.out.println("Enter fullname:");
            String name = input.next();
            System.out.println("Enter amount");
            double amount = input.nextInt();
            writer.println(name+" "+ amount);
        }
        System.out.println("Your data has input");
        writer.close();
        File file = new File("/home/votha/Documents/text/text.txt");
        Scanner fileScan = new Scanner(file);

        while (fileScan.hasNext()){
            String line = fileScan.nextLine();
            System.out.println(line);
        }
    }
}
