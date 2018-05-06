package com.example.tiagotiti.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mBotaoVerdadeiro;
    private Button mBotaoFalso;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mBotaoVerdadeiro = (Button) findViewById(R.id.botaoVerdadeiro);
        mBotaoVerdadeiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.correto, Toast.LENGTH_SHORT).show();
            }
        });


        mBotaoFalso = (Button) findViewById(R.id.botaoFalso);
        mBotaoFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.incorreto, Toast.LENGTH_SHORT).show();


            }
        });


    }







}
