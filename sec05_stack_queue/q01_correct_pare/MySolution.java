import java.util.Scanner;
import java.util.Stack;

public class MySolution {
  //스택
  public static void main(String[] args) {
    Stack<String> st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] arr = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
    arr[i] = str.charAt(i);
    }
    for(char input:arr){
      if(input=='('){
        st.push("item");
      } 
      else{
        if(st.empty()){
          System.out.println("NO");
          return;
        }
        st.pop();
      }
    }
    if(st.empty()){System.out.println("YES");}
    sc.close();
  }
}
