import models.Modulelnfo;
import models.Professeur;

public class ServiceFormationMaitres {
    public static final int MAX = 12;
    public static final int MIN = 1;

    public final void attribuerModules(Professeur[] professeurs, Modulelnfo[] modules) {
        for (int i = 0; i < modules.length; i++) {
            int nbre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            if (professeurs != enseigneCeModuele) {
                ajouterModuleEnseigne++;
            } else {
                continue;
            }

        }

    }

    public final static boolean tousModulesCouverts(Professeur[] profs, Modulelnfo[] modules) {
        for (int i = 0; i < modules.length; i++) {
            if (modules != null) {
                break;
            }
            

        }
        return false;
    }
}
