public class Assignment_01_ifelse7 {
    public static void main(String[] args) {
        int sp=1200;
        int cp=1200;
        if(sp>cp){
            System.out.println("profit is:"+(sp-cp));
        } else if (sp==cp) {
            System.out.println("No Profit No Loss");

        } else{
            System.out.println("Loss is:"+(cp-sp));
        }
    }
}
