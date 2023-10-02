public class Assignment_02_WhileLoop9 {
    public static void main(String[] args) {
        int i=7654321;
       int rev=0;
       int rem=0;

        while (i!=0){
            rem=i%10;
            rev=rev*10+rem;

            i=i/10;
        }
        System.out.println(rev);
    }
}
