package com.ppirogue.cinecine.model;

import java.time.format.DateTimeFormatter;

public class SaisieModel {

    private String title; //le titre du film
    private DateTimeFormatter date_time; //- la date et l’heure de la projection
    private Integer note_scenario; //- une note pour le scénario
    private Integer note_realisation; //- une note pour la réalisation
    private  Integer note_musique;//- une note pour la musique

    public String getTitle() {
        return title;
    }

    public DateTimeFormatter getDate_time() {
        return date_time;
    }

    public Integer getNote_scenario() {
        return note_scenario;
    }

    public Integer getNote_realisation() {
        return note_realisation;
    }

    public Integer getNote_musique() {
        return note_musique;
    }

    public String getDescription() {
        return description;
    }

    private  String description; //- une zone de description / critique

    public SaisieModel(String title, DateTimeFormatter date_time, Integer note_scenario, Integer note_realisation, Integer note_musique, String description) {
        this.title = title;
        this.date_time = date_time;
        this.note_scenario = note_scenario;
        this.note_realisation = note_realisation;
        this.note_musique = note_musique;
        this.description = description;
    }

}
