package interfaces;

public interface Phone {
	int number = 12345;

	public void dial();

	public void dialNum(int n);

	public void receive();

	String getVersion();
	
	void phoneID();
}
