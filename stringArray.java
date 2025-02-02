import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class stringArray {
//    public static void searchNumber(int[] num ,int number ){
//        boolean isFoound = false;
//
//        int index = 0;
//        while (!isFoound && index<num.length ){
//           if (num[index] == number){
//               isFoound = true;
//           }
//           index++;
//        }
//        if (isFoound){
//            System.out.println("item found " + index);
//            return;
//        }
//        else {
//            System.out.println("Item not found");
//        }
//
//    }
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
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int number = input.nextInt();
//        int num[] = {1,2,3,4,5,6};
//        searchNumber(num,number);
//
//        //sort array
//        int array [] = {2,6,4,3};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        for (int i=0;i<array.length-1;i++){
//            for (int j=i+1;j<array.length;j++){
//                if (array[i]>array[j]){
//                    int tmp = array[i];
//                    array[i] = array[j];
//                    array[j] = tmp;
//                }
//            }
//        }
//        for (int val: array){
//            System.out.println(val);
//        }

//        ArrayList<String> list = new ArrayList<>();
//        ArrayList myList = new ArrayList();
//        list.add("votha");
//        list.add("pich");
//        list.set(0,"apple");
//
//        for (String val:list){
//            System.out.println(val);
//        }
        ArrayList<String> list = new ArrayList<>();
        ArrayList myList =new ArrayList();
        list.add("A");
        list.add("B");
        list.set(0, "Apple");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array");
        String inputArray = input.nextLine();
//            list.add(inputArray);
        list.set(1, inputArray);
        System.out.println(list);
    }
}
