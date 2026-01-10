package sec02_array.q03_rock_paper_sissors;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    char[] answer = new char[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      b[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(a[i]==b[i]){
        answer[i]='D';
      }else{
        if(a[i]==1){
          answer[i]=(b[i]==2)?'B':'A';
        }else if(a[i]==2){
          answer[i]=(b[i]==1)?'A':'B';
        }else{
          answer[i]=(b[i]==1)?'B':'A';
        }
      }
    }
    for(int i =0;i<n;i++){
      System.out.println(answer[i]);
    }
    sc.close();
  }
}
