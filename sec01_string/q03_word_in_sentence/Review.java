package sec01_string.q03_word_in_sentence;

import java.util.Scanner;

public class Review {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String textArray[] = text.split(" ");
    int count =0;
    String answer="";

    for (String str : textArray){
      if(count<str.length()){
        answer=str;
        count=str.length();
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
