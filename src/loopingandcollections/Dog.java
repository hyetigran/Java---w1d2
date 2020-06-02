package loopingandcollections;

public class Dog {
    private String breed;
    private int avgWeight;
    private boolean apartment;

    public Dog(String breed, int avgWeight, boolean apartment) {
        this.breed = breed;
        this.avgWeight = avgWeight;
        this.apartment = apartment;
    }

    // getters
    public String getBreed() {
        return breed;
    }

    public int getAvgWeight() {
        return avgWeight;
    }

    public boolean isApartment() {
        return apartment;
    }

    // setters
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAvgWeight(int avgWeight) {
        this.avgWeight = avgWeight;
    }

    public void setApartmen(boolean apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Dog: " + " Breed = " + breed + " avgWeigth = " + avgWeight + " apartment = " + apartment + "\n";
    }
}