package com.example.tp5_carnettel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.tp5_carnettel.Contact;

public class Dialogue extends Activity 
{
	private Intent myIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dlg);
		myIntent = new Intent();
		
		Intent iin= getIntent();


		Bundle b = iin.getExtras();
        if (b!=null) {
            String str = (String) b.get("nom");
            final EditText nom = (EditText) findViewById(R.id.Nom);
            nom.setText(str);
            str = (String) b.get("prenom");
            final EditText prenom = (EditText) findViewById(R.id.Prenom);
            prenom.setText(str);
            str = (String) b.get("numero");
            final EditText numero = (EditText) findViewById(R.id.Tel);
            numero.setText(str);
        }

        Button btn=(Button)findViewById(R.id.Ok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView nom = (TextView)findViewById(R.id.Nom);
                String str=nom.getText().toString();
                myIntent.putExtra("nom", str);
                final TextView prenom = (TextView)findViewById(R.id.Prenom);
                str=prenom.getText().toString();
                myIntent.putExtra("prenom", str);
                final TextView numero = (TextView)findViewById(R.id.Tel);
                str=numero.getText().toString();
                myIntent.putExtra("numero", str);
                setResult(RESULT_OK, myIntent);
                finish();
            }
        });

        btn=(Button)findViewById(R.id.Annuler);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
