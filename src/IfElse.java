
import java.util.Scanner;

//you can pass scanner object to method outside the main method
//you can use scanner constant so every method can reach under the same class
//if you use like nextInt() (not ...Line() ) you should use nextLine after the next..() so that it will read you "enter" key
// and won't encounter "scanner doesn't read nextLine()" Issue.

//        \n is LF or Line Feed or NewLine
//        \r is CR or Carriage Return
//        \r\n CR+LF is used in Windows as newLine sequence
//        U+0085 NEL is the Unicode character for NExt Line
//        U+2028 is the Unicode character for Line Separator
//        U+2029 is the Unicode character for Paragraph Separator

//Using skip()-> if scanner is defined as from a string "..a-word" pattern can be used(also you need to put dot how many character it contains before that "a-word"
// but if it is defined as System.in,you should use it as ".*a-word"(!!but also finds every "a-word" then cuts out the string).So better use -> " .* "
//
//            If you meat \n\r
//                    or |
//                    one of the characters in the group **[\n \r \u2028 \u2029 \u0085]** (those are considered single characters to choose from)
//                    ? 0 or 1 times
public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
//        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");// what is the purpose of the " ? " mark
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 && N < 5) {
            System.out.println("Not Weird");

        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");

        } else if (N > 20) {
            System.out.println("Not Weird");

        }
        System.out.print("Hackerrank example is finished..");
        scanner.close();


    }


}
