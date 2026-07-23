import java.util.Scanner;
import java.util.Stack;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    String str = sc.next();
    for(char x : str.toCharArray()){
      if(!stack.isEmpty()&&(x=='+'||x=='-'||x=='*'||x=='/')){
        int st = stack.pop();
        switch(x){
          case '+':
            stack.push((stack.pop())+st);
            break;
          case '-':
            stack.push((stack.pop())-st);
            break;
          case '*':
            stack.push((stack.pop())*st);
            break;
          case '/':
            stack.push((stack.pop())/st);
            break;
          }
      }else{
        stack.push(Character.getNumericValue(x));
      }
    }
    System.out.println(stack.pop());
    sc.close();
  }
}
