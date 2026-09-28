public class customer {
    int deposit;
    double interest_rate;
    double interest;
    double total_amount;

    public customer(int d, double ir) {
        deposit = d;
        interest_rate = ir;
    }

    public void savings_interest() {
        interest = deposit * interest_rate / 100;
        total_amount = deposit + interest;
    }

    public void report(){
        System.out.println("deposit "+ deposit);
        System.out.println("interest rate "+ interest_rate);
        System.out.println("interest "+ interest);
        System.out.println("total amount "+ total_amount);
    }
}
