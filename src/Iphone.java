public class Iphone implements MusicPlayer, InternetBrowser, PhoneDevice{

    public void playMusic() {
        System.out.println("Playing music...");
    }

    public void pauseMusic() {
        System.out.println("Pausing music...");
    }

    public void selectMusic() {
        System.out.println("Selecting music...");
    }

    public void makeCalls() {
        System.out.println("Making a call...");
    }

    public void answerCalls() {
        System.out.println("Answering a call...");
    }

    public void initiateVoiceMemo() {
        System.out.println("Initiating voice memo...");
    }

    public void displayWebPages() {
        System.out.println("Displaying web page...");
    }

    public void addNewTabs() {
        System.out.println("Adding new tab...");
    }

    public void refreshPages() {
        System.out.println("Refresing a page...");
    }

    public static void main(String[] args) {
        
        Iphone myIphone = new Iphone();

        myIphone.playMusic();
        myIphone.addNewTabs();

    }

}
