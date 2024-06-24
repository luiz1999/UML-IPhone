public class Iphone implements MusicPlayer, Phone, WebBrowser {

    //Métodos da interface MusicPlayer
    @Override
    public void playMusic(String trackName) {
        System.out.println("Playing music: " + trackName);
    }

    @Override
    public void stopMusic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stopMusic'");
    }

    @Override
    public void pauseMusic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pauseMusic'");
    }


    // Métodos da interface WebBrowser
    @Override
    public void browse(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'browse'");
    }

    @Override
    public void openNewTab(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openNewTab'");
    }

    @Override
    public void closeTabe() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'closeTabe'");
    }


    // Métodos da interface Phone
    @Override
    public void makeCall(String phoneNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeCall'");
    }

    @Override
    public void receiverCall(String phoneNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiverCall'");
    }

    @Override
    public void endCall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'endCall'");
    }

}
