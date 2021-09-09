import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	
	//----------------------------------------------------------------
	//--------------------Declarations--------------------------------
	//----------------------------------------------------------------
	private String UserNames;
	private ArrayList<Accounts> a=new ArrayList<Accounts>();
	//Accounts a=new Accounts();
	
	
	
	//----------------------------------------------------------------
	//----------------------Constructor--------------------------------
	//-----------------------------------------------------------------
	public UI() {
		//a.add(new Accounts());
		//
		// TODO Auto-generated constructor stub
	}
	
	
	//----------------------------------------------------------------
	//----------------------Sign Up-----------------------------------
	//--------------------Create Account------------------------------
	public void SignUp(int unique) {
		Scanner i1=new Scanner(System.in);
		System.out.println("Enter Account type");
		String AccT=i1.nextLine();
		//System.out.println("Enter Account Number");
		//int accNum=i1.nextInt();
		a.add(new Accounts(AccT,unique));
	}
	
	//----------------------------------------------------------------
	//----------------------Initial Display Function------------------
	//----------------------------------------------------------------
	
	public void Show(int n) {
		Accounts b=(Accounts)a.get(n);
		b.Display();
	}
	
	//----------------------------------------------------------------
	//----------------------Int Main----------------------------------
	//----------------------------------------------------------------
	
	public static void main(String[] args) {
		//------------------------------------------------------------
		UI interface1=new UI();
		int id=0;//unique identifier for new comers
		char option='z';//To make menu
		//------------------------------------------------------------
		while(option!='e'||option!='E') {
		Scanner i1=new Scanner(System.in);
		System.out.println("Select the Options below to proceed");
		option=i1.next().charAt(0);
		if(option=='a'||option=='A')
		interface1.SignUp(id);
		
		interface1.Show(id);
		id++;
		// TODO Auto-generated method stub
		}
	}

}
