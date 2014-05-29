package jp.ac.st.asojuku.original2014001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Kyo extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kyo_activity);
		Intent vIntent = getIntent();
		String name = vIntent.getStringExtra("NAME");
		String res = name + "さんの運勢は凶です。\n残念！";
		((TextView)findViewById(R.id.kyo_res)).setText(res);
	}

}
