package ie.atu.week1;

public class PreferredCustomer extends Customer {

    private int loyaltyPoints;
    private double discountLevel; //0.05 for 5% etc

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }
}
