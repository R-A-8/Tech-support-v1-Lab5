import java.util.Random;
/**
 * Décrivez votre classe Random ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MyRandom
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    
    /**
     * Constructeur d'objets de classe Random
     */
    public MyRandom()
    {
        // initialisation des variables d'instance
        
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     
     */
    public int randomGenerator()
    {
        Random  randomGenerator;
        randomGenerator = new Random();
        int index = randomGenerator.nextInt();
        System.out.println(index);
        return index;
    }
}