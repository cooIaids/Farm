import java.util.ArrayList;
import java.util.Random;

public class Farm {

    private Random r = new Random();
    private ArrayList<Animal> barn = new ArrayList<>();
    private ArrayList<Flower> flowerField = new ArrayList<>();
    private ArrayList<Flower> harvestedFlowers = new ArrayList<>();
    private int satisfactionOfAnimals;
    private double sizeOfLand = 100;


    public void addFlower(Flower f){
        if(flowerField.size() < 5){
            flowerField.add(f);
        }else {
            System.out.println("Exceeding capacity");
        }

    }

    public void addAnimal(Animal a){
        if(barn.size() < 20){
            barn.add(a);
        }else {
            System.out.println("Exceeding capacity");
        }
    }

    public void petAnimal(int index){
        barn.get(index);
    }

    public String writeOutFlowers(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < flowerField.size(); i++){
            s.append(flowerField.get(i));
        }
        return s.toString();
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
