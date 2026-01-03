package sec01_string.q09_extract_numbers;

import java.util.Scanner;

public class Review {
  public int solution(String s){
    int answer=0;
    for(char x : s.toCharArray()){
      if(x>=48&&x<=57) answer=answer*10+(x-48)
;    }
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
