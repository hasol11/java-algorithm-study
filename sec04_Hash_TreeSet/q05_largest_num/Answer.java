package sec04_Hash_TreeSet.q05_largest_num;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Answer {
  public int solution(int n, int k, int[] arr) {
    TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int l = j + 1; l < n; l++) {
          treeSet.add(arr[i] + arr[j] + arr[l]);
        }
      }
    }
    int count = 0;
    for (int num : treeSet) {
      count++;
      if (count == k) {
        return num; 
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Answer T = new Answer();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(T.solution(n, k, arr));
  }
}