package accountExam;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account("±èÅÂÈñ",101);
		a1.setBalance(8000);
		
		Account a2=new Account("¹è¼öÁö",102,0);
		
		a1.prinntInfo();
		a2.prinntInfo();
		
		a1.withdraw(5000);
		a2.deposit(10000);
		a1.deposit(1000);
		a2.withdraw(7000);
		
		a1.prinntInfo();
		a2.prinntInfo();
		
		a1.withdraw(5000);
		

	}

}
