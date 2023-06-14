/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo1;

/**
 *
 * @author Paulo
 */
public class ComputadorBordo {
    private boolean ligarGPS;
    private boolean ligarRadio;
    private boolean ligarMP3Player;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public ComputadorBordo() {
        ligarGPS = true;
        ligarRadio = false;
        ligarMP3Player = true;
        descricao = "KONNWEI KW206";
    }

    public ComputadorBordo(boolean ligarGPS, boolean ligarRadio, boolean ligarMP3Player) {
        this.ligarGPS = ligarGPS;
        this.ligarRadio = ligarRadio;
        this.ligarMP3Player = ligarMP3Player;
    }

    public boolean isLigarGPS() {
        return ligarGPS;
    }

    public void setLigarGPS(boolean ligarGPS) {
        this.ligarGPS = ligarGPS;
    }

    public boolean isLigarRadio() {
        return ligarRadio;
    }

    public void setLigarRadio(boolean ligarRadio) {
        this.ligarRadio = ligarRadio;
    }

    public boolean isLigarMP3Player() {
        return ligarMP3Player;
    }

    public void setLigarMP3Player(boolean ligarMP3Player) {
        this.ligarMP3Player = ligarMP3Player;
    }    

    @Override
    public String toString() {
        return "ComputadorBordo{" + "ligarGPS=" + ligarGPS + ", ligarRadio=" + ligarRadio + ", ligarMP3Player=" + ligarMP3Player + '}';
    }
    
}
