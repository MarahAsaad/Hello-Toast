package com.example.hellotoast;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private int mConunt=0;
    private TextView mshowCount;
    @Override
    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowCount=findViewByld(R.id.textDisplayCount);
    }

    private TextView findViewByld(int textDisplayCount) {
        return null;
    }


    public void showToast(View view){
        Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT).show();
    }
    public void showCount(View view){
        mConunt++;
        if(mshowCount!=null){
            mshowCount.setText(Integer.toString(mConunt));
        }
    }
    public void resetZero(View view){
        mConunt=0;
        if(mshowCount!=null){
            mshowCount.setText(Integer.toString(mConunt));
        }
    }
}

