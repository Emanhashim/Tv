package television;

public class Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Flat f1 = new Flat();
        f1.turnon();
        f1.setChannel(56);
        f1.setVolume(9);
        
        Flat f2 = new Flat();
        f2.turnon();
        f2.channelUp();
        f2.channelDown();
        f2.volumeUp();
        
        System.out.println("f1's channel is " + f1.channel + "and volume is" +  f1.volume);
        System.out.println("f2's channel is " + f2.channel + "and volume is" +  f2.volume);
        	
        
	}

}

class Flat{
	
	int channel =1;
	int volume= 1;
	boolean powerOn = true;
	Flat(){
		
	}
	
	void turnon(){
		powerOn = true;
	}
	
	void turnoff() {
		powerOn = false;
	}
	
	void setChannel(int newChannel) {
		if(powerOn && newChannel>=1 && newChannel <=120)
		channel = newChannel;
	}
	void setVolume(int newVolume) {
		if(powerOn && newVolume>=1 && newVolume <=10 )
		volume = newVolume;
	}
	void channelUp() {
		if(powerOn && channel < 120)
			channel++;
		
	}
	void channelDown() {
		
		if(powerOn && channel > 1)
			channel--;
	}
    void volumeUp() {
    	if(powerOn && volume < 10)
    		volume++;
		
	}
	void volumeDown() {
		if(powerOn && volume > 1)
			volume --;
		
	}
}
