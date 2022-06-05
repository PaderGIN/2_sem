package task5_2;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String regex1 = "";
        String regex2 = "a";
        String regex3 = "ab";
        String regex4 = "a|b";
        String regex5 = "a*";
        String regex6 = "a+";
        String regex7 = "aa*"; //Эквивалент regex6.
        String regex8 = "\\**";
        String regex9 = "a*b*";
        String regex10 = "aa*bb*";
        String regex11 = "a*|b*";
        String regex12 = "(a|b)*";
        String regex13 = "a|b*";
        String regex14 = "(aab|ab)*";
        String regexN = "(1|2|3|4|5|6|7|8|9)|(1|2|3|4|5|6|7|8|9)(0|1|2|3|4|5|6|7|8|9)*";

        Scanner in = new Scanner(System.in);
        while (true) {
            String input = in.nextLine();
            boolean result = input.matches(regexN); //Проверка строки на соответсвие регулярному выражению (языку).
            System.out.println(result);
        }
    }

    public boolean n1(String s) {
        return s.matches("(1|2|3|4|5|6|7|8|9)+(0|1|2|3|4|5|6|7|8|9)*");
    }

    public boolean n2(String s) {
        return s.matches("(1|2|3|4|5|6|7|8|9)+(0|1|2|3|4|5|6|7|8|9)*\\.(0|1|2|3|4|5|6|7|8|9)+");
    }

    //email regex
    public boolean n3(String s) {
        return s.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
    }


}