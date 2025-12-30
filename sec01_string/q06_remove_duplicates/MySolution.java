package sec01_string.q06_remove_duplicates;

import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    //배열로 받아서 비교해서 없으면 저장하도록 해야하나? 
    //배열 선언 때 크기는 length 이용하면 될듯. 
    //근데 StringBulider을 사용하진 못하나? 
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    //일단 배열에 하나씩 담아야하나? => 아 split("") 써서 하면 된다.=> 근데 이러면 하나씩 비교해서 넣는 건 또 다른 배열이 필요한데..
    String[] array = word.split("");
    //Stringbuilder 써서 하면 안되나. array 개선된 for문으로 하나씩 꺼내고 아예 없으면 붙이고, 있으면 .equals()로 비교해서 없으면 붙이기.
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(array[0]);
  }
}
