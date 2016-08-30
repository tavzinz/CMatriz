package com.tavzenterprise.cmatriz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = MainActivity.this;

        final Cartao cartao = new Cartao();
        Cartao.readCsv(context);

        final TextView LetraTxt = (TextView)findViewById(R.id.coordinatesCharTxt);
        final TextView NumTxt = (TextView)findViewById(R.id.coordinatesNumTxt);
        final TextView PositionTxt = (TextView)findViewById(R.id.resultadoText);

        //botoes
        final Button btn_A = (Button)findViewById(R.id.buttonA);
        final Button btn_B = (Button)findViewById(R.id.buttonB);
        final Button btn_C = (Button)findViewById(R.id.buttonC);
        final Button btn_D = (Button)findViewById(R.id.buttonD);
        final Button btn_E = (Button)findViewById(R.id.buttonE);
        final Button btn_F = (Button)findViewById(R.id.buttonF);
        final Button btn_G = (Button)findViewById(R.id.buttonG);
        final Button btn_H = (Button)findViewById(R.id.buttonH);

        final Button btn_1 = (Button)findViewById(R.id.button1);
        final Button btn_2 = (Button)findViewById(R.id.button2);
        final Button btn_3 = (Button)findViewById(R.id.button3);
        btn_4 = (Button)findViewById(R.id.button4);
        btn_5 = (Button)findViewById(R.id.button5);
        btn_6 = (Button)findViewById(R.id.button6);
        btn_7 = (Button)findViewById(R.id.button7);
        btn_8 = (Button)findViewById(R.id.button8);
        btn_9 = (Button)findViewById(R.id.button9);

        final Button Calculate = (Button)findViewById(R.id.CalculateBtn);

        btn_A.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LetraTxt.setText("A");
            }
        });

        btn_B.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LetraTxt.setText("B");
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LetraTxt.setText("C");
            }
        });

        btn_D.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LetraTxt.setText("D");
            }
        });

        btn_E.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LetraTxt.setText("E");
            }
        });

        btn_F.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LetraTxt.setText("F");
            }
        });

        btn_G.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LetraTxt.setText("G");
            }
        });

        btn_H.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LetraTxt.setText("H");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"1");
                disableButtons(true);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"2");
                disableButtons(true);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"3");
                disableButtons(true);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"4");
                disableButtons(true);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"5");
                disableButtons(true);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"6");
                disableButtons(true);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"7");
                disableButtons(true);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"8");
                disableButtons(true);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                NumTxt.setText(NumTxt.getText()+"9");
                disableButtons(true);
            }
        });

        Calculate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                char resultado = 'X';
                String codigo = LetraTxt.getText().toString();
                codigo = codigo.concat(NumTxt.getText().toString());
                codigo = codigo.concat(PositionTxt.getText().toString());
                resultado = Cartao.getResultado(codigo);
                NumTxt.setText("");
                LetraTxt.setText("");
                PositionTxt.setText("" + resultado);
                disableButtons(false);
            }
        });
    }

    private void disableButtons(boolean enable){
        btn_4.setEnabled(!enable);
        btn_5.setEnabled(!enable);
        btn_6.setEnabled(!enable);
        btn_7.setEnabled(!enable);
        btn_8.setEnabled(!enable);
        btn_9.setEnabled(!enable);
    }
}
