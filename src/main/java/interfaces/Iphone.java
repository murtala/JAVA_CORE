package interfaces;

public class Iphone extends SmartPhone {

	public static void main(String[] args) {

		Iphone i = new Iphone();
		i.dial();
		i.receive();
		i.play();
		i.storeMusic();
		i.getSinger();
		System.out.println(i.number);
		int X = i.number;
		
	}

	@Override
	public String getVersion() {
		// 
		return null;
	}

	@Override
	void smartPhoneID() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mp3id() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mp3id2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void phoneID() {
		// TODO Auto-generated method stub
		
	}

}
