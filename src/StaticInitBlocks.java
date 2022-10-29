import java.util.Scanner;
//https://www.c-sharpcorner.com/UploadFile/3614a6/static-initialization-block-in-java/#:~:text=A%20Static%20Initialization%20Block%20in,the%20main%20method(%20)%20regardless.
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

