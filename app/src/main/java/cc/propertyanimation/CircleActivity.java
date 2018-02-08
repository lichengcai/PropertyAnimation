package cc.propertyanimation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import customview.CircleView;

public class CircleActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.circleView)
    CircleView circleView;
    @BindView(R.id.activity_circle)
    ConstraintLayout activityCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void changeRadius() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(circleView,"angle",0,270,0);
        objectAnimator.setDuration(5000);
        objectAnimator.start();
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Log.d("tag","ValueAnimator: " + animation.getAnimatedValue());
            }
        });
    }
}
