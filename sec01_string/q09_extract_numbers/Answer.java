package sec01_string.q09_extract_numbers;

import java.util.Scanner;

public class Answer {
  public int solution(String s){
    int answer=0;
    for(char x : s.toCharArray()){
      if(x>=48&&x<=57) answer=answer*10+(x-48);
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
