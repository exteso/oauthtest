package com.exteso.oauthtest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 */
@SpringBootApplication
@RestController
@EnableResourceServer
public class AuthenticationServer {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationServer.class, args);
    }
    private static final Log logger = LogFactory.getLog(AuthenticationServer.class);

    @RequestMapping("/user")
    public Principal user(Principal user) {
        logger.info("AS /user has been called");
        logger.debug("user info: "+user.toString());
        return user;
    }


}
