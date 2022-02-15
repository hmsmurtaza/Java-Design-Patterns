public class FeedbackXMLDisplayService extends DisplayService{
    public FeedbackXMLDisplayService() {
        System.out.println("inside "+FeedbackXMLDisplayService.class.getSimpleName());
    }

    @Override
    public XMLParser getParser() {
        System.out.println("inside getParser() method");
        return new FeedbackXMLParser();
    }
}
