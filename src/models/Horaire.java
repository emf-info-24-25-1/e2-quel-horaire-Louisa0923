package models;

public class Horaire {

    public static final String [] NBRE_DE_BLOCS = {"B1S1","B2S1","B3S1","B4S1","B5S1","B6S1","B1S2","B2S2","B3S2","B4S2"};
    
    //MR pourquoi il y a deux attributs blocsd ?
        private models.Bloc[] blocs;
    
        Bloc[] Bloc = blocs;

    public Horaire() {
        for (int i = 0; i < Bloc.length; i++) {
            System.out.println(Bloc);
        }

    }

    public boolean plannifier(Modulelnfo[] modules, Professeur[] profs) {
        for (int i = 0; i < profs.length; i++) {
            if (plannifier(modules, profs)) {
                return true;
            } else {
                continue;
            }
        }
        return false;

    }

    public void afficheHoraire() {
        System.out.println(Bloc);
    }

    public Bloc moduleDansQuelBloc(Modulelnfo module) {
        return moduleDansQuelBloc(module);

    }

}
