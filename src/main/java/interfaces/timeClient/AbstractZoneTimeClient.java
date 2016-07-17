package interfaces.timeClient;

public interface AbstractZoneTimeClient extends TimeClient {

	default String getInfo2 (String info){
		return info;
	}
	
	void thisIsAbstractTimeClient();
}
