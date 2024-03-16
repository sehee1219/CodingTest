package CodingTest;

import java.util.Arrays;

class ProgrammersImmigraiton {
    public long solution(int n, int[] times){
        long answer =0;
        Arrays.sort(times);
        long min=0;
        long max=times[times.length-1]*(long)n;
        while(min<=max){
            long mid=(min+max)/2;
            long complete =0;
            for(int i=0;i<times.length;i++){
                complete+=mid/times[i];
            }
            if(complete<n){
                min=mid+1;
            }else{
                max=mid-1;
                answer=mid;
            }

        }
        return answer;
    }
}
