package task8;

import java.util.Stack;

public class Calc extends Compf {

    private final Stack<Integer> s;
    private static String num;
    public static int temp;


    public Calc() {
        s = new Stack<>();
        num = "";
        flag = true;
        temp=0;
    }

//    private static int char2int(char c) {
//        return (int) c - (int) '0';
//    }

    private static int Str2int(String c) {
        return Integer.parseInt(c);
    }

    @Override
    protected int symType(char c) {
        switch (c) {
            case '(', '{', '[':
                return SYM_LEFT;
            case ')', '}', ']':
                return SYM_RIGHT;
            case '+':
            case '-':
            case '*':
            case '/':
                return SYM_OPER;
            case '=':
                return SYM_ANS;
            default:
                return symOther(c);
        }
    }

    @Override
    protected void processSymbol(char c) {
        switch (symType(c)) {
            case SYM_LEFT:
                AddNum();
                push(c);
                break;
            case SYM_RIGHT:
                AddNum();
                processSuspendedSymbols(c);
                pop();
                break;
            case SYM_OPER:
                AddNum();
                processSuspendedSymbols(c);
                push(c);
                break;
            case SYM_OTHER:
                nextOther(c);
                break;
            case SYM_ANS:
                PrintAns();
                break;
        }
    }

    private void AddNum() {
        if (!num.equals("")) {
            s.push(Str2int(num));
            num = "";
        }
    }

    private void PrintAns() {
        temp = s.pop();
        System.out.print("Answer: " + temp);
        flag = true;
        //returnAns(temp);
    }

    @Override
    protected int symOther(char c) {
        if (c < '0' || c > '9') {
            System.out.println("Wrong symbol: " + c);

            System.exit(0);
        }

        return SYM_OTHER;
    }

    @Override
    protected void nextOper(char c) {

        int second = s.pop();
        int first = s.pop();

        switch (c) {
            case '+':
                s.push(first + second);
                break;
            case '-':
                s.push(first - second);
                break;
            case '*':
                s.push(first * second);
                break;
            case '/':
                s.push(first / second);
                break;
        }
    }

    @Override
    protected void nextOther(char c) {
        num += c;
    }

    private boolean protectFrom(char ch) {
        if (ch == '=' && s.empty()) {
            return true;
        } else return false;
    }

    @Override
    public final void compile(char[] str) {
        if (protectFrom(str[0])) {
            System.out.println("The expression is empty! Enter another!");
        } else {
            super.compile(str);
        }
    }
}