package net.anis.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "net.anis.bmicalculator.EXTRA_NUMBER";

    Button button;
    ImageButton myImageButton;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 =(EditText) findViewById(R.id.editText1);
        editText2 =(EditText) findViewById(R.id.editText2);

        myImageButton = (ImageButton) findViewById(R.id.imageButton);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent (MainActivity.this, AboutUs.class);
                startActivity(intentLoadNewActivity);
            }
        });
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();


                //set the condition here
                if (TextUtils.isEmpty(str1))
                {
                    editText1.setError("Please enter your weight");
                    //editText1.requestFocus();
                    return;

                }
                if (TextUtils.isEmpty(str2))
                {
                    editText2.setError("Please enter your height");
                    //editText2.requestFocus();
                    return;

                }
                openActivity2();

            }
        });
    }

    public void openActivity2() {
        Intent in = new Intent (this, Activity2.class);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
       // int weight = Integer.parseInt(editText1.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.editText2);
         //int height = Integer.parseInt(editText2.getText().toString());

        in.putExtra("USER_WEIGHT_EXTRA", editText1.getText().toString());
        in.putExtra("USER_HEIGHT_EXTRA", editText2.getText().toString());
        startActivity(in);

    }
}