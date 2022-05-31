public class Car extends Vehicle{
    private int speed;
    private int acceleration;
    public Car(int speed, int acceleration){
        super(speed,acceleration);
    }
    @Override
    public int move (){
       return speed * acceleration * 5;
    }
}