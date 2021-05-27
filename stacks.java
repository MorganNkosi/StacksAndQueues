import java.util.Stack;

public class stacks
{
	//Create the Numbers stack
	static Stack<Integer> Numbers = new Stack<Integer>();
	
	//Create the Temp stack
	static Stack<Integer> Temp = new Stack<Integer>();	
	
	//main method begins program execution
	public static void main(String [] args)
	{
		
		//add numbers to stack
		Numbers.add(55);	
		Numbers.add(46);		
		Numbers.add(90);		
		Numbers.add(39);		
		Numbers.add(20);		
		Numbers.add(13);		
		Numbers.add(56);		
		Numbers.add(100);		
		Numbers.add(20);		
		Numbers.add(77);
		
		System.out.println();
		System.out.println("Initialize stack Numbers");
		System.out.println("=============================");
		
		//call displayInitialize() method
		displayInitialize();
		
		System.out.println();
		//Display the list of values in the Numbers stack.
		System.out.println("list of values in the Numbers stack\n" + Numbers); 
		
		deleteRestore();
		
		System.out.println();
		System.out.println("list of values in the Numbers stack\n" + Numbers); 
			
		System.out.println();
		//display top element in the Numbers stack
		System.out.println("Top element in the Numbers stack: " + Numbers.peek());
		System.out.println();
		//display the size of the Numbers stack
		System.out.println("Size of the Numbers stack: " + Numbers.size());
		
		
	} //end main
	
	//display message for each number initialization operation
	static void displayInitialize()
	{
		//iterate through each value added
		for(int i = 0; i < Numbers.size(); i++)
		{	
			//display added value
 			System.out.println("value "+ Numbers.get(i) +" added into stack Numbers");
		} 
	} //end displayInitialize()
	
	
	static void deleteRestore()
	{
		System.out.println();
		System.out.println("Delete value 39 from the Numbers Stack");
		System.out.println("======================================");
		
		//iterate from last value   
		for(int i = 9; i > Numbers.indexOf(39); i--)
		{
			//delete from Numbers and add to Temp stack
			Temp.add(Numbers.pop());
			System.out.println("Value " + Temp.peek() + " moved from Numbers and add to Temp stack");
			
		}
		
		//deletion and display message
		if ( Numbers.contains(39) == true )
		{
			Numbers.pop();//delete the last value on stack #39
			System.out.println("value 39 deleted from Numbers stack!");
		}
		System.out.println();
		System.out.println("list of values in the Numbers stack\n" + Numbers);
		
		System.out.println();
		System.out.println("Restored from Temp stack and added to Numbers stack");
		System.out.println("===================================================");
		
		//iterate through Temp stack and delete
		for(int i = Temp.size() ; i > 0 ; i--)
		{
			//delete from Temp and resotore to Numbers
			Numbers.add(Temp.pop());
			System.out.println("Value " + Numbers.peek() + " restored from Temp and add to Numbers stack");
		}
		
		
	}
} 
