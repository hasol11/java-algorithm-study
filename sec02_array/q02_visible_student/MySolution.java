package sec02_array.q02_visible_student;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i = 0; i<n; i++){
      array[i]=sc.nextInt();
    }
    int count = 1;
    int max = array[0];
    for(int i = 1; i<n; i++){
      if(max<array[i]){
        max=array[i];
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
