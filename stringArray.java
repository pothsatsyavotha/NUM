import java.util.Scanner;

public class stringArray {
    public static void searchNumber(int[] num ,int number ){
        boolean isFound = false;

        int index = 0;
        while (!isFound && index<num.length ){
           if (num[index] == number){
               isFound = true;
           }
           index++;
        }
        if (isFound){
            System.out.println("item found ");
            System.out.println("position is :");
        }
        else {
            System.out.println("Item not found");
        }

    }
    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        String keyword = "volvo";
//        boolean isFound = false;
//        int index = 0;
//        while (!isFound && index<cars.length){
//            if (cars[index].equalsIgnoreCase(keyword)){
//                isFound = true;
//            }
//            index++;
//        }
//        if (isFound){
//            System.out.println("item found");
//        }
//        else {
//            System.out.println("Item not found");
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        int num[] = {1,2,3,4,5,6};
        searchNumber(num,number);
    }
}
