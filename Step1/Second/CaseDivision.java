package Step1.Second;

import java.util.Scanner;

public class CaseDivision {
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
    CaseDivision T = new CaseDivision();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
    sc.close();
  }
}
