package com.mjax;

import java.io.*;

public class Main {
    private static void wordCount() throws FileNotFoundException {
        File f = new File("declaration.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String str;
        String dStr = "";
        try {

            while ((str = br.readLine()) != null) {
                dStr += str + "\n";
            }
            br.close();
            System.out.println(dStr);
        }catch (IOException e)
        {
            System.out.println("file not found");
        }

    }
    public static void main(String[] args) throws FileNotFoundException{
	// write your code here
        wordCount();
    }
}
