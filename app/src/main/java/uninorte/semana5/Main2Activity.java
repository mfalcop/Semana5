package uninorte.semana5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText etTitulo;
    private EditText etTexto;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        etTitulo= (EditText) findViewById(R.id.editText);
        etTexto= (EditText) findViewById(R.id.editText2);



    }


    public void guardar(View view) {
        Intent i =getIntent();
        i.putExtra("Titulo", etTitulo.getText().toString());
        i.putExtra("Texto", etTexto.getText().toString());
        setResult(RESULT_OK, i);
        finish();
    }
}
