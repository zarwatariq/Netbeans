/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoofdstuk6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class opdracht21 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Geef je naam op:");

        //De variable invoer vullen :
        String naam = br.readLine();

        //Uitvoer naar het beeldscherm:
        System.out.println("Geef je leeftijd:");

        String leeftijd_input = br.readLine();

        int leeftijd = Integer.parseInt(leeftijd_input);

        for (int i = 0; i < leeftijd; i++) {
            System.out.println(naam);

        }
    }
}
