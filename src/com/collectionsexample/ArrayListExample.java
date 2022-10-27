package com.collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creation of an ArrayList
List AutomationBatch = new ArrayList();
        
        AutomationBatch.add("Arpana");
        AutomationBatch.add("Arun");
        AutomationBatch.add("Arul");
        
        for(int i=0;i<AutomationBatch.size();i++)
        {
            System.out.println(AutomationBatch.get(i));
        }
        
        AutomationBatch.remove(0);
        
        for(int i=0;i<AutomationBatch.size();i++)
        {
            System.out.println(AutomationBatch.get(i));
        }

        
        ArrayList<String> cricketTeam = new ArrayList<String>();
        
        ArrayList<Integer> Runs = new ArrayList<Integer>();
        
        Runs.add(98);
        Runs.add(56);
        Runs.add(130);
        
        
        
        cricketTeam.add("Dhoni");
        cricketTeam.add("Rohit");
        cricketTeam.add("Kohli");
        
        System.out.println(cricketTeam);
        
        for(String team:cricketTeam)
        {
            System.out.println(team);
        }
        
        cricketTeam.add(3, "Shami");
        
        for(String team:cricketTeam)
        {
            System.out.println(team);
        }
        
        Collections.sort(cricketTeam);
        Collections.sort(Runs);
        
        System.out.println("***Sorting Runs****");
        
        for(int score:Runs)
        {
            System.out.println(score);
        }
        
	}
	
}
