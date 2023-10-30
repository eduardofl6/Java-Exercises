package Exercises17;
import java.io.*;
import java.util.*;

public class cayde {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int[] cpf = new int[11];

        while(Character.isDigit(cpf[cpf.length-1])){
           System.out.print("Insira seu CPF: ");
            char[] Scpf = ((String) input.next()).toCharArray();
           if(Scpf.length == cpf.length){
            for(int i = 0; i < cpf.length;i++){
                cpf[i] = Scpf[i] - '0';
            }
           }else{
            System.out.print("CPF com o número de digitos errado \n");
           }
        }

        System.out.print(cpf);


    }

 
}
