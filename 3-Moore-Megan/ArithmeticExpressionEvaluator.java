/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import java.util.logging.Level;
import java.util.logging.Logger;
import stacksandqueues.*;

/**
 *
 * @author ogm2
 * @param 
 */
public class ArithmeticExpressionEvaluator {
   // myStack = new MyStackImpl<>(array);
    MyStackIF<Double> myStackVals;
    MyStackIF<Character> myStackOps;
    Double[] array1;
    Character[] array2;
    int size;
    ////private Object myStackVals;

    public ArithmeticExpressionEvaluator() 
    {
       myStackVals= new MyStackImpl<>(array1);
       myStackOps=new MyStackImpl<>(array2);
      
    }

    public Double evaluateArithmeticExpression(String s) throws EmptyStructureException {
        char[] str=s.toCharArray();
        //int i=0;
        //char el=s.charAt(i);
        for(int i=0; i<str.length;i++){
           char el=str[i];
           while(el!=')')
            {
                //char el=s.charAt(i);
                if(el>='1' && el<='9'){try {
                    // if it is a number
                    
                    myStackVals.push((double)el);
                    } catch (FullStructureException ex) {
                        Logger.getLogger(ArithmeticExpressionEvaluator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else if (el=='+'||el=='-'||el=='*'||el=='/')
                {
                    try {
                        myStackOps.push(el);
                    } catch (FullStructureException ex) {
                        Logger.getLogger(ArithmeticExpressionEvaluator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            int x=i;
            if(str[x]!='(')
                x--;
            else if(str[x]=='('){
               try {
                   double num1=myStackVals.pop();
                   double num2=myStackVals.pop();
                   char op=myStackOps.pop();
                   double newVal=(num2+op+num1);
                   try {
                       myStackVals.push(newVal);
                   } catch (FullStructureException ex) {
                       Logger.getLogger(ArithmeticExpressionEvaluator.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   str[x]='o';
                   str[i]='o';
               } catch (EmptyStructureException ex) {
                   Logger.getLogger(ArithmeticExpressionEvaluator.class.getName()).log(Level.SEVERE, null, ex);
               }
            }
           
        }
        return myStackVals.pop();
    }
}
    
    
