package sp.fr.localsqlapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import fr.sp.database.DatabaseHandler;

public class FormActivity extends AppCompatActivity {

    private TextView textViewNom;
    private TextView textViewPrenom;
    private TextView textViewEmail;

    private EditText editTextNom;
    private EditText editTextPrenom;
    private EditText editTextEmail;

    private Button buttonValider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //Récupération zone de saisie
        editTextNom = (EditText)findViewById(R.id.editTextNom);
        editTextPrenom = (EditText)findViewById(R.id.editTextPrenom);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);


        //récupération zone d'affichage
        textViewNom = (TextView)findViewById(R.id.textViewNom);
        textViewPrenom = (TextView)findViewById(R.id.textViewPrenom);
        textViewEmail = (TextView)findViewById(R.id.textViewEmail);

        //récupération bouton
        buttonValider = (Button)findViewById(R.id.buttonValider);

    }

    public void onValide(View v) {

        Button buttonValider = (Button) v;
        DatabaseHandler db = new DatabaseHandler(this);

    }
}
