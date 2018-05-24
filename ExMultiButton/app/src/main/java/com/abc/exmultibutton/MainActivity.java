package com.abc.exmultibutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	// 宣告全域變數
	private TextView txtShow;
	private Button btnZero,btnOne,btnTwo,btnThree,btnFour;
	private Button btnFive,btnSix,btnSeven,btnEight,btnNine;
	private EditText editText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 取得資源類別檔中的介面元件
		//final EditText E_EditText = (EditText) findViewById(R.id.editText);
		editText = (EditText) findViewById(R.id.editText);
		txtShow = (TextView) findViewById(R.id.txtShow);
		btnZero = (Button) findViewById(R.id.btnZero);
		btnOne = (Button) findViewById(R.id.btnOne);
		btnTwo = (Button) findViewById(R.id.btnTwo);
		btnThree = (Button) findViewById(R.id.btnThree);
		btnFour = (Button) findViewById(R.id.btnFour);
		btnFive = (Button) findViewById(R.id.btnFive);
		btnSix = (Button) findViewById(R.id.btnSix);
		btnSeven = (Button) findViewById(R.id.btnSeven);
		btnEight = (Button) findViewById(R.id.btnEight);
		btnNine = (Button) findViewById(R.id.btnNine);

		// 設定 button 元件 Click 事件共用   myListner
		btnZero.setOnClickListener(myListner);
		btnOne.setOnClickListener(myListner);
		btnTwo.setOnClickListener(myListner);
		btnThree.setOnClickListener(myListner);
		btnFour.setOnClickListener(myListner);
		btnFive.setOnClickListener(myListner);
		btnSix.setOnClickListener(myListner);
		btnSeven.setOnClickListener(myListner);
		btnEight.setOnClickListener(myListner);
		btnNine.setOnClickListener(myListner);
	}

		// 定義  onClick() 方法
		private Button.OnClickListener myListner = new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				//String s= E_EditText.getText().toString();
				int sk = Integer.parseInt(editText.getText().toString());
				switch (v.getId()) {
					case R.id.btnZero: {
						//txtShow.setText(s + "0");
						//int km= (int) (1.61*miles);
						int st = (int) (sk + 0);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnOne: {
						//txtShow.setText(s + "1");
						int st = (int) (sk + 1);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnTwo: {
						//txtShow.setText(s + "2");
						int st = (int) (sk + 2);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnThree: {
						//txtShow.setText(s + "3");
						int st = (int) (sk + 3);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnFour: {
						//txtShow.setText(s + "4");
						int st = (int) (sk + 4);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnFive: {
						//txtShow.setText(s + "5");
						int st = (int) (sk + 5);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnSix: {
						//txtShow.setText(s + "6");
						int st = (int) (sk + 6);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnSeven: {
						//txtShow.setText(s + "7");
						int st = (int) (sk + 7);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnEight: {
						//txtShow.setText(s + "8");
						int st = (int) (sk + 8);
						editText.setText(String.valueOf(st));
						break;
					}
					case R.id.btnNine: {
						//txtShow.setText(s + "9");
						int st = (int) (sk + 9);
						editText.setText(String.valueOf(st));
						break;
					}
				}
			}
		};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
