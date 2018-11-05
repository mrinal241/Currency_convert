package com.example.dcl.converter_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText input,output;
     public Button click,reseat,btnA;
    RadioButton bdt,usd,ind,bdt1,cad,bdt2,euro,bdt3;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=(EditText)findViewById(R.id.input);
        output=(EditText)findViewById(R.id.output);
        click=(Button)findViewById(R.id.click);
        bdt=(RadioButton)findViewById(R.id.btn1);
        usd=(RadioButton)findViewById(R.id.btn2);
        bdt1=(RadioButton)findViewById(R.id.btn3);
        ind=(RadioButton)findViewById(R.id.btn4);
        cad=(RadioButton)findViewById(R.id.btn5);
        bdt2=(RadioButton)findViewById(R.id.btn6);
        euro=(RadioButton)findViewById(R.id.btn7);
        bdt3=(RadioButton)findViewById(R.id.btn8);
        reseat =(Button)findViewById(R.id.clear);





        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(usd.isChecked())
                {
                    Double amount=Double.parseDouble(input.getText().toString());
                    double x=Convert.BDTtoUSD(amount);
                    output.setText(Double.toString(x));

                }

                else  if(bdt.isChecked()) {
                    Double amount = Double.parseDouble(input.getText().toString());
                    double x = Convert.USDtoBDT(amount);
                    output.setText(Double.toString(x));


                }
                else  if(bdt1.isChecked()) {
                    Double amount = Double.parseDouble(input.getText().toString());
                    double x = Convert.INDtoBDT(amount);
                    output.setText(Double.toString(x));


                }
                else  if(ind.isChecked()) {
                    Double amount = Double.parseDouble(input.getText().toString());
                    double x = Convert.BDTtoIND(amount);
                    output.setText(Double.toString(x));


                }
                else  if(cad.isChecked()) {
                    Double amount = Double.parseDouble(input.getText().toString());
                    double x = Convert.CADtoBDT(amount);
                    output.setText(Double.toString(x));


                }
                else  if(bdt2.isChecked()) {
                    Double amount = Double.parseDouble(input.getText().toString());
                    double x = Convert.BDTtoCAD(amount);
                    output.setText(Double.toString(x));


                }

                else  if(euro.isChecked()) {
                    Double amount = Double.parseDouble(input.getText().toString());
                    double x = Convert.EUROtoBDT(amount);
                    output.setText(Double.toString(x));


                }

                else  if(bdt3.isChecked()) {
                    Double amount = Double.parseDouble(input.getText().toString());
                    double x = Convert.BDTtoEURO(amount);
                    output.setText(Double.toString(x));


                }
            }
        });
        reseat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                output.setText("");
                input.setText("");
            }
        });



    }
}