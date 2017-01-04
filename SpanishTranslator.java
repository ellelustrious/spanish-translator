
/**
 * Translates a few Spanish words to English
 * 
 * @author Michelle Pham
 * @version Sept 28, 2016
 */
public class SpanishTranslator
{
    private String spanishWord;

    /**
     * the constructors for objects of class SpanishTranslator
     * @param spanishWord takes in the word
     */
    public SpanishTranslator(String spanishWord)
    {
        this.spanishWord = spanishWord;
    }

    /**
     * gets the Spanish word
     * @return the Spanish word
     */
    public String getSpanish()
    {
        return spanishWord;
    }
    
    /**
     * sets a new Spanish word
     * @param newSpanishWord setting the new Spanish word
     */
    public void setSpanish(String newSpanishWord)
    {
        this.spanishWord = newSpanishWord;
    }
    
    /**
     * gets the English translation of the Spanish word
     * @return English translation of the Spanish word
     */
    public String getEnglish()
    {
        if (spanishWord.substring(0,3).equals("el "))
        {
            spanishWord = spanishWord.substring(3, spanishWord.length());
        }
        else if (spanishWord.substring(0, 3).equals("la "))
        {
            spanishWord = spanishWord.substring(3, spanishWord.length());
        }
        if (spanishWord.equals("estudiante"))
        {
            return "student";  
        }
        else if (spanishWord.equals("aprender"))
        {
            return "to learn";
        }
        else if (spanishWord.equals("entender"))
        {
            return"to understand";
        }
        else if (spanishWord.equals("verde"))
        {
            return "green";
        }
        else
        {
            return null;
        }
    }
}
