import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	String UserNames;
	ArrayList<Accounts> a=new ArrayList<Accounts>();
	//Accounts a=new Accounts();
	public UI() {
		//a.add(new Accounts());
		//
		// TODO Auto-generated constructor stub
	}
	public void SignUp() {
		Scanner i1=new Scanner(System.in);
		System.out.println("Enter Account type");
		String AccT=i1.nextLine();
		System.out.println("Enter Account Number");
		int accNum=i1.nextInt();
		a.add(new Accounts(AccT,accNum));
	}
	public void Show() {
		Accounts b=(Accounts)a.get(0);
		b.Display();
	}

	public static void main(String[] args) {
		UI interface1=new UI();
		interface1.SignUp();
		interface1.Show();
		// TODO Auto-generated method stub

	}

}
