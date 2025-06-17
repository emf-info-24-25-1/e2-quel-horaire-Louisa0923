import models.*;

public class App {

    public static final String[] NOMS_MODULES = { "G300", "187", "162", "123", "293", "117", "164", "216", "106", "231",
            "122", "431" };
    private static final Modulelnfo[] Modulelnfo = null;
        private static final Professeur[] Professeur = null;
    
        public static void main(String[] args) {
        
                Horaire horaire = new Horaire ();
                Modulelnfo[] module1ere = new Modulelnfo[12];
        
                Modulelnfo [0] = new Modulelnfo("G300");
                Modulelnfo [1] = new Modulelnfo("187");
                Modulelnfo [2] = new Modulelnfo("162");
                Modulelnfo [3] = new Modulelnfo("123");
                Modulelnfo [4] = new Modulelnfo("293");
                Modulelnfo [5] = new Modulelnfo("117");
                Modulelnfo [6] = new Modulelnfo("164");
                Modulelnfo [7] = new Modulelnfo("216");
                Modulelnfo [8] = new Modulelnfo("106");
                Modulelnfo [9] = new Modulelnfo("231");
                Modulelnfo [10] = new Modulelnfo("122");
                Modulelnfo [11] = new Modulelnfo("431");
    
            Professeur[] profs = new Professeur[5];
    
            Professeur[0] = new Professeur("John WICK", null);
            Professeur[1] = new Professeur("Lara CROFT", null );
            Professeur[2] = new Professeur("Jean-Marc RICHARD", null);
            Professeur[3] = new Professeur("Taylor SWIFT", null);
            Professeur[4] = new Professeur("Anakin SKYWALKER", null);

        for (Modulelnfo modulelnfo : module1ere) {
            boolean tousModulCouverts = ServiceFormationMaitres.attribuerModules(profs,module1ere);
            boolean tousModulCouverts = ServiceFormationMaitres.tousModulesCouverts(profs,module1ere);

        }

        System.out.println("L'école a engagé les professeurs suivants");

        for (Professeur professeur : profs) {
            System.out.println("-"+ profs+"peut enseigneer les modules :");
            models.Modulelnfo[] getModulesEnseignes;
                        for (Modulelnfo modulelnfo  : getModulesEnseignes) {
                Modulelnfo module;
                                System.out.println(""+module.getNom());
            }
            System.out.println();
        }

        System.out.println("\nll est temps de préparer l'horaire.\n");
        boolean succes = Horaire.planifier(module1ere,profs);

        if (succes) {
            System.out.println("Modules planifiés avec succès !");
            Horaire () afficheHoraire ();
            
        }else{
            System.out.println("Problème de planification");
        }


    


    
    }

}
