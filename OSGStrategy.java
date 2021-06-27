
import java.util.*;

/**
 * 
 */
public class OSGStrategy implements Strategy {
	ArrayList<String> vocabulary;
    /**
     * Default constructor
     */
    public OSGStrategy(ArrayList<String> vocabulary) {
    	this.vocabulary = vocabulary;
    }

    /**
     * 
     */
    public void generateSentence() {
    	String sentence = "";
    	
    	for (int i = 0; i<vocabulary.size(); i++) {
    		sentence += vocabulary.get(i) + " ";
    	}
    	
    	sentence.trim();
    	System.out.println("Ordered Sentence Generator: " + sentence);
    }

}