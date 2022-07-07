package edu.val.estadored;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButtonWifi;
    private RadioButton radioButtonDatos;
    private RadioButton radioButtonInternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.radioButtonDatos = findViewById(R.id.radioButtonDatos);
        this.radioButtonWifi = findViewById(R.id.radioButtonWifi);
        this.radioButtonInternet = findViewById(R.id.radioButtonSinInternet);

        boolean hay_wifi = UtilRed.hayWifiViejo(this);
        boolean hay_datos = UtilRed.hayDatos345gViejo(this);
        boolean hay_internet = UtilRed.hayInternetViejo(this);

        this.radioButtonDatos.setChecked(hay_datos);
        this.radioButtonWifi.setChecked(hay_wifi);
        this.radioButtonInternet.setChecked(!hay_internet);





    }


}