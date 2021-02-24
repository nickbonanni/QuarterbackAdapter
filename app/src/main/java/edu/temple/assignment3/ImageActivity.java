package edu.temple.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView qbImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayList<String> nameArray = new ArrayList<String>();
        nameArray.add(getString(R.string.brady));
        nameArray.add(getString(R.string.brees));
        nameArray.add(getString(R.string.mahomes));
        nameArray.add(getString(R.string.rodgers));
        nameArray.add(getString(R.string.watson));

       int[] qbImageArray = new int[]{R.drawable.brady, R.drawable.brees, R.drawable.mahomes,
                                        R.drawable.rodgers, R.drawable.watson};

       QuarterbackAdapter adapter = new QuarterbackAdapter(this, nameArray);

       spinner.setAdapter(adapter);

        /*
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        */


    }
}