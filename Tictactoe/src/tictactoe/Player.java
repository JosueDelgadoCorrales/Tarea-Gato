/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

/**
 *
 * @author josue
 */
public class Player {
    private String name;
    private char mark;

    //Constructor que permite darle un nombre y simbolo(X o O) a los jugadores
    public Player(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mark
     */
    public char getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(char mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", mark=" + mark + '}';
    }
    
    
}
