package lwtech.itad230.implicitintentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static int TIMER_REQUEST_CODE = 0;
    public final static int MESSAGE_REQUEST_CODE = 1;
    public final static int PICTURE_REQUEST_CODE = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTimerClick(View view) {
        Intent intent = new Intent( this, TimerActivity.class );
        startActivityForResult( intent, TIMER_REQUEST_CODE);
    }

    public void onMessageClick(View view) {

    }

    public void onPictureClick(View view) {

    }
}
