package models;
import java.util.Arrays;

public class Professeur {
    private final String nom;
    private final String prenom;
    private Modulelnfo[] modulesEnseignes;

    public Professeur(String prenom, String nom){
        this.nom = nom;
        this.prenom = prenom;
        this.modulesEnseignes = new Modulelnfo [0];


    }

    public boolean enseigneCeModuele(String nomDuModule){
            return false;

    }

    public void ajouterModuleEnseigne(Modulelnfo module){
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (module != null) {
                professeur = enseigneCeModuele(nom);
                i --;
            }
        }

    }

    public void viderModules(){
        int vider;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes != enseigneCeModuele(nom)) {
                modulesEnseignes vider;
            }

            break;
        }

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Modulelnfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        //MR Il manque le uppercase pour le nom
        return prenom +" " + nom;
    }

    
}
