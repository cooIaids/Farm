import java.util.ArrayList;
import java.util.Random;

public class Farm {

    private Random r = new Random();
    private ArrayList<Animal> barn = new ArrayList<>();
    private ArrayList<Flower> flowerField = new ArrayList<>();
    private ArrayList<Flower> harvestedFlowers = new ArrayList<>();
    private double sizeOfLand = 100;


    public void addFlower(Flower f){
        flowerField.add(f);
    }

    public void waterFlower(){
        int increaseChanceOfGrowth = r.nextInt(1)+19;
        double chanceOfGrowth = 0;
        chanceOfGrowth += increaseChanceOfGrowth;
    }

    public void harvestAllFlowers(){
        harvestedFlowers.addAll(flowerField);
        flowerField.removeAll(harvestedFlowers);
    }



}
