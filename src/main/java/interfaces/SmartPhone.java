package interfaces;

public abstract class SmartPhone implements MP3Player, Phone {

	public void play() {
		System.out.println("Playing..");
	}

	public void storeMusic() {
		System.out.println("Saving file..");
	}

	public void getSinger() {
		System.out.println("Bob Marley");
	}

	public void dial() {
		System.out.println("Dialing...");

	}

	public void receive() {
		System.out.println("Receiving...");

	}

	public void dialNum(int n) {
		System.out.println("Dialing " + n);
	}

	public void playSong() {
		System.out.println("Playing song..");
	}
	
	abstract void smartPhoneID();

}
