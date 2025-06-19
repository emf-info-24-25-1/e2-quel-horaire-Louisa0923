package models;
public class Modulelnfo {
    private final String nom;
    private Professeur professeur;

    public Modulelnfo(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        //MR Un toString ne fait pas un sout, mais retourne en String
        if (professeur!= null) {
            System.out.println(nom + "avec" + professeur);
        }else{
            System.out.println(nom);
        }
        return null; 
    }

    
}
