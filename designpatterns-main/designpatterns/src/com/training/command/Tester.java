package com.training.command;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		System.out.println("Starting...");
		
		List<CommandInterface> commands = new ArrayList<CommandInterface>();
		
		commands.add( new Add( 25 ));
		commands.add( new Multiply( 5 ));
		commands.add( new Subtract( 16 ));
				
		// execute the commands in the list
		
		for(CommandInterface command: commands) {
			System.out.println("Beginning Counter: " + Counter.getValue());
			System.out.println("Command is " + command);
			command.execute();
			System.out.println("Result Counter: " + Counter.getValue());
			System.out.println("");
		}
		
		System.out.println("Undo all the commands.\n");
		
		int index = commands.size() - 1;
		do {
			CommandInterface command = commands.get(index);
			
			System.out.println("Beginning Counter: " + Counter.getValue());
			System.out.println("Command is " + command);
			command.undo();
			System.out.println("Result Counter: " + Counter.getValue());
			System.out.println("");
			--index;
		} while( index >= 0);
		
		System.out.println("Done...");
	}
}
