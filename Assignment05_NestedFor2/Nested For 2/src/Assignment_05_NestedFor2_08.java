public class Assignment_05_NestedFor2_08 {
    public static void main(String[] args) {
        char big='A';
        char small='a';
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (j%2==1){
                    System.out.print(big + " ");

                }else {
                    System.out.print(small +" ");

                }
                big++;
                small++;
            }
            System.out.println();
        }
    }
}
