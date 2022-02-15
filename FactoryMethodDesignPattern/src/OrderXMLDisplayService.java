public class OrderXMLDisplayService extends DisplayService{
    public OrderXMLDisplayService() {
        System.out.println("inside "+OrderXMLDisplayService.class.getSimpleName());
    }
    @Override
    public XMLParser getParser() {
        return new OrderXMLParser();
    }
}
