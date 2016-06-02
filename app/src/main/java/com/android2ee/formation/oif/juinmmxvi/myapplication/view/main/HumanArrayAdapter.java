/**
 * <ul>
 * <li>HumanArrayAdapter</li>
 * <li>com.android2ee.formation.oif.juinmmxvi.myapplication.view.main</li>
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

package com.android2ee.formation.oif.juinmmxvi.myapplication.view.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android2ee.formation.oif.juinmmxvi.myapplication.R;
import com.android2ee.formation.oif.juinmmxvi.myapplication.transverse.pojo.Human;

import java.util.ArrayList;

/**
 * Created by Mathias Seguy - Android2EE on 02/06/2016.
 */
public class HumanArrayAdapter extends ArrayAdapter<Human> {
    /***********************************************************
    *  Attributes
    **********************************************************/
    private LayoutInflater inflater;
    /***********************************************************
    *  Constructors
    **********************************************************/
    public HumanArrayAdapter(Context context, ArrayList<Human> dataset) {
        super(context, R.layout.human_even,dataset);
        inflater=LayoutInflater.from(context);
    }
    /***********************************************************
     *  GetView bloc
     **********************************************************/
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Human human=getItem(position);
        View rowView=inflater.inflate(R.layout.human_even,parent,false);
        ((TextView)rowView.findViewById(R.id.txvName)).setText(human.getName());
        return rowView;
    }
}
