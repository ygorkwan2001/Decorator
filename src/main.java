public class main {
    public static void main(String[] args) {


        Email emailNormal = new EmailNormal();
        Email emailNormal1 = new EmailNormal();
        Email emailNormal2 = new EmailNormal();
        Email emailNormal3 = new EmailNormal();
        Email emailanexo =  new EmailAnexo();
        Email emailanexo1 =  new EmailAnexo();
        Email emailConfirmacao = new EmailConfirmacao();
        Email emailConfirmacao1 = new EmailConfirmacao();


        System.out.println("\n");
        emailNormal = new De(emailNormal);
        emailNormal = new Para(emailNormal);
        emailNormal = new Texto(emailNormal);
        emailNormal.showText();


        System.out.println("\n");
        emailNormal1 = new De(emailNormal1);
        emailNormal1 = new Para(emailNormal1);
        emailNormal1 = new Texto(emailNormal1);
        emailNormal1.showText();
        System.out.println("\n");
        emailanexo.showText();


        System.out.println("\n");
        emailNormal2 = new De(emailNormal2);
        emailNormal2 = new Para(emailNormal2);
        emailNormal2 = new Texto(emailNormal2);
        emailNormal2.showText();
        System.out.println("\n");
        emailConfirmacao.showText();



        System.out.println("\n");
        emailNormal3 = new De(emailNormal3);
        emailNormal3 = new Para(emailNormal3);
        emailNormal3 = new Texto(emailNormal3);
        emailNormal3.showText();
        System.out.println("\n");
        emailanexo1.showText();
        emailConfirmacao1.showText();




       // marine = new Faca(marine);
       // marine = new Granada(marine);
       // marine = new Pistola(marine);

       // seal.showText();
       // System.out.println("");
       // marine.showText();
    }
}
