package kr.co.tjeit.database;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tjoeun on 2017-09-11.
 */

public abstract class BaseActivity extends AppCompatActivity {
    Context mContext = this;

    public abstract void setupEvents();
    public abstract void setValues();
    public abstract void bindViews();

}
