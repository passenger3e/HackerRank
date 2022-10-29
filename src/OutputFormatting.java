import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/*
http://makale.kodmerkezi.net/java-regular-expressions-duzenli-ifadeler.html
https://cihanozde.gitbooks.io/csd-ileri-java-ii-kurs-notlari-oguz-karan/content/11regular_expressions.html
https://www.digitalocean.com/community/tutorials/java-printf-method
*if you don't specify all formats right aligned by default
* - will make them left aligned
* Locale.English to use comma as digit grouping Instead of dot hint German uses dot
%c character
%d decimal (integer) number (base 10)
%e exponential floating-point number
%f floating-point number
&.4f presion up to 4 decimal places after dot
%5.4f allocates 5 space
%05.2f filling with zeros empty space on the left side
%i integer (base 10)
%o octal number (base 8)
%s String
%u unsigned decimal (integer) number
%x number in hexadecimal (base 16)
%t formats date/time
%% print a percent sign
\% print a percent sign
%n or \n  line separators

\b backspace
\f next line first character starts to the right of current line last character
\n newline
\r carriage return
\t tab
\\ backslash
 */
public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 0; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            // String convertedInt=Integer.toString(x);
            //Complete this line
            System.out.printf("[%-15s][%03d][%03d]\n", s1, x, y);  //changed the output just to see different outputs. this is not exactly answer of the challenge.
        }
        System.out.println("================================");
        //---------------Other practices----------

        String[] months =
                {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
                        "Sep", "Oct", "Nov", "Dec"};
        Double[] temper =
                {70.3, 70.8, 73.8, 77.0, 80.7, 83.4, 84.5, 84.4, 83.4, 80.2, 76.3, 72.0};
        Double[] humid =
                {69.0, 67.0, 66.0, 64.0, 66.0, 69.0, 67.0, 67.0, 70.0, 69.0, 69.0, 70.0};

        System.out.printf("            %7s%7s%7s%7s%7s%7s%7s%7s%7s%7s%7s%7s\n",
                (Object[]) months);
        System.out.printf("________________________________________"
                + "________________________________________________________\n");
        System.out.printf("Temperature:%7.1f%7.1f%7.1f%7.1f%7.1f"
                        + "%7.1f%7.1f%7.1f%7.1f%7.1f%7.1f%7.1f\n",
                (Object[]) temper);
        System.out.printf("   Humidity:%7.1f%7.1f%7.1f%7.1f%7.1f"
                        + "%7.1f%7.1f%7.1f%7.1f%7.1f%7.1f%7.1f\n",
                (Object[]) humid);

        System.out.println("repeating 'x' 10 times: " + "x".repeat(10));

        int gap = 6;

        System.out.printf("%0" + gap + "d\n", 8000);
        System.out.printf(Locale.ENGLISH, "%,d\n", 8000); //comma
        System.out.printf(Locale.CANADA, "%,d\n", 8000); //comma
        System.out.printf(Locale.CHINA, "%,d\n", 8000); //comma
        System.out.printf(Locale.GERMAN, "%,d\n", 8000); // dot
        System.out.printf(Locale.ROOT, "%,d\n", 8000); //comma
        System.out.format("%05d\n",200);
        System.out.printf("%s\f%S\n","hello","world"); // \f doesnt work
        System.out.println(String.format("[%-10S]\n","hello world"));
        float[] num1=new float[]{5.25487f,3.141516f};
        StringBuilder formatstring=new StringBuilder();
        for(float vs:num1)
        {
            formatstring.append(String.format("[%5.2f] ",vs)); //will create formating depends on quantity of the given numbers, like you can make a method so can call to append
        }
        System.out.println(String.format(formatstring.toString()));
        System.out.println("-------");
        Float[] num2=new Float[]{2.28144f,3.1415f,1.0002f};
        System.out.println("Calling first formatting");
        System.out.println("Returned: "+formatFloat( 5.25487,3.141516f));
        System.out.println("First formatting ended\nCalling second formatting");
        System.out.println("Returned: "+formatFloat2( num2));

        System.out.printf("This is a formatting from an array: %.2f %.2f %.3f",(Object[])num2);


    }
    public static String formatFloat(Object...obj){
        StringBuilder stBuilder=new StringBuilder();
        for(Object vs:obj){
            stBuilder.append("%2.2f ");
        }
        System.out.printf("1- %.2f %5f\n",obj);
        System.out.printf("2- %d\n",obj.length);
        return String.format(stBuilder.toString().trim(), obj); //trim both ends,leading and trailing whitespace
    }
    public static String formatFloat2(Float...obj){
        StringBuilder stBuilder=new StringBuilder();
        for(Float vs:obj){
            stBuilder.append("%2.2f ");
            //System.out.println(vs);
        }
        System.out.println("4- "+stBuilder.toString().trim());
        System.out.println("Object is: "+obj);
        return String.format(stBuilder.toString().trim(), obj);
    }
}
