public class Assignment_02_WhileLoop2 {
    public static void main(String[] args) {
        int i=6;
        int j=1;
        int k=i;
        while(i>0){
            j=j*i;
            i--;

        }
        System.out.println("Factorial of "+ k +" is:"+j);
    }
}
