package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch (v.getId()){
		case R.id.btnOK:
			Random rnd = new Random();
	        int ran = rnd.nextInt(4);
	        Intent vIntent;
	        switch (ran){
	        case 0:
	        	vIntent = new Intent(this,Daikichi.class);
	        	startActivity(vIntent);
	        	break;
	        case 1:
	        	vIntent = new Intent(this,Chukichi.class);
	        	startActivity(vIntent);
	        	break;
	        case 2:
	        	vIntent = new Intent(this,Kyo.class);
	        	startActivity(vIntent);
	        	break;
	        case 3:
	        	vIntent = new Intent(this,Daikyo.class);
	        	startActivity(vIntent);
	        	break;
	        }

			break;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button)findViewById(R.id.btnOK);
		btn.setOnClickListener(this);
	}

}
