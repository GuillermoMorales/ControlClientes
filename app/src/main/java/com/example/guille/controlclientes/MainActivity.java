package com.example.guille.controlclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2;
    Button btn1,btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = tv1.getText().toString();

                int numero1 = Integer.parseInt(n1);
                numero1 = numero1+1;
                tv1.setText(""+numero1);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n2 = tv2.getText().toString();

                int numero2 = Integer.parseInt(n2);
                numero2 = numero2+1;
                tv2.setText(""+numero2);

            }
        });
    }

    public void inicializar()
    {
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        btn1 =(Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
    }
}
