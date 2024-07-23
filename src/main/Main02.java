package main;

import entities.Robo;
import entities.Robo02;
import java.util.Random;

import java.util.Scanner;
public class Main02 {
    public static void main(String[] args){
        Robo robo01 = new Robo02("branco");
        Robo robo02 = new Robo02("preto");
        Scanner teclado = new Scanner(System.in);
        int[] food = new int[2];
		food[0] = teclado.nextInt();
		food[1] = teclado.nextInt();
		teclado.nextLine();
        MoveLoop(robo01, robo02, food);
        teclado.close();
    }

    public static void MoveLoop(Robo r1, Robo r2, int[] food){
        int move, z = 0, x;
        Random rd = new Random();
        while(z == 0){
            System.out.printf("Vez do robo %s\n", r1.getColor());
            System.out.printf("(%d,%d)\n", r1.getCoord()[0], r1.getCoord()[1]);
            move = rd.nextInt(4);
            x = ((Robo02) r1).Mover2(move + 1);
            if(x == 0){
                System.out.printf("Movimento invalidado, robo %s perdeu a vez!\n", r1.getColor());
            }
            if(r1.isFoodFound(food)) {
        	    System.out.printf("(%d,%d)", r1.getCoord()[0], r1.getCoord()[1]);
        	    System.out.printf("O robo %s achou primeiro a comida primerio!", r1.getColor());
                z++;
            }
            if(z == 0){
                System.out.printf("Vez do robo %s\n", r2.getColor());
                System.out.printf("(%d,%d)\n", r2.getCoord()[0], r2.getCoord()[1]);
                move = rd.nextInt(4);
                x = ((Robo02) r2).Mover2(move + 1);
                if(x == 0){
                    System.out.printf("Movimento invalidado, robo %s perdeu a vez!\n", r2.getColor());
                }
                if(r2.isFoodFound(food)) {
        	    System.out.printf("(%d,%d)", r2.getCoord()[0], r2.getCoord()[1]);
        	    System.out.printf("O robo %s achou primeiro a comida primerio!", r2.getColor());
                z++;
                }
            }
        }
    }
}
