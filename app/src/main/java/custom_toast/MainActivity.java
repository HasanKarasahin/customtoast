package custom_toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.example.hasan.custom_toast.R;

import static custom_toast.CustomToast.NEGATIVE;
import static custom_toast.CustomToast.POZITIVE;
import static custom_toast.CustomToast.ZERO;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void toastWithGravity() {
        CustomToast.show(MainActivity.this, Gravity.CENTER, 10, 10, "TEST1");
        CustomToast.show(MainActivity.this, Gravity.RIGHT, 20, 10, "TEST2");
        CustomToast.show(MainActivity.this, Gravity.LEFT, 30, 10, "TEST3");
        CustomToast.show(MainActivity.this, Gravity.CENTER_VERTICAL, 40, 10, "TEST4");
        CustomToast.show(MainActivity.this, Gravity.CENTER_HORIZONTAL, 50, 10, "TEST5");
        CustomToast.show(MainActivity.this, Gravity.START, 60, 10, "TEST6");
        CustomToast.show(MainActivity.this, Gravity.FILL_HORIZONTAL, 70, 10, "TEST7");
        CustomToast.show(MainActivity.this, Gravity.FILL_VERTICAL, 80, 10, "TEST8");
    }

    private void toastWithMargin() {
        CustomToast.show(MainActivity.this, NEGATIVE, POZITIVE, "TOP-LEFT");
        CustomToast.show(MainActivity.this, ZERO, POZITIVE, "TOP-CENTER");
        CustomToast.show(MainActivity.this, POZITIVE, POZITIVE, "TOP-RIGTH");

        CustomToast.show(MainActivity.this, NEGATIVE, ZERO, "CENTER-LEFT");
        CustomToast.show(MainActivity.this, ZERO, ZERO, "CENTER-CENTER");
        CustomToast.show(MainActivity.this, POZITIVE, ZERO, "CENTER-RIGTH");

        CustomToast.show(MainActivity.this, NEGATIVE, NEGATIVE, "BOTTOM-LEFT");
        CustomToast.show(MainActivity.this, ZERO, NEGATIVE, "BOTTOM-CENTER");
        CustomToast.show(MainActivity.this, POZITIVE, NEGATIVE, "BOTTOM-RIGTH");
    }

    public void btnGravity_Click(View view) {
        toastWithGravity();
    }

    public void btnMargin_Click(View view) {
        toastWithMargin();
    }

    public void btnWarning_Click(View view) {
        CustomToast.warning(MainActivity.this);
    }

    public void btnError_Click(View view) {
        CustomToast.error(MainActivity.this);
    }

    public void btnSuccessful_Click(View view) {
        CustomToast.successful(MainActivity.this);
    }
}
