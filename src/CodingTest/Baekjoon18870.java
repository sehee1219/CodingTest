package CodingTest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;


public class Baekjoon18870 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int[] ori=new int[N];
        int[] sort=new int[N];
        HashMap<Integer,Integer> rankingmap = new HashMap<Integer, Integer>();

        for(int i=0;i<N;i++){
            sort[i]=ori[i]=sc.nextInt();
        }
        Arrays.sort(sort);

        int rank=0;
        for(int v:sort){
            if(!rankingmap.containsKey(v)){
                rankingmap.put(v,rank);
                rank++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int key:ori){
            int ranking=rankingmap.get(key);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
