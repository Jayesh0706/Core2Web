public class Assignment_02_WhileLoop5 {
    public static void main(String[] args) {
        int i=942111423;
        while(i>0){
            int rem=i%10;
            if(rem%2==0){
                System.out.println(rem*rem+" is square");
            }
            i=i/10;
        }

    }
}
