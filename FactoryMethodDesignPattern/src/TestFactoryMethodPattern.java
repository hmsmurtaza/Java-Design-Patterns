public class TestFactoryMethodPattern {
    public static void main(String[] args) {
        DisplayService displayService = new FeedbackXMLDisplayService();
        displayService.display();

        displayService = new ErrorXMLDisplayService();
        displayService.display();

        displayService = new OrderXMLDisplayService();
        displayService.display();

        displayService = new ResponseXMLDisplayService();
        displayService.display();
    }
}
