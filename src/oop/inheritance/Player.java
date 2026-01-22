package oop.inheritance;

public class Player {

    int life = 100;
    int x;
    int y;

    Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean attack(Player player) {
        int detalX = Math.abs(x - player.x);
        int deltaY = Math.abs(y - player.y);

        if (detalX == 0 && deltaY == 1) {
            player.life -= 10;
            return true;
        } else if (detalX == 1 && deltaY == 0) {
            player.life -= 10;
            return true;
        } else {
            return false;
        }
    }

    boolean walk(Direction direction) {

        switch (direction) {
            case N0RTH:
                y--;
                break;
            case SOUTH:
                y++;
                break;
            case EAST:
                x++;
                break;
            case WEST:
                x--;
                break;
        }

        return true;
    }
}
