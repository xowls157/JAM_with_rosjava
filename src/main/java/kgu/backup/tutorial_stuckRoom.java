package kgu.backup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tutorial_stuckRoom {
	
	public static void main(String[] args) {
		
		try{
			String[] cmdArray01 = {"/home/ho/Desktop/stockrom_cell/1.py", "4", "10"}; 
			
		    Process p = Runtime.getRuntime().exec(cmdArray01);
		    BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    String line = null;
		   
		    while((line = br.readLine()) != null){
		        System.out.println(line);
		    }
		    
		    String[] cmdArray02 = {"/home/ho/Desktop/stockrom_cell/2.py", "4", "10"}; 
			
		    p = Runtime.getRuntime().exec(cmdArray02);
		    br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    line = null;
		   
		    while((line = br.readLine()) != null){
		        System.out.println(line);
		    }
		    
		    String[] cmdArray03 = {"/home/ho/Desktop/stockrom_cell/3.py", "4", "10"}; 
			
		    p = Runtime.getRuntime().exec(cmdArray03);
		    br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    line = null;
		   
		    while((line = br.readLine()) != null){
		        System.out.println(line);
		    }
		    
		    String[] cmdArray04 = {"/home/ho/Desktop/stockrom_cell/4.py", "4", "10"}; 
			
		    p = Runtime.getRuntime().exec(cmdArray04);
		    br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    line = null;
		   
		    while((line = br.readLine()) != null){
		        System.out.println(line);
		    }
		    
		    String[] cmdArray05 = {"/home/ho/Desktop/stockrom_cell/5.py", "4", "10"}; 
			
		    p = Runtime.getRuntime().exec(cmdArray05);
		    br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    line = null;
		   
		    while((line = br.readLine()) != null){
		        System.out.println(line);
		    }

		}catch(Exception e){
		    System.out.println(e);
		}
		
		
		
		System.out.println("Fetchbot Task is Finished");
	}

}
