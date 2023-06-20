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
public class opdracht20 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geef een getal op groter dan 1:");
        String nummer_input = br.readLine();

        int nummer = Integer.parseInt(nummer_input);

        for (int i = 1; i < nummer; i++) {
            System.out.println(i);
        }
    }
}
