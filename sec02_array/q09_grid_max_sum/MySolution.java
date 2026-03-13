package sec02_array.q09_grid_max_sum;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] array = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        array[i][j]=sc.nextInt();
      }
    }
    int[] answer = new int[3];
    //가로 최고 합
    int maxRowSum = 0;
    for(int i=0;i<n;i++){
      int rowSum = 0;
      for(int j=0;j<n;j++){
        rowSum+=array[i][j];
      }
      if(rowSum>maxRowSum){
        maxRowSum=rowSum;
      }
    }
    //세로 최고 합
    int maxColSum = 0;
    for(int j=0;j<n;j++){
      int colSum = 0;
      for(int i=0;i<n;i++){
        colSum+=array[i][j];
      }
      if(colSum>maxColSum){
        maxColSum=colSum;
      }
    }
    //대각선 최고 합
    int maxDiagSum = 0;
    for(int i=0;i<n;i++){
      maxDiagSum+=array[i][i];
    }
    //최고 합 구하기
    answer[0] = maxRowSum;
    answer[1] = maxColSum;
    answer[2] = maxDiagSum;
    int maxSum = 0;
    for(int i=0;i<3;i++){
      if(answer[i]>maxSum){
        maxSum=answer[i];
      }
    }
    System.out.println(maxSum);
    sc.close();
  }
}
