public class Decorator extends Email{
    private Email email;

    public Decorator(Email email) {
        this.email = email;
    }

    @Override
    public void showText() {
        this.email.showText();
    }
}
