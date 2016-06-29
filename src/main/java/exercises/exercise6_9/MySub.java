package exercise6_9;



class MySub extends MySuper {
	int count;

	MySub(int cnt, int num) {
		super(num);
		count = cnt;
	}

	// INSERT ADDITIONAL CONSTRUCTOR HERE
	MySub(int cnt) {
		this(cnt, cnt);
	}
	
	
	public static void main(String[] args) {
		MySub ms = new MySub(10);
	}
	
}