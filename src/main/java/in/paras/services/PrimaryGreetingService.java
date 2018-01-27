package in.paras.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greetings From Primary Bean Service";
    }
}
