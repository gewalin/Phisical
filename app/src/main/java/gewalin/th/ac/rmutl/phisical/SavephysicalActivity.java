package gewalin.th.ac.rmutl.phisical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SavephysicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savephysical);

//        create Toolbal
        createToolbal();
    }

    private void createToolbal() {
        Toolbar toolbar = findViewById(R.id.toolbarsave);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.title_save_phisical));
    }
}
