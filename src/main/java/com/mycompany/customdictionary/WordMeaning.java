
package com.mycompany.customdictionary;

/**
 *  
 * @author rando
 */
public class WordMeaning {
    private String word, definition;
    
    WordMeaning(String w, String d) 
    {
        this.word       = w;
        this.definition = d;
    }
    
    public String getWord()
    {
        return word;
    }
    
    public String getDefinition()
    {
        return definition;
    }
}
