package sec03_two_pointers.q04_contiguous_subsequence;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int answer = 0;
    for (int i = 0; i < n; i++) {
      int sum = arr[i];
      int p = i + 1;
      while (sum <= m && p <= n-1 ) {
        sum += arr[p];
        if (sum == m)
          answer++;
        p += 1;
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
