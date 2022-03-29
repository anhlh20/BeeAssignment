package ui;

import business.BeeHive;
import entity.Bee;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class BeeUI {
    public static void main(String[] args) {
        BeeHive beeHive = null;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------Bee hive----------");
            System.out.println("\t1 - Create bee list");
            System.out.println("\t2 - Attack bees");
            System.out.println("\t3 - Exit");
            System.out.println("Enter your choice (1, 2 or 3): ");

            int choice = scanner.nextInt();
            ArrayList<Bee> listBee;

            switch(choice){
                case 1:
                    beeHive = new BeeHive();
                    beeHive.init();
                    listBee = beeHive.getListBees();
                    System.out.println("Bees details at the beginning: ");
                    showBees(listBee);
                    break;
                case 2:
                    if(beeHive == null) {
                        System.out.println("No bee!");
                    }else {
                        beeHive.attackBees();
                        listBee = beeHive.getListBees();
                        System.out.println("Bees details at the moment: ");
                        showBees(listBee);

                    }
                    break;
                default:
                    exit(0);
            }
        }
    }
    public static void showBees(ArrayList<Bee> listBee){
        for (int i = 0; i < listBee.size(); ++i){
            System.out.println(listBee.get(i));
        }
    }
}
