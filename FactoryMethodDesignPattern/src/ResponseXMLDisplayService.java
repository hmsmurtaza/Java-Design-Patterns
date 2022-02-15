public class ResponseXMLDisplayService extends DisplayService{
    public ResponseXMLDisplayService() {
        System.out.println("inside "+ResponseXMLDisplayService.class.getSimpleName());
    }

    @Override
    public XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
