package sec03_two_pointers.q01_merge_two_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] arr1 = new int[a];
    for(int i=0;i<a;i++){
      arr1[i]=sc.nextInt();
    }
    int b = sc.nextInt();
    int[] arr2 = new int[a+b];
    for(int i=0;i<a+b;i++){
      if(i>=a){
        arr2[i]=sc.nextInt();
      }else{
        arr2[i]=arr1[i];
      }
    }
    Arrays.sort(arr2);
    for(int x : arr2){
      System.out.print(x+" ");
    }
    sc.close();
  }
}
