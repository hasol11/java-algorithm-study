package sec02_array.q12_mentoring;

import java.util.Scanner;

public class Review {
  public int solution(int n, int m, int[][] arr){
    int answer = 0;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        int cnt = 0;
        // i의 위치와 j의 위치를 구해서 i<j 이면 성립을 하는 것
        for(int k=0;k<m;k++){
          int posi =0, posj=0;
          for(int s=0;s<n;s++){
            if(arr[k][s]==i) posi=s;
            if(arr[k][s]==j) posj=s;
          }
          if(posi<posj) cnt++;
        }
        if(cnt==m) answer++;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    Review R = new Review();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println(R.solution(n, m, arr));
    sc.close();
  }
}
