package exercice2;

import datamocklib.Person;
import exercice2.models.*;
import datamocklib.TxtHelper;
import java.util.List;
import java.util.ArrayList;

public class MainExercice2 implements Exo2 {

    /* EXO 2
     * Recupérez depuis le serveur la liste des gens qui sont nés à Chambéry.
     * La récupération de Data se fait dans l'ordre :
     *  - Récupération de data sur le server grâce à TxtHelper.getDataFromTxt("server.txt");
     *  - Vider la base de données locale grâce à la fonction TxtHelper.clearDataLocal();
     *  - Insérer les données dans la database locale grâce à la fonction TxtHelper.insertDataInTxt(line, "local.txt")
     *  - Afficher les données locale grace à TxtHelper.getDataFromTxt("local.txt")
     */
    @Override
    public void displayPersonFromChambery() {
        List<String> data = TxtHelper.getDataFromTxt("server.txt");
        ArrayList<String> well = new ArrayList<String>();
        for(int i = 0 ; i < data.size(); i++){
            String[] foo = data.get(i).split(",");
            System.out.println(foo);
            if(foo[5].equals("Chambery")){
                well.add(data.get(i));
            }
        }
        System.out.println("Chambéry");
        System.out.println(well);
    }

    /*
     * Recupérez depuis le serveur la liste des gens qui ont plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     * Tips : Vous avez dans la class Person la fonction getAge();
     */
    @Override
    public void displayBoomers() {
    }

    /*
     * Recupérez depuis le serveur la liste des gens de sexe féminin.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemales() {
        List<String> data = TxtHelper.getDataFromTxt("server.txt");
        ArrayList<String> well = new ArrayList<String>();
        for(int i = 0 ; i < data.size(); i++){
            String[] foo = data.get(i).split(",");
            System.out.println(foo);
            if(foo[3].equals("female")){
                well.add(data.get(i));
            }
        }
        System.out.println("Female");
        System.out.println(well);
    }

    /*
     * Recupérez depuis le serveur la liste des femmes de plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemaleBoomers() {

    }

    public static void main(String[] args) {
        Exo2 exo2 = new MainExercice2();
        exo2.displayPersonFromChambery();
        exo2.displayFemales();
    }
}
