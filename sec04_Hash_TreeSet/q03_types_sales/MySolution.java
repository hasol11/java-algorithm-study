import java.util.HashMap;
import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<k-1;i++){
      map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    }
    int lt = 0;
    for(int rt=k-1;rt<n;rt++){
      map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
      System.out.print(map.size()+" ");
      map.put(arr[lt], map.get(arr[lt])-1);
      if(map.get(arr[lt])==0){
        map.remove(arr[lt]);
      }
      lt++;
    }
    sc.close();
  }
}
