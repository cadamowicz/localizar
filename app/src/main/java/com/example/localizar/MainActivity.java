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

    EditText letra1;

    EditText letra2;

    EditText palavrafinal;

    Button trocar;

    Button resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto=findViewById(R.id.texto);
        texto2=findViewById(R.id.texto2);
        resultfinal=findViewById(R.id.resultfinal);
        resultado=findViewById(R.id.resultado);
        letra1=findViewById(R.id.letra1);
        letra2=findViewById(R.id.letra2);
        palavrafinal=findViewById(R.id.palavrafinal);
        trocar=findViewById(R.id.trocar);

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String achou;

                String t1=texto.getText().toString();// armazena dentro da variavel para comparar
                String t2=texto2.getText().toString();

                int pos=t1.indexOf(t2);

                if( pos == -1){
                    achou="Não Achou";
                }
                else{
                    achou="Achou";

                }

                resultfinal.setText(String.valueOf(achou));

            }


        });
        trocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String t3=texto.getText().toString();
                String t4=letra1.getText().toString();
                String t5=letra2.getText().toString();
                char myChar = t4.charAt(0);
                char myChar1 = t5.charAt(0);
                String char2 = t3.replace(myChar,myChar1);
                palavrafinal.setText(String.valueOf(char2));
            }
        });
    }
}