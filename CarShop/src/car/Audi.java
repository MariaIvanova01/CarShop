package car;

public class Audi extends CarImpl implements Rentable{
    private int minRentDay;
    private double pricePerDay;

    public Audi(String model, String color, int horsePower, String countryProduced, int minRentDay, double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %d tires%nMinimum rental period of %d days. Price per day %f",
                getModel(),countryProduced(),TIRES,minRentDay,pricePerDay);
    }

    @Override
    public int getMinRentDay() {
        return minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }
}
