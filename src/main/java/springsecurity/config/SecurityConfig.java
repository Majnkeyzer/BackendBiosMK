//package springsecurity.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
//import springsecurity.auth.CustomSimpleUrlAuthenticationSuccessHandler;
//import springsecurity.auth.RestAuthenticationEntryPoint;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private RestAuthenticationEntryPoint restAuthenticationEntryPoint = new RestAuthenticationEntryPoint();
//    private CustomSimpleUrlAuthenticationSuccessHandler mySuccessHandler = new CustomSimpleUrlAuthenticationSuccessHandler();
//    private SimpleUrlAuthenticationFailureHandler myFailureHandler = new SimpleUrlAuthenticationFailureHandler();
//
//    @Override
//    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin").password(encoder().encode("adminPass")).roles("ADMIN")
//                .and()
//                .withUser("user").password(encoder().encode("userPass")).roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//             .csrf().disable()
//             .exceptionHandling()
//             .authenticationEntryPoint(restAuthenticationEntryPoint)
//             .and()
//             .authorizeRequests()
//             .antMatchers("/api/foos").authenticated()
//             .antMatchers("/api/admin/**").hasRole("ADMIN")
//             .and()
//             .formLogin()
//             .successHandler(mySuccessHandler)
//             .failureHandler(myFailureHandler)
//             .and()
//             .logout();
//    }
//
//    @Bean
//    public PasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
