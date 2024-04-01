package com.hustler.beatwish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleEventObserver;

import android.content.Intent;
import android.media.metrics.Event;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AttendeeEventJoin extends AppCompatActivity {

    ImageView joinImage;
    EditText eventCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendee_event_join);


        joinImage = findViewById(R.id.joinImage);
        eventCode = findViewById(R.id.eventCode);

        joinImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String eventCodeStr = eventCode.getText().toString();
                String eventCodeDB = "abc-123";

                if(eventCodeDB.equals(eventCodeStr)){
                    Intent i = new Intent(AttendeeEventJoin.this, RequestPage.class);
                    startActivity(i);
                }

            }
        });


    }
}