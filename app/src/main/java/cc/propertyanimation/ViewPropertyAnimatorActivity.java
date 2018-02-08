package cc.propertyanimation;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lichengcai on 2018/2/7.
 */

public class ViewPropertyAnimatorActivity extends Activity {

    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_property);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        image.animate().translationX(300).setDuration(1000);
    }
}
