package in.paras.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("hn")
public class GreetingHindiServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "App Kaise Hain";
    }
}
