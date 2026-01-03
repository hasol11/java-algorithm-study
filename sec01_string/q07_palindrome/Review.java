package sec01_string.q07_palindrome;

import java.util.Scanner;

public class Review {
  public String solution(String str){
    String answer="NO";
    String s = new StringBuilder(str).reverse().toString();
    if(str.equalsIgnoreCase(s)) answer="YES";
    return answer;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Review R = new Review();
    String str = sc.next();
    System.out.println(R.solution(str));
    sc.close();
  }
}
