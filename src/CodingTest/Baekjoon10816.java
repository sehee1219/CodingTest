package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10816 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int[] arr=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        StringBuilder sb=new StringBuilder();
        for(int i=0; i<M;i++){
            int key=sc.nextInt();
            sb.append(upperBound(arr,key)-lowerBound(arr,key)).append(' ');
        }
        System.out.println(sb);

    }
    private static int lowerBound(int[] arr, int key){
        int min=0;
        int max=arr.length;

        while(min<max){
            int mid =(min+max)/2;
            if(key<=arr[mid]){
                max=mid;
            }
            else{
                min=max+1;
            }
        }
        return min;
    }
    private static int upperBound(int[] arr, int key){
        int min=0;
        int max=arr.length;

        while(min<max){
            int mid=(min+max)/2;
            if(key<arr[mid]){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
    }
}
