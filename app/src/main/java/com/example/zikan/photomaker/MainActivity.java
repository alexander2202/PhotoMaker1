package com.example.zikan.photomaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button button;
    ListView NewPhotos = (ListView)findViewById(R.id.NewPhotos);
    ArrayList PhNames = new ArrayList();
    //Заполнение массива именами файлов


    public final static String EXTRA_MESSAGE ="com.exmple.zikan.photomaker.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
                Intent intent = new Intent(this, PhotoActivity.class);
                startActivity(intent);
                String FileName;
                Intent intActTwo = getIntent();
                FileName = intActTwo.getStringExtra("FileName");
                PhNames.add(1,FileName);
                // используем адаптер данных
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, PhNames);
                NewPhotos.setAdapter(adapter);
                break;
            default:
                break;
        }

    }
      /*public void sendMessage(View view){
        // Создаем объект Intent для вызова новой Activity
        Intent intent = new Intent(this, PhotoActivity.class);
        // Получаем текстовое поле в текущей Activity
        Button butTwoAct = (Button) findViewById(R.id.button);
        // Получаем текст данного текстового поля
        String message = butTwoAct.getText().toString();
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
        intent.putExtra(EXTRA_MESSAGE, message);
        // запуск activity
        startActivity(intent);
    }*/
}