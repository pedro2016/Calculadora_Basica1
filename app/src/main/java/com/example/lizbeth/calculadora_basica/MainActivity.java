package com.example.lizbeth.calculadora_basica;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements OnClickListener {
boolean decimal = false;
    boolean sumar = false;
    boolean restar = false;
    boolean multiplicar = false;
    boolean dividir = false;
    double[]numero = new double[20];
    double resulatado;
    int mar=0;
    /**

     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button n1 = (Button) findViewById(R.id.un);
        n1.setOnClickListener(this);

        Button n2 = (Button) findViewById(R.id.dos);
        n2.setOnClickListener(this);

        Button n3 = (Button) findViewById(R.id.tre);
        n3.setOnClickListener(this);

        Button n4 = (Button) findViewById(R.id.cuat);
        n4.setOnClickListener(this);

        Button n5 = (Button) findViewById(R.id.cinc);
        n5.setOnClickListener(this);

        Button n6 = (Button) findViewById(R.id.sei);
        n6.setOnClickListener(this);

        Button n7 = (Button) findViewById(R.id.siete);
        n7.setOnClickListener(this);

        Button n8 = (Button) findViewById(R.id.ocho);
        n8.setOnClickListener(this);

        Button n9 = (Button) findViewById(R.id.nueve);
        n9.setOnClickListener(this);

        Button borar = (Button) findViewById(R.id.borar);
        borar.setOnClickListener(this);

        Button n0 = (Button) findViewById(R.id.cero);
        n0.setOnClickListener(this);

        Button suma = (Button) findViewById(R.id.mas);
        suma.setOnClickListener(this);

        Button resta = (Button) findViewById(R.id.menos);
        resta.setOnClickListener(this);

        Button multi = (Button) findViewById(R.id.por);
        multi.setOnClickListener(this);

        Button divi = (Button) findViewById(R.id.div);
        divi.setOnClickListener(this);

        Button igua = (Button) findViewById(R.id.igual);
        igua.setOnClickListener(this);

        Button limpi = (Button) findViewById(R.id.limpia);
        limpi.setOnClickListener(this);

        Button punto = (Button) findViewById(R.id.punto);
        punto.setOnClickListener(this);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();



        try {

            switch (seleccion) {

                case R.id.dos:
                    pantalla.setText(a+"2");
                    break;
                case R.id.tre:
                    pantalla.setText(a+"3");
                    break;
                case R.id.cuat:
                    pantalla.setText(a+"4");
                    break;
                case R.id.cinc:
                    pantalla.setText(a+"5");
                    break;
                case R.id.sei:
                    pantalla.setText(a+"6");
                    break;
                case R.id.siete:
                    pantalla.setText(a+"7");
                    break;
                case R.id.ocho:
                    pantalla.setText(a+"8");
                    break;
                case R.id.nueve:
                    pantalla.setText(a+"9");
                    break;
                case R.id.cero:
                    pantalla.setText(a+"0");
                    break;
                case R.id.un:
                    pantalla.setText(a+"1");
                    break;
                case R.id.borar:
                    int A;
                    TextView obj = (TextView) findViewById(R.id.texto);
                    String temp = obj.getText().toString();
                    A=temp.length();
                    if(temp.equals("")||A==0){
                        obj.setText("");
                        return ;
                    }
                    temp= temp.substring(0,temp.length()-1);
                    obj.setText(temp);
                    decimal=false;
                    break;
                case R.id.punto:
                    if(decimal==false) {
                    pantalla.setText(a+".");

                        decimal = true;
                    } else {return ;}
                    break;

                case R.id.mas:


                    sumar  = true;
                    numero[0]= Double.parseDouble(a);
                    pantalla.setText("");


                    decimal =false;
                    break;

                case R.id.limpia:
                    pantalla.setText("");
                    decimal =false;
                    break;
                case R.id.menos:
                    restar =true;
                    numero[0]= Double.parseDouble(a);
                    pantalla.setText("");
                    decimal =false;
                    break;
                case R.id.div:
                    dividir = true;
                    numero[0]= Double.parseDouble(a);
                    pantalla.setText("");

                    decimal =false;
                    break;
                case R.id.por:
                    multiplicar = true;
                    numero[0]= Double.parseDouble(a);
                    pantalla.setText("");
                    decimal =false;
                    break;

                case R.id.igual:

                    numero[1]= Double.parseDouble(a);
                    if (sumar ==true){
                       resulatado= numero[0]+ numero[1];
                        if(numero[0]==0){
                            pantalla.setText("MATH ERROR");
                            numero[0]=0;}

                        else{
                        pantalla.setText(String.valueOf(resulatado));}
                        decimal =true;

                    }else if(restar ==true){
                        resulatado= numero[0]- numero[1];
                        if(numero[0]==0){
                            pantalla.setText("MATH ERROR");
                            numero[0]=0;}

                        else{
                        pantalla.setText(String.valueOf(resulatado));}
                        decimal =true;

                    }else if (multiplicar==true) {
                        resulatado= numero[0]* numero[1];
                        if(numero[0]==0){
                            pantalla.setText("MATH ERROR");
                        numero[0]=0;}

                        else{
                        pantalla.setText(String.valueOf(resulatado));}

                        decimal =true;

                    } else if(dividir ==true){
                        resulatado= numero[0]/numero[1];
                        if(numero[0]==0){
                            pantalla.setText("MATH ERROR");
                            numero[0]=0;}

                        else if(numero[1]==0){
                            pantalla.setText("MATH ERROR");
                            numero[0]= 0;
                        }
                        else {
                            pantalla.setText(String.valueOf(resulatado));
                        }
                        decimal =true;
                    }
                    decimal =false;
                    sumar = false;
                    restar=false;
                    multiplicar =false;
                    dividir=false;
                    break;
                    }}catch(Exception e){
                pantalla.setText("");
            };
        }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.lizbeth.calculadora_basica/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.lizbeth.calculadora_basica/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
