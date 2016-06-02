package com.android2ee.formation.oif.juinmmxvi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    private TextView txvResult;
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
        txvResult= (TextView) findViewById(R.id.txvResult);
        //add listeners
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMessageToResult();
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
        txvResult.append("\r\n"+messageTemp);
        edtMessage.setText("");
    }
}
