package br.com.masterdetaildemo.trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void proximaTela(View view) {

        //descricao = (EditText)findViewById(R.id.miEditText);

        Intent intent = new Intent(view.getContext(), ActivityTela2.class );
        intent.putExtra("EXTRA_MESSAGE","Daniel Zauli Conceição");
        intent.putExtra("ALUNO_2","aluno 2");
        startActivity(intent);
    }

}
