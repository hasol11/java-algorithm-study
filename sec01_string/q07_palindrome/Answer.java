package sec01_string.q07_palindrome;

import java.util.Scanner;

public class Answer {
  public String solution(String str){
    String answer ="YES";
    str=str.toLowerCase();
    int len = str.length();
    for(int i =0; i<len/2;i++){
      if(str.charAt(i)!=str.charAt(len-i-1)){
        return "NO";
      }
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
