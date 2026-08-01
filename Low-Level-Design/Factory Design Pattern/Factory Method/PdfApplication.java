
public class PdfApplication extends DocumentApplication{
    @Override
    Document createDocument() {
        return new PdfDocument();
    }
}
