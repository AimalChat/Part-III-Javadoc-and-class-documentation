TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.


This project implements a technical support system for customers of the 
DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

Lab report(part a = question, part b = answer) 

43a. Open the tech-support-analysis project. Notice the use of the getOrDefault of the HashMap in the 
addWords method of WordCounter class. What does the putIfAbsent method of HashMap do?

43b. getOrDefault is a method that returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key. Meaning you it returns the value
storred in the inputted key. Otherwise, it returns the default value of that type within
the java parameters for the type inside(int = 0 for example).
putIfAbsent is a method in which if the specified key is not already associated with a value
(or is mapped to null) associates it with the given value and returns null, else returns the
current value. In other words, if there is nothing associated to that key, put the inputted
value from the parameter and store it there, otherwise it will show the value already stored
to that key, if there is one.

44a. Add a method to the WordCounter class to print the usage count of each word after the
“goodbye” message has been printed.

44b.
    /**
     * 
     */
    public void printWordsAndCounts()
    {
        System.out.println("Word Count:" + "\n");
        counts.forEach((k,v)-> {System.out.println("Word count for " + k +" is " + v + ".");});
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye..."+"\n");
        counter.printWordsAndCounts();
    }

45a. Print counts of only those words that are not already keys in the responseMap in the Responder class. 
You will need to provide an accessor method for responseMap.

45b.
    public HashMap<String,String> getResponseMap()
    {
        return responseMap;
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

46a. Use BlueJ’s Project Documentation function to generate documentation for your TechSupport project. 
Examine it. Is it accurate? Is it complete? Which parts are useful? Which are not? Do you find any errors 
in the documentation?

46b. Yes, or to whatever degree I detailed each class in the documentation. It took
the blue comments above each class, constructor and methods to generate this. It is
quite useeful, if there was anything useless or an error it would have come from me, since its
just a copy and paste of my words. 

47a. Find examples of javadoc key symbols in the source code of the TechSupport project. How do they 
influence the formatting of the documentation?

47b. @param = shows in the documentation what is needed as input for the method.
@param name = key, number = value corresponding to the name key
Parameters:
name - = key, number = value corresponding to the name key Associates the specified number with the specified name in this map.

@author = adds an author line in the documentation at the begining of the page.
ex: @author  Michael Kölling and David J. Barnes
Author:
Michael Kölling and David J. Barnes

@version = adds a line in which the version used is displayed.
ex: @version 7.0
Version:
7.0

@return = adds a return section to the method.
@return       (number associated to name)value stored in key
Returns:
A string that should be displayed as the response

@see = is telling you to check out the references that are pertinant to the class in question,
it adds a link you can press to visit said related classes.

48a. Find out about and describe other javadoc key symbols. One place where you can look is the online 
documentation of Oracle’s Java distribution. It contains a document called javadoc – The Java API 
Documentation Generator (for example, at 
http://download.oracle.com/javase/6/docs/technotes/tools/windows/javadoc.html). In this document, the 
key symbols are called javadoc tags.

48b. @see = is telling you to check out the references that are pertinant to the class in question,
it adds a link you can press to visit said related classes.
@snippet ...} can be used to enclose a fragment of text, such as source code or any other form of structured text. The @replace tag is used to specify that it should be replaced with an ellipsis.
@end tag to mark the end of the region.
In the external source file, define the region with @start and @end tags.

49a. Properly document all classes in your version of the TechSupport project

49b.
file:///E:/Prog101/Personal%20Projects/tech-support-v1-copy/doc/package-summary.html
