public class De extends Decorator{

    public De(Email email) {
        super(email);
    }

    @Override
    public void showText() {
        super.showText();
        System.out.print("\nDe: igorkwan147@gmail.com ");
    }
}
