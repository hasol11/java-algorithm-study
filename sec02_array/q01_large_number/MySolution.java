import java.util.Scanner;

public class MySolution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int[] array = new int[count];
    for(int i = 0; i <count; i++){
      array[i]=sc.nextInt();
    }
    System.out.print(array[0]+" ");
    for(int i =1; i< count; i++){
      if(array[i-1]<array[i]) System.out.print(array[i]+" ");
    }
    sc.close();
  }
}
