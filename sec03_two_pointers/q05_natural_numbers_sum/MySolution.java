package sec03_two_pointers.q05_natural_numbers_sum;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int answer = 0, p1 = 0;
    for (p1 = 1; p1 < n; p1++) {
      int p2 =p1+1;
      int sum = p1;
      while (p2 < n && sum<n) {
        sum += p2;
        if (sum == n) {
          answer++;
        }
        p2++;
      }
    }
    System.out.println(answer);
    sc.close(); 
  }
}
