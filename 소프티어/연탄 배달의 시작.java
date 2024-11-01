import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();   // 남아있는 개행 문자 제거
        String str = sc.nextLine();  
        String[] numbers = str.split(" ");

        int minn=Integer.parseInt(numbers[1])-Integer.parseInt(numbers[0]);
        int diff;
        int cnt=1;
        for(int i=1; i<numbers.length-1; i++){
            diff=Integer.parseInt(numbers[i+1])-Integer.parseInt(numbers[i]);
            if (diff==minn){
                cnt+=1;
            }else if(diff<minn){
                minn=diff;
                cnt=1;
            }else{
                continue;
            }
        }
        sc.close();
        System.out.println(cnt);
    }
}
