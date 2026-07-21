import java.util.Scanner;
import java.util.Stack;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    Stack<Character> stack = new Stack<>();
    char[] arr = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      arr[i] = str.charAt(i);
    }
    for(char x : arr){
      if(x!=')'){
        stack.add(x);
      }
      else if(x==')'){
        while(true){
          char s = stack.pop();
          if(s=='('){
            break;
          }
        }
      }
    }
    for(char x:stack){
      System.out.print(x);
    }
    sc.close();
  }
}
