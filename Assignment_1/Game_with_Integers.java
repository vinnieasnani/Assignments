import java.util.Scanner;

public class Game_with_Integers {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	  int[] a = new int[t];
	  for(int i = 0;i<t;i++){
	      a[i] = sc.nextInt();
	  }
	  for(int i = 0;i<t;i++){
	      if(a[i]%3==0){
	          System.out.println("Second");
	      }
	      else{
	          System.out.println("First");
	      }
	  }
	   
	}
}
