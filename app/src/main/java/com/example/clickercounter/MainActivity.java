package com.example.clickercounter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class
MainActivity extends AppCompatActivity {

    int counterTotal, counter0, counter1, counter2, counter3;
    TextView clickCounterTotal;
    TextView clickCounter0;
    TextView clickCounter1;
    TextView clickCounter2;
    TextView clickCounter3;
    Button increaseCounter0;
    Button increaseCounter1;
    Button increaseCounter2;
    Button increaseCounter3;
    Button resetCounterAll;
    Button resetCounter0;
    Button resetCounter1;
    Button resetCounter2;
    Button resetCounter3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        counterTotal = 0;
        counter0 = 0;
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;

        clickCounterTotal = findViewById(R.id.clickCounterTotal);
        clickCounter0 = findViewById(R.id.clickCounter0);
        increaseCounter0 = findViewById(R.id.increaseCounter0);
        //Sums 1 to the counter0 and displays it
        increaseCounter0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal++;
                clickCounterTotal.setText("" + counterTotal);
                counter0++;
                clickCounter0.setText("" + counter0);
            }
        });
        clickCounter1 = findViewById(R.id.clickCounter1);
        increaseCounter1 = findViewById(R.id.increaseCounter1);
        //Sums 1 to the counter1 and displays it
        increaseCounter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal++;
                clickCounterTotal.setText("" + counterTotal);
                counter1++;
                clickCounter1.setText("" + counter1);
            }
        });

        clickCounter2 = findViewById(R.id.clickCounter2);
        increaseCounter2 = findViewById(R.id.increaseCounter2);
        //Sums 1 to the counter2 and displays it
        increaseCounter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal++;
                clickCounterTotal.setText("" + counterTotal);
                counter2++;
                clickCounter2.setText("" + counter2);
            }
        });

        clickCounter3 = findViewById(R.id.clickCounter3);
        increaseCounter3 = findViewById(R.id.increaseCounter3);
        //Sums 1 to the counter3 and displays it
        increaseCounter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal++;
                clickCounterTotal.setText("" + counterTotal);
                counter3++;
                clickCounter3.setText("" + counter3);
            }
        });


        resetCounterAll = findViewById(R.id.resetCounterAll);
        //Resets the total click counter and displays it
        resetCounterAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = 0;
                clickCounterTotal.setText("" + counterTotal);
                counter0 = 0;
                clickCounter0.setText("" + counter0);
                counter1 = 0;
                clickCounter1.setText("" + counter1);
                counter2 = 0;
                clickCounter2.setText("" + counter2);
                counter3 = 0;
                clickCounter3.setText("" + counter3);
            }
        });

        resetCounter0 = findViewById(R.id.resetCounter0);
        //Resets counter0
        resetCounter0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = counterTotal - counter0;
                clickCounterTotal.setText("" + counterTotal);
                counter0 = 0;
                clickCounter0.setText("" + counter0);
            }
        });

        resetCounter1 = findViewById(R.id.resetCounter1);
        //Resets counter1
        resetCounter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = counterTotal - counter1;
                clickCounterTotal.setText("" + counterTotal);
                counter1 = 0;
                clickCounter1.setText("" + counter1);
            }
        });
        resetCounter2 = findViewById(R.id.resetCounter2);
        //Resets counter2
        resetCounter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = counterTotal - counter2;
                clickCounterTotal.setText("" + counterTotal);
                counter2 = 0;
                clickCounter2.setText("" + counter2);
            }
        });
        resetCounter3 = findViewById(R.id.resetCounter3);
        //Resets counter3
        resetCounter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = counterTotal - counter3;
                clickCounterTotal.setText("" + counterTotal);
                counter3 = 0;
                clickCounter3.setText("" + counter3);
            }
        });
    }
}
//Make methods for increaseCounter[2-3]