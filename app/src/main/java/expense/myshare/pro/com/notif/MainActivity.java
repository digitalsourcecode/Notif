package expense.myshare.pro.com.notif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final impIntf impIntf=new impIntf();
        Button button=(Button) findViewById(R.id.bbb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                impIntf.displaysData(50,MainActivity.this);
            }
        });


    }
}
