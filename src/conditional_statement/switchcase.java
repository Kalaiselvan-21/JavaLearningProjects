package conditional_statement;

public class switchcase {

    String hero = "Captain America";

    public void superHero(){
        switch (hero){
            case "Iron Man":
                System.out.println("Iron Man is a super hero");
                break;
            case "Super Man":
                System.out.println("Super Man is a super hero");
                break;
            case "C America":
                System.out.println("Captain America is a super hero");
                break;
            default:
                System.out.println("He is not a super hero");
                break;
        }

    }
    public static void main (String[] args){
        switchcase case1 = new switchcase();
        case1.superHero();
    }
}
