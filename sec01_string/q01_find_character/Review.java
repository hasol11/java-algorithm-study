package sec01_string.q01_find_character;

import java.util.Scanner;

public class Review {
  public int solution(String str, char t){
    int answer = 0;
    str = str.toUpperCase();
    t = Character.toUpperCase(t);
    for(char x : str.toCharArray()){
      if(x==t){
        answer+=1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Review T = new Review();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char t = sc.next().charAt(0);
    System.out.print(T.solution(str, t));
    sc.close();
  }
}
