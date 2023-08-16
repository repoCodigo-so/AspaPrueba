package com.example.aspaprueba;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aspaprueba.R;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;
import java.util.List;

public class Web extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ColorAdapter colorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ColorItem> colorItems = generateColorItems(); // Función para generar la lista de colores
        colorAdapter = new ColorAdapter(colorItems);
        recyclerView.setAdapter(colorAdapter);
    }

    private List<ColorItem> generateColorItems() {
        List<ColorItem> colorItems = new ArrayList<>();
        colorItems.add(new ColorItem("Rojo", R.color.colorRed));
        colorItems.add(new ColorItem("Verde", R.color.colorGreen));
        colorItems.add(new ColorItem("Azul", R.color.colorBlue));
        colorItems.add(new ColorItem("Amarillo", R.color.colorYellow));
        colorItems.add(new ColorItem("Cian", R.color.colorCyan));
        colorItems.add(new ColorItem("Magenta", R.color.colorMagenta));
        colorItems.add(new ColorItem("Blanco", R.color.colorWhite));
        colorItems.add(new ColorItem("Negro", R.color.colorBlack));
        colorItems.add(new ColorItem("Gris", R.color.colorGray));
        colorItems.add(new ColorItem("Naranja", R.color.colorOrange));
        colorItems.add(new ColorItem("Rosa", R.color.colorPink));
        colorItems.add(new ColorItem("Violeta", R.color.colorPurple));
        colorItems.add(new ColorItem("Aqua", R.color.colorAqua));
        colorItems.add(new ColorItem("Beige", R.color.colorBeige));
        colorItems.add(new ColorItem("Marrón", R.color.colorBrown));
        colorItems.add(new ColorItem("Coral", R.color.colorCoral));
        colorItems.add(new ColorItem("Dorado", R.color.colorGold));
        colorItems.add(new ColorItem("Gris Claro", R.color.colorLightGray));
        colorItems.add(new ColorItem("Lavanda", R.color.colorLavender));
        colorItems.add(new ColorItem("Limón", R.color.colorLemon));
        colorItems.add(new ColorItem("Marrón Claro", R.color.colorLightBrown));
        colorItems.add(new ColorItem("Oro Rosa", R.color.colorRoseGold));
        colorItems.add(new ColorItem("Plateado", R.color.colorSilver));
        colorItems.add(new ColorItem("Turquesa", R.color.colorTurquoise));
        colorItems.add(new ColorItem("Verde Lima", R.color.colorLimeGreen));
        colorItems.add(new ColorItem("Verde Oliva", R.color.colorOliveGreen));
        colorItems.add(new ColorItem("Verde Oscuro", R.color.colorDarkGreen));
        colorItems.add(new ColorItem("Violeta Rojo", R.color.colorVioletRed));
        colorItems.add(new ColorItem("Chocolate", R.color.colorChocolate));
        colorItems.add(new ColorItem("Verde Mar", R.color.colorSeaGreen));
        return colorItems;
    }
}