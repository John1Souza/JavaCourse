package OO.Inheritance;

public class Hero extends Player{
    //boolean attack(Player opponent){
    //    int deltaX = Math.abs(x - opponent.x);
    //    int deltaY = Math.abs(y - opponent.y);
    //
    //    if(deltaX == 0 && deltaY == 1){
    //        opponent.life -= 20;
    //         return true;
    //    } else if (deltaX == 1 && deltaY == 0) {
    //        opponent.life -= 20;
    //        return true;
    //    }else{
    //        return true;
    //    }
    //}


    @Override
    boolean attack(Player opponent) {
        boolean attack1 = super.attack(opponent);
        boolean attack2 = super.attack(opponent);
        return attack1 || attack2;
    }
}
