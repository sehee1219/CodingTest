package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon10610 {
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();

        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        int sum=0;
        for(int i =arr.length-1; i>=0;i--){
            int num=arr[i]-'0';
            sum+=num;
            sb.append(num);
        }
        if(sum%3 !=0 || arr[0]!='0'){
            System.out.println(-1);
            return;
        }
        System.out.println(sb);


    }
}
