package entity;

public class QueenBee extends Bee{
    public QueenBee(){
        super();
        this.setType("QueenBee");
    }

    @Override
    public void updateStatus() {
        if (this.getHealth() < 20){
            this.setAlive(false);
        }
    }
}
