package edu.neu.csye6200;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	
	public static void createCSV(Object[][] data, String fileName) 
	{
		FileWriter fw = null;
		File f = new File(fileName);
		if(!f.exists()) 
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.err.println("Error while creating new file");
				e.printStackTrace();
			}
		}
		try {
			fw = new FileWriter(fileName);
		} catch (IOException e) {
			System.err.println("Error while opening file to write data");
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				sb.append(data[i][j].toString());
				if( j !=(data[i].length-1)) {
					sb.append(",");
				}
			}
			sb.append("\n");
		}
		try {
			fw.write(sb.toString());
		} catch (IOException e) {
			System.err.println("Error while writing data to file "+sb.toString());
			e.printStackTrace();
		}
		try {
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.err.println("error while closing file");
			e.printStackTrace();
		}
	}

	public static List<List<String>> getParsedFileData(String path) {
		FileReader fr =null;
		BufferedReader br = null;
		List<List<String>> data= new ArrayList<>();
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			while(br.ready()) 
			{
				String row = br.readLine();
				String[] vals = row.split(",");
				data.add(Arrays.asList(vals));
			}
		} catch (IOException e) {
			System.err.println("error while reading file");
			e.printStackTrace();
		}
		return data;
	}
}
