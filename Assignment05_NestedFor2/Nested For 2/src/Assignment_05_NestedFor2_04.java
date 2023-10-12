public class Assignment_05_NestedFor2_04 {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            char ch='A';
            for (int j=1;j<=3;j++){
                System.out.print(j+""+ch++ +" ");

            }
            System.out.println();
        }
    }
}
