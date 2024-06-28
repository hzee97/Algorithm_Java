import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.print("A");
        }
        else if (a<b){
            System.out.print("B");
        }
        else {
             System.out.print("same");   
        }
    }
}
