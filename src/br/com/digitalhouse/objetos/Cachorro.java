package br.com.digitalhouse.objetos;

import java.sql.SQLOutput;

public class Cachorro extends Animal {

    /*
    @Override
    public void estaBrincando(boolean estaBrincando) {
        //super.estaBrincando(estaBrincando);
        System.out.println("Estou sobrescrevendo o metodo");
        System.out.println("O animal se chama: " + super.getNomeAnimal());

    }
 */

    String nome = super.getNomeAnimal();


    @Override
    public int idadeDoAnimalFofo(int idade) {
        return 0;
    }
}
