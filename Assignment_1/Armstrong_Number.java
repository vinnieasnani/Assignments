public class Armstrong_Number {
    public static String armstrongNumber(int n){
        // code here
        String s1 = "Yes";
        String s2 = "No";
        int x = n;
        double sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum + Math.pow(r,3);
            n = n/10;
        }
        if(sum==x){
            return s1;
        }
        return s2;
    }
}
