
import java.util.Scanner;

public class TypeConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int num1 = 10;
        long num2 = num1;   

        System.out.println("Implicit Type Conversion:");
        System.out.println("int value: " + num1);
        System.out.println("long value: " + num2);

        
        int x = 10;
        double y = x;        
        float z = (float) y; 

        long num = 400;
        int a = (int) num;    

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + y);
        System.out.println("float value: " + z);
        System.out.println("long value: " + num);
        System.out.println("int value after casting: " + a);

        sc.close();
    }
}



Program 3
