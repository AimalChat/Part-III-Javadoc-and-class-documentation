import java.util.HashMap;
import java.util.HashSet;

/**
 * Keep a record of how many times each word was entered by users.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class WordCounter
{
    // Associate each word with a count.
    private final HashMap<String, Integer> counts;
    //to fetch HashMap from the responsder class.
    private Responder responder;

    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        counts = new HashMap<>();
        responder = new Responder();
    }
    
    /**
     * 
     */
    public void printWordsAndCounts()
    {
        System.out.println("Word Count:" + "\n");
        counts.forEach((k,v)-> {System.out.println("Word count for " + k +" is " + v + ".");});
    }
    
    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> input)
    {
        for(String word : input) {
            String answer = responder.getResponseMap().get(word);
            if(answer != null)
            {
                //do nothing
            }else
            {
                int counter = counts.getOrDefault(word, 0);
                counts.put(word, counter + 1);
            }
        }
    }
}
