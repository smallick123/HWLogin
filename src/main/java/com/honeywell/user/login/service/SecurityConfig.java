import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public RestAuthenticationProvider restAuthenticationProvider() {
        return new RestAuthenticationProvider();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth, AuthenticationProvider provider) throws Exception {
        auth
                .authenticationProvider(provider);
    }
}