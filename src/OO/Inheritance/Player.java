package OO.Inheritance;

public class Player {

    int life = 100;
    int x;
    int y;

    boolean attack(Player opponent){
        int deltaX = Math.abs(x - opponent.x);
        int deltaY = Math.abs(y - opponent.y);

        if(deltaX == 0 && deltaY == 1){
            opponent.life -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            opponent.life -= 10;
            return true;
        }else{
            return true;
        }
    }
    boolean walk(Direction direction){
        switch (direction){
            case NORTH:
                y++;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y--;
                break;
            case WEST:
                x--;
                break;
        }

        return true;
    }
}
