package akki.com.workshop_one;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name=getIntent().getStringExtra("key");
        Bundle abc=getIntent().getExtras();
       String value= abc.getString("key2");


    }
}
