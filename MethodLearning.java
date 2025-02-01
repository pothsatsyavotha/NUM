import com.sun.net.httpserver.Headers;

public class MethodLearning{
    public static String fullName (String fn, String ln){
        String full = fn +" "+ ln;
        return full;
    }
    public static int getFullLengthName(String fullName){
        int length = fullName.length();
        return length;
    }
    public static void setUppercase(String fullName){
        System.out.println(fullName.toUpperCase());
    }
    public static void main(String[] args) {
        String name = fullName("votha","satsya");
        int lengthName = getFullLengthName(name);
        System.out.println(name);
        System.out.println(lengthName);
        setUppercase(name);
    }
}
