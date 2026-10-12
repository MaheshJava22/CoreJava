package corejava;
//Create a Class Named as LoanManagement with following 
//variables 
//customerName, LoanAmount, interestRate, Loantenure - in years
public class LoanManagement {
	String customerName;
	double LoanAmount;
	double InterestRate;
	double  Loantenure;
	double  InterestAmt;
	double TotalAmt;
	double EMI;
	
	//calculateInterest()
	//Accept loanAmount and interestRate as arguments.
	//Calculate and return the simple interest.

	double  calculateInterest(double  loanAmount,double  InterestRate,double  Loantenure) {
		  InterestAmt=(loanAmount*InterestRate*Loantenure)/100;
		  return  InterestAmt;	
	 }
	
	//calculateTotalAmount ()
	//Accept the calculated
	//interest as an argument.
	//Return the total amount payable.
	
	 double calculateTotalAmount(double InterestAmt,double loanAmount) {
		 TotalAmt=loanAmount+InterestAmt;
		 return TotalAmt;
	 }
	 
	//calculateMonthlyEMI():-
	//Accept the total payable amount and loan tenure as arguments.
	//Return the monthly EMI.
	 
	 double calculateMonthlyEMI(double TotalAmt,double loantenure) {
		 double months=loantenure*12;
		 EMI=TotalAmt/months;
		 return EMI;
	 }
	 //displayLoanSummary():-
	//Accept the interest,
	//total amount, and EMI as arguments.
	 
	void displayLoanSummary(double TotalAmt,double EMI,double InterestRate) {
		 System.out.println("Customername :" +customerName);
		 System.out.println("LoanAmount :" + LoanAmount);
		 System.out.println("InterestRate :" +InterestRate);
		 System.out.println("Loantenure :" +Loantenure);
		 System.out.println("InterestAmt :" +InterestAmt );
		 System.out.println("TotalAmt :" +TotalAmt);
		 System.out.println("EMI :" +EMI);
		 
	 }
	 
    //Display the complete loan details.
	//create atleast 2 different objects and different type of data and
	//with every object call the method print the total in main with proper readability.
	 
	public static void main(String[] args) {	  
	
		LoanManagement c=new LoanManagement();
		 c.customerName="Mahesh";
		 c.LoanAmount= 500000;
		 c.InterestRate= 3;
		 c.Loantenure=5;
		 System.out.println("Total interest amount :"+c.calculateInterest( c.LoanAmount, c.InterestRate, c.Loantenure));
		 System.out.println("Total amount :"+c.calculateTotalAmount( c.InterestAmt, c.LoanAmount));
		 System.out.println("EMI :"+c.calculateMonthlyEMI(c.TotalAmt, c.Loantenure));
		 c.displayLoanSummary( c.TotalAmt,c.EMI, c.InterestRate);
		
	}
	
	
	

}
