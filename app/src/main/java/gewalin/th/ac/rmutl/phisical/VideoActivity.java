package gewalin.th.ac.rmutl.phisical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

public class VideoActivity extends AppCompatActivity {

    ListView vlistView;
    String[] countryNameVideo = {"ท่าการเหยียดคอ (ท่านั่ง)", "ท่ายกแขน (ท่านั่ง)", "ท่ากรรเชียง (ท่านั่ง)", "ท่าเหยียดหลัง (ท่านั่ง)",
                        "ท่าเหยียดข้อเท้า (ท่านั่ง)", "ท่าเหยียดเข่า (ท่านั่ง)", "ท่าเตะเท้า (ท่านั่ง)", "ท่านั่งสวนสนาม (ท่านั่ง)",
                        "ท่าเหยียดน่อง (ท่ายืน)", "ท่าเขย่งปลายเท้าสลับยืนบนส้นเท้า (ท่ายืน)", "ท่าเหวี่ยงขาออก (ท่ายืน)",
                        "ท่าย่อเข่า (ท่ายืน)", "ท่างอและเหยียดสะโพก (ท่ายืน)", "ท่ายกลำตัว (ท่ายืน)"};
    int[] countryImageVideo = {R.drawable.iconvideo, R.drawable.iconvideo,
            R.drawable.iconvideo, R.drawable.iconvideo, R.drawable.iconvideo,
            R.drawable.iconvideo, R.drawable.iconvideo,R.drawable.iconvideo,
            R.drawable.iconvideo, R.drawable.iconvideo, R.drawable.iconvideo,
            R.drawable.iconvideo, R.drawable.iconvideo, R.drawable.iconvideo};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

//        Create Toolbar
        createToolbar();

//        ListView Video
        vlistView = (ListView) findViewById(R.id.ListViewVideo);
        MyAdapterVideo myAdapter = new MyAdapterVideo(
                VideoActivity.this, countryNameVideo, countryImageVideo);
        vlistView.setAdapter(myAdapter);


        vlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(VideoActivity.this, DetailvideoActivity.class);
                intent.putExtra("ountryNameVideo", countryNameVideo[i]);
                intent.putExtra("countryImageVideo", countryImageVideo[i]);
                startActivity(intent);
            }
        });


    }

    private void createToolbar() {
        android.support.v7.widget.Toolbar mtoolbar = findViewById(R.id.toolbarVideo);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle(getString(R.string.title_toolbar_video));
    }
}
