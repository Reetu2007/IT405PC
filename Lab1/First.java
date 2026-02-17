import java.lang.*;
import java.util.*;

public class JavaVariables {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        float num3 = (int) num1;
        char ch = 'A';
        boolean variable = true;

        if (num1 > num2) {
            variable = false;
        }

        String str = "Java Programming";
        String str1 = new String("Java Programming");

        System.out.println(num1 + " " + num2 + " " + num3);
        System.out.println(str1 == str);
        System.out.println(str1 + ", " + str);
        System.out.println(variable);
    }
}



