package sec03_two_pointers.q02_find_common_element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MySolution {
  public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
    ArrayList<Integer> answer = new ArrayList<>();
    Arrays.sort(a);
    Arrays.sort(b);
    int posA = 0, posB = 0;
    while (posA < n && posB < m) {
      if (a[posA] == b[posB]) {
        answer.add(a[posA++]);
        posB++;
      } else if (a[posA] < b[posB])
        posA++;
      else
        posB++;
    }
    return answer;
  }
  public static void main(String[] args) {
    MySolution M = new MySolution();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
    }
    for(int x : M.solution(n, m, a, b)) System.out.print(x+" ");
    sc.close();
  }
}
