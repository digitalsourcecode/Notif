package expense.myshare.pro.com.notif;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Pankaj on 13-01-2018.
 */

public class impIntf implements Intr {
    Context context;

    @Override
    public void displaysData(int i,Activity activity) {
        Toast.makeText(activity, "ok = "+i, Toast.LENGTH_SHORT).show();
//        Log.d("Data", "displaysData: "+i);

    }
}
