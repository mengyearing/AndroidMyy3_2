package comyy.example.administrator.androidmyy3_2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;

/**
 * Created by Administrator on 2018/5/5.
 */

public class MyButton extends AppCompatButton{
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        Log.v("com.sise","the onKeyDown in MyButton");
        return  true;
    }
}
