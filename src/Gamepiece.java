/**
 * Created by roberttaylor on 7/18/17.
 */


public class Gamepiece {

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public Gamepiece() {
       int positionY = 0;
       int positionX = 0;
       boolean frozen = false;
    }



    public void move(int newX, int newY) {
        if (!frozen) {
            positionX = newX;
            positionY = newY;
        }

    }

    public void freeze() {
        frozen = true;

    }

    public void unfreeze() {
        frozen = false;

    }

}
