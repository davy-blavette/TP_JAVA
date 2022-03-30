package arraylist;

import java.util.ArrayList;

public class TP_reverse {

	 public static ArrayList<Integer> reverse(ArrayList<Integer> liste)
	    {
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        for (Integer i: liste)
	        {
	                res.add(0, i);
	        }
	        return res;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> liste = new ArrayList<Integer>();
		    
	        int[] nbrs = {1, 2, 3, 4, 5, 6, 7};
	    
	        for (int i = 0; i < nbrs.length; i++)
	        {
	            liste.add(nbrs[i]);
	        }
	    
	        ArrayList<Integer> res = reverse(liste);
	        System.out.println(res);
	}

	
	
	
}
