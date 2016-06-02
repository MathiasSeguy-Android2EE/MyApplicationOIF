/**
 * <ul>
 * <li>Human</li>
 * <li>com.android2ee.formation.oif.juinmmxvi.myapplication.transverse.pojo</li>
 * <li>02/06/2016</li>
 * <p/>
 * <li>======================================================</li>
 * <p/>
 * <li>Projet : Mathias Seguy Project</li>
 * <li>Produit par MSE.</li>
 * <p/>
 * /**
 * <ul>
 * Android Tutorial, An <strong>Android2EE</strong>'s project.</br>
 * Produced by <strong>Dr. Mathias SEGUY</strong>.</br>
 * Delivered by <strong>http://android2ee.com/</strong></br>
 * Belongs to <strong>Mathias Seguy</strong></br>
 * ***************************************************************************************************************</br>
 * This code is free for any usage but can't be distribute.</br>
 * The distribution is reserved to the site <strong>http://android2ee.com</strong>.</br>
 * The intelectual property belongs to <strong>Mathias Seguy</strong>.</br>
 * <em>http://mathias-seguy.developpez.com/</em></br> </br>
 * <p/>
 * *****************************************************************************************************************</br>
 * Ce code est libre de toute utilisation mais n'est pas distribuable.</br>
 * Sa distribution est reservée au site <strong>http://android2ee.com</strong>.</br>
 * Sa propriété intellectuelle appartient à <strong>Mathias Seguy</strong>.</br>
 * <em>http://mathias-seguy.developpez.com/</em></br> </br>
 * *****************************************************************************************************************</br>
 */

package com.android2ee.formation.oif.juinmmxvi.myapplication.transverse.pojo;

import com.android2ee.formation.oif.juinmmxvi.myapplication.R;

/**
 * Created by Mathias Seguy - Android2EE on 02/06/2016.
 */
public class Human {
    /**
     * The name
     */
    String name;
    /**
     * The message associated
     */
    String message;
    /**
     * The picture of the human
     */
    int pictureId;
    /***********************************************************
    *  Constructors
    **********************************************************/
    public Human(String message, int position){
        if(position%2==0){
            name="toto";
            pictureId= R.mipmap.ic_human_even;
        }else{
            name="tata";
            pictureId= R.mipmap.ic_human_odd;
        }
        this.message=message;
    }
    /***********************************************************
     *  Getters/Setters
     **********************************************************/
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
