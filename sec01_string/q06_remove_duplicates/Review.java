package sec01_string.q06_remove_duplicates;

import java.util.Scanner;

public class Review {
  public String solution(String str){
    String answer="";
    char[] s = str.toCharArray();
    for(int i = 0; i<str.length();i++){
      if(i==str.indexOf(str.charAt(i))){
        answer+=s[i];
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    Review R = new Review();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(R.solution(str));
    sc.close();
  }
}
