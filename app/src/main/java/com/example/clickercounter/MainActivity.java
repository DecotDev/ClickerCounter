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

import com.example.clickercounter.databinding.ActivityMainBinding;

public class
MainActivity extends AppCompatActivity {

    int counterTotal, counter0, counter1, counter2, counter3;
    //TextView clickCounterTotal, clickCounter0, clickCounter1, clickCounter2, clickCounter3;
    //Button increaseCounter0, increaseCounter1, increaseCounter2, increaseCounter3;
    //Button resetCounterAll, resetCounter0, resetCounter1, resetCounter2, resetCounter3;

    ActivityMainBinding binding;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());
        //setContentView(R.layout.activity_main);
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

        //clickCounterTotal = findViewById(R.id.clickCounterTotal);
        //clickCounter0 = findViewById(R.id.clickCounter0);
        //increaseCounter0 = findViewById(R.id.increaseCounter0);
        //Sums 1 to the counter0 and displays it
        binding.increaseCounter0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal++;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter0++;
                binding.clickCounter0.setText("" + counter0);
            }
        });
        //clickCounter1 = findViewById(R.id.clickCounter1);
        //increaseCounter1 = findViewById(R.id.increaseCounter1);
        //Sums 1 to the counter1 and displays it
        binding.increaseCounter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal++;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter1++;
                binding.clickCounter1.setText("" + counter1);
            }
        });

        //clickCounter2 = findViewById(R.id.clickCounter2);
        //increaseCounter2 = findViewById(R.id.increaseCounter2);
        //Sums 1 to the counter2 and displays it
        binding.increaseCounter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal++;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter2++;
                binding.clickCounter2.setText("" + counter2);
            }
        });

        //clickCounter3 = findViewById(R.id.clickCounter3);
        //increaseCounter3 = findViewById(R.id.increaseCounter3);
        //Sums 1 to the counter3 and displays it
        binding.increaseCounter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal++;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter3++;
                binding.clickCounter3.setText("" + counter3);
            }
        });


        //resetCounterAll = findViewById(R.id.resetCounterAll);
        //Resets the total click counter and displays it
        binding.resetCounterAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = 0;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter0 = 0;
                binding.clickCounter0.setText("" + counter0);
                counter1 = 0;
                binding.clickCounter1.setText("" + counter1);
                counter2 = 0;
                binding.clickCounter2.setText("" + counter2);
                counter3 = 0;
                binding.clickCounter3.setText("" + counter3);
            }
        });

        //resetCounter0 = findViewById(R.id.resetCounter0);
        //Resets counter0
        binding.resetCounter0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = counterTotal - counter0;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter0 = 0;
                binding.clickCounter0.setText("" + counter0);
            }
        });

        //resetCounter1 = findViewById(R.id.resetCounter1);
        //Resets counter1
        binding.resetCounter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = counterTotal - counter1;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter1 = 0;
                binding.clickCounter1.setText("" + counter1);
            }
        });
        //resetCounter2 = findViewById(R.id.resetCounter2);
        //Resets counter2
        binding.resetCounter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = counterTotal - counter2;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter2 = 0;
                binding.clickCounter2.setText("" + counter2);
            }
        });
        //resetCounter3 = findViewById(R.id.resetCounter3);
        //Resets counter3
        binding.resetCounter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterTotal = counterTotal - counter3;
                binding.clickCounterTotal.setText("" + counterTotal);
                counter3 = 0;
                binding.clickCounter3.setText("" + counter3);
            }
        });
    }
}