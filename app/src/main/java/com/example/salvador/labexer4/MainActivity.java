package com.example.salvador.labexer4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;
import android.support.constraint.ConstraintLayout;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LAB4", "onCreate() has executed.");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LAB4", "onStart() has executed.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LAB4", "onResume() has executed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LAB4", "onPause() has executed.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LAB4", "onStop() has executed.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LAB4", "onDestroy() has executed.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LAB4", "onRestart() has executed.");
    }


    public void ToastButtonPress(View v){
        Button but=(Button)findViewById(R.id.toastButton);
        but.isClickable();
        if(but.isPressed()){
                Toast toast=Toast.makeText(this, "BACK HAS BEEN PRESSED", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    public void SnackbarButtonPress(View v){
        Button but1=(Button)findViewById(R.id.snackbarButton);
        but1.isClickable();
        if(but1.isPressed()){
            Snackbar snackbar=Snackbar.make(v, "NEXT HAS BEEN PRESSED", Snackbar.LENGTH_LONG);
            snackbar.show();
        }
    }
}
