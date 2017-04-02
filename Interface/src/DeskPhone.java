
public class DeskPhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	public DeskPhone(int number) {
		super();
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		System.out.println("No action taken for desk phone");
		
	}
	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing");
		
	}
	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the phone");
			isRinging = false;
		}
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring ring");
		}else{
			isRinging = false;
		}
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		
		return isRinging;
	}
	
	
}
