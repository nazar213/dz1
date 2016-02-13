package me1.mydz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvName;
    Button btnName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName = (TextView) findViewById(R.id.tv_name);
        btnName =(Button) findViewById(R.id.button_name);
        btnName.setOnClickListener(this);

    }
@Override
    public void onClick(View v) {
    Intent intent=new Intent(this,NameActivity.class);
    startActivityForResult(intent, 1);
}
    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode, data);
        if (data==null) {
            return;
        } String name = data.getStringExtra("name");
                tvName.setText("Your name is " +name);
    }
}