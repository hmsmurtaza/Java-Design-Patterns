public class ErrorXMLDisplayService extends DisplayService{
    public ErrorXMLDisplayService() {
        System.out.println("inside "+ErrorXMLDisplayService.class.getSimpleName());
    }

    @Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
