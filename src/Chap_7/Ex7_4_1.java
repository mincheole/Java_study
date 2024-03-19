package Chap_7;

class MyTv_4 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	protected void setChannel(int num) {
		if(num <= MAX_CHANNEL && num >= MIN_CHANNEL)
			this.channel = num;
	}
	
	protected void setVolume(int num) {
		if(num <= MAX_VOLUME && num >= MIN_VOLUME)
			this.volume = num;
	}
	
	protected int getChannel() {
		return this.channel;
	}
	
	protected int getVolume() {
		return this.volume;
	}
}

public class Ex7_4_1 {
	public static void main(String[] args) {
		MyTv_4 t = new MyTv_4();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}
