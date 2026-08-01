public class Main {
    public static void main(String[] args) {
        DocumentApplication app = new PdfApplication();
        app.openDocument();

        app = new WordApplication();
        app.openDocument();
    }
}
