package com.pointhub;

import android.app.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.pointhub.R;
import com.pointhub.db.Adapter;
import com.pointhub.db.DatabaseHelper;
import com.pointhub.db.Points;
import com.pointhub.db.PointsAdapter;

import java.util.ArrayList;
import java.util.List;

import static com.pointhub.R.id.points;

/**
 * Created by Venu on 03-05-2016.
 */
public class PointListActivity extends Activity {

    RecyclerView lstPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_list);

        /*final String store_name;
        store_name = getIntent().getExtras().getString(DatabaseHelper.STORE_NAME);*/
        DatabaseHelper dbHelper=new DatabaseHelper(getApplicationContext());
        ArrayList<Points> pointses= (ArrayList<Points>) DatabaseHelper.getInstance(this).getAllPoints();
        lstPoints= (RecyclerView) findViewById(R.id.lstPoints);


        lstPoints.setLayoutManager(new LinearLayoutManager(this));
        lstPoints.setAdapter(new Adapter(PointListActivity.this,pointses));

    }
}
