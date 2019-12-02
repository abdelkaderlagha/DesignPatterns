package paterns;

public class FixCreator extends PhoneCreator {

	public Phone create() {
		
	
		Phone f = new FixPhone(PhoneType.fold);
		return f;
		
		
		
	}
	
	
}
