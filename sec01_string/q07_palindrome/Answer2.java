package sec01_string.q07_palindrome;

import java.util.Scanner;

public class Answer2 {
    public String solution(String str){
    String answer ="NO";
    String tmp = new StringBuilder(str).reverse().toString();
    if(str.equalsIgnoreCase(tmp)) answer="YES";
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
