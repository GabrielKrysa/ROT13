public class Main {
    public static void main(String[] args) {

        //Rot13 rot13 = new Rot13("é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo\nessencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques\ncontendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado\na softwares de editoração eletrônica como Aldus PageMaker.");
        Messagem messagem = new Messagem("Bom Dia");
        System.out.println("-> Mensagem\n"+messagem.getMessagem());
        Rot13 rot13 = new Rot13(messagem);
        System.out.println("\n\n-> Criptografia");
        System.out.println(rot13.encrypting());
        System.out.println("\n\n-> Descriptografia");
        System.out.println(rot13.decrypting());
    }
}
