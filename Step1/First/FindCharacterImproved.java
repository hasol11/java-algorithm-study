package Step1.First;

import java.util.Scanner;

public class FindCharacterImproved {
  public static void main(String[] args) {
    //대소문자 구분 없이 비교 후 개수 출력
    int count = 0;
    Scanner sc = new Scanner(System.in);

    String inputString = sc.next().toLowerCase();
    char targetChar = sc.next().charAt(0);
    targetChar = Character.toLowerCase(targetChar);

    for(int i=0;i<inputString.length();i++){
      if(inputString.charAt(i)==targetChar){
        count+=1;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
