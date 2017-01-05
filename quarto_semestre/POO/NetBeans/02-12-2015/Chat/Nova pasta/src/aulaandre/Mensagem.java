package aulaandre;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.sql.Date;

/**
 *
 * @author a1320769
 */
public class Mensagem implements Comparable {
    public String nick,mensagem;
    public Date date;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object t) {
        Mensagem msg2 = (Mensagem) t;
        
        if(this.date.equals(msg2.getDate()) &&
           this.mensagem.equals(msg2.getMensagem()) &&
           this.nick.equals(msg2.getNick()))
            return true;
        else return false;
    }
    
    @Override
    public int compareTo(Object t) {
        Mensagem msg2 = (Mensagem) t;
        
        if(this.date.compareTo(msg2.getDate()) == 0)
            return this.nick.compareTo(msg2.getMensagem());
        
        else return this.date.compareTo(msg2.getDate());
    } 
    
    }
