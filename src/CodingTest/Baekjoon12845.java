package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon12845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] arr=br.readLine().split(" ");

        int i;
        int max=0, sum=0;
        for(i=0;i<n;i++){
            int L=Integer.parseInt(arr[i]);
            sum+= L;
            if(max<L){
                max=L;
            }
        }
        int result=sum+(max*(n-2));
        System.out.println(result);



    }
}
