import java.util.Scanner;

public class Review {
  public String solution(String str){
    String answer = "NO";
    str = str.toUpperCase().replaceAll("[^A-Z]", "");
    String s = new StringBuilder(str).reverse().toString();
    if(str.equals(s)) answer="YES";
    return answer;
  }
  public static void main(String[] args) {
    Review R = new Review();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(R.solution(str));
    sc.close();
  }
}
