package com.example.vibrator;

import android.app.Activity;
import android.app.Service;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.widget.Toast;


public class MainActivity extends Activity {

    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrator = (Vibrator) getSystemService(Service.VIBRATOR_SERVICE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(this,"手机震动",Toast.LENGTH_SHORT).show();
        vibrator.vibrate(2000);
        return super.onTouchEvent(event);
    }
}
