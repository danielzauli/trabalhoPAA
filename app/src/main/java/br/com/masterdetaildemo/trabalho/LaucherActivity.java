package br.com.masterdetaildemo.trabalho;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LaucherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences settings=getSharedPreferences("prefs",0);
        boolean firstRun=settings.getBoolean("firstRun",true);
        if(firstRun==true)
        {
            SharedPreferences.Editor editor=settings.edit();
            editor.putBoolean("firstRun",false);
            editor.commit();
            Intent i=new Intent(LaucherActivity.this,SplashActivity.class);
            startActivity(i);
            finish();
        }
        else
        {
          //  SharedPreferences.Editor editor=settings.edit();
          //  editor.putBoolean("firstRun",true);
          //  editor.commit();
            Intent a=new Intent(LaucherActivity.this,MainActivity.class);
            startActivity(a);
            finish();
        }
    }
}
