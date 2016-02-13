package me1.mydz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button_ok);
        button.setOnClickListener(this);
    }

    @Override
    public void  onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }

}
