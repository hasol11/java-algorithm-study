package sec02_array.q06_reversed_prime;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    boolean isTrue = true;
    for(int i=0;i<n;i++){
      int tmp = arr[i];
      int res = 0;
      while(tmp > 0) {
      int t = tmp % 10;
      res = res * 10 + t;
      tmp = tmp / 10;
      }
      isTrue=true;
      if(res == 1) isTrue = false;
      for(int j=2;j<res;j++){
        if(res%j==0){
          isTrue=false;
          break;
        }
      }
      if(isTrue){
        System.out.print(res+" ");
        }
      }
    sc.close();
  }
}
