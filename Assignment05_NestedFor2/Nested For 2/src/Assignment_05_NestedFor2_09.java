public class Assignment_05_NestedFor2_09 {
    public static void main(String[] args) {
        int num=1;
        for (int i=1;i<=3;i++){
            int num2=3;
            char ch='C';
            for (int j=1;j<=3;j++){
                System.out.print(num*num + ""+ch-- +""+num2-- +" ");
                num++;
            }
            System.out.println();
        }
    }
}
