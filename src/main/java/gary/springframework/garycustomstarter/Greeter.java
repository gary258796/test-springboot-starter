package gary.springframework.garycustomstarter;

import gary.springframework.garycustomstarter.configuration.GreetConfig;

public class Greeter {

    private final GreetConfig greetConfig;

    public Greeter(GreetConfig greetConfig) {
        this.greetConfig = greetConfig;
    }

    public String greet() {
        return "Hello there. This is message from ".concat(greetConfig.getUserName());
    }
}
