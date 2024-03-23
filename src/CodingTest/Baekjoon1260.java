package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1260 {
    static int Edge_arr[][];
    static boolean[] Visited_arr;
    static int N;
    static int M;
    static int V;
    static int count;
    static Queue<Integer> que= new LinkedList<>();
    public static void BFS(int start){
        que.offer(start);
        Visited_arr[start]= true;
        System.out.println(start+" ");
        while(!que.isEmpty()){
            start=que.poll();
            for(int i=1; i<=N;i++){
                if(Edge_arr[start][i]==1 &&Visited_arr[i]==false){
                    que.offer(i);
                    Visited_arr[i]=true;
                    System.out.print(i+ " ");
                }
            }
        }

    }
    public static void DFS(int start){
        Visited_arr[start] = true;
        System.out.print(start +" ");
        if(count==N){
            return;
        }
        count++;
        for(int i=1; i<N;i++){
            if(Edge_arr[start][i]==1 &&Visited_arr[i]==false){
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st=new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V= Integer.parseInt(st.nextToken());

        Edge_arr=new int[1001][1001];
        Visited_arr = new boolean[1001];

        for(int i=0;i<M; i++){
            st=new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            Edge_arr[x][y]=Edge_arr[y][x] =1;

        }
        DFS(V);
        System.out.println();
        Visited_arr =new boolean[1001];
        BFS(V);


    }

}
