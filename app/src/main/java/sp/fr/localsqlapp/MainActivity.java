package sp.fr.localsqlapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Intent intentionFormulaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //redirection vers le formulaire
    public void onAddContact(View v) {

        intentionFormulaire = new Intent(this.getBaseContext(), FormActivity.class);
        startActivity(intentionFormulaire);

    }
}
