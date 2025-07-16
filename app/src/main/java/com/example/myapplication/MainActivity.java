package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int numMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        numMessage = 10;
        Log.i("numMessage = ",""+numMessage);

        numMessage++;
        numMessage = numMessage+1;
        Log.i("numMessage = ",""+numMessage);

        Boolean isFriend = true;
        Log.i("isFriend",""+isFriend);

        String contact = "Chonlasit";
        String message = "This is my first APP";

        Toast.makeText(this, "Message from" + contact, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Message is" + message, Toast.LENGTH_SHORT).show();

        String command = "go east";
        switch (command){
            case "go east":
                Log.i("massage","Player go to east");
                break;
            case "go west":
                Log.i("massage","Player go to west");
                break;
            default:
                Log.i("massage","Default message");
                break;
        }
        Log.i("message:","In countUp method");
        int x = 0;
        while(true){
            x++;
            Log.i("x =",""+x);
            if(x==3){
                break;
            }
            Animal dogA = new Animal();
            Animal dogB = new Animal();
            Animal birdA = new Animal();

            Book book1 = new Book();

            dogA.type = "dog";
            dogA.hasWing = false;
            dogA.numberOfLeg = 4;
            dogA.move();

            birdA.type = "bird";
            birdA.hasWing = true;
            birdA.numberOfLeg = 2;

            dogB.type = "dog";
            dogB.hasWing = false;
            dogB.numberOfLeg = 4;
            dogB.move();

        }
        String mess = joinThese("Method","are","cool");
        Log.i("message=",mess);
        float area = getAreaCircle(5f);
        Log.i("area=",""+area);
        }
    String joinThese(String a, String b, String c){
        return a+b+c;
    }
    float getAreaCircle(float radius){
        return 3.14f*radius*radius;
    }
    }