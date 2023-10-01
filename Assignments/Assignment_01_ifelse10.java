public class Assignment_01_ifelse10 {
    public static void main(String[] args) {
        System.out.println("What cricket match is played? :");
        int x=45;
        if(x==10){
            System.out.println("Match is T10");
        }else if(x==20){
            System.out.println("Match is T20");
        }else if(x==50){
            System.out.println("Match is One Day");
        }else if(x>50){
            System.out.println("Match is Test");
        }else {
            System.out.println("Match not known");
        }
    }
}
