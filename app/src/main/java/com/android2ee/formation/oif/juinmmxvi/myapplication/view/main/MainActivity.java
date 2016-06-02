package com.android2ee.formation.oif.juinmmxvi.myapplication.view.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.android2ee.formation.oif.juinmmxvi.myapplication.R;
import com.android2ee.formation.oif.juinmmxvi.myapplication.transverse.pojo.Human;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /***********************************************************
     * Attributes
     **********************************************************/
    /**
     * The edittext
     */
    private EditText edtMessage;
    /**
     * The button to add the content of the edit text in the result area
     */
    private Button btnAdd;
    /**
     * The result area
     */
    private ListView lsvResult;
    /**
     * The list of items to display
     */
    private ArrayList<Human> humen;
    /**
     * The arrayadapter of the listview
     */
    private HumanArrayAdapter humanArrayAdapter;
    /***********************************************************
    *  Temp Var
    **********************************************************/
    /**
     * A temp string to use when you need a temp string
     */
    private String messageTemp;
    /***********************************************************
    *  Managing LifeCycle
    **********************************************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflate the view
        setContentView(R.layout.activity_main);
        //instanciate the graphical components
        edtMessage= (EditText) findViewById(R.id.edtMessage);
        btnAdd= (Button) findViewById(R.id.btnAdd);
        lsvResult= (ListView) findViewById(R.id.lsvResult);
        humen =new ArrayList<>();
        humanArrayAdapter =new HumanArrayAdapter(this,humen);
        lsvResult.setAdapter(humanArrayAdapter);

        //add listeners
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMessageToResult();
            }
        });
        lsvResult.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                fillEdtWithSelectedElement(position);
            }
        });
    }

    /***********************************************************
    *  Business Methods
    **********************************************************/
    /**
     * Copy the content of the dittext in the result area
     */
    private void addMessageToResult(){
        messageTemp= edtMessage.getText().toString();
        //manage the list of data directly
//        messages.add(messageTemp);
//        arrayAdapter.notifyDataSetChanged();
        //use the arrayadapter
        humanArrayAdapter.add(new Human(messageTemp,humen.size()));
        edtMessage.setText("");
    }

    /**
     * Copy the selected element in the EdtText
     * @param position
     */
    private void fillEdtWithSelectedElement(int position){
        messageTemp= humen.get(position).getMessage();
        edtMessage.setText(messageTemp);
    }
}
