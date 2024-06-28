import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=0;
        int m=0;
        for (int i=0; i<5; i++){
            String start = sc.next();  // 출근시간
            String end = sc.next();    // 퇴근시간

            String[] start_time = start.split(":");
            String[] end_time = end.split(":");
            
            h+=Integer.parseInt(end_time[0])-Integer.parseInt(start_time[0]);
            m+=Integer.parseInt(end_time[1])-Integer.parseInt(start_time[1]);
        }
        System.out.print(h*60+m);
    }
}
