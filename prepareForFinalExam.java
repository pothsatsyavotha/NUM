import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class prepareForFinalExam {
    public static void writeIntoFile(){
        try {
            PrintWriter writer = new PrintWriter("/home/votha/Documents/text/text.txt");
            for(int i=0;i<3;i++){
                Scanner input = new Scanner(System.in);
                System.out.println("enter month:");
                String month = input.next();
                System.out.println("Enter amount:");
                int amount = input.nextInt();

                writer.println(month +":"+amount);
            }
            writer.close();
        }catch (FileNotFoundException e){
            e.fillInStackTrace();
        }
    }
    public static void readDataFromFile(){
        File file = new File("/home/votha/Documents/text/text.txt");
        try {
            Scanner fileScan = new Scanner(file);
            while (fileScan.hasNextLine()){
                String line = fileScan.nextLine();
                String[] value = line.split(":");
                int valueNumber = Integer.parseInt(value[1]);
                System.out.println(value[0] +":" + valueNumber);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        writeIntoFile();
        readDataFromFile();
    }
}
