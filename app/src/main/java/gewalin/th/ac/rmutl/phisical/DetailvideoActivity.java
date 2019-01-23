package gewalin.th.ac.rmutl.phisical;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.MediaController;
import android.widget.VideoView;

public class DetailvideoActivity extends AppCompatActivity {


    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailvideo);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbarVideo1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            toolbar.setTitle(bundle.getString("countryNameVideo"));

        }

    }


}
