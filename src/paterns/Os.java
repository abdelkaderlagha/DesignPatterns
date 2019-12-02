package paterns;

import java.util.ArrayList;
import java.util.List;

public class Os implements Subject {
	
	

	

	private List<Subscriber> subs = new ArrayList<>();
	String name;
	
	@Override
	public void subsribe(Subscriber sub) {
		
		subs.add(sub);
	}
	@Override
	public void unSubscribe(Subscriber sub) {
		
		subs.remove(sub);
	}
	
	@Override
	public void notifySubscribers() {
		
		for(Observer sub : subs) {
			sub.update();
		}
	}
	
	
	@Override
	public void upload(String os) {
		this.name = os;
		notifySubscribers();
	}
}
