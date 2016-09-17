package karel.com.portfolio.common;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Karel on 17/09/2016.
 */
public class SharedPreferenceManager {

    private final Context mContext;
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    private static int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "portfolio-intro";

    private static final String IS_FIRST_LAUNCH = "IsFirstLaunch";

    public SharedPreferenceManager(Context context) {
        this.mContext = context;
        mPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        mEditor = mPreferences.edit();
    }

    public void setFirstLaunch(boolean isFirstTime) {
        mEditor.putBoolean(IS_FIRST_LAUNCH, isFirstTime);
        mEditor.commit();
    }

    public boolean isFirstLaunch() {
        return mPreferences.getBoolean(IS_FIRST_LAUNCH, true);
    }

}
