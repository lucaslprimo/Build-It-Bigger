package br.com.lucaslprimo.jokeshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeShowActivity extends AppCompatActivity {

    public static String EXTRA_JOKE = "joke";
    TextView mTxtJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_show);

        mTxtJoke = findViewById(R.id.txtJoke);

        if(getIntent()!=null && getIntent().getExtras()!=null)
        {
            String joke = getIntent().getExtras().getString(EXTRA_JOKE);
            if(joke!=null)
                mTxtJoke.setText(joke);
        }
    }
}
