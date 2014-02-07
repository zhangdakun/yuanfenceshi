// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package ya.nvren;

import com.android.adlib.ADbaseActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package ya.nvren:
//            menuActivity

public class overActivity extends ADbaseActivity
    implements android.view.View.OnClickListener
{

    public overActivity()
    {
        String as[] = new String[5];
        as[0] = "\u672A\u77E5\u5BB3\u6015\u7C7B\u578B \n\n\u660E\u767D\u5730\u8BF4\uFF0C\u4F60\u662F\u4E0D\u662F\u5F88\u5C11\u548C\u5973\u4EBA\u63A5\u89E6\uFF0C\u8FD9\u662F\u56E0\u4E3A\u4F60\u4E00\u76F4\u628A\u5973\u4EBA\u60F3\u5230\u662F\u300C\u6050\u6016\u7684\u4E1C\u897F\u300D\u4E86\u3002\u6709\u6CA1\u6709\u9047\u5230\u8FC7\u8FC7\u4E8E\u4FDD\u62A4\u5973\u513F\u7684\u6BCD\u4EB2\u548C\u574F\u5FC3\u773C\u7684\u5973\u5B69\u7ED9\u4F60\u5E26\u6765\u7684\u56F0\u7A98\uFF1F\u548C\u5973\u5B69\u5B50\u4EA4\u670B\u53CB\uFF0C\u6D88\u89E3\u4E86\u5BF9\u5973\u6027\u7684\u4E0D\u4FE1\u4EFB\uFF0C\u4F60\u7684\u8FD0\u6C14\u5C31\u4F1A\u597D\u8F6C\u3002 ";
        as[1] = "\u56E0\u61E6\u5F31\u800C\u754F\u602F\u7C7B\u578B\n\n\u88AB\u559C\u6B22\u7684\u5973\u5B69\u73A9\u5F04\uFF0C\u88AB\u4E0D\u559C\u6B22\u7684\u5973\u5B69\u770B\u4E0A\u3002\u4F60\u5C31\u50CF\u662F\u300C\u5973\u4EBA\u8FD0\u5F88\u574F\u300D\u7684\u7C7B\u578B\u3002\u4F46\u662F\uFF0C\u771F\u6B63\u539F\u56E0\u662F\u4F60\u592A\u61E6\u5F31\u3002\u6240\u4EE5\uFF0C\u9996\u5148\u4F60\u8981\u517B\u6210\u5206\u6E05\u662FYES\u8FD8\u662FNO\u7684\u4E60\u60EF\u3002\u6709\u4E86\u81EA\u4FE1\uFF0C\u5973\u5B69\u5B50\u81EA\u7136\u4F1A\u9760\u8FD1\u4F60\u3002 ";
        as[2] = "\u4F9D\u9760\u60C5\u670D\u3001\u6570\u636E\u7C7B\u578B \n\n\u5C3D\u7BA1\u7528\u5C3D\u5FC3\u601D\uFF0C\u4F60\u73B0\u5728\u8FD8\u662F\u4E2A\u4E0D\u61C2\u5973\u4EBA\u7684\u4EBA\u3002\u867D\u7136\u5F97\u5230\u4E86\u5973\u6027\u7684\u597D\u611F\uFF0C\u5374\u4E0D\u80FD\u53D1\u5C55\u6210\u604B\u7231\uFF0C\u8FD9\u6837\u7684\u60C5\u51B5\u662F\u5426\u4E0D\u5C11\uFF1F\u6253\u7834\u8FD9\u4E2A\u5C40\u9762\u5C31\u4E0D\u8981\u518D\u91CD\u89C6\u60C5\u670D\u548C\u6570\u636E\u3002\u56E0\u4E3A\uFF0C\u5973\u5B69\u662F\u4E00\u4E2A\u4E00\u4E2A\u90FD\u4E0D\u4E00\u6837\u7684\u3002\u6709\u4E86\u771F\u6B63\u559C\u6B22\u7684\u5973\u5B69\u5B50\u5C31\u5FC5\u987B\u8BA9\u5979\u611F\u5230\u4F60\u7684\u771F\u610F\u3002 ";
        as[3] = "\u5E78\u8FD0\u8005\u7C7B\u578B\n\n\u5F53\u7136\u4F60\u662F\u4ED8\u51FA\u4E86\u52AA\u529B\uFF0C\u4F46\u4F60\u5F97\u5230\u6BD4\u52AA\u529B\u66F4\u591A\u7684\u5E78\u8FD0\u3002\u770B\u4E0A\u53BB\u662F\u5962\u671B\uFF0C\u4E0D\u53EF\u80FD\u5F97\u5230\u7684\u5973\u5B69\u5B50\uFF0C\u53EA\u8981\u80FD\u4E0D\u6015\u754F\u602F\u5730\u53D1\u8D77\u8FDB\u653B\uFF0C\u5C31\u4E00\u5B9A\u80FD\u6210\u529F\u3002\u4F46\u662F\uFF0C\u4F60\u5982\u679C\u4E0D\u9002\u5EA6\u5730\u6536\u4E00\u6536\u82B1\u5FC3\u7684\u8BDD\uFF0C\u4E5F\u53EF\u80FD\u751A\u4E48\u65F6\u5019\u751A\u4E48\u90FD\u843D\u7A7A\u3002\u53EA\u8981\u4F60\u4E0D\u5FD8\u8BB0\u8BDA\u5B9E\uFF0C\u5C31\u80FD\u5F97\u5230\u5FEB\u4E50\u7684\u7231\u60C5\u3002 ";
        as[4] = "\u7EC8\u8EAB\u4E3A\u5973\u4EBA\u6240\u8BEF\u7C7B\u578B\n\n\u4F60\u662F\u5426\u4EE5\u4E3A\u53EA\u8981\u82E6\u53E3\u5A46\u5FC3\u529D\u8BF4\u5C31\u80FD\u591F\u8F7B\u6613\u4E0E\u5979\u5206\u624B\u3002\u786E\u5B9E\u8BA4\u771F\u52E4\u6073\u79EF\u6781\u7684\u4F60\u62E5\u6709\u5F88\u591A\u5973\u5B69\uFF0C\u4F46\u4F60\u5982\u679C\u8BA4\u4E3A\u81EA\u5DF1\u6709\u6843\u82B1\u8FD0\u7684\u8BDD\uFF0C\u90A3\u5C31\u9519\u4E86\u3002\u5982\u679C\u8FD9\u6837\u6301\u7EED\u4E0B\u53BB\u7684\u8BDD\uFF0C\u4F60\u5C06\u6765\u53EA\u80FD\u4E00\u6B21\u6B21\u7ED3\u5A5A\u4E00\u6B21\u6B21\u79BB\u5A5A\u3002\u7136\u540E\uFF0C\u4E00\u6B21\u53C8\u4E00\u6B21\u4EA4\u4ED8\u8D61\u517B\u8D39\u3002\u81EA\u6EE1\u3001\u81EA\u8D1F\u662F\u7EDD\u5BF9\u7981\u5FCC\u7684\u3002";
        restring = as;
        back = null;
        exit = null;
    }

    private void findIndex()
    {
        if(getScore <= 20)
            index = 0;
        else
        if(getScore <= 30)
            index = 1;
        else
        if(getScore <= 40)
            index = 2;
        else
        if(getScore <= 50)
            index = 3;
        else
            index = 4;
    }

    public void finish()
    {
        super.finish();
    }

    public void onClick(View view)
    {
//        if(view.getId() != 0x7f070008) goto _L2; else goto _L1
//_L1:
//        Intent intent = new Intent();
//        intent.setClass(this, ya/nvren/menuActivity);
//        startActivity(intent);
//_L4:
//        return;
//_L2:
//        if(view.getId() == 0x7f070009)
//        {
//            Intent intent1 = new Intent();
//            intent1.setClass(this, ya/nvren/menuActivity);
//            startActivity(intent1);
//            Intent intent2 = new Intent("android.intent.action.MAIN");
//            intent2.addCategory("android.intent.category.HOME");
//            intent2.setFlags(0x4000000);
//            startActivity(intent2);
//            Process.killProcess(Process.myPid());
//            System.exit(0);
//        }
//        if(true) goto _L4; else goto _L3
//_L3:
    	
    	if(view.getId() == 0x7f070008) {
          Intent intent = new Intent();
          intent.setClass(this, menuActivity.class);
          startActivity(intent);  		
    	} else {
    		 if(view.getId() == 0x7f070009) {
               Intent intent1 = new Intent();
               intent1.setClass(this, menuActivity.class);
               startActivity(intent1);
               Intent intent2 = new Intent("android.intent.action.MAIN");
               intent2.addCategory("android.intent.category.HOME");
               intent2.setFlags(0x4000000);
               startActivity(intent2);
               Process.killProcess(Process.myPid());
               System.exit(0);   			 
    		 }
    	}
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030002);
        back = (Button)findViewById(0x7f070008);
        exit = (Button)findViewById(0x7f070009);
        getScore = getIntent().getIntExtra("getScore", 0);
        findIndex();
        ((TextView)findViewById(0x7f070007)).setText((new StringBuilder("  \u6D4B\u8BD5\u7ED3\u679C\uFF1A")).append(restring[index]).toString());
        back.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    private Button back;
    private Button exit;
    int getScore;
    int index;
    String restring[];
}
