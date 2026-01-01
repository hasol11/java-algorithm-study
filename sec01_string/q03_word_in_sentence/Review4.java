package sec01_string.q03_word_in_sentence;

import java.util.Scanner;

public class Review4 {
  public String solution(String str){
    String answer="";
    int pos = 0;
    int min = 0;
    while((pos=str.indexOf(' '))!=-1){
      String text = str.substring(0, pos);
      if(min<text.length()){
        answer=text;
        min=text.length();
      }
      str=str.substring(pos+1);
    }
    if(str.length()>min){
      answer=str;
    }
    return answer;
  }
  public static void main(String[] args) {
    Review4 R = new Review4();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(R.solution(str));
    sc.close();
  }
}
