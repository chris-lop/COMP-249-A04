import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class DictionaryGenerator {
    // Word Processing Method - Method Processes words in dictionary based on assignment instructions
    public static void processList(ArrayList<String> list){
        String word, finalWord;


        // 1st Iteration to remove last char punctuation
        for (int i = 0; i < list.size(); i++) {
            word = list.get(i);
            char lastChar = word.charAt(word.length()-1);
            int lastIndex = word.length()-1;

            // Last Char Punctuation Removal
            if (lastChar == '?' || lastChar == ':' || lastChar == ',' || lastChar == ';' || lastChar == '!' || lastChar == '.') {
                finalWord = word.substring(0, lastIndex);
                list.set(i, finalWord.toUpperCase());
            }
        }
         

        // 2nd Iteration to remove xxx
        for (int i = 0; i < list.size(); i++) {
            word = list.get(i);
            char lastChar = word.charAt(word.length()-1);
            int lastIndex = word.length()-1;
            word = list.get(i);

            // A or I (Single char words)
            if (word.equals("a") || word.equals("I") || word.equals("A") || word.equals("i")) {
                list.set(i, word.toUpperCase());
                continue;
            }

            // Checks if word contains numbers
            if (word.contains("0") || word.contains("1") || word.contains("2") || word.contains("3") || word.contains("4") ||
             word.contains("5") || word.contains("6") || word.contains("7") || word.contains("8") || word.contains("9")) {
                list.remove(i);
                i = i-1;
                continue;
            }

            // Remove other single char
            if (word.length() == 1) {
                list.remove(i);
                i = i-1;
                continue;
            }

            // MC2 Special Case
            if (word.equals("mc²")) {
                list.set(i, list.get(i).toUpperCase());
                continue;
            }
        
            // Last Char Apostrophe Removal
            if (word.charAt(word.length()-2) == '’' && (lastChar == 's' || lastChar == 'n' || lastChar == 'm' || lastChar == 'S' || lastChar == 'N' || lastChar == 'M')) {
                finalWord = word.substring(0, lastIndex-1);
                list.set(i, finalWord.toUpperCase());
                continue;
            }
            
            // If none of the IF statements are called, then turn the word into uppercase
            list.set(i, word.toUpperCase());
        }

        // Sorting ArrayList & Eliminating Duplicates
        for(int i = 0; i<list.size()-1; i++) {  
            for (int j = i+1; j<list.size(); j++) {  
                // Compares each elements of the array to all the remaining elements and checks for order
                if(list.get(i).compareTo(list.get(j))>0) {  
                    // Swapping array elements based on order
                    String temp = list.get(i);  
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }

                // Compares each elements of the array to all the remaining elements and checks for equality
                if(list.get(i).compareTo(list.get(j))==0) {  
                    // Eliminating duplicates 
                    list.remove(j);
                    j = j-1;
                }  
            }  
        }
    }

    // Method to Print ArrayList Contents on separate lines
    public static void printList(ArrayList<String> list, PrintWriter pw){
        for (int i = 0; i < list.size(); i++) {
            pw.println(list.get(i));
        }
    }

    // Main Method
    public static void main(String args[]) {
        Scanner sc = null;
		PrintWriter pw = null;
		Scanner keyboard = new Scanner(System.in);
        ArrayList<String> dictionary = new ArrayList<String>();

		// Welcome Message
		System.out.println("========================================================");
		System.out.println("Hello, Welcome to my Sub-Dictionary Generator Program!");
		System.out.println("========================================================");
		System.out.println();

        // Ask for file name
        System.out.print("Please enter the name of the file");
        System.out.println(". Do NOT include the file extension!");
        String filename = keyboard.nextLine();

        // Opening Input File
        try {
            sc = new Scanner(new FileInputStream("C:/A04Input/"+filename+".txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Could not open file "+filename+" for reading.");
            System.err.println("Please check that the file exists and is readable. This program will terminate..");
			System.exit(0);
        }

        // Saving File Contents Into ArrayList as long as it has a next line
        while (sc.hasNextLine()) {
            dictionary.add(sc.next());
        }
        sc.close();

        // Process the Dictionary
        processList(dictionary);

        // Opening PrintWriter Output File
        try {
            pw = new PrintWriter(new FileOutputStream("C:/A04Input/SubDictionary.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Could not open file SubDictionary.txt for writing.");
            System.err.println("This program will terminate..");
			System.exit(0);
        }
        
        // ArrayList for each letter 
        ArrayList<String> A = new ArrayList<String>();
        ArrayList<String> B = new ArrayList<String>();
        ArrayList<String> C = new ArrayList<String>();
        ArrayList<String> D = new ArrayList<String>();
        ArrayList<String> E = new ArrayList<String>();
        ArrayList<String> F = new ArrayList<String>();
        ArrayList<String> G = new ArrayList<String>();
        ArrayList<String> H = new ArrayList<String>();
        ArrayList<String> I = new ArrayList<String>();
        ArrayList<String> J = new ArrayList<String>();
        ArrayList<String> K = new ArrayList<String>();
        ArrayList<String> L = new ArrayList<String>();
        ArrayList<String> M = new ArrayList<String>();
        ArrayList<String> N = new ArrayList<String>();
        ArrayList<String> O = new ArrayList<String>();
        ArrayList<String> P = new ArrayList<String>();
        ArrayList<String> Q = new ArrayList<String>();
        ArrayList<String> R = new ArrayList<String>();
        ArrayList<String> S = new ArrayList<String>();
        ArrayList<String> T = new ArrayList<String>();
        ArrayList<String> U = new ArrayList<String>();
        ArrayList<String> V = new ArrayList<String>();
        ArrayList<String> W = new ArrayList<String>();
        ArrayList<String> X = new ArrayList<String>();
        ArrayList<String> Y = new ArrayList<String>();
        ArrayList<String> Z = new ArrayList<String>();

        // Saving each word on its respective Arraylist (based on alphabetical order)
        for (int i = 0; i < dictionary.size(); i++) {
            String word = dictionary.get(i);
            
            // A Section
            if (word.charAt(0) == 'A') {
                A.add(word);
                continue;
            }

            // B Section
            if (word.charAt(0) == 'B') {
                B.add(word);
                continue;
            }


            // C Section
            if (word.charAt(0) == 'C') {
                C.add(word);
                continue;
            }


            // D Section
            if (word.charAt(0) == 'D') {
                D.add(word);
                continue;
            }


            // E Section
            if (word.charAt(0) == 'E') {
                E.add(word);
                continue;
            }

            // F Section
            if (word.charAt(0) == 'F') {
                F.add(word);
                continue;
            }

            // G Section
            if (word.charAt(0) == 'G') {
                G.add(word);
                continue;
            }

            // H Section
            if (word.charAt(0) == 'H') {
                H.add(word);
                continue;
            }

            // I Section
            if (word.charAt(0) == 'I') {
                I.add(word);
                continue;
            }

            // J Section
            if (word.charAt(0) == 'J') {
                J.add(word);
                continue;
            }

            // K Section
            if (word.charAt(0) == 'K') {
                K.add(word);
                continue;
            }

            // L Section
            if (word.charAt(0) == 'L') {
                L.add(word);
                continue;
            }

            // M Section
            if (word.charAt(0) == 'M') {
                M.add(word);
                continue;
            }

            // N Section
            if (word.charAt(0) == 'N') {
                N.add(word);
                continue;
            }

            // O Section
            if (word.charAt(0) == 'O') {
                O.add(word);
                continue;
            }

            // P Section
            if (word.charAt(0) == 'P') {
                P.add(word);
                continue;
            }

            // Q Section
            if (word.charAt(0) == 'Q') {
                Q.add(word);
                continue;
            }

            // R Section
            if (word.charAt(0) == 'R') {
                R.add(word);
                continue;
            }

            // S Section
            if (word.charAt(0) == 'S') {
                S.add(word);
                continue;
            }

            // T Section
            if (word.charAt(0) == 'T') {
                T.add(word);
                continue;
            }

            // U Section
            if (word.charAt(0) == 'U') {
                U.add(word);
                continue;
            }

            // V Section
            if (word.charAt(0) == 'V') {
                V.add(word);
                continue;
            }

            // W Section
            if (word.charAt(0) == 'W') {
                W.add(word);
                continue;
            }

            // X Section
            if (word.charAt(0) == 'X') {
                X.add(word);
                continue;
            }
            
            // Y Section
            if (word.charAt(0) == 'Y') {
                Y.add(word);
                continue;
            }

            // Z Section
            if (word.charAt(0) == 'Z') {
                Z.add(word);
                continue;
            }
        }

        // File Header
        pw.println("This document produced this sub-dictionary, which includes "+Integer.toString(dictionary.size())+" entries.");

        // Printing Each Letter Section
        pw.println();
        // A
        if (A.size() > 0) {
            pw.println("A");
            pw.println("==");
            printList(A, pw);
        }

        // B
        if (B.size() > 0) {
            pw.println();
            pw.println("B");
            pw.println("==");
            printList(B, pw);
        }

        // C
        if (C.size() > 0) {
            pw.println();
            pw.println("C");
            pw.println("==");
            printList(C, pw);
        }

        // D
        if (D.size() > 0) {
            pw.println();
            pw.println("D");
            pw.println("==");
            printList(D, pw);
        }

        // E
        if (E.size() > 0) {
            pw.println();
            pw.println("E");
            pw.println("==");
            printList(E, pw);
        }

        // F
        if (F.size() > 0) {
            pw.println();
            pw.println("F");
            pw.println("==");
            printList(F, pw);
        }

        // G
        if (G.size() > 0) {
            pw.println();
            pw.println("G");
            pw.println("==");
            printList(G, pw);
        }

        // H
        if (H.size() > 0) {
            pw.println();
            pw.println("H");
            pw.println("==");
            printList(H, pw);
        }

        // I
        if (I.size() > 0) {
            pw.println();
            pw.println("I");
            pw.println("==");
            printList(I, pw);
        }

        // J
        if (J.size() > 0) {
            pw.println();
            pw.println("J");
            pw.println("==");
            printList(J, pw);
        }

        // K
        if (K.size() > 0) {
            pw.println();
            pw.println("K");
            pw.println("==");
            printList(K, pw);
        }

        // L
        if (L.size() > 0) {
            pw.println();
            pw.println("L");
            pw.println("==");
            printList(L, pw);
        }

        // M
        if (M.size() > 0) {
            pw.println();
            pw.println("M");
            pw.println("==");
            printList(M, pw);
        }

        // N
        if (N.size() > 0) {
            pw.println();
            pw.println("N");
            pw.println("==");
            printList(N, pw);
        }

        // O
        if (O.size() > 0) {
            pw.println();
            pw.println("O");
            pw.println("==");
            printList(O, pw);
        }

        // P
        if (P.size() > 0) {
            pw.println();
            pw.println("P");
            pw.println("==");
            printList(P, pw);
        }

        // Q
        if (Q.size() > 0) {
            pw.println();
            pw.println("Q");
            pw.println("==");
            printList(Q, pw);
        }

        // R
        if (R.size() > 0) {
            pw.println();
            pw.println("R");
            pw.println("==");
            printList(R, pw);
        }

        // S
        if (S.size() > 0) {
            pw.println();
            pw.println("S");
            pw.println("==");
            printList(S, pw);
        }

        // T
        if (T.size() > 0) {
            pw.println();
            pw.println("T");
            pw.println("==");
            printList(T, pw);
        }

        // U
        if (U.size() > 0) {
            pw.println();
            pw.println("U");
            pw.println("==");
            printList(U, pw);
        }

        // V
        if (V.size() > 0) {
            pw.println();
            pw.println("V");
            pw.println("==");
            printList(V, pw);
        }

        // W
        if (W.size() > 0) {
            pw.println();
            pw.println("W");
            pw.println("==");
            printList(W, pw);
        }

        // X
        if (X.size() > 0) {
            pw.println();
            pw.println("X");
            pw.println("==");
            printList(X, pw);
        }

        // Y
        if (Y.size() > 0) {
            pw.println();
            pw.println("Y");
            pw.println("==");
            printList(Y, pw);
        }

        // Z
        if (Z.size() > 0) {
            pw.println();
            pw.println("Z");
            pw.println("==");
            printList(Z, pw);
        }

        // Close PrintWriter
        pw.close();

        // Final Message
        System.out.println();
        System.out.println("Generated Sub-Dictionary successfully!");
        System.out.println("Thank you for using our program!");
    }
}