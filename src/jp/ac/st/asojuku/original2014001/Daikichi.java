package jp.ac.st.asojuku.original2014001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Daikichi extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daikichi_activity);
		Intent vIntent = getIntent();
		String name = vIntent.getStringExtra("NAME");
		String res = null;
		if(name.equals("")){
			res = "あなたの運勢は大吉です。\nおめでとう！";
		}else{
			res = name + "さんの運勢は大吉です。\nおめでとう！";
		}
		((TextView)findViewById(R.id.daikichi_res)).setText(res);
	}

}
