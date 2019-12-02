package paterns;

public class SmartCreator  extends PhoneCreator{

	public Phone create() {
		
		Phone f = new SmartPhone(PhoneType.smart);
		return f;
		
		
	}
	
	
}
