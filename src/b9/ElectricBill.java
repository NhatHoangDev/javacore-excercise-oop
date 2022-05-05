package b9;

public class ElectricBill {
    private Customer customer;
    private int oldElectric;
    private int newElectric;
    private double totalBill;

    public ElectricBill() {
    }

    public ElectricBill(Customer customer, int oldElectric, int newElectric) {
        this.customer = customer;
        this.oldElectric = oldElectric;
        this.newElectric = newElectric;
        this.totalBill = (newElectric - oldElectric) * 5;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldElectric() {
        return oldElectric;
    }

    public void setOldElectric(int oldElectric) {
        this.oldElectric = oldElectric;
    }

    public int getNewElectric() {
        return newElectric;
    }

    public void setNewElectric(int newElectric) {
        this.newElectric = newElectric;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return "ElectricBill{" +
                "customer=" + customer +
                ", oldElectric=" + oldElectric +
                ", newElectric=" + newElectric +
                ", totalBill=" + totalBill +
                '}';
    }
}
