//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class TestClass {
//    public static void main(String[] args) throws Exception {
//        stackUsing();
//        polyndrome();
//    }
//    public static void stackUsing() throws Exception {
//        System.out.println("Введите строку: ");
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        Stack queue = new Stack(str.length());
//        for (int i = 0; i < str.length(); i++) {
//            char t = str.charAt(i);
//            if (t == '[' || t == '(' || t == '{') {
//                queue.push(t);
//            }
//            try {
//                char top = queue.top();
//
//                if ((t == ']') && (top == '[')) {
//                    queue.pop();
//                }
//                if ((t == ')') && (top == '(')) {
//                    queue.pop();
//                }
//                if ((t == '}') && (top == '{')) {
//                    queue.pop();
//                }
//            } catch (Exception ex) {
//                ;
//            }
//        }
//        System.out.println("-" + (queue.empty() ? "верно" : "неверно"));
//    }
//
//    public static void polyndrome() throws Exception {
//        ArrayList<String> tests = new ArrayList<>();
//        tests.add(new String("dad"));
//        tests.add(new String("edrtfgyuhkijo"));
//        tests.add(new String("asdfggfdsa"));
//        tests.add(new String(""));
//        for (int i = 0; i < tests.size(); i++) {
//            isPolyndrome(tests.get(i));
//        }
//    }
//
//    public static void isPolyndrome(String str) throws Exception {
//        StringDeq strDck = new StringDeq(str);
//        if (strDck.empty()) {
//            System.out.println("Пустая строка!");
//        } else {
//            while (!strDck.empty()) {
//                char front_sym = strDck.popFront();
//                if (!strDck.empty()) {
//                    char back_sym = strDck.popBack();
//                    if (front_sym != back_sym) {
//                        System.out.println("Не палиндром");
//                        break;
//                    } else {
//                        System.out.println("Палиндром");
//                        break;
//                    }
//                } else {
//                    System.out.println("Палиндром");
//                    break;
//                }
//            }
//        }
//    }
//}
