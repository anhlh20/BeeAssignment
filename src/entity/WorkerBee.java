package entity;

public class WorkerBee extends Bee{
    public WorkerBee(){
        super();
        this.setType("WorkerBee");
    }

    @Override
    public void updateStatus() {
        if (this.getHealth() < 70){
            this.setAlive(false);
        }
    }
}
