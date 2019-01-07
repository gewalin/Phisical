package gewalin.th.ac.rmutl.phisical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Control PhisicalButton
        ImageView imageView1 = (ImageView) findViewById(R.id.btn1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PhisicalActivity.class);
                startActivity(intent);
            }
        });

//        Control EducateButtonControll
        ImageView imageView2 = (ImageView) findViewById(R.id.btn2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EducateActivity.class);
                startActivity(intent);
            }
        });

//        Control CallButtonControll
        ImageView imageView3 = (ImageView) findViewById(R.id.btn3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CallActivity.class);
                startActivity(intent);
            }
        });

//        Control UserButtonControl
        ImageView imageView4 = (ImageView) findViewById(R.id.btn4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent);
            }
        });


    }
}
