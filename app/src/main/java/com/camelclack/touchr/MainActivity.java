package com.camelclack.touchr;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private static final String KEY_NUM = "num";

  private long num = 0;

  // Create an anonymous implementation of OnClickListener
  private View.OnClickListener mClickListener = new View.OnClickListener() {
    public void onClick(View v) {
      num += 1;
      showNum();
    }
  };

  private void showNum() {
    TextView text = (TextView)findViewById(R.id.number);
    text.setText("" + num);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    TextView text = (TextView)findViewById(R.id.number);
    text.setOnClickListener(mClickListener);

    showNum();
  }

}
