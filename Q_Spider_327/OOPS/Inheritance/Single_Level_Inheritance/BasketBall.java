package Q_Spider_327.OOPS.Inheritance.Single_Level_Inheritance;

public class BasketBall extends Ball {
    String game;

    public static void main(String[] args) {
        BasketBall n = new BasketBall();
        n.setRadius(5.5);
        n.display();
        System.out.println(n.game);
    }

}
