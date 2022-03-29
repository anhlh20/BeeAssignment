package entity;

import java.util.Random;

public abstract class Bee {
    /*
    - thuoc tinh: type, health, alive
    Contructor: mac dinh: health = 100, alive = true

    getter, setter cua cac thuoc tinh
    phuong thuc: damage:
        chỉ thực hiện nếu ong còn sống
            Random 1 số ngẫu nhiên (0-100)
            thực hiện giảm sức khỏe của ong xuống
    phuong thuc: updateStatus:
        thực hiện kiểm tra trạng thái (sống hay chết của từng loại ong)
        (lưu ý: ở phương thức setHealth(): phải gọi đến phương thức này.

    toString: hien thi ket qua ra UI
     */
    private String type;
    private int health;
    private boolean alive;

    public Bee(){
        this.alive = true;
        this.health = 100;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        this.updateStatus();
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract void updateStatus();

    public void damage(){
        Random rand = new Random();

        if(this.isAlive()){
            int dam = rand.nextInt(100) + 1;
//            System.out.println("damage = " + dam);
            int healthRemain = this.getHealth() - dam;

            if(healthRemain > 0) {
                this.setHealth(healthRemain);
            } else {
                this.setHealth(0);
            }
        }
    }
    @Override
    public String toString(){
        return this.getType() + "\t" + this.getHealth() + "\t" + (this.isAlive() ? "alive":"dead");
    }
}
