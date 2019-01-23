package gewalin.th.ac.rmutl.phisical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PhisicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phisical);

//        Add Button
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.AddPhysical);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhisicalActivity.this, AddformActivity.class);
                startActivity(intent);
            }
        });

    }
}
