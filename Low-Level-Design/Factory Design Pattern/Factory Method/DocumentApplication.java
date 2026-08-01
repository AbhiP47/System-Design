abstract public class DocumentApplication {

    abstract Document createDocument();

    public void openDocument()
    {
        Document document = createDocument();
        document.open();
    }
}
