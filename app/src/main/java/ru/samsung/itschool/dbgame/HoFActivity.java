package ru.samsung.itschool.dbgame;

import static android.icu.text.MessagePattern.ArgType.SELECT;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HoFActivity extends Activity {

	private DBManager dbManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ho_f);
		dbManager = DBManager.getInstance(this);

		ListView listView = findViewById(R.id.lv);
		ArrayList<Result> results = dbManager.getAllResults();
		String[] resultsString = new String[results.size()];
		int i =0;
		for (Result res:results) {

			resultsString[i]=res.name+": "+ res.score;
			i++;
		}
		listView.setAdapter(new ResultAdapter(this,  results));
	}
}
