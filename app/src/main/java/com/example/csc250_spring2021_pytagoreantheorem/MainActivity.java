package com.example.csc250_spring2021_pytagoreantheorem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity
{

    private EditText inputASiteET;
    private EditText inputBSiteET;
    private TextView resultCTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputASiteET = this.findViewById(R.id.inputASiteET);
        this.inputBSiteET = this.findViewById(R.id.inputBSiteET);
        this.resultCTV = this.findViewById(R.id.resultCTV);
    }

    public void onCalculateButtonCLicked(View v)
    {
        String valueA = this.inputASiteET.getText().toString();
        String valueB = this.inputBSiteET.getText().toString();
        int numA = Integer.parseInt(valueA);
        int numB = Integer.parseInt(valueB);
        this.resultCTV.setText(String.valueOf(pyt(numA, numB)));

    }

    private double pyt(int numA, int numB)
    {
        //double aSquared = Math.sqrt(Math.pow(numA,2));
        //double bSquared= Math.sqrt(Math.pow(numB,2));
        double valueC = Math.sqrt((numA*numA) + (numB*numB));

        return valueC;
    }

}