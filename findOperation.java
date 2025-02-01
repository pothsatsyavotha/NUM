import java.util.Scanner;

public class findOperation {
    public static int sum(int a ,int b){
        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;
    }
    public static int mutliply(int a,int b){
        return a*b;
    }
    public static int devide(int a,int b){
        return a/b;
    }
    public static double findRemainer(int a,int b){
        return a%b;
    }
    public static double sumThreeNum(int a,int b, int c){
        double result = a + b + c;
        return result;
    }
    public static double findAverage(double sumThreeNum){
        double result = sumThreeNum/3;
        return  result;
    }
    public static char findGrade(double avg) {
        if (avg > 90) {
            return 'A';
        } else if (avg > 80) {
            return 'B';
        } else if (avg > 70) {
            return 'C';
        } else if (avg > 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static String schorlarShip(char value){
        if (value == 'A'){
            return "you got 100%";
        }
        else if(value =='B'){
            return "You got 70%";
        }
        else if (value == 'C'){
            return "You got 50%";
        }
        else if(value == 'D'){
            return "You got 30%";
        }
        else {
            return "u haven't got scholarship";
        }
    }
    public static int SchoolFee (char value){
        int originalFee = 800;
        int discount = 0;

        if (value == 'A') {
            discount = 100;
        } else if (value == 'B') {
            discount = 70;
        } else if (value == 'C') {
            discount = 50;
        } else if (value == 'D') {
            discount = 30;
        } else {
            discount = 0;
        }

        return originalFee - (originalFee * discount / 100);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b= input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();
        System.out.println("result of sum: "+ sum(a,b));
        System.out.println("result of minus:" + Math.abs(minus(a,b)));
        System.out.println("result of multiply:" + mutliply(a,b));
        System.out.println("result of devide:"+ devide(a,b));
        System.out.println("result of modulus:"+ findRemainer(a,b));

        double resultOfThree = sumThreeNum(a,b,c);
        double avg = findAverage(resultOfThree);
        System.out.println(resultOfThree);
        System.out.println("finder average:"+avg);
        System.out.println("your grade is:"+ findGrade(avg));
        char value = findGrade(avg);
        System.out.println("your scorlarship :"+ schorlarShip(value));

        System.out.println("your school fee: "+ SchoolFee(value));
    }
}

