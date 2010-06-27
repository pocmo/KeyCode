package de.pocmo.keycode;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Activity that displays the pressed keycode
 * 
 * @author Sebastian Kaspari <sebastian@yaaic.org>
 */
public class KeyCodeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        EditText input = (EditText) findViewById(R.id.input);
        final TextView view = (TextView) findViewById(R.id.keycode);
        final EditText log  = (EditText) findViewById(R.id.log);
        
        input.setOnKeyListener(new OnKeyListener() {
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				String action = "?";
				
				switch (event.getAction()) {
					case KeyEvent.ACTION_DOWN:
						action = "DOWN";
						break;
					case KeyEvent.ACTION_UP:
						action = "UP";
						break;
					case KeyEvent.ACTION_MULTIPLE:
						action = "MULTIPLE";
						break;
				}
				
				view.setText(String.valueOf(keyCode));
				log.setText(keyCode + " (" + action + ")\n" + log.getText());
				return true;
			}
        });
    }
}