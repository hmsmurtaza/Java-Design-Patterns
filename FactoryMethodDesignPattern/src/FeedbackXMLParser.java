public class FeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("inside parse() method");
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";
    }
}
