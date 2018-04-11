package br.com.lucaslprimo.jokeslib;

import java.util.Random;

public class JokesTeller {

    private static final String[] jokes = {
            "What time did the man go to the dentist? Tooth hurt-y.",
            "I'm reading a book about anti-gravity. It's impossible to put down!",
            "You're American when you go into the bathroom, and you're American when you come out, but do you know what you are while you're in there? European.",
            "Did you know the first French fries weren't actually cooked in France? They were cooked in Greece.",
            "Want to hear a joke about a piece of paper? Never mind... it's tearable.",
            "I just watched a documentary about beavers. It was the best dam show I ever saw!",
            "If you see a robbery at an Apple Store does that make you an iWitness?",
            "What's Forrest Gump's password? 1forrest1" };

    public static String getRandomJoke(){
        Random rand = new Random();

        int randomPosition = rand.nextInt(jokes.length);

        return jokes[randomPosition];
    }
}
