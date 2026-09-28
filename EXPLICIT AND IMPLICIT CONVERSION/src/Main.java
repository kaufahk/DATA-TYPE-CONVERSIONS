public class Main {
    public static void main(String[] args) {
int deposit = 10000;
double interest_rate = 2.5;
customer acc = new customer(deposit,interest_rate);
acc.savings_interest();
double depositasdouble = (double) deposit;
System.out.println("deposit as double "+ depositasdouble);
String interestasstring = Double.toString(acc.interest);
        System.out.println("interest as string "+ interestasstring);
        System.out.println("Summary report");
        acc.report();
    }
}
