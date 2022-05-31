public class Plane extends Vehicle{
    private int speed;
    private int acceleration;
    public Plane(int speed, int acceleration){
        super(speed,acceleration);
    }
    @Override
    public int move (){
        return acceleration * 2;
    }
}