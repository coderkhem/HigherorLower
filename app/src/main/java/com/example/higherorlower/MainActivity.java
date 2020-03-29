package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random;
    final int min = 1;
    final int max = 20;

    public void guessFunction(View view)
    {
        EditText number=(EditText)findViewById(R.id.editText);
        String numberinstring=number.getText().toString();
        int numberinInt=Integer.parseInt(numberinstring);
        if(numberinInt>random)
        {
            Toast.makeText(this,"Go Lower",Toast.LENGTH_SHORT).show();
        }
        else if(numberinInt < random)
        {
            Toast.makeText(this,"Go Higher",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this,"You guessed it right!!! Play Again",Toast.LENGTH_SHORT).show();
            random = new Random().nextInt((max - min) + 1) + min;

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         random = new Random().nextInt((max - min) + 1) + min;
    }
}
