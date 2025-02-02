import java.util.Calendar;
import java.util.Scanner;

public class finalExam {

    public static void SortAscending(String[] Classmate) {
        for (int i = 0; i < Classmate.length - 1; i++) {
            for (int j = 0; j < Classmate.length - 1 - i; j++) {
                if (Classmate[j].compareTo(Classmate[j + 1]) > 0) {
                    String temp = Classmate[j];
                    Classmate[j] = Classmate[j + 1];
                    Classmate[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

//        a
        String[] Classmate = {"Ratha","Bopha","Chanda","Mama"};
//        b
        for (String name: Classmate){
            System.out.println(name);
        }
//        c
        for(int i=0;i<Classmate.length;i++){
            System.out.println(Classmate[i].length());
        }
//        c
        int totalLength =0;
        for (int j=0;j<Classmate.length;j++){
            totalLength += Classmate[j].length();
        }
        System.out.println("total length: "+ totalLength);

//        e
        SortAscending(Classmate);
        for (String val: Classmate){
            System.out.println(val);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String searchElement = input.nextLine();
        boolean found = false;

        for (String name : Classmate) {
            if (name.equalsIgnoreCase(searchElement)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchElement + " was found in the array.");
        } else {
            System.out.println(searchElement + " was not found in the array.");
        }

        int n =7;
        for (int i=n;i>=1;i--){
            for (int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
