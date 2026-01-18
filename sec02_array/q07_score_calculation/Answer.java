package sec02_array.q07_score_calculation;

import java.util.Scanner;

public class Answer {
  public int solution(int n,int[] arr){
    int answer=0, cnt=0;
    for(int i=0;i<n;i++){
      if(arr[i]==1){
        cnt++;
        answer+=cnt;
      }
      else cnt=0;
    }
    return answer;
  }
  public static void main(String[] args) {
    Answer A = new Answer();
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(A.solution(n, arr));
    sc.close();
  }
}
