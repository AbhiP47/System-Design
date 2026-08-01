public class WordApplication extends DocumentApplication{
    @Override
    Document createDocument() {
        return new WordDocument();
    }
}
