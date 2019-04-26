package com.example.asignarcomprotamientoaboton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaro objetos
    private Button botonSaludar, botonReset; //declaro objeto
    private EditText editNombre;    //declaro objeto
    private TextView textSaludo ;   //declaro objeto


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencio objetos
        botonSaludar = findViewById(R.id.botonSaludar); //referencio objetos
        editNombre = findViewById(R.id.editNombre); //referencio objetos
        textSaludo = findViewById(R.id.textSaludo); //referencio objetos
        botonReset = findViewById(R.id.botonReset);

        botonSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saludar();
            }
        });

    }

    private void saludar(){
        if(editNombre.getText().toString().isEmpty()) { //si el cuadro esta vacio y el usuario no ingreso el nombre
            Toast.makeText(this, "Tiene que ingresar su nombre", Toast.LENGTH_SHORT).show(); //le decimos que tiene que ingresar su nombre
        }
         else {
             //el usuario ingreso el saludo
            textSaludo.setText("Bienvenido  " + editNombre.getText().toString());
        }
    }

    public void reset(View v){

        editNombre.setText("");
        textSaludo.setText("");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
