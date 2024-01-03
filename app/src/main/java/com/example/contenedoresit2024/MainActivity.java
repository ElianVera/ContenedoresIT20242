package com.example.contenedoresit2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Llenar el combobox o lista
        //paso 1 Data

        final String[] datos = new String[]{"Alojamiento", "Alimentaci[on y Bebidas", "Atractivos Culturales", "Esparcimientos", "Compras"};
        //Adaptador PASO 2
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        //paso 3 vista

        Spinner cmbOpciones = (Spinner) findViewById(R.id.cbCategoria);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemSelectedListener(this);

        //Llenar el combobox o lista
        //paso 1 Data

        final String[] datos2 = new String[]{"EXPLOMUNDO", "MULTICARIBE", "XPLORA", "CAFÉ & CAKE SHOP", "SWEET LAND" , "TORO CAFÉ"};
        //Adaptador PASO 2
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos2);
        //paso 3 vista

        ListView lstOpciones = (ListView)findViewById(R.id.lstLugares);
        lstOpciones.setAdapter(adaptador2);


    }


    public void onItemSelected(AdapterView<?> parent,android.view.View v, int position, long id) {
        TextView txtItem = (TextView) findViewById(R.id.txtCategoria);
        txtItem.setText("Seleccionado: " +
                parent.getItemAtPosition(position));}

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    TextView txtItem = 					(TextView)findViewById(R.id.txtCategoria); txtItem.setText("");}
}