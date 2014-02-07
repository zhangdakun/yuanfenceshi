// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package ya.nvren;

import android.content.res.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import org.apache.http.util.EncodingUtils;

// Referenced classes of package ya.nvren:
//            mainActivity

public class ReadFile
{

    public ReadFile()
    {
    }

    public static void Analy(String s)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            if(l >= s.length())
                return;
            if(j < str[i].length)
            {
                if(s.charAt(l) == '#')
                {
                    int i1 = l - 2;
                    str[i][j] = s.substring(k, i1);
                    j++;
                    k = i1 + 3;
                }
            } else
            {
                i++;
                j = 0;
            }
            l++;
        } while(true);
    }

    public static String readString(int i)
    {
        String s1 = null;
        InputStream inputstream = mainActivity.ma.getResources().openRawResource(i);
        byte abyte0[];
		try {
			abyte0 = new byte[inputstream.available()];

        inputstream.read(abyte0);
        s1 = EncodingUtils.getString(abyte0, "UTF-8");
        inputstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
//        String s = s1;
//_L2:
//        return s;
//        Exception exception;
//        exception;
//        exception.printStackTrace();
//        s = null;
//        if(true) goto _L2; else goto _L1
//_L1:
    }

    public static String str[][];

    static 
    {
        int ai[] = new int[2];
        ai[0] = 12;
        ai[1] = 4;
        str = (String[][])Array.newInstance(String.class, ai);
    }
}
