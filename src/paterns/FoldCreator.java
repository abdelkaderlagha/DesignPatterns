package paterns;

public class FoldCreator extends PhoneCreator{

	public Phone create() {
		
		System.out.println("Phone Created!");
		
		Phone f = new FoldPhone(PhoneType.fold);
		
		return f;
	}
	
	
}
