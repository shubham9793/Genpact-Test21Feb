package com.org.gen.TestAssignment21Feb;
import java.util.Scanner;
class UserMainCode{
    public static int validatePassword(String a){
        int d = 0;
        if (a.length() >= 8) {
            if (a.contains("#") || a.contains("@") || a.contains("_")) {
                char c = a.charAt(0);
                //System.out.println(c);
                if (Character.isAlphabetic(c)) {
                    char dd = a.charAt(a.length() - 1);
                    if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd))){
                        if (a.matches(".[0-9]{1,}.") || a.matches(".[a-zA-Z]{1,}."))
                            return 1;
                        else
                            return -1;
                    }
                    else
                        return -1;
                }
                else
                    return -1;
            } else
                return -1;

        } else
            return -1;
    }
}
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pass type");
        String str = sc.next();
        if(UserMainCode.validatePassword(str) == 1)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }
}
