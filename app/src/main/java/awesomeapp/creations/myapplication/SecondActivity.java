package awesomeapp.creations.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

public class SecondActivity extends AppCompatActivity {
//    final String[] studentList = getResources().getStringArray(R.array.studentList);
//    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(SecondActivity.this, android.R.layout.simple_list_item_1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /////////////

//        arrayAdapter=new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                studentList);
//        setListAdapter(arrayAdapter);
//
//        for(int i = 0; i<studentList.length; i++) {
//            arrayAdapter.add(studentList[i]);
//        }
    }

}
