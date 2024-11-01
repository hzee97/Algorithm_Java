import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int d = Integer.parseInt(arr[2]);

        int go = 0;
        if (d%a==0){
            go = go+a;
        } else {
            go = d +(d/a)*b;
        }

        int back = 0;
        if (d%b==0){
            back = back+b;
        } else {
            back = d +(d/b)*a;
        }

        int answer = go + back;
        System.out.print(answer);
    }
}