import java.util.Scanner;
import java.util.Stack;

public class Answer {
    public String Solution(String s) {
        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                st.push(x);
            } else {
                if (st.isEmpty()) {
                    return "NO";
                }
                st.pop();
            }
        }
        if (st.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) { 
            String str = sc.next();
            System.out.println(T.Solution(str));
        }
        sc.close();
    }
}