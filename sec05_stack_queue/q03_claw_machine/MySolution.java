package sec05_stack_queue.q03_claw_machine;

import java.util.Scanner;
import java.util.Stack;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int m = sc.nextInt();
    int[] moves = new int[m];
    for(int i = 0;i<m;i++){
      moves[i]=sc.nextInt();
    }
    Stack<Integer> stack = new Stack<>();
    int answer=0;
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(arr[j][moves[i]-1]!=0){
          if(!stack.isEmpty()&&stack.peek()==arr[j][moves[i]-1]){
            stack.pop();
            answer+=2;
          }else{
            stack.push(arr[j][moves[i]-1]);
          }
          arr[j][moves[i]-1]=0;
          break;
        }
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
