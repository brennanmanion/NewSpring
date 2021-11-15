package com.mycompany.pojo;

import java.io.Serializable;

public interface IModel extends Serializable{
	
	public interface Properties
	{
		String ID = "id";
		String VERSION = "version";
		String LAST_MODIFIED = "lastModified";		
	}
	
	public interface Lengths
	{
		int DEFAULT = 255;
		int ID = 32;
	}
}
