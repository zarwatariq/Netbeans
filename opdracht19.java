/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoofdstuk6;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class opdracht19 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Geef je naam op:");

        //De variable invoer vullen :
        String naam = br.readLine();

        //Uitvoer naar het beeldscherm:
        System.out.println("Hallo " + naam);

    }
}
