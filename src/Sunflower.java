public class Sunflower extends Flower{

    public Sunflower(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public double getChanceOfGrowth() {
        return super.getChanceOfGrowth();
    }

    @Override
    public void setChanceOfGrowth(double chanceOfGrowth) {
        super.setChanceOfGrowth(chanceOfGrowth);
    }
}
