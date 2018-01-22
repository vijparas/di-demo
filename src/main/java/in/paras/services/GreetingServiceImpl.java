package in.paras.services;

public class GreetingServiceImpl implements GreetingsService {
    public static final String HELLO_GURUS = "Hello Gurus!!!!";
    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
