
package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener
{

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("nom", "Doe");
        intent.putExtra("prenom", "John");
        intent.putExtra("email", "john@doe.com");
        startActivity(intent);

    }

}