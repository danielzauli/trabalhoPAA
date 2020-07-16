package br.com.masterdetaildemo.trabalho;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityTela2 extends AppCompatActivity {


    private ListView lvAluno;
    private List<String> lsAluno;
    private ArrayAdapter<String> adapter;

    private String nome;
    private String nome2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Intent intent = getIntent();
        nome = ((Intent) intent).getStringExtra("EXTRA_MESSAGE");
        nome2 = ((Intent) intent).getStringExtra("ALUNO_2");

        lsAluno = new ArrayList<String>();
        lsAluno.add(nome);
        lsAluno.add(nome2);

        lvAluno = (ListView) findViewById(R.id.aluno_list);

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, lsAluno);

        lvAluno.setAdapter(adapter);

        ImageView imgView=(ImageView)findViewById(R.id.imageView1);

        imgView.setImageResource(R.drawable.android_24_black);

    }
}
