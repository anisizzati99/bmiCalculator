package net.anis.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);
        TextView result1 = (TextView) findViewById(R.id.tvCategory);
        TextView result2 = (TextView) findViewById(R.id.tvRange);
        TextView result3 = (TextView) findViewById(R.id.tvRisk);


        Bundle bundle = getIntent().getExtras();

        int weight = Integer.parseInt(bundle.getString("USER_WEIGHT_EXTRA"));
        int height = Integer.parseInt(bundle.getString("USER_HEIGHT_EXTRA"));

        //TextView textView2 = (TextView) findViewById(R.id.tvHeight);
        //weight.setText(""+ weight);
       // textView2.setText(""+ height);

        double height2 = (double)height/100;
        double BMI = (weight*1.0)/(height2*height2);


        if (BMI <= 18.4) {
            result1.setText("Underweight");
            result2.setText("18.4 and below");
            result3.setText("Malnutrition risk");


        } else if (BMI >= 18.5 && BMI <= 24.9) {
            result1.setText("Normal weight");
            result2.setText("18.5-24.9");
            result3.setText("Low risk");

        } else if (BMI >= 25.0 && BMI <= 29.9) {
            result1.setText("Overweight");
            result2.setText("25-29.9");
            result3.setText("Enchanced risk");

        }
        else if (BMI >= 30.0 && BMI <= 34.9) {
            result1.setText("Moderately obese");
            result2.setText("30-34.9");
            result3.setText("Medium risk");

        }
        else if (BMI >= 35.0 && BMI <= 39.9) {
            result1.setText("Severely obese");
            result2.setText("35-39.9");
            result3.setText("High risk");

        }
        else if (BMI >= 40.0 ) {
            result1.setText("Very severely obese");
            result2.setText("40 and above");
            result3.setText("Very high risk");

        }

        
    }

}