package com.vimukthigunasekara.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView BMI, LEVEL, Weight, Height;
    ImageView IMV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BMI = findViewById(R.id.txtBMIV);
        LEVEL = findViewById(R.id.txtName);
        Weight = findViewById(R.id.txtWeight);
        Height = findViewById(R.id.txtHeight);
        IMV = findViewById(R.id.imvLevel);
    }

    public void ConvertClick(View view) {
        String WeightV = Weight.getText().toString();
        double WEG = Double.parseDouble(WeightV);

        String HeightV = Height.getText().toString();
        double HEG = Double.parseDouble(HeightV);

        if(WeightV == null || HeightV == null){
            Toast.makeText(this, "Weight or Height Cann't be Null", Toast.LENGTH_SHORT).show();
        }
        if (HEG >= 3){
            Toast.makeText(this, "Height Cann't be grater than 2", Toast.LENGTH_SHORT).show();
        }else {
            double BMI_Value = WEG / (HEG * HEG);
            String Final_Value = String.format("%1.2f", BMI_Value);
            BMI.setText("" + Final_Value);

            if (BMI_Value < 18.5) {
                LEVEL.setText("Under Weight");
                IMV.setImageResource(R.mipmap.un);
            } else if (BMI_Value >= 18.5 && BMI_Value <= 24.9) {
                LEVEL.setText("Normal Weight");
                IMV.setImageResource(R.mipmap.n);
            } else if (BMI_Value >= 25 && BMI_Value <= 29.9) {
                LEVEL.setText("Over Weight");
                IMV.setImageResource(R.mipmap.ov);
            } else if (BMI_Value >= 30 && BMI_Value <= 34.9) {
                LEVEL.setText("Obese");
                IMV.setImageResource(R.mipmap.o);
            } else if (BMI_Value > 35) {
                LEVEL.setText("Extremely Obese");
                IMV.setImageResource(R.mipmap.eo);
            }
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }
}
