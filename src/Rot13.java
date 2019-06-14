public class Rot13 {
    private String message = "";
    private String encryption = "";
    private String decryption = "";

    public Rot13(Messagem message) {
        this.message = message.getMessagem();
    }

    public String encrypting() {

        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            letter = swapCrypt(letter);
            encryption += "" + letter;
        }

        return encryption;
    }

    public String decrypting() {

        for (int i = 0; i < message.length(); i++) {
            char letter = encryption.charAt(i);
            letter = swapCrypt(letter);
            decryption += "" + letter;
        }

        return decryption;
    }

    public char swapCrypt(char letter) {
        char encryp = letter;

        if (letter >= 'a' && letter <= 'z') {
            encryp = (char) ((((letter - 'a') + 13) % ('z' - 'a' + 1)) + 'a');
        }

        if (letter >= 'A' && letter <= 'Z') {
            encryp = (char) ((((letter - 'A') + 13) % ('Z' - 'A' + 1)) + 'A');
        }

        return encryp;
    }
}
