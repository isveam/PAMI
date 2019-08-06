package br.com.etechoracio.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void onLonga(View view) {
        Toast longa = Toast.makeText(this,"Mensagem longa",Toast.LENGTH_LONG);
        longa.show();
    }

    public void onCurta(View view) {
        Toast curta = Toast.makeText(this,"Mensagem curta",Toast.LENGTH_SHORT);
        curta.show();
    }
}
