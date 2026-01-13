import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int count = 0;
  int[] ch = new int[n+1];
  for(int i = 2; i <= n ; i++){
    if(ch[i]==0){
      count++;
      for(int j=i;j<=n;j=j+i) ch[j]=1;
    }
    }
    System.out.println(count);
    sc.close();
  }
}
