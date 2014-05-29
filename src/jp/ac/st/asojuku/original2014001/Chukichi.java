package jp.ac.st.asojuku.original2014001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Chukichi extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chukichi_activity);
		Intent vIntent = getIntent();
		String name = vIntent.getStringExtra("NAME");
		String res = name + "さんの運勢は中吉です。\nよかったね！";
		((TextView)findViewById(R.id.chukichi_res)).setText(res);
	}

}
