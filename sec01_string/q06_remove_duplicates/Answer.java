package sec01_string.q06_remove_duplicates;

import java.util.Scanner;

public class Answer {
  public String solution(String str){
    String answer="";
    for(int i=0;i<str.length();i++){
      if(i==str.indexOf(str.charAt(i))){
        answer+=str.charAt(i);
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    Answer A = new Answer();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(A.solution(str));
  }
}
