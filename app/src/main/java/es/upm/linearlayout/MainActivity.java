package es.upm.linearlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Texto incrustado programaticamente
        TextView tvPrincipal = findViewById(R.id.idTextoPrincipal);
        tvPrincipal.setText(R.string.textoActividad);
    }
}
