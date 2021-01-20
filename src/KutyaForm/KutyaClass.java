/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KutyaForm;

/**
 *
 * @author Kova
 */
public class KutyaClass {
    public String type;
    public boolean isMale;
    public int age;
    public String nick;

    public KutyaClass(String line) 
    {
        String[] sp = line.split(";");
        this.type = sp[0];
        this.isMale = sp[1].equals("kan");
        this.age = Integer.parseInt(sp[2]);
        this.nick = sp[3];
    }
}
