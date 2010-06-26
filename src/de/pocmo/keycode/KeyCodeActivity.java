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
        
        input.setOnKeyListener(new OnKeyListener() {
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				view.setText(String.valueOf(keyCode));
				return true;
			}
        });
    }
}