public class GCD_and_LCM {
    public static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long x = A;
        Long y = B;
        Long r = x%y;
        while(r!=0){
            A = B;
            B = r;
            r = A%B;
        }
        
        Long[] a = new Long[2];
        a[0] = (x*y)/B;
        a[1] = B;
        return a;
    }
}
