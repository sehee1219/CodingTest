package CodingTest;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1012 {
    static boolean[][] visit;
    static int N,M,K;
    static int[][] cabbage;
    static int count;
    static int[] dx={0,-1,0,1}; //
    static int[] dy={1,0,-1,0};

    static void dfs(int x,int y){
        visit[x][y]=true;

        for(int i=0; i<4;i++){
            int cx=x+dx[i];
            int cy=y+dy[i];

            if(cx>=0&&cy>=0&&cx<M&&cy<N){ // 새로운 좌표가 범위 안에 있는지 학인
                if(!visit[cx][cy]&&cabbage[cx][cy]==1){ //방문하지 않은 위치, 배추가 심어져 있으면
                    dfs(cx,cy); //해당좌표를 시작으로 다시 dfs호출
                }
            }
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine()); //테스트 케이스의 개수 받기

        for(int i=0;i<tc;i++){ //테스트 케이스 수만큼 실행
            count =0;
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            M=Integer.parseInt(st.nextToken());
            N=Integer.parseInt(st.nextToken());
            cabbage=new int[M][N];
            visit=new boolean[M][N];

            K=Integer.parseInt(st.nextToken());
            for(int j=0; j<K;j++){
                st=new StringTokenizer(br.readLine()," ");
                int p1=Integer.parseInt(st.nextToken());
                int p2=Integer.parseInt(st.nextToken());
                cabbage[p1][p2]=1;
            }
            for(int x=0; x<M;x++){
                for(int y=0;y<N;y++){
                    if(cabbage[x][y]==1&&!visit[x][y]){
                        dfs(x,y);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }






    }

}
