package com.example.diegomoraes.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1;
    EditText num2;
    Button btn_calc;
    TextView resultado;
    float soma, n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //teste


        num1 = (EditText) findViewById(R.id.ed_num1);
        num2 = (EditText) findViewById(R.id.ed_num2);
        resultado = (TextView) findViewById(R.id.tv_resultado);
        btn_calc = (Button) findViewById(R.id.btn_calc);

        btn_calc.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        n1 = Float.valueOf(num1.getText().toString());
        n2 = Float.valueOf(num2.getText().toString());

        soma = n1 + n2;

        resultado.setText(String.valueOf(soma));



    }
}
