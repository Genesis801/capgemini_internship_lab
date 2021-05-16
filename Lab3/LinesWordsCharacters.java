package lab_3;

import java.io.*;
public class LinesWordsCharacters {

	public static void main(String[] args) throws IOException
    {
        File file = new File("E:\\Capgemini Internship\\Eclipse Projects\\Java_Lab_Assignments\\src\\lab_3\\ReplaceConstants_inputfile.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
          
        String line;
          
        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;

          
        // Reading line by line from the 
        // file until a null is returned
        while((line = reader.readLine()) != null)
        {
                characterCount += line.length();
                  
                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");
                  
                countWord += wordList.length;
                  
                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:]+");
                  
                sentenceCount += sentenceList.length;
        }
          
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of lines = " + (sentenceCount-1));
        System.out.println("Total number of characters = " + characterCount);
        
        reader.close();
      }
}


