package karel.com.portfolio;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Karel on 17/09/2016.
 */
public class IntroViewPageAdapter extends PagerAdapter {

    private LayoutInflater layoutInflater;
    private int[] mLayouts;
    private Context mContext;

    public IntroViewPageAdapter(Context context, int[] layouts) {
        mLayouts = layouts;
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(mLayouts[position], container, false);
        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return mLayouts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }

}
