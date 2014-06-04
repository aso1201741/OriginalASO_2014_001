package jp.ac.st.asojuku.original2014001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Daikyo extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daikyo_activity);
		Intent vIntent = getIntent();
		String name = vIntent.getStringExtra("NAME");
		String res = null;
		if(name.equals("")){
			res = "あなたの運勢は大凶です。\n気を付けて！";
		}else{
			res = name + "さんの運勢は大凶です。\n気を付けて！";
		}
		((TextView)findViewById(R.id.daikyo_res)).setText(res);
	}

}
