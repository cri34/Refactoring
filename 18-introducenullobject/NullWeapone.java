public  class NullWeapone extends Weapone{
    public Weapon(int damage) {
        super(damage);
    }
    @Override
    public int getDamage() {
        return 5;
    }
}