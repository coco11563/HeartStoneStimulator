package hss.obj.imp;

public interface Follower {
    public boolean check_alive();
    public void attack(Follower follower);
    public void skill(Follower follower);
    public void death_wisper(Follower follower);
    public void battle_cry(Follower follower);
}
