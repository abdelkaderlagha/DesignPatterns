package paterns;

public interface Subject {

	void subsribe(Subscriber sub);

	void unSubscribe(Subscriber sub);

	void notifySubscribers();

	void upload(String title);

}