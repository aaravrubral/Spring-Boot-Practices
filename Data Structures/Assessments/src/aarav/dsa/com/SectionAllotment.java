package aarav.dsa.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SectionAllotment {
    
    public static List<Integer> allotSections(int[] sectionSize, int numStudents) {
        List<Integer> allotments = new ArrayList<>();
        Random random = new Random();
        
        // Shuffle the section array
        List<Integer> shuffledSections = new ArrayList<>();
        for (int section : sectionSize) {
            shuffledSections.add(section);
        }
        Collections.shuffle(shuffledSections, random);
        
        // Assign sections to students based on shuffled array
        for (int i = 0; i < numStudents; i++) {
            int sectionIndex = i % sectionSize.length;
            allotments.add(shuffledSections.get(sectionIndex));
        }
        
        return allotments;
    }
    
    public static void main(String[] args) {
        int[] sectionSize = {121, 12, 13, 45, 67};
        int numStudents = 10;
        List<Integer> allotments = allotSections(sectionSize, numStudents);
        
        // Display the allotments
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i+1) + " allotted section: " + allotments.get(i));
        }
    }
}
