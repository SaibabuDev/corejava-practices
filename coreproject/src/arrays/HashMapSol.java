package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSol {
	public static void main(String []argh){
        HashMap map=new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
            System.out.println(map);
        }
        while(in.hasNext()){
            String s = in.nextLine();
            // Write code here
            if(map.get(s)!=null){
            	System.out.println(map.get(s));
            }
            else{
            	System.out.println("Not found key in hash map");
            	
            }
        }
        in.close();
    }
}
