package gewalin.th.ac.rmutl.phisical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EducateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educate);

//        Control VideoButton
        Button button1 = (Button) findViewById(R.id.btnVideo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducateActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });

//        Control SubjectButton
        Button button2 = (Button) findViewById(R.id.btnEducate);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducateActivity.this, SubjectActivity.class);
                startActivity(intent);
            }
        });
    }
}
