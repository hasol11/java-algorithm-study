import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("A", 0);
    map.put("B", 0);
    map.put("C", 0);
    map.put("D", 0);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String vote = sc.next();
    for (int i = 0; i < n; i++) {
      if(vote.charAt(i)=='A') map.put("A",map.get("A")+1);
      if(vote.charAt(i)=='B') map.put("B",map.get("B")+1);
      if(vote.charAt(i)=='C') map.put("C",map.get("C")+1);
      if(vote.charAt(i)=='D') map.put("D",map.get("D")+1);
    }
    Integer maxValue = Collections.max(map.values());
    String answer = "";
    for(Map.Entry<String,Integer> entry : map.entrySet()){
      if(entry.getValue()==maxValue) answer=entry.getKey();
    }
    System.out.println(answer);
    sc.close();
  }
}
