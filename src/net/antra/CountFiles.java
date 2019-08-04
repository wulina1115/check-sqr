package net.antra;

import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountFiles {

    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);  
     File file = null;
     while(true) {
    	 String path = sc.nextLine();
    	 try {
    		 file = new File(path);
    		 break;
    	 } catch(NullPointerException e){
    		 e.printStackTrace();	
    	 }
    	 
     }
     	Criteria criteria = new Criteria(file.getAbsolutePath());
		criteria.setFileNum(countFilesInDirectory(file));
		criteria.setSubFolderNum(countFoldersInDirectory(file));
		criteria.setExtNum(extensionCount(file));
		count(criteria);
    }

	
	public static int countFilesInDirectory(File directory) {
	      int count = 0;
	      for (File file : directory.listFiles()) {
	          if (file.isFile()) {
	              count++;
	          }
	      }
	      return count;
	  }
	public static int countFoldersInDirectory(File directory) {
	      int count = 0;
	      for (File file : directory.listFiles()) {
	          if (file.isDirectory()) {
	              count++;
	          }
	      }
	      return count;
	  }
	public static Map<String, Integer> extensionCount(File directory){
		Map<String, Integer> res = new HashMap<String, Integer>();
		for (File file : directory.listFiles()) {
        	if (file.isFile()) {
                String currExt = file.getName().substring(file.getName().lastIndexOf(".") + 1);
                Integer num = res.get(currExt);
                if (num == null) {
                    res.put(currExt, 1);
                } else {
                    res.put(currExt, num + 1);
                }
        	}
		}
		return res;
	}
	public static void count(Criteria criteria) {
		System.out.println("There are "+ criteria.getFileNum() +" files and "+ criteria.getSubFolderNum()+" folders in this Folder." );
		Map<String, Integer> map = criteria.getExtNum();
		for(String key : map.keySet()) {
			System.out.println("Find "+ map.get(key)+" ."+ key + " files.");
		}
	}
}
//     System.out.println("Enter the Path for Folder Name");  
//     String Folder=sc.nextLine(); 
//     System.out.println("Your folder is :"+ Folder);
//
//     File f = new File(Folder);
//
//     int countFiles = 0;
//     int countFolder=0;
//     for (File file : f.listFiles()) {
//             if (file.isFile()) {
//                     countFiles++;
//             }
//             if (file.isDirectory()) {
//                     countFolder++;
//             }
//     }
//     System.out.println("Number of files is : " + countFiles+"\nNumber of folder "+countFolder);
//
//    }
//
//}