package cat.dam.pau.habitantsplaestany;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] municipi = new String[]{
            "Banyoles", "Camós", "Cornellà del Terri", "Crespià", "Esponellà",
            "Fontcoberta", "Palol de Revardit", "Porqueres", "Sant Miquel de Campmajor",
            "Serinyà","Vilademuls"
    };
    int[] numHabitans = new int[]{
            17451,698,2106,247,441,1212,459,4208,218,1084,769
    };

    String[][] dades =
            {{"Banyoles","17.451"},{"Camós","698"},{"Cornellà del Terri","2.106"},{"Crespià","247"},
            {"Esponellà","441"},{"Fontcoberta","1.212"},{"Palol de Revardit","459"},
            {"Porqueres","4.208"},{"Sant Miquel de Campmajor","218"},{"Serinyà","1.084"},
            {"Vilademuls","769"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, municipi);
        AutoCompleteTextView municipiAuto = (AutoCompleteTextView)
                findViewById(R.id.municipiAuto);
        municipiAuto.setAdapter(adapter);


        final Button button = findViewById(R.id.button);
        final TextView resultat=findViewById(R.id.resultat);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Aquest és el codi que s'executa al clicar
                resultat.setText("");
            }
        });

    }
}