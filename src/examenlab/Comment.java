/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab;
import java.util.Calendar;

public class Comment {
    private int postId;
    private String autor, comentario;
    private Calendar fecha;
    
    public Comment(int postId, String autor, String comentario){
        this.postId=postId;
        this.autor=autor;
        this.comentario=comentario;
        fecha=Calendar.getInstance();
    }
    
    public int getpostId(){
        return postId;
    }
    
    public void print(){
        int dia=fecha.get(Calendar.DAY_OF_MONTH);
        int mes=fecha.get(Calendar.MONTH)+1;
        int año=fecha.get(Calendar.YEAR);
        System.out.println(autor+" - "+""+dia+" "+mes+" "+año+"\n"+comentario);
    }

    
    


}