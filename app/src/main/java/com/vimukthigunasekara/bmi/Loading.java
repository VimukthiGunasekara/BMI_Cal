package com.vimukthigunasekara.bmi;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
    }

    public void loadingClick(View view) {
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }

    public void infoClick(View view) {
        displayPopupWindow(view);
    }

    private void displayPopupWindow(View anchorView) {
        PopupWindow popup = new PopupWindow(Loading.this);
        View layout = getLayoutInflater().inflate(R.layout.popup_content, null);
        popup.setContentView(layout);
        // Set content width and height
        popup.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popup.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        // Closes the popup window when touch outside of it - when looses focus
        popup.setOutsideTouchable(true);
        popup.setFocusable(true);
        // Show anchored to button
        popup.setBackgroundDrawable(new BitmapDrawable());
        popup.showAsDropDown(anchorView);
    }
}
