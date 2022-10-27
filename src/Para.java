public class Para extends Decorator {
    public Para(Email email) {
        super(email);
    }

    @Override
    public void showText() {
        super.showText();
        System.out.print("\nPara: joao_14@gmail.com ");
    }
}
