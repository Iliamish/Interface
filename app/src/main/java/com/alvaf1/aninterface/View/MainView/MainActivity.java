package com.alvaf1.aninterface.View.MainView;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alvaf1.aninterface.Classes.MyInterface;
import com.alvaf1.aninterface.Controllers.Controller;
import com.alvaf1.aninterface.R;

public class MainActivity extends Activity implements MyInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button  mybtn = (Button)findViewById(R.id.button);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doReq();
            }
        });
    }

    @Override
    public void Update() {
        
        Log.wtf("TICK","HAve a problem??");
    }

    public void doReq(){
        Controller controller = new Controller();
        controller.Tick(this);
    }
}
