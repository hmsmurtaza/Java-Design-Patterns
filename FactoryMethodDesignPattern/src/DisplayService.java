public abstract class DisplayService {
    public void display() {
        System.out.println("inside "+DisplayService.class.getSimpleName()+"::display() before getParser() call");
        XMLParser parser = getParser();
        System.out.println("inside "+DisplayService.class.getSimpleName()+"::display() after getParser() call");
        String message = parser.parse();
        System.out.println(message);
    }
    public abstract XMLParser getParser();
}
