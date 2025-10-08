package Project;

public class AirlineClass {
    private int profitMargin;
    private int costPerCustomer;

    public AirlineClass(int profitMargin, int costPerCustomer) {
        this.profitMargin = profitMargin;
        this.costPerCustomer = costPerCustomer;
    }

    public int getProfitMargin() {
        return this.profitMargin;
    }

    public int getCostPerCustomer() {
        return this.costPerCustomer;
    }
}
