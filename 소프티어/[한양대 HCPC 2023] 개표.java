import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int n = sc.nextInt();
            int set = n/5;
            int single = n%5;
            for (int j=0; j<set; j++){
                System.out.print("++++ ");
            }
            for (int j=0; j<single; j++){
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}