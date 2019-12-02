package paterns;

public final class Facade {
	
	
	public Phone call(PhoneType type) {
		
		
		Phone p = null;
		PhoneCreator c = null;
		
		switch(type) {
		
		case fold :
			
		 c = new FoldCreator();
		
		 break;
		case fix:
			c =new FixCreator();
			break;
		case smart:
			c =new SmartCreator();
			break;
		}
		 
			
		p= c.create();
		return p;
		
		
		
	}

}
