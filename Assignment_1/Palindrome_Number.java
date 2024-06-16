public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        int n = x;
       int sum = 0;
       if(x<0){
        return false;
       }
       while(x!=0){
          int r = x%10;
          sum = sum*10 + r;
          x = x/10;
          
       }
       if(sum==n){
        return true;
       }
       else{
        return false;
       }
        
    }
}
