import java.util.HashMap;
import java.util.Scanner;

public class Review {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String string = sc.next();
    for(char x : string.toCharArray()){
      map.put(x, map.getOrDefault(x, 0)+1);
    }
    char answer = ' ';
    int max = Integer.MIN_VALUE;
    for(char key : map.keySet()){
      if(map.get(key)>max){
        max=map.get(key);
        answer=key;
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
