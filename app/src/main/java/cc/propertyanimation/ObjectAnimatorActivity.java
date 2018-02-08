package cc.propertyanimation;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ObjectAnimatorActivity extends AppCompatActivity {

    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.button)
    Button button;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        switch (count) {
            case 0:
                button.setText("透明度变化");
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(image,"alpha",1f,0f,1f);
                objectAnimator.setDuration(3000);
                objectAnimator.start();
                break;
            case 1:
                button.setText("平移");
                ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(image,"translationX",0,500,0);
                objectAnimator2.setDuration(5000);
                objectAnimator2.start();
                break;
        }
        count++;
    }
}
