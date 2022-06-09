package task8;

import java.util.Scanner;

//Тест для калькулятора формул.
public class CalcTest{
    public static void main(String[] args){
        Calc c = new Calc();

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter an expression -> ");
            c.compile(in.next().toCharArray());
            System.out.print("\n");
        }
    }
}
