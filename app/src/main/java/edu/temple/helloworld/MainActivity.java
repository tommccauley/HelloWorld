package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        txt = findViewById(R.id.myText);

        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setText("You have clicked the button");
            }


        });
    }


}
