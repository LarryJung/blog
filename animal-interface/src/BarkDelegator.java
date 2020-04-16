public class BarkDelegator implements Barkable{

    private String voice = "bark bark";

    public BarkDelegator(String voice) {
        this.voice = voice;
    }

    @Override
    public void bark() {
        System.out.println(this.voice);
    }
}
