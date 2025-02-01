import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.Scanner;

public class numArray {
//    public static void cal(int[] arr){
//
//        int total =0;
//        for (int j:arr){
//            total +=j;
//        }
//        System.out.println("total with method: "+total);
//    }
//    public static int[] createArray(int size){
//        int [] array = new int[size];
//        Scanner input = new Scanner(System.in);
//        for (int i=0;i<array.length;i++){
//            System.out.println("Enter array ["+(i+1)+"]:");
//            array[i] = input.nextInt();
//        }
//        return array;
//    }

//    public static int FindMax(int[] firstArray){
//        int max = firstArray[0];
//
//        for (int i =0;i< firstArray.length;i++){
//            if (firstArray[i]>max){
//                max= firstArray[i];
//            }
//        }
//        return max;
//    }
//    public static int findMin(int[] secondArray){
//        int min = secondArray[0];
//        for (int i =0;i< secondArray.length;i++){
//            if (secondArray[i]<min){
//                min = secondArray[i];
//            }
//        }
//        return min;
//    }

    public static int[] cretaeNewArray(int size){
        int[] arr = new int[size];
        Scanner input = new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("enter value:");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static void writeDataIntoFile(int[] array) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("/home/votha/Documents/text/text.txt");
        for (int i=0;i<array.length;i++){
            writer.println(array[i]);
        }
        writer.close();
    }
    public static void readDataFromArray() throws FileNotFoundException {
        File file = new File("/home/votha/Documents/text/text.txt");
        Scanner read = new  Scanner(file);
        int index = 0;
        int[] myData = new int[0];
        while (read.hasNext()){
            myData[index] = data.nextInt();
            index++;
        }
        for (int v:myData){
            System.out.println(v);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
//        int[] arr = {1,2,3,5};
//
//            for (int i: arr){
//                System.out.println(i);
//            }
//            int total =0;
//            for (int j:arr){
//                total +=j;
//            }
//        System.out.println("total with normal: "+total);
//        cal(arr);
//        int[] createArray = createArray(3);
//        for (int v:createArray){
//            System.out.println(v);
//        }
//        cal(createArray);

//        compare array

//        int[] firstArray = {1,2,3,4};
//        int[] secondArray = {3,2,10};
//        boolean arrEqual = false;
//        int index = 0;
//        if (firstArray.length == secondArray.length){
//            arrEqual = true;
//        }
//
//        while (arrEqual && index <firstArray.length){
//            if (firstArray[index] != secondArray[index]){
//                arrEqual = false;
//            }
//            index++;
//        }
//        if (arrEqual){
//            System.out.println("Equal");
//        }
//        else {
//            System.out.println("Not Equal");
//        }

//        find max
//        int max = firstArray[0];
//
//        for (int i =0;i< firstArray.length;i++){
//            if (firstArray[i]>max){
//                max= firstArray[i];
//            }
//        }
//        System.out.println("max is:"+max);
//        int min = secondArray[0];
//        for (int i =0;i< secondArray.length;i++){
//            if (secondArray[i]<min){
//                min = secondArray[i];
//            }
//        }
//        System.out.println("min is:"+min);
//
//        System.out.println("max number is: "+ FindMax(firstArray));
//
//        System.out.println("min number is: "+findMin(secondArray));

        int[] array = cretaeNewArray(3);

        for (int i:array){
            System.out.println(i);
        }

        writeDataIntoFile(array);

    }
}
