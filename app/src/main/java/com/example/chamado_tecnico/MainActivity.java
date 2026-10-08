package com.example.chamado_tecnico;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private Button btnSailvar;
    private TextInputLayout ilEquipamento, ilNumero, ilRetorno;
    private TextInputEditText edtEquipamento, edtNumero, edtRetorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        MaterialToolbar toolbar = findViewById(R.id.toolbarTop);
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);

        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.nav_host);

        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(bottomNav, navController);

    }
}
//        btnSailvar = findViewById(R.id.btnSalvar);
//        ilEquipamento = findViewById(R.id.ilEquipamento);
//        ilNumero = findViewById(R.id.ilNumero);
//        ilRetorno = findViewById(R.id.ilRetorno);
//        edtEquipamento = findViewById(R.id.edtEquipamento);
//        edtNumero = findViewById(R.id.edtNumero);
//        edtRetorno = findViewById(R.id.edtRetorno);
//
//
//        Button btnConfig = findViewById(R.id.btnConfig);
//        btnConfig.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, ConfigAcitiviity.class);
//            startActivity(intent);
//        });

//        btnSailvar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String equipamento = edtEquipamento.getText().toString();
//                String numeroString = edtNumero.getText().toString();
//                String retorno = edtRetorno.getText().toString();
//
//                ilEquipamento.setError(null);
//                ilNumero.setError(null);
//                ilRetorno.setError(null);
//
//                if(equipamento.isEmpty()){
//                    ilEquipamento.setError("Campo obrigatório");
//                    return;
//                }
//
//                if(numeroString.isEmpty()){
//                    ilNumero.setError("Campo obrigatório");
//                    return;
//                }
//
//                if(retorno.isEmpty()){
//                    ilRetorno.setError("Campo obrigatório");
//                    return;
//                }
//
//                if(!retorno.contains("@")){
//                    ilRetorno.setError("E-mail sem arroba");
//                    return;
//                }
//
//                try {
//                    int numero = Integer.parseInt(numeroString);
//                } catch (NumberFormatException e) {
//                    ilNumero.setError("Numero invalido");
//                    return;
//                }
//                Toast.makeText(MainActivity.this, "Salvo com sucesso",Toast.LENGTH_SHORT).show();
//            }
//        });


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.menu_top, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        if (item.getItemId() == R.id.menu_config) {
//            Intent intent = new Intent(MainActivity.this, ConfigAcitiviity.class);
//            startActivity(intent);
//            return true;
//        }
//
//        if (item.getItemId() == R.id.menu_sobre) {
//            Intent intent = new Intent(MainActivity.this, SobreActivity.class);
//            startActivity(intent);
//            return true;
//        }
//
//        if (item.getItemId() == R.id.menu_cadastro) {
//            Intent intent = new Intent(MainActivity.this, CadastroAcitivity.class);
//            startActivity(intent);
//            return true;
//        }
//
//        if (item.getItemId() == R.id.home) {
//            Intent intent = new Intent(MainActivity.this, MainActivity.class);
//            startActivity(intent);
//            return true;
//        }
//
//
//        return super.onOptionsItemSelected(item);
//    }
