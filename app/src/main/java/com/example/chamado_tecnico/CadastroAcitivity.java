package com.example.chamado_tecnico;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;

public class CadastroAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro_acitivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        MaterialToolbar toolbar = findViewById(R.id.toolbarTop);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null){
            getSupportActionBar()
                    .setDisplayHomeAsUpEnabled(true);
        }

        EditText edtChamado = findViewById(R.id.edtChamado);
        Button btnChamar = findViewById(R.id.btnChamar);

        btnChamar.setOnClickListener(v -> {
            String chamado = edtChamado.getText().toString().trim();
            if(chamado.isEmpty()){
                edtChamado.setError("Digite a descrição do chamado");
                return;
            }
            Toast.makeText(this, "Chamado registrado", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.menu_config) {
            Intent intent = new Intent(CadastroAcitivity.this, ConfigAcitiviity.class);
        }

        if (item.getItemId() == R.id.menu_sobre) {
            Intent intent = new Intent(CadastroAcitivity.this, SobreActivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.menu_cadastro) {
            Intent intent = new Intent(CadastroAcitivity.this, CadastroAcitivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.home) {
            Intent intent = new Intent(CadastroAcitivity.this, MainActivity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}