import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        int[] arr2 = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            arr2[i]=Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(arr2);

        int comp1 = arr2[0]*arr2[1];
        int comp2 = arr2[arr2.length-1]*arr2[arr2.length-2];
        
        int answer = Math.max(comp1,comp2);

        System.out.print(answer);
    }
}
