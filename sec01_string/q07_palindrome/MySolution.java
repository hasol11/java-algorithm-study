package sec01_string.q07_palindrome;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    str=str.toLowerCase();
    char[] s = str.toCharArray();
    int lt=0, rt=str.length()-1;
    boolean isPallin = true;
    while(lt<rt){
      if(s[lt]!=s[rt]){
        isPallin=false;
        break;
      }
      lt++;
      rt--;
    }
    if(isPallin) System.out.println("YES");
    else System.out.println("NO");
    sc.close();
  }
}
