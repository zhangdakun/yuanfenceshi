// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package ya.nvren;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Referenced classes of package ya.nvren:
//            mainActivity

public class menuActivity extends Activity
    implements android.view.View.OnClickListener
{

    public menuActivity()
    {
        start = null;
    }

    public void onClick(View view)
    {
        if(view.getId() == 0x7f070006)
        {
            Intent intent = new Intent();
            intent.setClass(this, mainActivity.class);
            startActivity(intent);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030001);
        start = (Button)findViewById(0x7f070006);
        start.setOnClickListener(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    private Button start;
}
