package com.ppirogue.cinecine.controller;

import com.ppirogue.cinecine.model.SaisieModel;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;

public class SaisieAvisController {
    private static SaisieAvisController instance = null;
    private SaisieModel saisieModel;
    private String filesaved = "saveAvis";

    private SaisieAvisController() {
        super();
    }

    public static final SaisieAvisController getSaisieAvisController() {
        if(SaisieAvisController.instance == null) {
            SaisieAvisController.instance = new SaisieAvisController();
        }
        return SaisieAvisController.instance;
    }

    public void createSaisieAvis(String title, DateTimeFormatter date_time, Integer note_scenario, Integer note_realisation, Integer note_musique, String description) {
        saisieModel = new SaisieModel(title, date_time, note_scenario, note_realisation, note_musique, description);
    }
}
