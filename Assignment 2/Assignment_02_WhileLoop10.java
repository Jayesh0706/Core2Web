public class Assignment_02_WhileLoop10 {
    public static void main(String[] args) {
        int i=2332;
        int number=i;
        int rem=0;
        int rev=0;
        while (i!=0){
            rem=i%10;
            rev=rev*10+rem;
            i=i/10;
        }
        System.out.println(rev);
        if(number==rev){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("No Palindrome");
        }
    }
}
