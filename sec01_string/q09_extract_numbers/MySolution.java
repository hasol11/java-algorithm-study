package sec01_string.q09_extract_numbers;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    str=str.toUpperCase().replaceAll("[^0-9]","");
    int answer=Integer.parseInt(str);
    System.out.println(answer);
    sc.close();
  }
}
