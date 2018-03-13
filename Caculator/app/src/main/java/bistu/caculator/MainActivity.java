package bistu.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button key0Button = (Button) findViewById(R.id.key0);
        Button key1Button = (Button) findViewById(R.id.key1);
        Button key2Button = (Button) findViewById(R.id.key2);
        Button key3Button = (Button) findViewById(R.id.key3);
        Button key4Button = (Button) findViewById(R.id.key4);
        Button key5Button = (Button) findViewById(R.id.key5);
        Button key6Button = (Button) findViewById(R.id.key6);
        Button key7Button = (Button) findViewById(R.id.key7);
        Button key8Button = (Button) findViewById(R.id.key8);
        Button key9Button = (Button) findViewById(R.id.key9);
        Button dotButton = (Button) findViewById(R.id.keydot);


//显示结果
        EditText resultEdit = (EditText) findViewById(R.id.result);

//各个按钮
        Button plusButton = (Button) findViewById(R.id.keyadd);
        Button minusButton = (Button) findViewById(R.id.keysub);
        Button multiButton = (Button) findViewById(R.id.keymulti);
        Button divButton = (Button) findViewById(R.id.keydivide);
        Button equalButton = (Button) findViewById(R.id.keyequal);
        Button clearButton = (Button) findViewById(R.id.keyclear);

        plusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                int nOP = 1;
                nStatus=1;

                DisplayOP("+");
            }
        });












    }





}
