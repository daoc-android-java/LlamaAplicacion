package dordonez.llamaaplicacion;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void pideSaludo(View v) {
		Intent intent = new Intent("dordonez.aplicacionllamada.ACCION_SALUDO");
		intent.putExtra("nombre", "Diego");
		startActivityForResult(intent, 1);		
	}
	
	@Override
	protected void onActivityResult (int requestCode, int resultCode, Intent data) {
		TextView tv = (TextView) findViewById(R.id.tv);
		tv.setText(data.getStringExtra("saludo"));
	}


}
