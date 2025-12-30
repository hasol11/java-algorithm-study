package sec01_string.q02_case_conversion;

import java.util.Scanner;

public class Answer {
  public String solution(String str){
    String answer="";
    for(char x : str.toCharArray()){
      if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
      else answer+=Character.toLowerCase(x);
    }
    return answer;
  }
  public static void main(String[] args) {
    Answer A = new Answer();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(A.solution(str));
    sc.close();
  }
}
