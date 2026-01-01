package sec01_string.q05_reverse_specific_char;
import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String str = sc.next();
  char[] s = str.toCharArray();
  int lt = 0, rt = str.length()-1;    
  while(lt<rt){
    while(!Character.isAlphabetic(s[lt])||!Character.isAlphabetic(s[rt])){
    if(!Character.isAlphabetic(s[lt])) lt++;
    if(!Character.isAlphabetic(s[rt])) rt--;
    }
    char tmp = s[lt];
    s[lt]=s[rt];
    s[rt]=tmp;
    lt++;
    rt--;
  } 
  System.out.print(String.valueOf(s));
  sc.close();
  }
}
