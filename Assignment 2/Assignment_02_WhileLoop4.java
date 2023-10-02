public class Assignment_02_WhileLoop4 {
    public static void main(String[] args) {
        int i=942111426;

        int count=0;
        while(i>0){
            int rem=i%10;
            if(rem%2==1){
                count++;
            }
            i=i/10;

        }
        System.out.println("Odd digits are:" +count);
    }
}
