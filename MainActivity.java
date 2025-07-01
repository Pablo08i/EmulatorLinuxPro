package com.emuladorlinuxpro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.buttonStartLinux);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Process process = Runtime.getRuntime().exec("sh /data/data/com.emuladorlinuxpro/files/start_ubuntu.sh");
                    Toast.makeText(MainActivity.this, "Linux iniciado!", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Erro ao iniciar Linux", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}