import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min_a = 1000000;
        int min_b = 1000000;

        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (min_b>y){
                min_a = x;
                min_b = y;
            }
        }
        System.out.println(min_a+" "+min_b);
        sc.close();
    }
}
