/**
 * Created by roberttaylor on 7/18/17.
 */
public class Main {

    public static void main(String[] args) {

    Gamepiece checker = new Gamepiece();
    checker.setName("Bill");
    checker.setColor("red");
        System.out.println(checker.getPositionX());
        System.out.println(checker.getPositionY());

        checker.freeze();

        checker.move(3, 10);
        System.out.println(checker.getPositionX());
        System.out.println(checker.getPositionY());

        checker.unfreeze();

        checker.move(21, 7);
        System.out.println(checker.getPositionX());
        System.out.println(checker.getPositionY());


    }



}
