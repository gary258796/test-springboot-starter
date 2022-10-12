package gary.springframework.garycustomstarter.configuration;

import gary.springframework.garycustomstarter.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Greeter.class)
@EnableConfigurationProperties(GaryProperties.class)
public class GaryAutoConfiguration {

    @Autowired
    private GaryProperties garyProperties;

    @Bean
    @ConditionalOnMissingBean
    public GreetConfig greetConfig() {
        GreetConfig greetConfig = new GreetConfig();
        greetConfig.setUserName(garyProperties.getName());
        return greetConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public Greeter greeter(GreetConfig greetConfig) {
        return new Greeter(greetConfig);
    }

}
