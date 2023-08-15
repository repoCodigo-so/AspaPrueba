package com.example.aspaprueba;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aspaprueba.R;
import android.view.View;
import android.widget.Button;

public class Acerca extends AppCompatActivity {
    Button Marca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
        Marca = (Button)findViewById(R.id.buttonLLAMAR);


       // Intent intent = getIntent();

        Marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //finish();


                Intent callIntent =new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:3336292676"));
                startActivity(callIntent);

            }
        });
    }

}
