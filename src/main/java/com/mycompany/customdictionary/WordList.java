
package com.mycompany.customdictionary;

/**
 *
 * @author rando
 */
public class WordList {
    private WordMeaningNode list;
    
    WordList()
    {
        list = null;
    }
    
    void add(WordMeaning w)
    {
        WordMeaningNode temp = new WordMeaningNode(w);
        
        if(list == null)
                list = temp;
        else
        {
            WordMeaningNode current = list,
                               back = null;
                      boolean found = false;
            
            while(current != null && ! found)
                if(temp.word.getWord().compareTo(current.word.getWord()) < 0)
                    found = true;
                else
                {
                    back = current;
                    current = current.next;
                }
            
                temp.next = current;
                
                if(back == null)
                    list = temp;
                else
                    back.next = temp;
        }
    }
    
    public String toString()
    {
        String result = "";
        WordMeaningNode current = list;
        
        while (current != null)
        {
            result += current.word.getWord() + " --> " + current.word.getDefinition() + "\n";
            current = current.next;
        }
        return result;
    }
}

