package sec02_array.q07_score_calculation;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n+1];
      for(int i=1;i<n+1;i++){
      arr[i]=sc.nextInt();
      }
      int answer=0;
      int num=1;
      for(int i=1;i<n+1;i++){
        if(arr[i]==1){
          if(arr[i-1]==1){
            num+=1;
            answer+=num;
          }else{
            num=1;
            answer+=1;
          }
        }
      }
      System.out.println(answer);
      sc.close();
  }
}
