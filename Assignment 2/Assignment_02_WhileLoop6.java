public class Assignment_02_WhileLoop6 {
    public static void main(String[] args) {
        int i=1;
        int j=0;
        int k=1;
        while(i<=10){
            if (i % 2 ==0){
                j=j+i;

            }else{
                 k=k*i;
            }
            i++;

        }
        System.out.println("even sum: "+j);
        System.out.println("odd multiplication: "+k);

    }
}
