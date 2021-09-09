/**
 * 
 */

/**
 * @author gulsh
 *
 */
public class Accounts {
	private int Acc_no;
	private String Acc_typ;

	/**
	 * 
	 */
	public Accounts() {
		Acc_no=0;
		Acc_typ="";
		// TODO Auto-generated constructor stub
	}
	public Accounts(String A,int num) {
		Acc_no=num;
		Acc_typ=A;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public void Display() {
		System.out.println("Your assigned Account Number and Account type is: ");
		System.out.println(Acc_no);
		System.out.println(Acc_typ);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
