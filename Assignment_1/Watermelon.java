import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
	   Scanner obj = new Scanner(System.in);
	   int t = obj.nextInt();
	  if(t%2==0 && t>2){
	      System.out.println("YES");
	  }
	  else{
	      System.out.println("NO");
	  }
	   
	}
}
