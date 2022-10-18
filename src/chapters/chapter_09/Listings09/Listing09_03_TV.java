package chapters.chapter_09.Listings09;

public class Listing09_03_TV {
    int channel = 1;// Default channel is 1
    int volumeLevel = 1;// Default volume level is 1
    boolean on = false;// TV is off

    public Listing09_03_TV(){
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (on && 1 <= newChannel && newChannel <= 120)
            channel = newChannel;
    }

    public void setVolumeLevel(int newVolumeLevel){
        if (on && 1 <= newVolumeLevel && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        if (on && channel < 120)
            channel++;
    }

    public void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }

    public void volumeUp(){
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
