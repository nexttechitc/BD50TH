package com.bangladesh.Util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogsHelper_Log {
	
	
private static boolean root=false;
	
	public static Logger getLogsss(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	

	
}

	


