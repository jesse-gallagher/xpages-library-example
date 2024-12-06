package frostillicus.library.example;

import java.text.MessageFormat;

import org.openntf.domino.Database;

public enum ExampleUtil {
	;
	
	public static String sayHello(Database database) {
		return MessageFormat.format("hello from {0}", database.getTitle());
	}
}
