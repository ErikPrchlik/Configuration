package cz.mendelu.pef.configuration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button b = (Button) findViewById(R.id.main_but);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
//                openActivity();
//            }
//        });
    }

//    public void openActivity() {
//        Intent intent = new Intent(this, SelectSectionActivity.class);
//        startActivity(intent);
//    }

    public void configuration(View view) {
        Intent intent = new Intent(this, SelectSectionActivity.class);
        startActivity(intent);
    }
}
