package sec01_string.q11_string_compression;

import java.util.Scanner;

public class Answer {
  public String solution(String s){
    String answer = "";
    s=s+" ";
    int cnt =1;
    for(int i =0;i<s.length()-1;i++){
      if(s.charAt(i)==s.charAt(i+1)) cnt++;
      else{
        answer+=s.charAt(i);
        if(cnt>1) answer+=String.valueOf(cnt);
        cnt=1;
      }
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
