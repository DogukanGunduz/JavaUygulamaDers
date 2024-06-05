package com.dogukangunduz.a4ilemuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {
    EditText answerText;
    TextView scoreText;
    TextView resultText;
    Button button1;
    int score=0;
    int result;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        answerText = findViewById(R.id.answerText);
        scoreText = findViewById(R.id.scoreText);
        resultText = findViewById(R.id.resultText);
        button1 = findViewById(R.id.button1);
        int a = random.nextInt(100);
        int b = random.nextInt(10);
        result = a * b;
        resultText.setText(a + "X" + b + " = ?");
        scoreText.setText("Score:" + score);
    }

    public void buttonClick(View view) {
        if (answerText.getText().toString().matches("")) {
            Toast.makeText(this, "Hatalı Yanıt", Toast.LENGTH_SHORT).show();
        } else {
            int c = Integer.parseInt(answerText.getText().toString().trim());
            if (c == result) {
                score++;
            } else {
                score--;
                Toast.makeText(this, "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
            }
            int a = random.nextInt(100);
            int b = random.nextInt(10);
            result = a * b;
            resultText.setText(a + "X" + b + " = ?");
            answerText.setText("");
            scoreText.setText("Score :" + score);
        }
    }
    public void mainMenu(View view){
        Intent goToMainMenu = new Intent(this, MainActivity.class );
        startActivity(goToMainMenu);
    }
}