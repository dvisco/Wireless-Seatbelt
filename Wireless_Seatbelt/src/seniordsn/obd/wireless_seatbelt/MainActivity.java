package seniordsn.obd.wireless_seatbelt;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.preference.*;

public class MainActivity extends Activity 
{
	public static final String BLUETOOTH_LIST_KEY = "bluetooth_list_preference";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //ListPreference listBtDevices = (ListPreference) getPreferenceScreen().findPreference(BLUETOOTH_LIST_KEY);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
