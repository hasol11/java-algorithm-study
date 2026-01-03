package sec01_string.q10_shortest_distance;

import java.util.Scanner;

public class MySolution2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char s = sc.next().charAt(0);
    int[] answer = new int[str.length()];
    int p = 1000;
    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i)==s) p=0;
      else p+=1;
      answer[i]=p;
    }
    p = 1000;
    for(int i = str.length()-1; i>=0; i--){
      if(str.charAt(i)==s) p=0;
      else p+=1;
      if(answer[i]>p){answer[i]=p;}
    }
    for(int x : answer){
      System.out.print(x+" ");
    }
    sc.close();
  }
}
