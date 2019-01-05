package gewalin.th.ac.rmutl.phisical;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

public class SubjectActivity extends AppCompatActivity {

    ListView mlistView;

    String[] countryNames = {"อัมพาตประเภทต่างๆ", "อัมพาตประเภทต่างๆ", "อัมพาตประเภทต่างๆ", "การป้องกันภาวะแทรกซ้อน", "ความรู้เบื้องต้นสำหลับผู้สูงอายุ",
                            "ความรู้เบื้องต้นสำหรับการดูแลผู้สูงอายุ", "ความรู้เบื้องต้นสำหรับการดูแลผู้สูงอายุ", "ความรู้เบื้องต้นสำหรับการดูแลผู้สูงอายุ", "ความรู้เบื้องต้นสำหรับการดูแลผู้สูงอายุ",
                            "ความรู้เบื้องต้นสำหรับการดูแลผู้สูงอายุ", "ความรู้เบื้องต้นสำหรับการดูแลผู้สูงอายุ", "ความรู้เบื้องต้นสำหรับการดูแลผู้สูงอายุ"};

    String[] countryNamesSubtitle = {"ผู้ป่วยอัมพาตครึ่งซีก", "ผู้ป่วยอัมพาตครึ่งท่อน", "ผู้ป่วยอัมพาตทั้งตัว", "ความรู้เบื้องต้น",
                                "ด้านอาหาร", "ด้านการเคลื่อนไหวร่างกายและการออกกำลังกาย", "ด้านการขับถ่าย", "ด้านการป้องกันอุบัติเหตุในบ้าน",
                                "ด้านการติดเชื้อและโรคประจำตัว", "ด้านสุขภาพจิต", "ด้านสิ่งแวดล้อม"};

    int[] countryFlags = {R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard,
            R.drawable.clipboard};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

//        Create Toolbar
        createToolbar();

        mlistView = (ListView) findViewById(R.id.ListViewSubject);
        MyAdapter myAdapter = new MyAdapter(SubjectActivity.this, countryNames, countryNamesSubtitle, countryFlags);
        mlistView.setAdapter(myAdapter);

       mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent intent = new Intent(SubjectActivity.this, DetailsubjectActivity.class);
               intent.putExtra("countryName", countryNames[i]);
               intent.putExtra("countryFlag", countryFlags[i]);
               startActivity(intent);
           }
       });

    }

    private void createToolbar() {
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbarSubject);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.title_toolbar));

    }


}
