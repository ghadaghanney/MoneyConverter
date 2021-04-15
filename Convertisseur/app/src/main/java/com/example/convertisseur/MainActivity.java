package com.example.convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);



        String[] from = {"Euro"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"Dinars","Dollar"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double total ;

                Double montant = Double.parseDouble(ed1.getText().toString());


                if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Dinars" ) {

                    total = montant * 3.28;
                    Toast.makeText(getApplicationContext() ,total.toString(),Toast.LENGTH_LONG).show();
                }
                
                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Dollar" ) {

                    total = montant * 1.19;
                    Toast.makeText(getApplicationContext() ,total.toString(),Toast.LENGTH_LONG).show();

                }

            }
        });


    }
}