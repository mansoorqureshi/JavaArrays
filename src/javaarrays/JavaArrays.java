/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/**
 *
 * @author Mansoor
 */
public class JavaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myarray = new int[100];
//       for (int i=0; i<myarray.length; i++){
//            myarray[i] = i;
//        }
        myarray[0] = 1;
        myarray[1] = 2;
        myarray[2] = 3;
        myarray[3] = 3;
        
        JavaArrays o = new JavaArrays();
        o.findDupInteger(myarray);
    }
    
    public int findDupInteger(int[] inputArray)
     {

      int arrLen = inputArray.length;
      if (arrLen == 0)
      return -1;
     
      Map<Integer, Boolean> arrMap = new HashMap<Integer, Boolean> ();      
      for (int arrCount = 0; arrCount<arrLen; arrCount++)
      {
       Boolean preVal = arrMap.putIfAbsent(inputArray[arrCount], true);
       if (preVal != null)
           {
               System.out.println("duplicate found at " + arrCount);
            return inputArray[arrCount];
           }
          
       }
       System.out.println("no duplicates");
      return 0;
      }
    
}
