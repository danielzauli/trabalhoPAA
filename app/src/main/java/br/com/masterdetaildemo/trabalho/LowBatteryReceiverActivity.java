package br.com.masterdetaildemo.trabalho;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LowBatteryReceiverActivity extends BroadcastReceiver {
    public LowBatteryReceiverActivity() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Atenção!!! Bateria Fraca!", Toast.LENGTH_SHORT).show();
    }
}
