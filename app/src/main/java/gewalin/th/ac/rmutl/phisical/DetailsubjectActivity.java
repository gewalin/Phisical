package gewalin.th.ac.rmutl.phisical;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class DetailsubjectActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsubject);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbarSubject1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            toolbar.setTitle(bundle.getString("countryName"));

        }
    }
}
