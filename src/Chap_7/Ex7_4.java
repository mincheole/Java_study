package Chap_7;

import static java.lang.System.out;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	void setChannel(int channelNum) {
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
	
}

public class Ex7_4 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		out.println("CH:" + t.getChannel());
		t.setVolume(20);
		out.println("VOL:" + t.getVolume());

	}

}
