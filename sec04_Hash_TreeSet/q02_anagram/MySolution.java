import java.util.HashMap;
import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next().toLowerCase();
    String str2 = sc.next().toLowerCase();
    for(char x: str1.toCharArray()){
      map1.put(x, map1.getOrDefault(x, 0)+1);
    }
    for(char x:str2.toCharArray()){
      map2.put(x, map2.getOrDefault(x, 0)+1);
    }
    if(map1.equals(map2)) System.out.println("YES");
    else System.out.println("NO");
    sc.close();
  } 
}
