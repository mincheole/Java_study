package Chap_7;

class MyTv_5 {
	boolean isPowerOn;
	int channel;
	int prevchannel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	protected void setChannel(int num) {
		prevchannel = this.channel;
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
	
	protected void gotoPrevChannel() {
		setChannel(this.prevchannel);
	}
}

public class Ex7_5_1 {
	public static void main(String[] args) {
		MyTv_5 t = new MyTv_5();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
