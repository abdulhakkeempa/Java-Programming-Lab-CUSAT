interface Bank{
    void displayLoans();
    int getBranchCount();
}  

class HDFC implements Bank{
    public void displayLoans(){
        System.out.println("Loans available under HDFC are");
        System.out.println("1.Personal Loan\n2.Home Loan\n3.Educational Loan");
    }
    public int getBranchCount(){
        return 15;
    }
}

public class BankInterface{
    public static void main(String S[]){
        HDFC loan = new HDFC();
        loan.displayLoans();
        System.out.println("No of HDFC Branches are : "+loan.getBranchCount());
    }
}

