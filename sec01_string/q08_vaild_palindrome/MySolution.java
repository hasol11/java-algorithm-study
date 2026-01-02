import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str_final ="";
    str=str.toLowerCase();
    for(char x : str.toCharArray()){
      if(Character.isAlphabetic(x)){
        str_final+=x;
      }
    }
    int len = str_final.length();
    boolean isPalin = true;
    for(int i =0;i<len/2;i++){
      if(str_final.charAt(i)!=str_final.charAt(len-i-1)){
        isPalin=false;
        break;
      }
    }
    if(isPalin) System.out.println("YES");
    else System.out.println("NO");
    sc.close();
  }
}
