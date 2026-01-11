package sec02_array.q04_fibonacci;

import java.util.Scanner;

public class Answer {
  public int[] solution(int n){
    int[] answer = new int[n];
    answer[0]=1;
    answer[1]=1;
    for(int i=2;i<n;i++){
      answer[i]=answer[i-2]+answer[i-1];
    }
    return answer;
  }
  public static void main(String[] args) {
    Answer A = new Answer();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int x : A.solution(n)) System.out.print(x+" ");
    sc.close();
  }
}
