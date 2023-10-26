/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

/**
 *
 * @author josue
 */
public class Board {
    /*Se define el atributo para representar el tablero(board) como una matriz
    de 3x3 que contenga caracteres*/
    private char[][] board;

    //Este metodo inicializa el tablero(board) 3x3 con guiones '-'
    private void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    //Constructor que inicializa el tablero(board) y lo rellena con guiones
    public Board() {
        this.board = new char[3][3];
        this.initBoard();
    }


    //Este metodo muestra el estado en el que se encuentra el tablero
    public void display() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    //Metodo que verifica si se puede realizar un movimiento o no
    public boolean validMove(int row, int col) {
        return (row >= 0 && row < board.length) && (col >= 0 && col <
                board[row].length) && (board[row][col] == '-');
    }


    /*Metodo que permite realizar un movimiento para una celda especifica 
    siempre y cuando el movimiento sea valido*/
    public void makeMove(int row, int col, char mark) {
        if (validMove(row, col)) {
            board[row][col] = mark;
        }
    }


    /*Metodo que compruba mediante una verificacion de las filas, columnas y 
    diagonales del tablero si ya se definio un ganador*/
    public boolean checkWin(char mark) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == mark && board[i][1] == mark && 
                    board[i][2] == mark) {
                return true;
            }
            if (board[0][i] == mark && board[1][i] == mark && 
                    board[2][i] == mark) {
                return true;
            }
        }
        if (board[0][0] == mark && board[1][1] == mark &&
                board[2][2] == mark) {
            return true;
        }
        if (board[0][2] == mark && board[1][1] == mark && 
                board[2][0] == mark) {
            return true;
        }
        return false;
    }


    //Metdo que verifica si el juego ya finalizo
    public boolean isGameOver() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
    
    
    
    
