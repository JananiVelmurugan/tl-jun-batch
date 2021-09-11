
package com.training.proxy;

public class ProxyPatternTest {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("testuser", "1234561");
		try {
			executor.runCommand("notepad");
			executor.runCommand("mspaint");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}
