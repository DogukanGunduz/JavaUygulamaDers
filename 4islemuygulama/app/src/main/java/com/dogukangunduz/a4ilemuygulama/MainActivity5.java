package com.dogukangunduz.a4ilemuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {
    EditText answerText;
    TextView scoreText;
    TextView resultText;
    int score = 0;
    int result;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        answerText = findViewById(R.id.answerText);
        scoreText = findViewById(R.id.scoreText);
        resultText = findViewById(R.id.resultText);
        generateQuestion();
        scoreText.setText("Score: " + score);
    }

    public void buttonClick(View view) {
        String answer = answerText.getText().toString().trim();
        if (answer.isEmpty()) {
            Toast.makeText(this, "Lütfen bir cevap girin", Toast.LENGTH_SHORT).show();
            return;
        }

        int userAnswer = Integer.parseInt(answer);
        if (userAnswer == result) {
            score++;
            Toast.makeText(this, "Doğru Cevap!", Toast.LENGTH_SHORT).show();
        } else {
            score--;
            Toast.makeText(this, "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
        }

        generateQuestion();
        answerText.setText("");
        scoreText.setText("Score: " + score);
    }

    public void mainMenu(View view) {
        Intent goToMainMenu = new Intent(this, MainActivity.class);
        startActivity(goToMainMenu);
    }

    private void generateQuestion() {
        int a = random.nextInt(101); // 0 ile 100 arasında rastgele bir sayı seçer
        int b;
        do {
            b = random.nextInt(101); // 0 ile 100 arasında rastgele bir sayı seçer
        } while (b == 0 || a % b != 0); // İkinci sayı sıfır olamaz ve birinci sayı ikinci sayıya tam bölünebilmelidir
        result = a / b;
        resultText.setText(a + " ÷ " + b + " = ?");
    }
}
