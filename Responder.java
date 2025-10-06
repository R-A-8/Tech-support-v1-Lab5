import java.util.HashMap;
import java.util.HashSet;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String, String> responseMap;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responseMap = new HashMap<>();
        fillResponseMap();
    }

    public void fillResponseMap()
    {
        responseMap.put("slow",
                        "That's too bad. Have you tried\n" +
                        "unplugging your router? Maybe you should check\n" +
                        "your wifi");
                        
        responseMap.put("glitch",
                        "All softwares have glitches\n" +
                        "it's part of the design.");
        responseMap.put("bug",
                        "That's the same thing as a glitch,\n" +
                        "it's part of the design!!!");
        responseMap.put("expensive",
                        "That's not my problem. It has nothing\n"+
                        "to do with my job...");
                        
                        
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
        
        for(String word : words){
            String response = responseMap.get(word);
            if(response != null){
            return response;
         }
         }
         
        return pickDefaultResponse();
        }
    }
    
    public HashSet<String> pickDefaultResponse(){
            return "I'm not sure I'm understanding... Please give me more details.";
         }
}


