package com.example.nhanphan.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String imageNames[] = {"Jungle","image2","image3","image4","image5","image6","image7","image8"
            ,"image9","image10",};
    Integer thumbnails[] = {R.drawable.s_image1,R.drawable.s_image2, R.drawable.s_image3, R.drawable.s_image4,R.drawable.s_image5,R.drawable.s_image6,R.drawable.s_image7,R.drawable.s_image8,R.drawable.s_image9,R.drawable.s_image10};

    ListView lv;
    TextView txttb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lview);
        txttb = (TextView) findViewById(R.id.txtTB);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.custom_row, imageNames, thumbnails);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = "Index: " + position + "\nName of image" + imageNames[position];
                txttb.setText(selectedItem);
            }
        });
    }
}
