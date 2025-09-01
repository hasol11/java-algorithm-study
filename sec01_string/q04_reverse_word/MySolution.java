package sec01_string.q04_reverse_word;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    String[] words = new String[count];
    for(int i=0;i<count;i++){
      String word = sc.next();
      String answerWord="";
      for(int j=word.length()-1; j>=0;j--){
        answerWord+=word.charAt(j);
      }
      words[i]=answerWord;
    }
    for(int i=0;i<count;i++){
      System.out.println(words[i]);
      sc.close();
  }
}
}
