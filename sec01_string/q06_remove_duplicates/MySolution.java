package sec01_string.q06_remove_duplicates;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder answer = new StringBuilder();
    String str = sc.next();
    char[] s = str.toCharArray();
    for(int i=0;i<str.length();i++){
      if(i==str.indexOf(s[i])){
        answer.append(s[i]);
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
