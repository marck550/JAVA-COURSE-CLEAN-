interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface Phone {
    void makeCall(String number);
}

class Smartphone implements Camera, MusicPlayer, Phone {
    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    @Override
    public void takePhoto() {
        System.out.println(model + " is taking a photo... Click!");
    }

    @Override
    public void playMusic() {
        System.out.println(model + " is playing music...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println(model + " is calling " + number + "...");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung Galaxy");
        myPhone.takePhoto();
        myPhone.playMusic();
        myPhone.makeCall("0712345678");

        System.out.println("\n=== POLYMORPHISM WITH INTERFACES ===");
        Camera cam = myPhone;
        MusicPlayer mp = myPhone;

        cam.takePhoto();
        mp.playMusic();
    }
}
