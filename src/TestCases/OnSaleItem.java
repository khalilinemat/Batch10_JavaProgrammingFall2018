package TestCases;

/**
 * SubClass of Item
 */
public class OnSaleItem extends Item {
    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    public OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
      
    }

    /**
     * getter for discount
     * @return
     */
    public double getDiscount() {
      //TODO
        return 0.0;
    }

    /**
     * setter for discount
     * @param discount
     */
    public void setDiscount(double discount) {
       
    }

    @Override
	public String toString() {
		return "OnSaleItem [discount=" + discount + "]";
	}
    
    
    
    
    
}