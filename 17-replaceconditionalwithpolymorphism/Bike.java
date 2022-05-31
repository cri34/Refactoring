public class Bike extends Vehicle{
        private int speed;
        private int acceleration;
        public Bike(int speed, int acceleration){
               super(speed,acceleration);
                }
        @Override
        public int move (){
                return speed * 10;
        }
}