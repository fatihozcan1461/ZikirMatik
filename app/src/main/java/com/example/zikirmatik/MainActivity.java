package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    int cekilen_zikir ;
    int Toplam;
    int i,r;
    TextView textView;
    TextView textView2;
    Button button;
    SharedPreferences sharedPreferences;
    ImageButton sesbutonu;
    View view;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        textView  = findViewById( R.id.textView );
        textView2 = findViewById( R.id.textView2 );
        button = findViewById( R.id.button );
        view   = findViewById( R.id.view );
        cekilen_zikir =0;
        i=0;
        r=0;
        view = findViewById( R.id.view );
        view.setBackgroundResource( R.drawable.ana_tema );

        MobileAds.initialize(this,
                "ca-app-pub-4865819792706308~7405535232");




    }

    public void resimdegistir(View view)
    {
        r++;

        if (r==1)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arkaplan_1 );
        }
        else if(r==2)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arkaplan_2 );
        }
        else if(r==3)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arkaplan_3 );
        }
        else if(r==4)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_4 );
        }
        else if(r==5)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_5 );
        }
        else if(r==6)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_6 );
        }
        else if(r==7)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_7 );
        }
        else if(r==8)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_8 );
        }
        else if(r==9)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_9 );
        }
        else if(r==10)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_10 );
        }
        else if(r==11)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_11 );
        }
        else if(r==12)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_12 );
        }
        else if(r==13)
        {
            view = findViewById( R.id.view );
            view.setBackgroundResource( R.drawable.arka_plan_13 );
        }
        else
        {
            r=0;

        }



    }

    public void cekilenzikir(View view)
    {

        cekilen_zikir++;
        Toplam++;
        textView.setText(""+cekilen_zikir);
        textView2.setText( "Toplam : "+Toplam);


        if(i%2==0){
            Vibrator kiprasim = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            kiprasim.vibrate(150); //1000 yazarsak 1 saniyelik titreşim yaratır
        }
        else
        {
            Vibrator kiprasim = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            kiprasim.cancel();
        }



    }
    public void sifirla(View view)
    {
        cekilen_zikir =0;
        textView.setText( ""+cekilen_zikir );

    }



    public void titresim(View view )
    {
        i++;
        if(i%2==0){
            Vibrator kiprasim = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            kiprasim.vibrate(150); //1000 yazarsak 1 saniyelik titreşim yaratır
            sesbutonu = findViewById( R.id.imageButton3 );
            sesbutonu.setImageResource( R.drawable.ic_vibration_black_24dp );
        }
        else
        {
            Vibrator kiprasim = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            kiprasim.cancel();
            sesbutonu = findViewById( R.id.imageButton3 );
            sesbutonu.setImageResource( R.drawable.ic_smartphone_black_24dp );

        }

    }

}
