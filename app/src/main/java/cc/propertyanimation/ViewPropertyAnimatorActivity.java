package cc.propertyanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

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
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_property);
        ButterKnife.bind(this);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewPropertyAnimatorActivity.this,"toast",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.button)
    public void onViewClicked() {

        switch (count) {
            case 0:
                button.setText("ViewPropertyAnimator平移");
                image.animate().translationX(300).setDuration(1000);
                break;
            case 1:
                button.setText("ViewPropertyAnimator旋转");
                image.animate().rotation(180);
                break;
            case 2:
                button.setText("ViewPropertyAnimator缩小");
                image.animate().scaleX(0.5f).scaleY(0.5f);
                break;
            case 3:
                button.setText("ViewPropertyAnimator透明度");
                image.animate().alpha(0.5f);
                break;
            default:

                break;
        }
        count++;
    }
}
