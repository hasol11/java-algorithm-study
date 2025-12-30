package sec01_string.q03_word_in_sentence;

import java.util.Scanner;

public class Review2 {
  public String solution(String str){
    String answer="";
    int min=0;
    int pos;
    while((pos=str.indexOf(' '))!=-1){
      String word = str.substring(0, pos);
      int len = word.length();
      if(min<len){
        min=len;
        answer=word;
      }
      str=str.substring(pos+1);
    }
    if(str.length()>min) answer=str;
    return answer;
  }
  public static void main(String[] args) {
    Review2 R = new Review2();
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    System.out.println(R.solution(text));
    sc.close();
  }
}
