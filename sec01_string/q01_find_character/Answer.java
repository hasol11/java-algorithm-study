package sec01_string.q01_find_character;

import java.util.Scanner;

public class Answer {
  public int solution(String str, char t){
    str=str.toUpperCase();
    t=Character.toUpperCase(t);
    int answer=0;
    /*for(int i =0;i<str.length();i++){
      if(str.charAt(i)==t){
        answer+=1;
      }
    }*/
    //향상된 for문 forEach 사용 => str은 string 자체는 안되고 iterater이나 배열만 올 수 있다.
    //따라서 문자열을 Char의 배열로 만들어줘야 한다. 
    for(char x: str.toCharArray()){
      if(x==t) answer+=1;
    }
    return answer;
  }

  public static void main(String[] args) {
    Answer T = new Answer();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char t = sc.next().charAt(0);
    System.out.print(T.solution(str, t));
    sc.close();
  }
}
