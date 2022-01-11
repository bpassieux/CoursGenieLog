package exercice1;

import datamocklib.Person;
import datamocklib.TxtHelper;

import java.util.ArrayList;
import java.util.List;

public class MainExercice1 {

    // Format du fichier : firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
    // Pas de header
    public static List<Person> parse(List<String> data) {
        ArrayList<Person> arr = new ArrayList<Person>();
        for(int i = 0 ; i < data.size(); i++){
            String[] foo = data.get(i).split(",");
            arr.add(new Person(foo[0], foo[1], foo[2], foo[3], foo[4], foo[5]));
        }
        return arr;
    }

    public static void main(String[] args) {
        // EXO 1
        /*
         * - Récuperez la liste des personnes sous la forme -> firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
         *   grâce à la fonction TxtHelper.getDataFromTxt("persons.txt")
         * - Parser la liste des Personnes grâce à la fonction parse())
         * - Calculer le nombre de personnes nées dans chaque ville avec les données obtenues.
         * Les données contiennent une trentaine de villes, Bonne chance !
        */

        // Map reduce etc
        parse(TxtHelper.getDataFromTxt("persons.txt")).stream().reduce();

    }
}
