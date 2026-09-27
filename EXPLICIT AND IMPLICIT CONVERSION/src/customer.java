public class customer {
    int deposit;
    double interest;
    double total_amount;
    double interest_rate;
    public customer(int d,double i,double t,double ir){
        deposit = d;
        interest= i;
        total_amount = t;
        interest_rate = ir;
    }
    public void savings_interest(){
        interest = deposit * interest_rate/100;
        total_amount = deposit + interest;
    }
}
