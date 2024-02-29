package Chap_7;

import static java.lang.System.out;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	void setChannel(int channelNum) {
		this.prevChannel = this.channel;
		this.channel = channelNum;
	}
	
	void setVolume(int volumeNum) {
		this.volume = volumeNum;
	}
	
	
	int getChannel() {
		return this.channel;
	}
	
	int getVolume() {
		return this.volume;
	}
	
	void gotoPrevChannel() {
		setChannel(this.prevChannel);		
	}
}

public class Ex7_5 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		out.println("CH:" + t.getChannel());
		t.setChannel(20);
		out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		out.println("CH:" + t.getChannel());

	}

}
