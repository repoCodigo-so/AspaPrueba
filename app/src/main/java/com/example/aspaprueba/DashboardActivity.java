package com.example.aspaprueba;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    Button LogOut,actuno,actdos,acttre,cua;
    TextView EmailShow;
    String EmailHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        LogOut = (Button)findViewById(R.id.button);
        actuno = (Button)findViewById(R.id.butactuno);
        actdos = (Button)findViewById(R.id.buttonactoDos);
        acttre = (Button)findViewById(R.id.buttonactoTres);
        cua = (Button)findViewById(R.id.buttonCu);
        EmailShow = (TextView)findViewById(R.id.EmailShow);


        Intent intent = getIntent();
        EmailHolder = intent.getStringExtra(UserLoginActivity.UserEmail);
        EmailShow.setText(EmailHolder);


        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

                Intent intent = new Intent(DashboardActivity.this, UserLoginActivity.class);

                startActivity(intent);

                Toast.makeText(DashboardActivity.this, "Log Out Exitoso", Toast.LENGTH_LONG).show();


            }
        });
        actuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // finish();

                Intent intent = new Intent(DashboardActivity.this, Acerca.class);

                startActivity(intent);

                Toast.makeText(DashboardActivity.this, "Informacion referente a nosotros", Toast.LENGTH_LONG).show();


            }
        });
        actdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //finish();

                Intent intent = new Intent(DashboardActivity.this, Promo.class);

                startActivity(intent);

                Toast.makeText(DashboardActivity.this, "Informacion referente a promociones", Toast.LENGTH_LONG).show();


            }
        });
        acttre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //finish();

                Intent intent = new Intent(DashboardActivity.this, Local.class);

                startActivity(intent);

                Toast.makeText(DashboardActivity.this, "Informacion referente a ubicacion", Toast.LENGTH_LONG).show();


            }
        });
        cua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //finish();

                Intent intent = new Intent(DashboardActivity.this, Web.class);

                startActivity(intent);

                Toast.makeText(DashboardActivity.this, "Informacion referente a la pagina web", Toast.LENGTH_LONG).show();


            }
        });
    }
}