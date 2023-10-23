package cz.mendelu.pef.configuration;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SelectTermActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_term);
    }

    public static Intent getIntent(Context context, Long id) {
        Intent intent = new Intent(context, SelectTermActivity.class);
        if (id != null){
            intent.putExtra(IntentConstants.ID, id);
        }
        return intent;
    }
}
