package business;

import entity.Bee;
import entity.Drone;
import entity.QueenBee;
import entity.WorkerBee;

import java.util.ArrayList;
import java.util.Random;

public class BeeHive {
    private ArrayList<Bee> listBee;

    public void init(){
        this.listBee = new ArrayList<>();

        this.listBee.add(new QueenBee());
        this.listBee.add(new WorkerBee());
        this.listBee.add(new Drone());

        Random rand = new Random();
        for (int i = 0; i < 7; ++i){
            int tmp = rand.nextInt(3) + 1;
            if (tmp == 1){
                this.listBee.add(new QueenBee());
            } else if(tmp == 2){
                this.listBee.add(new WorkerBee());
            }else {
                this.listBee.add(new Drone());
            }
        }
    }

    public ArrayList<Bee> getListBees(){
        return listBee;
    }

    public void attackBees(){
        for (int i = 0; i < this.getListBees().size(); ++i){
            this.getListBees().get(i).damage();
        }
    }

}
