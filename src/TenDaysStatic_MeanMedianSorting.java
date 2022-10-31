import java.util.Scanner;

public class TenDaysStatic_MeanMedianSorting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count , total = 0;
        double mean;
        count = scan.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scan.nextInt();
            total += array[i];
        }
        mean = ((double) total) / count;
        System.out.println(mean);
        int j = 0;
        int[] array2 = new int[count];
        for (int i = 0; i < count; i++) {
            array2[i] = array[i];
            while (j < count) {
                if (array2[i] > array[j]) {
                    array2[i] = array[j]; //setting the smallest value
                    array[j] = array[i]; //swapping values
                    array[i] = array2[i]; //swapping values
                }

                j++;
            }
            j = i + 1; //setting the j to nex loop i //or you could just set the j before the while() loop with j=i;
        }
        //j = 0;
        int repeat = 0, rcount = 0, prevrepeat = 0;
        for (int i = 0; i < count - 1; i++) {
            if ((array2[i] == array2[i + 1])) {
                rcount++;
                if (prevrepeat < rcount) {
                    prevrepeat = rcount; //setting the previous counter the new count
                    repeat = array2[i]; //setting a new value to repeated value
                }

            } else {
                if (prevrepeat < rcount) //checking repeating values if number of them bigger than previous one
                    repeat = array2[i]; //if so setting new repeating value

                rcount = 0; //and make zero to check another repeating value
            }
        }
        int centerFirst,centersecond;
        if(count%2==0) { // number of values is odd thre will be two values to be calculated
            centerFirst = (count - 1) / 2;//finding the first value at center
            centersecond = centerFirst + 1;//second value
            System.out.println((double) (array2[centerFirst] + array2[centersecond]) / 2);
        }else{
            centerFirst = (count) / 2;//finding the center value
            System.out.println((double) (array2[centerFirst] ));

        }


        System.out.println(prevrepeat == 0 ? array2[0] : repeat);
//        for (int i = 0; i < count; i++) {
//         System.out.print(array2[i]+" ");
//
//        }

    }
}
