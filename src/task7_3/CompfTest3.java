package task7_3;

import java.util.Scanner;

public class CompfTest3{
    public static void main(String[] args) throws Exception {
        Compf3 c = new Compf3();

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Введите формулу -> ");
            c.compile(in.next().toCharArray());
            System.out.print("\n");
        }
    }
}