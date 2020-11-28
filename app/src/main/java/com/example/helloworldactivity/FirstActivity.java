package com.example.helloworldactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                // toast 例子
               // Toast.makeText(FirstActivity.this,"You clicked button 1",Toast.LENGTH_SHORT).show();

                // 销毁活动
               // finish();

                // 启动另外的活动

                /**
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                 */

                /**
                 * 隐式启动活动

                Intent implicateIntent = new Intent("com.example.ACTION_START");
                implicateIntent.addCategory("com.example.MY_CATEGORY");
                startActivity(implicateIntent);
                 */

                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(browserIntent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:

        }
        return true ;
    }
}