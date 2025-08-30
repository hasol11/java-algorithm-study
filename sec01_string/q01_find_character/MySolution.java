package sec01_string.q01_find_character;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    int count =0;
    Scanner sc = new Scanner(System.in);
    String text = sc.next();
    char alphabet=sc.next().charAt(0);
    for(int i=0; i<text.length();i++){
      if(text.charAt(i)==Character.toUpperCase(alphabet)){
        count+=1;
      }else if(text.charAt(i)==Character.toLowerCase(alphabet)){
        count+=1;
      }
    }
    System.out.println(count);
    sc.close();
    }
}
