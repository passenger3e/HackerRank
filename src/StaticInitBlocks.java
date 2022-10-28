import java.util.Scanner;

public class StaticInitBlocks {
    static int b,h,area;
    static boolean flag=false;
    static {
        Scanner scan =new Scanner(System.in);
        b=scan.nextInt();
        h=scan.nextInt();
        if(b<=0||h<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            //throw new Exception("java.lang.Exception: Breadth and height must be positive");
        }else{
            flag=true;
            area=b*h;
            System.out.println(area);
        }
    }
    public static void main(String[] args) {

    }
}

