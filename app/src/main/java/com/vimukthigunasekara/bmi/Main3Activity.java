package com.vimukthigunasekara.bmi;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    TextView Title, Heightname, HeightMeas, WeightName, WeightMeas, BMI, LEVEL, Weight, Height;
    ImageView IMV;
    ScrollView scroll;
    Button ButtonCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Title = findViewById(R.id.txtTitle);
        Heightname = findViewById(R.id.txtheightName);
        HeightMeas = findViewById(R.id.txtheightmeas);
        WeightName = findViewById(R.id.txtweightName);
        WeightMeas = findViewById(R.id.txtweightmeas);
        ButtonCon = findViewById(R.id.button);
        BMI = findViewById(R.id.txtBMIV);
        LEVEL = findViewById(R.id.txtName);
        Weight = findViewById(R.id.txtWeight);
        Height = findViewById(R.id.txtHeight);
        IMV = findViewById(R.id.imvLevel);
        scroll = findViewById(R.id.scrollView2);
    }

    @SuppressLint("ResourceType")
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
                IMV.setImageResource(R.mipmap.unone);
                Title.setBackgroundColor(getResources().getColor(R.color.gray));
                Heightname.setTextColor(getResources().getColor(R.color.gray));
                HeightMeas.setTextColor(getResources().getColor(R.color.gray));
                Height.setTextColor(getResources().getColor(R.color.gray));
                WeightName.setTextColor(getResources().getColor(R.color.gray));
                WeightMeas.setTextColor(getResources().getColor(R.color.gray));
                Weight.setTextColor(getResources().getColor(R.color.gray));
                ButtonCon.setTextColor(getResources().getColor(R.color.gray));
                ButtonCon.setBackgroundResource(R.drawable.button_shape_gray);
                scroll.setBackgroundColor(getResources().getColor(R.color.gray));
                LEVEL.setBackgroundColor(getResources().getColor(R.color.gray));
                BMI.setBackgroundColor(getResources().getColor(R.color.gray));
                IMV.setBackgroundColor(getResources().getColor(R.color.gray));
            } else if (BMI_Value >= 18.5 && BMI_Value <= 24.9) {
                LEVEL.setText("Normal Weight");
                IMV.setImageResource(R.mipmap.nntwo);
                Title.setBackgroundColor(getResources().getColor(R.color.green));
                Heightname.setTextColor(getResources().getColor(R.color.green));
                HeightMeas.setTextColor(getResources().getColor(R.color.green));
                Height.setTextColor(getResources().getColor(R.color.green));
                WeightName.setTextColor(getResources().getColor(R.color.green));
                WeightMeas.setTextColor(getResources().getColor(R.color.green));
                Weight.setTextColor(getResources().getColor(R.color.green));
                ButtonCon.setTextColor(getResources().getColor(R.color.green));
                ButtonCon.setBackgroundResource(R.drawable.button_shape_green);
                scroll.setBackgroundColor(getResources().getColor(R.color.green));
                LEVEL.setBackgroundColor(getResources().getColor(R.color.green));
                BMI.setBackgroundColor(getResources().getColor(R.color.green));
                IMV.setBackgroundColor(getResources().getColor(R.color.green));
            } else if (BMI_Value >= 25 && BMI_Value <= 29.9) {
                LEVEL.setText("Over Weight");
                IMV.setImageResource(R.mipmap.ovthree);
                Title.setBackgroundColor(getResources().getColor(R.color.yello));
                Heightname.setTextColor(getResources().getColor(R.color.yello));
                HeightMeas.setTextColor(getResources().getColor(R.color.yello));
                Height.setTextColor(getResources().getColor(R.color.yello));
                WeightName.setTextColor(getResources().getColor(R.color.yello));
                WeightMeas.setTextColor(getResources().getColor(R.color.yello));
                Weight.setTextColor(getResources().getColor(R.color.yello));
                ButtonCon.setTextColor(getResources().getColor(R.color.yello));
                ButtonCon.setBackgroundResource(R.drawable.button_shape_yellow);
                scroll.setBackgroundColor(getResources().getColor(R.color.yello));
                LEVEL.setBackgroundColor(getResources().getColor(R.color.yello));
                BMI.setBackgroundColor(getResources().getColor(R.color.yello));
                IMV.setBackgroundColor(getResources().getColor(R.color.yello));
            } else if (BMI_Value >= 30 && BMI_Value <= 34.9) {
                LEVEL.setText("Obese");
                IMV.setImageResource(R.mipmap.oofour);
                Title.setBackgroundColor(getResources().getColor(R.color.orange));
                Heightname.setTextColor(getResources().getColor(R.color.orange));
                HeightMeas.setTextColor(getResources().getColor(R.color.orange));
                Height.setTextColor(getResources().getColor(R.color.orange));
                WeightName.setTextColor(getResources().getColor(R.color.orange));
                WeightMeas.setTextColor(getResources().getColor(R.color.orange));
                Weight.setTextColor(getResources().getColor(R.color.orange));
                ButtonCon.setTextColor(getResources().getColor(R.color.orange));
                ButtonCon.setBackgroundResource(R.drawable.button_shape_orange);
                scroll.setBackgroundColor(getResources().getColor(R.color.orange));
                LEVEL.setBackgroundColor(getResources().getColor(R.color.orange));
                BMI.setBackgroundColor(getResources().getColor(R.color.orange));
                IMV.setBackgroundColor(getResources().getColor(R.color.orange));
            } else if (BMI_Value > 35) {
                LEVEL.setText("Extremely Obese");
                IMV.setImageResource(R.mipmap.eofive);
                Title.setBackgroundColor(getResources().getColor(R.color.red));
                Heightname.setTextColor(getResources().getColor(R.color.red));
                HeightMeas.setTextColor(getResources().getColor(R.color.red));
                Height.setTextColor(getResources().getColor(R.color.red));
                WeightName.setTextColor(getResources().getColor(R.color.red));
                WeightMeas.setTextColor(getResources().getColor(R.color.red));
                Weight.setTextColor(getResources().getColor(R.color.red));
                ButtonCon.setTextColor(getResources().getColor(R.color.red));
                ButtonCon.setBackgroundResource(R.drawable.button_shape_red);
                scroll.setBackgroundColor(getResources().getColor(R.color.red));
                LEVEL.setBackgroundColor(getResources().getColor(R.color.red));
                BMI.setBackgroundColor(getResources().getColor(R.color.red));
                IMV.setBackgroundColor(getResources().getColor(R.color.red));
            }
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }
}
