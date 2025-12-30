package sec01_string.q01_find_character;

import java.util.Scanner;

public class Review2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count =0;

    String text = sc.next();
    char ch = sc.next().charAt(0);

    for(char x : text.toCharArray()){
      if(x==Character.toUpperCase(ch)){
        count++;
      }else if(x==Character.toLowerCase(ch)){
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
