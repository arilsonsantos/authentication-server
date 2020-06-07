package br.com.orion.authorizationserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import br.com.orion.authorizationserver.service.UserDetailServiceImpl;

import lombok.AllArgsConstructor;

@EnableWebSecurity
@EnableResourceServer
@EnableAuthorizationServer
@AllArgsConstructor
public class SegurancaConfig extends WebSecurityConfigurerAdapter {

    private UserDetailServiceImpl userDetailServiceImpl;
    //private PasswordEncoder passwordEncoder;

    @Bean
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth.inMemoryAuthentication().withUser("arilson").password("123").roles("ADMIN");
        auth.userDetailsService(userDetailServiceImpl).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
         return NoOpPasswordEncoder.getInstance();
    }

    // @Bean
    // PasswordEncoder passwordEncoder() {
    //     return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    // }


}