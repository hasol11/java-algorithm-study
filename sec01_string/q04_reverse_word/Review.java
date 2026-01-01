package sec01_string.q04_reverse_word;

import java.util.Scanner;

public class Review {
  public String[] solution(int count, String[] Input){
    String[] answer = new String[count];
    for(int i = 0; i<count; i++){
      String reversed = new StringBuilder(Input[i]).reverse().toString();
      answer[i]=reversed;
    }
    return answer;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    String[] Input = new String[count];
    for(int i = 0; i<count; i++){
      String text = sc.next();
      Input[i]=text;
    }
    Review R = new Review();
    String[] answer = R.solution(count, Input);
    for(int i =0; i<count;i++){
      System.out.println(answer[i]);
    }
    sc.close();
  }
}
