package Chap_6;

class MyTv1 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnoff() {
		this.isPowerOn = !this.isPowerOn;
	}
	
	void volumeUp() {
		if(this.volume < MAX_VOLUME) this.volume++;
	}
	
	void volumeDown() {
		if(this.volume > MIN_VOLUME) this.volume--;		
	}
	
	void channelUp() {
		if(this.channel == MAX_CHANNEL) {
			this.channel = MIN_CHANNEL;
			return;
		}
		this.channel++;		
	}
	
	void channelDown() {
		if(this.channel == MIN_CHANNEL) {
			this.channel = MAX_CHANNEL;
			return;
		}
		this.channel--;
	}
} // class MyTv1

public class Exercise6_19_1 {
	public static void main(String[] args) {
		MyTv1 t = new MyTv1();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
}
