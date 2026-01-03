package sec01_string.q10_shortest_distance;

import java.util.ArrayList;
import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    ArrayList<Integer> array = new ArrayList<>();
    ArrayList<Integer> answer = new ArrayList<>();
    char s = sc.next().charAt(0);
    for(int i =0;i<str.length();i++){
      if(str.charAt(i)==s){
        array.add(i);
      }
    }
    for(int i = 0 ; i < str.length(); i++){
      int min =str.length();
      for(int x : array){
        if(min>Math.abs(i-x)){
          min=Math.abs(i-x);
        }
      }
      answer.add(min);
    }
    for(int x : answer){
      System.out.print(x+" ");
    }
    sc.close();
  }
}
