package sec01_string.q02_case_conversion;

import java.util.Scanner;

public class Review {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String text = sc.next();
    for(char x : text.toCharArray()){
      sb.append((Character.isUpperCase(x))? Character.toLowerCase(x):Character.toUpperCase(x));
      }
      System.out.println(sb);
      sc.close();
    }
  }
