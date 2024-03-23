package CodingTest;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Baekjoon1697 {
    static int N,K;
    static int visited[]= new int[100001];

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String[] inputs=input.split(" ");
        N=Integer.valueOf(inputs[0]);
        K=Integer.valueOf(inputs[1]);
        int result= bfs(N);
        System.out.println(result);
    }
    private static int bfs(int node){
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(node);
        int index=node;
        int n=0;
        visited[index]=1;
        while(queue.isEmpty()==false){
            n=queue.remove();
            if (n==K){
                return visited[n]-1;
            }if (n-1>=0&&visited[n-1]==0){
                visited[n-1]=visited[n]+1;
                queue.add(n-1);
            }if (n+1<=100000&& visited[n+1]==0){
                visited[n+1] =visited[n]+1;
                queue.add(n+1);
            }if (2*n<= 100000&&visited[2*n]==0){
                visited[2*n]=visited[n]+1;
                queue.add(2*n);
            }
        }
        return -1;
    }

}
