package interfaces.timeClient;

public interface AnotherTimeClient extends TimeClient {
	default String getInfo1 (String info){
		return info;
	}
	
	void thisIsAnotherClient();
	
	//Any class that implements the interface AnotherTimeClient
	//will have the implementation specified by the default method here
	// the default implemented methods in the orginal TimeClient will not appear 
	//
}
