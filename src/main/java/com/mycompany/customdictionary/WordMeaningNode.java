
package com.mycompany.customdictionary;

/**
 *
 * @author rando
 */
public class WordMeaningNode {
    WordMeaning word;
    WordMeaningNode next;
    
    WordMeaningNode(WordMeaning w)
    {
        word = w;
        next = null;
    }
}
