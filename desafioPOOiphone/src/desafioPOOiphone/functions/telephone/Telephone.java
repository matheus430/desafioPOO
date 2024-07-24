package desafioPOOiphone.functions.telephone;

public class Telephone implements ReceiveSendCall{

	public void receiveSendCall() {
		checkCredit();
		System.out.println("Make a call");
		finishCall();
		System.out.println("Receiving call...");
		System.out.println("_____________________________");
	}
	
	private void checkCredit() {
		System.out.println("\n" + "You have credits");
	}
	
	private void finishCall() {
		System.out.println("Ended call" + "\n");
		
	}
}
