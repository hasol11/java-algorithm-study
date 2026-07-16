package sec04_Hash_TreeSet.q05_largest_num;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    sc.close();
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            for (int l = j + 1; l < n; l++) {
                hashSet.add(arr[i] + arr[j] + arr[l]);
            }
        }
    }
    ArrayList<Integer> list = new ArrayList<>(hashSet);
    Collections.sort(list, Collections.reverseOrder());
    if (list.size() < k) {
        System.out.println(-1);
    } else {
        System.out.println(list.get(k - 1));
    }
  }
}