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
    public static void findGrade(double avg){
        if (avg >90){
            System.out.println("A");
        }
        else if(avg >80){
            System.out.println("B");
        }
        else if(avg >70){
            System.out.println("C");
        }
        else if(avg >60){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
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
        findGrade(avg);
    }
}

