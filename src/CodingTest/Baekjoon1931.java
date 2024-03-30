package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int[][] time=new int[N][2]; //time[][0]은 시작지점 ,time[][1]은 종료지점
        StringTokenizer st;


        for(int i=0;i<N;i++) {

          st= new StringTokenizer(br.readLine()," ");//새로운 줄 읽어야해서
          time[i][0]= Integer.parseInt(st.nextToken());
          time[i][1]= Integer.parseInt(st.nextToken());
        }
        //끝나는 시간을 기준으로 정렬하기 위헤 compare 재정의
        Arrays.sort(time, new Comparator<int[]>(){
            @Override
            public int compare(int [] o1,int[] o2){
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1] -o2[1];
            }
        });
        int count=0;
        int prev_end_time=0;

        for(int i=0; i<N;i++){
            if(prev_end_time<=time[i][0]){
                prev_end_time=time[i][1];
                count++;
            }
        }
        System.out.println(count);




    }
}
