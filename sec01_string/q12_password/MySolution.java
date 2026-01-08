import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    String str = sc.next();
    String num = "";
    String answer = "";
    for(int i =0; i<str.length();i++){
      if(str.charAt(i)=='#') num+="1";
      else num+="0";
    }
    for(int i=0; i<count;i++){
      answer+=(char)Integer.parseInt(num.substring(i*7,(i+1)*7), 2);
    }
    System.out.println(answer);
    sc.close();
  }
}
