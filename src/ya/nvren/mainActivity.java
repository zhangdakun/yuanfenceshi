// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package ya.nvren;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import com.android.adlib.AD;
import com.android.adlib.ADbaseActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
//import ya.money.*;

// Referenced classes of package ya.nvren:
//            ReadFile, overActivity

public class mainActivity extends ADbaseActivity
    implements android.view.View.OnClickListener//, UpdatePointsNotifier
{

    public mainActivity()
    {
        nextButton = null;
        question = null;
        radio1 = null;
        radio2 = null;
        radio3 = null;
        index = 0;
    }

    private void cal()
    {
//        if(!radio1.isChecked()) goto _L2; else goto _L1
//_L1:
//        score[index] = 0;
//_L4:
//        return;
//_L2:
//        if(radio2.isChecked())
//            score[index] = 1;
//        else
//        if(radio3.isChecked())
//            score[index] = 2;
//        if(true) goto _L4; else goto _L3
//_L3:
    	
    	if(radio1.isChecked()) {
    		score[index] = 0;
    	} else {
          if(radio2.isChecked())
        	  score[index] = 1;
	      else
	    	  if(radio3.isChecked())
	          score[index] = 2;  		
    	}
    }

    public void MangerStr()
    {
        question.setText(ReadFile.str[index][0]);
        radio1.setText(ReadFile.str[index][1]);
        radio2.setText(ReadFile.str[index][2]);
        radio3.setText(ReadFile.str[index][3]);
        if(index == 11)
            nextButton.setBackgroundResource(0x7f02000a);
    }

    public void MangerStrNew()
    {
        index = 1 + index;
        MangerStr();
    }

    public void getUpdatePoints(String s, int i)
    {
        currentName = s;
        point = i;
        if(showAd.equals(""))
            point = 0;
        else
        if("true".equals(showAd))
            point = i;
        else
            point = 30;
    }

    public void getUpdatePointsFailed(String s)
    {
    }

    public void onClick(View view)
    {
//        if(view.getId() != 0x7f070004) goto _L2; else goto _L1
//_L1:
//        if(index >= 11) goto _L4; else goto _L3
//_L3:
//        cal();
//        if(!radio1.isChecked() && !radio2.isChecked() && !radio3.isChecked())
//            Toast.makeText(this, "\u8BB0\u5F97\u9009\u4E2D\u5176\u4E2D\u4E00\u9879\u54E6\uFF01", 0).show();
//        else
//            MangerStrNew();
//_L2:
//        return;
//_L4:
//        if(index == 11)
//            if(point >= 1)
//            {
//                AppConnect.getInstance(this).spendPoints(1, this);
//                cal();
//                tongji();
//                Intent intent = new Intent();
//                intent.putExtra("getScore", GetScore);
//                intent.setClass(this, ya/nvren/overActivity);
//                startActivity(intent);
//            } else
//            {
//                Toast.makeText(this, "\u6D4B\u8BD5\u4EC5\u97001\u79EF\u5206\uFF0C\u514D\u8D39\u5373\u53EF\u83B7\u53D6\u79EF\u5206\u54E6\uFF01", 0).show();
//                AppConnect.getInstance(this).showOffers(this);
//            }
//        if(true) goto _L2; else goto _L5
//_L5:
    	if(view.getId() == 0x7f070004) {
    		if(index >= 11) {
    			if(AD.i().haveOffers(context)) {
    				    			
    			cal();
    			tongji();
              Intent intent = new Intent();
              intent.putExtra("getScore", GetScore);
              intent.setClass(this, overActivity.class);
              startActivity(intent);
    			}
    		} else {
    	        cal();
    	        if(!radio1.isChecked() && !radio2.isChecked() && !radio3.isChecked())
    	            Toast.makeText(this, "\u8BB0\u5F97\u9009\u4E2D\u5176\u4E2D\u4E00\u9879\u54E6\uFF01", 0).show();
    	        else
    	            MangerStrNew();    			
    		}
    		

    	}
    	
    }
private Context context;
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        context = this;
		AdManager.getInstance(this).init("cee0670908571eda",
				"e86f502020a27415", false);
		
        LinearLayout adLayout = (LinearLayout) findViewById(android.myapp.nvrens.R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
//        AppConnect.getInstance("63c45f580f6216951ffba06036d554fd", "3G", this);
//        AppConnect.getInstance(this).setAdViewClassName("ya.nvren.MyAdView");
        showAd = "true";
//        if("true".equals(showAd))
//        {
//            AppConnect.getInstance(this).initPopAd(this);
//            AppConnect.getInstance(this).showPopAd(this);
//            AppConnect.getInstance(this).setAdBackColor(Color.argb(50, 120, 240, 120));
//            AppConnect.getInstance(this).setAdForeColor(0xff0000ff);
//            (new MiniAdView(this, (LinearLayout)findViewById(0x7f070005))).DisplayAd(10);
//        }
        ma = this;
        ReadFile.Analy(ReadFile.readString(0x7f040000));
        GetScore = 0;
        index = 0;
        question = (TextView)findViewById(0x7f070000);
        radio1 = (RadioButton)findViewById(0x7f070001);
        radio2 = (RadioButton)findViewById(0x7f070002);
        radio3 = (RadioButton)findViewById(0x7f070003);
        MangerStr();
        nextButton = (Button)findViewById(0x7f070004);
        nextButton.setOnClickListener(this);
    }

    protected void onDestroy()
    {
//        AppConnect.getInstance(this).finalize();
        super.onDestroy();
    }

    protected void onResume()
    {
//        AppConnect.getInstance(this).getPoints(this);
        super.onResume();
    }

    public void tongji()
    {
        int i = 0;
        do
        {
            if(i >= score.length)
                return;
            GetScore += answer[i][score[i]];
            i++;
        } while(true);
    }

    public static final int CheckA = 0;
    public static final int CheckB = 1;
    public static final int CheckC = 2;
    public static int GetScore = 0;
    public static int answer[][];
    public static String currentName;
    public static mainActivity ma;
    public static int point = 0;
    public static final int questionLen = 12;
    public static final int questionStrNum = 4;
    public static int score[] = new int[12];
    public static String showAd = "";
    public static final int xiaoFeiJiFen = 1;
    public static final String xiaoFeiJiFenTiShi = "\u6D4B\u8BD5\u4EC5\u97001\u79EF\u5206\uFF0C\u514D\u8D39\u5373\u53EF\u83B7\u53D6\u79EF\u5206\u54E6\uFF01";
    LinearLayout adLinearLayout;
    private int index;
    private Button nextButton;
    private TextView question;
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;

    static 
    {
        point = 0;
        GetScore = 0;
        int ai[][] = new int[12][];
        int ai1[] = new int[3];
        ai1[0] = 3;
        ai1[1] = 1;
        ai1[2] = 5;
        ai[0] = ai1;
        int ai2[] = new int[3];
        ai2[0] = 1;
        ai2[1] = 5;
        ai2[2] = 3;
        ai[1] = ai2;
        int ai3[] = new int[3];
        ai3[0] = 1;
        ai3[1] = 5;
        ai3[2] = 3;
        ai[2] = ai3;
        int ai4[] = new int[3];
        ai4[0] = 5;
        ai4[1] = 1;
        ai4[2] = 3;
        ai[3] = ai4;
        int ai5[] = new int[3];
        ai5[0] = 3;
        ai5[1] = 1;
        ai5[2] = 5;
        ai[4] = ai5;
        int ai6[] = new int[3];
        ai6[0] = 5;
        ai6[1] = 3;
        ai6[2] = 1;
        ai[5] = ai6;
        int ai7[] = new int[3];
        ai7[0] = 3;
        ai7[1] = 5;
        ai7[2] = 1;
        ai[6] = ai7;
        int ai8[] = new int[3];
        ai8[0] = 1;
        ai8[1] = 5;
        ai8[2] = 3;
        ai[7] = ai8;
        int ai9[] = new int[3];
        ai9[0] = 1;
        ai9[1] = 3;
        ai9[2] = 5;
        ai[8] = ai9;
        int ai10[] = new int[3];
        ai10[0] = 3;
        ai10[1] = 5;
        ai10[2] = 1;
        ai[9] = ai10;
        int ai11[] = new int[3];
        ai11[0] = 1;
        ai11[1] = 3;
        ai11[2] = 5;
        ai[10] = ai11;
        int ai12[] = new int[3];
        ai12[0] = 1;
        ai12[1] = 5;
        ai12[2] = 3;
        ai[11] = ai12;
        answer = ai;
    }
}
