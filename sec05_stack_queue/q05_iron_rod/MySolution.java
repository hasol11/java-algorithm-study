import java.util.Scanner;
import java.util.Stack;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    String str = sc.next();
    int answer = 0;
    for(int i =0;i<str.length();i++){
      if(!stack.isEmpty()&&str.charAt(i-1)=='('&&str.charAt(i)==')'){
        stack.pop();
        answer+=stack.size();
      }else if(!stack.isEmpty()&&str.charAt(i)==')'){
        answer+=1;
        stack.pop();
      }else{
        stack.push(str.charAt(i));
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
