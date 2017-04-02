
public class Main {

	public static void main(String[] args) {
		ITelephone shaifulPhone;
		shaifulPhone = new DeskPhone(123456);
		shaifulPhone.powerOn();
		shaifulPhone.dial(123456);  
		shaifulPhone.callPhone(123456);
		shaifulPhone.isRinging();
		shaifulPhone.answer();

	}

}
