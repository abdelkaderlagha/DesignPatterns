package paterns;

public class Subscriber implements Observer {
	
	private PhoneType type;
	private Os op = new Os();
	
	
	public Subscriber(PhoneType type) {
		super();
		this.type = type;
	}

	@Override
	public void update() {
		
		System.out.println(type+ " uploaded to" + op.name);
	}
	
	

	@Override
	public void subscribeOs(Os os) {
		
		op = os;
		
	}

}
