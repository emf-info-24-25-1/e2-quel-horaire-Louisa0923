package models;

import java.time.DayOfWeek;
import java.util.Arrays;

public class Bloc {
    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;
    private final String nom;
    private Modulelnfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
        Boolean valeur = false;
        this.modules =  new  Modulelnfo [10];

        modules [0] = new Modulelnfo("Matu");
        modules [1] = new Modulelnfo("Matu");
        modules [2] = new Modulelnfo("Matu");
        modules [3] = new Modulelnfo("Matu");
        modules [4] = new Modulelnfo("null");
        modules [5] = new Modulelnfo("null");
        modules [6] = new Modulelnfo("null");
        modules [7] = new Modulelnfo("null");
        modules [8] = new Modulelnfo("null");
        modules [9] = new Modulelnfo("null");
  

        //Modulelnfo [] = new Modulelnfo {"Matu","Matu","Matu","Matu","null","null","null","null","null","null");

        for (int i = 0; i < modules.length; i++) {
            if (valeur) {
                Modulelnfo ("Matu");
            } else {
                valeur = true;
                continue;
            }
        }
        
    }

    public boolean planifierModule(Modulelnfo module) {
        for (int i = 0; i < NBRE_DEMI_JOURS_SEMAINE; i++) {
            if (i == 3) {
                planifierModule(module);
            }else{
                return false;
            }

        }
        return false;

    }

    public void afficherHoraire() {
        System.out.println(DayOfWeek.values()[i].getDisplayName(null, null));

    }

    public boolean estTotalementPlanifie() {
        for (int i = 0; i < NBRE_DEMI_JOURS_SEMAINE; i++) {
            if (NBRE_DEMI_JOURS_SEMAINE [i] != null) {
                return true;
            }
        }
 

        return false;

    }

    public boolean contientModule(Modulelnfo module) {
        for (int i = 0; i < modules.length; i++) {
            if (module != null) {
                return true;
            }
        }
        return false;

    }

    public String getNom() {
        return nom;
    }


    @Override
    public String toString() {
        return "Bloc [nom=" + nom ;
    }

}
