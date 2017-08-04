package wirapon_41.intentapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {
    String s1,s2,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Next_page(View view) {
        Button btn1 = (Button)findViewById(R.id.but_submit);
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        EditText editText1 = (EditText) findViewById(R.id.edit_user);
        EditText editText2 = (EditText) findViewById(R.id.edit_pass);
        EditText editText3 = (EditText) findViewById(R.id.edit_tel);
        String message1 = editText1.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        intent.putExtra("s1", message1);
        intent.putExtra("s2", message2);
        intent.putExtra("s3", message3);
        startActivity(intent);
    }

}
