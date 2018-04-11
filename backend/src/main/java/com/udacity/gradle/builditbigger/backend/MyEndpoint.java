package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

import br.com.lucaslprimo.jokeslib.JokesTeller;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHiAndTellMeAJoke")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();

        String joke = JokesTeller.getRandomJoke();

        response.setData(String.format("Hi %s, here's a joke for you: <br>%s",name,joke));

        return response;
    }

    /** A simple endpoint method that says a delicious joke */
    @ApiMethod(name = "sayJustAJoke")
    public MyBean sayJustAJoke() {
        MyBean response = new MyBean();

        response.setData(JokesTeller.getRandomJoke());

        return response;
    }
}
