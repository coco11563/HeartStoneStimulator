package hss.obj;

import hss.obj.imp.Follower;

public class Player implements Follower {

    private static final int status_opponent = 1;
    private static final int status_same_side = 0;

    private static final int max_hold = 10;

    private int HP;
    private int power;
    private int shield;

    public Player(int aHP, int aPower, int aShield) {
        //init player
        if (aHP <= 0)
            this.HP = 30;
        else this.HP = aHP;
        if (aPower <= 0)
            this.power = 0;
        else this.power = aPower;
        if (aShield <= 0)
            this.shield = 0;
        else this.shield = aShield;
    }

    @Override
    public boolean check_alive() {
        if (this.HP < 0) return false;
        else return true;
    }

    @Override
    public void attack(Follower follower) {

    }

    @Override
    public void skill(Follower follower) {

    }

    @Override
    public void death_wisper(Follower follower) {

    }

    @Override
    public void battle_cry(Follower follower) {

    }
}
