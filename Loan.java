package homework2;

import java.util.Date;
public class Loan {
    private double annualInterestRate;
    private int numberOfYear;
    private double LoanAmount;
    private Date LoanDate;

    // No-argument constructor
    public Loan(){
        annualInterestRate =2.5;
        numberOfYear =1;
        LoanAmount = 1000;
        LoanDate =new Date();
    }
    //constructor
    public Loan(double annualInterestRate,int numberOfYear,double LoanAmount){
        this.annualInterestRate=annualInterestRate;
        this.numberOfYear=numberOfYear;
        this.LoanAmount=LoanAmount;
        LoanDate=new Date();
    }

    //Getter for InterestRate
    public double getAnnualInterestRate() {
            return annualInterestRate;
    }

    // Getter for numberOfYear
    public int getNumberOfYear() {
            return numberOfYear;
    }

    //Getter for LoanAmount
    public double getLoanAmount() {
            return LoanAmount;
    }

    //Getter for LoanDate
    public Date getLoanDate() {
            return LoanDate;
    }

    // Setter for getAnnualInterestRate

    public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYear(int numberOfYear) {
            this.numberOfYear = numberOfYear;
    }

    public void setLoanAmount(double loanAmount) {
           this.LoanAmount = loanAmount;
    }

    // Monthly payment
    public double getMonthlyPayment(){
        double monthlyInterestRate=annualInterestRate/1200;
        int numberOfPayments=numberOfYear*12;
        return LoanAmount*monthlyInterestRate/(1-1/Math.pow
                (+monthlyInterestRate,numberOfYear));
    }
    // Total payment
    public double getTotalpayment(){
        return getMonthlyPayment()*numberOfYear*12;
    }
}

   class TestMain{
     public static void main(String[] args){
         Loan loan =new Loan(5.0 ,10, 50000);
         System.out.println("Annual InterestRate:" +loan.getAnnualInterestRate());
         System.out.println("number of year:" +loan.getNumberOfYear());
         System.out.println("loan Amount:" +loan.getLoanDate());
         System.out.println("monthly payment:" +loan.getMonthlyPayment());
         System.out.println("Total payment:" +loan.getTotalpayment());
         System.out.println("loan Date:" +loan.getLoanDate());
     }
   }
