package week10_abstract;

public class InterfaceClass {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Spotify s = new Spotify();
        s.play();
    }
}

interface Media {
    void play();

    void pause();

    void next();

    void previous();

    String nowPlaying();
}

interface DigitalMedia extends Media {
    double size();

    double remaining(double current);
}

interface OnlineAsset {
    void download();
}

class Spotify implements DigitalMedia, OnlineAsset {
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void next() {
        System.out.println("Next");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public String nowPlaying() {
        return "Now Playing";
    }

    @Override
    public double size() {
        return 0;
    }

    @Override
    public double remaining(double current) {
        return 0;
    }

    @Override
    public void download() {
        System.out.println("Downloading");
    }
};

/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 */