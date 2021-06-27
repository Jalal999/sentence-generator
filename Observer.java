
import java.util.*;

/**
 * 
 */
public abstract class Observer {

    /**
     * 
     */
    public Strategy strategy;


    /**
     * 
     */
    public abstract void updateVocab(String word);
    
    public void sentence() {
		strategy.generateSentence();
	}

}