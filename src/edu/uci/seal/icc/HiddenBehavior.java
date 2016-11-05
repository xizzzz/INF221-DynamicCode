package edu.uci.seal.icc;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class HiddenBehavior {
    public Intent getIntent(String componentType){
    	Intent i = new Intent("edu.uci.seal.action.SEND_SMS");
    	return i;
    }
    public void startComponentExplicit(Context context, String componentType, Intent intent){
    	//you can use the Context to start a component with the given Intent
        Log.d("test", "startComponentExplicit");
    	context.startActivity(intent);
    }
    public void startComponentImplicit(Context context, String componentType, String action){
    	//you can use the Context to start a component with the given action
    	//make sure to create an Intent from that action
        Log.d("test", "startComponentImplicit");
        long alarmid = 1;
        Intent i = new Intent("com.xi.TRIGGER_ALARM");
        i.putExtra("alarm_id", alarmid);
        Log.d("alarm", "send alarm");
        context.sendBroadcast(i);
    }

}
