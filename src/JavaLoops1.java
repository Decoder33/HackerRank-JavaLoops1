import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


        /* Given an integer, N , print its first 10 multiples.
            Each multiple N x i(where i >= 1 and i <= 10 )
        should be printed on a new line in the form: N x i = result.
         */

class JavaLoops1 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter any number from 1 to 9: ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        System.out.println();
        for(int i=1;i<=10;i++){
            System.out.println(N+" x "+ i+" = " + N * i);
        }
        scanner.close();
    }
}

