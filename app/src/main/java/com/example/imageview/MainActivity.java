package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rdkarma;
    private RadioButton rdrajesh;
    private RadioButton rdsaugat;
    private ImageView imgActor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdkarma=findViewById(R.id.rdKarma);
        rdrajesh=findViewById(R.id.rdrajesh);
        rdsaugat=findViewById(R.id.rdsaugat);
        imgActor=findViewById(R.id.imgActor);

        rdkarma.setOnClickListener(this);
        rdrajesh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.rdKarma:
                imgActor.setImageResource(R.drawable.karma);
//                Toast toast= Toast.makeText(this, "your message", Toast.LENGTH_LONG);
//                toast.show();
                break;
            case R.id.rdrajesh:
                imgActor.setImageResource(R.drawable.rajesh);
                break;
            case R.id.rdsaugat:
                imgActor.setImageResource(R.drawable.saugat);
                break;


        }
    }
}


