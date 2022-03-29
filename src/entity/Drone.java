package entity;

public class Drone extends Bee{
    public Drone(){
        super();
        this.setType("Drone");
    }

    @Override
    public void updateStatus() {
        if (this.getHealth() < 50){
            this.setAlive(false);
        }
    }
}
