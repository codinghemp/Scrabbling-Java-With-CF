import java.util.*;

public class boardMoves{
    //main code
    public static void main (String[] args)
    {
	Scanner sc=new Scanner();
	    
	//n is the size of arrayList
	int n=sc.nextInt();
	    
        // Declare an empty List of size n
        List<Integer> list = new ArrayList<Integer>(); 
  
        // Add elements to the list 
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
  
        // Index from which you want to remove element 
        int index = 2; 
  
        // Initial list 
        System.out.println("Initial List: " + list); 
  
        // remove element 
        list.remove(index); 
  
        // Final list 
        System.out.println("Final List: " + list); 
        
	sc.close();
    }
}