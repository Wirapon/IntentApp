package wirapon_41.intentapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by GGG on 31/7/2560.
 */

public class MainActivity2 extends Activity {

    TextView tv1,tv2,tv3;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra("s1");
        String message2 = intent.getStringExtra("s2");
        String message3 = intent.getStringExtra("s3");
        TextView tv1 = (TextView)findViewById(R.id.textView1);
        TextView tv2 = (TextView)findViewById(R.id.textView2);
        TextView tv3 = (TextView)findViewById(R.id.textView3);
        tv1.setText(message1);
        tv2.setText(message2);
        tv3.setText(message3);
    }
        public void Back_page(View view){
            Button btn = (Button)findViewById(R.id.but_back);
            Intent intent = new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intent);
        }
    }


