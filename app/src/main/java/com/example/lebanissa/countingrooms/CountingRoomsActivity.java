package com.example.lebanissa.countingrooms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CountingRoomsActivity extends AppCompatActivity {
    private CountingRoomsModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_rooms);
          this.model = new CountingRoomsModel();
    }

    public void setTextView(){
        View counterView = findViewById(R.id.Zero);
        TextView outputText = (TextView) counterView;
        outputText.setText(model.getCount());
    }
        public void north(View view)
        {
            this.model.getNorth();
            this.setTextView();

        }
        public void west (View view)
        {
            this.model.getWest();
            this.setTextView();
        }
        public void south (View view)
        {
            this.model.getSouth();
            this.setTextView();
        }
        public void east (View view)
        {
            this.model.getEast();
            this.setTextView();


        }






}
