public class Texto extends Decorator{

    public Texto (Email email) {
        super(email);
    }

    @Override
    public void showText() {
        super.showText();
        System.out.print("\nTexto: Olá Jõao Bom dia ");
    }


}
