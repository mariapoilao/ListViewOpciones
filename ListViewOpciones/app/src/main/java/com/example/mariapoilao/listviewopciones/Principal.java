package com.example.mariapoilao.listviewopciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {

    private ListView listaOpciones;
    private ArrayAdapter adapter;
    private String[] opciones;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        listaOpciones = (ListView)findViewById(R.id.lstOpciones);
        opciones = this.getResources().getStringArray(R.array.opciones);
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, opciones);
        listaOpciones.setAdapter(adapter);

        listaOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        i = new Intent(Principal.this,Registrar.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this,Listado.class);
                        startActivity(i);
                        break;
                }
                }

            });


    }
}
