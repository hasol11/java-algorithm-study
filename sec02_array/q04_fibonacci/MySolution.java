package sec02_array.q04_fibonacci;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] answer = new int[n];
    answer[0]=1; answer[1]=1;
    for(int i=2;i<n;i++){
      answer[i]=answer[i-2]+answer[i-1];
    }
    for(int i=0;i<n;i++){
      System.out.print(answer[i]+" ");
    }
    sc.close();
  }
}
