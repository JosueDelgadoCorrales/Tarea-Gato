/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Game {
    //Atributos para representar el tablero y los jugadores
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    /*Constructor que permite inicializar el tablero y los jugadores, a estos 
    ya dandoles los valores*/
    public Game() {
        board = new Board();
        player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');
        currentPlayer = player1;
    }

    /*Metodo para iniciar el juego en la consola, este contiene funciones 
    para leer la entrada del usuario mediante un scanner, el bucle que permite 
    hacer todo lo que conlleva el juego(start), muestra el tablero, ingresa el
    caracter en el espacio que el usuario desee, verifica los movimientos, 
    verifica que jugador actual que realiza el movimiento gana y cambia de
    jugador*/
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (!board.isGameOver()) {
            System.out.println("Turno de: " + currentPlayer.getName());
            board.display();
            System.out.println("Ingrese la fila y la columna donde desea "
                    + "colocar su marca (ejemplo: 1 2): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            if (board.validMove(row, col)) {
                board.makeMove(row, col, currentPlayer.getMark());
                if (board.checkWin(currentPlayer.getMark())) {
                    System.out.println(currentPlayer.getName() + " ha ganado!");
                    break;
                }
                switchPlayer();
            } else {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.");
            }
        }
        scanner.close();
    }
    /*Metodo que permite realizar el cambio de jugador luego de cada movimiento
    valido*/
    private void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

}
