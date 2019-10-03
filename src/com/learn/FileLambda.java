package com.learn;

import java.io.FileFilter;
import java.io.File;

public class FileLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileFilter filter=new FileFilter();
		
		FileFilter filter= (File Pathname) -> Pathname.getName().endsWith(".java");
		
		File dir=new File("C:\\Users\\maluvala\\Documents\\REconnectCode\\mywindfarm\\mywindmal\\war\\src\\com\\geinfra\\geenergy\\malauto\\dao");
		
		File[] files=dir.listFiles(filter);
		
		
		for(File f:files )
		{
			System.out.println();
			System.out.println(f.getName() );
		}

		System.out.println("Number of files" + dir.listFiles().length);
	}

}
