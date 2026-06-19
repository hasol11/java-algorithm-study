package sec02_array.q12_mentoring;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int answer = 0;
    for(int a=1;a<=n;a++){
      for(int b=1;b<=n;b++){
        if(a==b) continue;
        int win = 0;
        for(int t=0;t<m;t++){
          int posA=0;
          for(int k=0;k<n;k++){
            if(arr[t][k]==a){
              posA=k;
              break;
            }
          }
          int posB=0;
          for(int k=0;k<n;k++){
            if(arr[t][k]==b){
              posB=k;
              break;
            }
          }
          if(posA<posB) win++;
        }
        if(win == m) answer++;
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
