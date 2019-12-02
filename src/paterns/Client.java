package paterns;

public class Client {

	public static void main(String[] args) {
		
		Facade f = new Facade();
		Phone p =f.call(PhoneType.fix);
	
		
			System.out.println(p.getType()) ;
			
			
			
			
			Os andr = new Os();
			
			
			
			Subscriber s1 = new Subscriber(PhoneType.fix);
			Subscriber s2 = new Subscriber(PhoneType.fold);
			Subscriber s3 = new Subscriber(PhoneType.smart);
			
			
			andr.subsribe(s1);
			andr.subsribe(s2);
			andr.subsribe(s3);
			
			s1.subscribeOs(andr);
			s2.subscribeOs(andr);
			s3.subscribeOs(andr);
	
			System.out.println("***************");
			
			
			andr.upload("from android 6.0 to android 7.0");
			
	}

	
}
	
	
	
	

