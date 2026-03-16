import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][5];
    for(int i=0;i<n;i++){
      for(int j=0;j<5;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int[] countList = new int[n+1];
    for(int i=0;i<n;i++){
      int count=0;
      for(int j=0;j<n;j++){
        for(int k=0;k<5;k++){
          if(arr[i][k]==arr[j][k]){
            count++;
            break;
          }
        }
      }
      countList[i+1]=count;
    }
    int answer=0;
    int max=0;
    for(int i=1;i<n+1;i++){
      if(countList[i]>max){
        max=countList[i];
        answer=i;
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
