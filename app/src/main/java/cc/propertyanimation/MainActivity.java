package cc.propertyanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.activity_main)
    ConstraintLayout activityMain;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;
    @BindView(R.id.button4)
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this, ViewPropertyAnimatorActivity.class));
    }

    @OnClick(R.id.button2)
    public void onViewClicked2() {
        startActivity(new Intent(MainActivity.this, ValueAnimatorActivity.class));
    }

    @OnClick(R.id.button3)
    public void objectAnimation() {
        startActivity(new Intent(MainActivity.this,ObjectAnimatorActivity.class));
    }

    @OnClick(R.id.button4)
    public void objectAnimation2() {
        startActivity(new Intent(MainActivity.this,CircleActivity.class));
    }
}
