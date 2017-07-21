package test;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import principale.Exercice;

public class TestPartitionList {
	
	Exercice maClassTest = new Exercice();
	
	@Test
	public void TestPartition(){
		
		List<Integer> maList= new ArrayList<>();
		maList.add(1);
		maList.add(2);
		maList.add(3);
		maList.add(4);
		maList.add(5);
		
		
		List<Integer> sousList1 = new ArrayList<>();
		List<Integer> sousList2 = new ArrayList<>();
		
		sousList1.add(1);
		sousList1.add(2);
		sousList1.add(3);
		
		sousList2.add(4);
		sousList2.add(5);
		
		List<List<Integer>> maListNouvelle= new ArrayList<>();
		
		maListNouvelle.add(sousList1);
		maListNouvelle.add(sousList2);
		
		assertEquals(maListNouvelle.size(),maClassTest.partition(maList,3).size());
		
		for(int i=0;i<maListNouvelle.size();i++)
		{						
			for(int j=0;j<maListNouvelle.get(i).size();j++)
				{				
				assertEquals(maListNouvelle.get(i).get(j),maClassTest.partition(maList,3).get(i).get(j));
				}
			
		}
		
	}
	
}
