package com.ppirogue.cinecine.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ppirogue.cinecine.R;
import com.ppirogue.cinecine.controller.SaisieAvisController;

import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //appel de fucntion
        init();
        this.saisieAvisController = SaisieAvisController.getSaisieAvisController();
    }

    //proprietes
    private EditText title; //le titre du film
    private EditText date_time; //- la date et l’heure de la projection
    private EditText note_scenario; //- une note pour le scénario
    private EditText note_realisation; //- une note pour la réalisation
    private EditText note_musique;//- une note pour la musique
    private SaisieAvisController saisieAvisController;

    //initialisation des lien vers la vue
    public void init() {
        title = (EditText)findViewById(R.id.id_title);
        date_time = (EditText)findViewById(R.id.id_date);
        note_scenario = (EditText)findViewById(R.id.id_note_scenario);
        note_realisation = (EditText)findViewById(R.id.id_realisation);
        note_musique = (EditText)findViewById(R.id.id_musique);
    }

    //ecoute sur le btn save
    private View.OnClickListener myListener = new View.OnClickListener() {
        public void onClick(View v) {
            // recuperation des donnees saisies
            String _title; //le titre du film
            DateTimeFormatter _date_time; //- la date et l’heure de la projection
            Integer _note_scenario; //- une note pour le scénario
            Integer _note_realisation; //- une note pour la réalisation
            Integer _note_musique;//- une note pour la musique
            String _description;

            switch (v.getId()) {
                case R.id.btn_save :
                    try {

                        _title = title.getText().toString();
                        _date_time = DateTimeFormatter.ofPattern(date_time.getText().toString());
                        _note_scenario = Integer.valueOf(note_scenario.getText().toString());
                        _note_realisation = Integer.valueOf(note_realisation.getText().toString());
                        _note_musique = Integer.valueOf(note_musique.getText().toString());
                        _description = note_musique.getText().toString();

                        afficheResulte(_title,_date_time,_note_scenario,_note_realisation,_note_musique,_description);

                        } catch (Exception e) {
                        Log.d("error", e);
                    }
                    Log.d("msg", "Tessssstttt");
                    break;
                default:
                    break;
            }
        }
    };

    //affichage des donnees saisies
    public void afficheResulte(String title, DateTimeFormatter date_time, Integer note_scenario, Integer note_realisation, Integer note_musique, String description, this) {
        this.saisieAvisController.createSaisieAvis(title, date_time, note_scenario, note_realisation, note_musique, description);
    }

}