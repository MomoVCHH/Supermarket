package com.example.supermarkt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2,button3,button4,button5,button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button1 = (Button)findViewById(R.id.button1);
    button2 = (Button)findViewById(R.id.button2);
    button3 = (Button)findViewById(R.id.button3);
    button4 = (Button)findViewById(R.id.button4);
    button5 = (Button)findViewById(R.id.button5);
    button6 = (Button)findViewById(R.id.button6);
    }


    public void openA(View view){
        openUrl("https://www.aktionspreis.de/");
        Toast.makeText(this, "search Aktionspreis",Toast.LENGTH_SHORT).show();
    }
    public void openN(View view){
        openUrl("https://www.netto-online.de/INTERSHOP/web/WFS/Plus-NettoDE-Site/de_DE/-/EUR/ViewMMPParametricSearch-SimpleOfferSearch?SearchTerm=Heidelberg");
        Toast.makeText(this, "search Netto",Toast.LENGTH_SHORT).show();
    }
    public void openP(View view){
        openUrl("https://www.penny.de/angebote/aktuell//liste/Ab-Montag/?ecid=sea_google_dg_nonbr_[aw]-angebote-&-werbung-[nt|co]_{e}-lidl-angebot-der-woche_text-ad_791811014_41606376456&gclid=CjwKCAiAvonyBRB7EiwAadauqZ8AKIenN8-XNqlLHk0aOjsha-kpp8zy9RnM7knhKjguVxC5qMMwnRoC5ckQAvD_BwE");
        Toast.makeText(this, "search Penny",Toast.LENGTH_SHORT).show();
    }
    public void openE(View view){
        openUrl("https://www.edeka.de/eh/angebote.jsp?ignoreRedirect=1");
        Toast.makeText(this, "search Edeka",Toast.LENGTH_SHORT).show();
    }
    public void openR(View view){
        openUrl("https://www.rewe.de/angebote/nationale-angebote/");
        Toast.makeText(this, "search Rewe",Toast.LENGTH_SHORT).show();
    }
    public void openK(View view){
        openUrl("https://www.kaufland.de/angebote/aktuelle-woche.html?cid=F3000B01C0100K01035W04002002D1000E1000F1000G1000H1000&campaign=939259596&adgroupid=46397102123&keyword=%2Bkaufland%20%2Bangebote&matchtype=b&gclid=CjwKCAiAvonyBRB7EiwAadauqYllpDI-hQymPp-0vwD1ZanqU0LIglyjTEsaQbUpLxgLR3Bjg_5wBRoCdR8QAvD_BwE");
        Toast.makeText(this, "search Kaufland",Toast.LENGTH_SHORT).show();
    }
    public void openUrl(String url){
        Uri uri = Uri.parse(url);
        Intent toOpenWeb = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(toOpenWeb);
    }







}
