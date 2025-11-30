package ie.atu.week1;

public class PreferredCustomer extends Customer {

    private int loyaltyPoints;
    private double discountLevel; //0.05 for 5% etc

    public PreferredCustomer(){
        super();                //non argumental constructor
        this.loyaltyPoints=0;
        this.discountLevel=0.0;
    }

    // Parameterised constructor
    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints) {

        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    private void updateDiscountLevel() {
        if(loyaltyPoints<500){
            discountLevel=0.0;
        }else if (loyaltyPoints<1000){
            discountLevel=0.05;
        }else if (loyaltyPoints<1500) {
            discountLevel=0.06;
        } else if(loyaltyPoints<2000) {
            discountLevel=0.07;
        }else {
            discountLevel=0.10;
        }

    }
    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }
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

    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }
}
