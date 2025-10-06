import java.util.HashMap;
/**
 * Décrivez votre classe MapTester ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */ 
public class MapTester
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    HashMap<String, String> contacts = new HashMap<>();

    /**
     * Constructeur d'objets de classe MapTester
     */
    public MapTester()
    {
        
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void enterNumber(String name, String number)
    {
        contacts.put(name, number);
    }
    
     public String lookupNumber(String name)
    {
       return contacts.get(name); 
    }
    
     public void printAllKeys()
    {
       System.out.println("All keys in the map:" + contacts.keySet()); 
    }
}