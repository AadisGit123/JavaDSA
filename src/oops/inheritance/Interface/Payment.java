//Interface
package oops.inheritance.Interface;

public interface Payment {
    void pay();
}

class UPI implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying through UPI.");
    }
}

class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying through Credit Card.");
    }
}

class Cash implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying through Cash.");
    }
}

class DriverClass {
    public static void main(String[] args) {
        UPI upi = new UPI();
        CreditCard cc = new CreditCard();
        Cash cash = new Cash();

        upi.pay();
        cc.pay();
        cash.pay();
    }
}
