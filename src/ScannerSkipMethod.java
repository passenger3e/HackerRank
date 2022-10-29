import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
        //by placing () and ? mark it will skip unmatched entry(will make it optional) and so there will be no infinite input request.
        //https://www.geeksforgeeks.org/scanner-skip-method-in-java-with-examples/
        //https://www.includehelp.com/java/scanner-skip-method-with-example.aspx
 */
public class ScannerSkipMethod {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean sos;
        String matching; //Matching input-string
        do {   // will check until finds matches
            System.out.println("Please enter something that you want to filter after \"xyz\" ");
            matching = scanner.nextLine();
            sos = Pattern.matches("(.*xyz.*)", matching);

            if (sos) {
                System.out.println("Matching is occurred.");
                Scanner newScan = new Scanner(matching); //passing the String to new Scanner to filter out
                try {
                    newScan.skip("(.*xyz)?"); //Initializing the filter
                    System.out.println("Your filtered output is: " + newScan.nextLine());
                    newScan.close();
                } catch (Exception e) {
                    sos = false;
                    System.out.println("you can't end your string xyz ");
                    newScan.close();
                }
            }

        } while (!sos);
        scanner.close();

        //-----------Other Matching examples---------
        System.out.println("This is Second Example: ");
        String[] array = {"dag", "deniz", "cam", "Kod"};

        // Regex ile kontrol ettiğimiz alan
        for (String input : array) {
            boolean output = Pattern.matches("d.+", input); //checks the ist first character is "d" or not
            System.out.println(output);
        }
        System.out.println("..ended..");
        //---------------------------------------------

        //----------------Another----------------------
        System.out.println("This is Third Example: ");

        Pattern patternMatching = Pattern.compile("number..");

        //preparing Matcher for input string
        Matcher checker = patternMatching.matcher("number12");
        if (checker.matches()) {
            System.out.println("First String: starts with " + checker.start() + " ends with " + (checker.end() - 1));
            checker.start();
        } else {
            System.out.println(false);
        }

        checker = patternMatching.matcher("numbe456");
        if (checker.matches()) {
            System.out.println("Second String: " + true);
        } else {
            System.out.println(false);
        }
        System.out.println("..ended..");
        //-----Some regex example--------
        //https://cihanozde.gitbooks.io/csd-ileri-java-ii-kurs-notlari-oguz-karan/content/11regular_expressions.html
        System.out.println("some regex examples:...");
        String tTry = "ali";
        boolean tryme = Pattern.matches("[Aa]li", tTry);
        System.out.println(tTry + (tryme ? "" : " not") + " matches with: [Aa]li so it is: " + tryme);

        System.out.println("regex finished..");
        //---------------------------------------------

        //----------------Another----------------------

        patternMatching = Pattern.compile("(d+)-(d+)");

        // burdada eşleştirmek istediğimiz string ifadeyi girdik.
        checker = patternMatching.matcher("9876-1011");

        // eğer eşleşme sağlanıyorsa onları gruplanmış şekilde döndürüyoruz
        if (checker.matches()) {
            String ilk = checker.group(1);
            String ikinci = checker.group(2);

            System.out.println(ilk);
            System.out.println(ikinci);
        }

        //---------------------------------------------
        String inputString = "She sells sea shells on the sea shore with shells";
        //obtain a Pattern object
        Pattern pattern = Pattern.compile("shells");
        // obtain a matcher object
        System.out.println("input string: " + inputString);
        Matcher matcher = pattern.matcher(inputString);
        inputString = matcher.replaceFirst("pearls");
        System.out.println(" replaceFirst method:" + inputString);
        //use replaceAll method to replace all occurrences of pattern
        inputString = matcher.replaceAll("pearls");
        System.out.println(" replaceAll method:" + inputString);
        //----------------Another----------------------

    }
}
