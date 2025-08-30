package sec01_string.q02_case_conversion;

import java.util.Scanner;

public class MySolution {
  public String solution(String str){
    String answer = null;
    StringBuilder sb = new StringBuilder();
    for(char x : str.toCharArray()){
      if(Character.isUpperCase(x)){
        sb.append(Character.toLowerCase(x));
      }else{
        sb.append(Character.toUpperCase(x));
      }
    }
    answer = sb.toString();
    return answer;
  }
  public static void main(String[] args) {
    MySolution T = new MySolution();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
    sc.close();
  }
}
