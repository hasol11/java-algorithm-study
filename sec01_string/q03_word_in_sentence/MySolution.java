package sec01_string.q03_word_in_sentence;

import java.util.Scanner;

public class MySolution {
  public String solution(String str){
    String answer = null;
    int count=0;
    String[] words = str.split(" ");
    for(String word:words){
      if(word.length()>count){
        answer=word;
        count=word.length();
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    MySolution T = new MySolution();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(T.solution(str));
    sc.close();
  }
}
