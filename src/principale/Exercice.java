package principale;

import java.util.ArrayList;
import java.util.List;



public class Exercice {

	//The beginning of function partition
		public List<List<Integer>> partition(List<Integer> list,int taille){
			
			/* Attributes nouvelleList for the result 
			 * and sizeOfList for the size of the list
			 */
			List<List<Integer>> nouvelleList = new ArrayList<>();
			
			int sizeOfList=list.size();
				
			//Through the list 
			for(int i=0;i<sizeOfList;i=i+taille)
			{
				//Create each sublist with name sousList
				
				List<Integer> sousList = new ArrayList<>();
				
				for (int j=i;j<i+taille & j < sizeOfList;j++)
				{
					// Add elements in the sublist
					sousList.add(list.get(j));
				}
				// Add the sublist in the principal list
				nouvelleList.add(sousList);
			
			}
			
			// Return the result of the new list 
			return  nouvelleList;
			
		}
		// The end of the function partition
		
		
		// This is the main program 
		public static void main(String[] args) {
		
			// some example 
			ArrayList<Integer> li= new ArrayList<Integer>();
			li.add(1);
			li.add(2);
			li.add(3);
			li.add(4);
			li.add(5);
			
			// Display the list li created before
			System.out.println(li);
			
			//Instanciation of the class Test2
			Exercice test= new Exercice();
			
			//Call the method to have the result of list with the element have a list of two elements maximum
			List<List<Integer>> af = test.partition(li, 2);
			System.out.println(test.partition(li, 2));
			
			//Call the method to have the result of list with the element have a list of three elements maximum
			test.partition(li, 3);
			System.out.println(test.partition(li, 3));
			
			//Call the method to have the result of list with the element have a list of one elements maximum
			test.partition(li, 1);
			System.out.println(test.partition(li, 1));
			
			/*for (Integer ele:li)
				System.out.println(ele);
			
			
			for (List elet:af)
			{
				System.out.println(elet);
				
				System.out.println(elet.size());
				
			}
			
			System.out.println(af.size());*/
				}

}
