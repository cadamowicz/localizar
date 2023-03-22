package com.example.localizar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText texto;

    EditText texto2;

    EditText resultfinal;

    Button resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto=findViewById(R.id.texto);
        texto2=findViewById(R.id.texto2);
        resultfinal=findViewById(R.id.resultfinal);
        resultado=findViewById(R.id.resultado);

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String achou;
                String teste;
                String t1=texto.getText().toString();// armazena dentro da variavel para comparar
                String t2=texto2.getText().toString();
                int pos=t1.indexOf(t2);

                if( pos == -1){
                    achou="Não Achou";
                }
                else{
                    achou="Achou";
                    teste=t1.replaceAll(t2,"r");
                }

                resultfinal.setText(String.valueOf(achou));
                texto.setText(String.valueOf(teste));
            }
        });
    }
}