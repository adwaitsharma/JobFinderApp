import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class job_engine extends Activity {
    /** Called when the activity is first created. */
    
     protected boolean _active = true;
     protected int _splashTime = 2000;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        //initially call the main screen which is the splash screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // thread for displaying the next screen
        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while(_active && (waited < _splashTime)) {
                        sleep(100);
                        if(_active) {
                            waited += 100;
                        }
                    }
                } catch(InterruptedException e) {
                    // do nothing
                } finally {
                    //the finish function will close the current activity 
                    //which is the "main" screen.
                    finish();

                    //after waiting.. display the "home" screen: application main screen.
                    Intent i = new Intent(job_engine.this, homescreen.class);
                     startActivity(i);
                    stop();//stop thread.
                }
            }
        };
        splashTread.start();
    }
        
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            _active = false;
        }
        return true;
    }    
}

