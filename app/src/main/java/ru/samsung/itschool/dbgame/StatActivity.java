package ru.samsung.itschool.dbgame;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class StatActivity extends Activity {
    int c1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);
        DBManager dbManager = DBManager.getInstance(this);
        TextView t1 = findViewById(R.id.textView);
        t1.setText(dbManager.gCount()+"");
    }
}
