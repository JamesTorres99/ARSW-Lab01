/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hcadavid
 */
public class MainSyncronizado {
    
    public static void main(String a[]){
    	
    	new Scanner(System.in).nextLine(); // Es necesario para poder ver el monitor de recursos en JVisualVM
    	
        HostBlackListsValidator hblv=new HostBlackListsValidatorSyncronizado();
        
        int procesadores = Runtime.getRuntime().availableProcessors();
        List<Integer> blackListOcurrences;
        
        blackListOcurrences=hblv.checkHost("202.24.34.55", 1);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
        blackListOcurrences=hblv.checkHost("202.24.34.55", procesadores);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
        blackListOcurrences=hblv.checkHost("202.24.34.55", 2*procesadores);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
        blackListOcurrences=hblv.checkHost("202.24.34.55", 50);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
        blackListOcurrences=hblv.checkHost("202.24.34.55", 100);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
    }
    
}
