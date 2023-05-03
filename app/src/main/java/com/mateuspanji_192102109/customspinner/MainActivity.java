package com.mateuspanji_192102109.customspinner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.mateuspanji_192102109.customspinner.R;

import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = (Spinner)findViewById(R.id.spinner1);

        List<String> negaraList = new ArrayList<>();
        negaraList.add("Albania");
        negaraList.add("Belgia");
        negaraList.add("Hungary");
        negaraList.add("Iran");
        negaraList.add("Slovenia");

        com.mateuspanji_192102109.customspinner.NegaraAdapter na = new com.mateuspanji_192102109.customspinner.NegaraAdapter(getApplicationContext(), negaraList);
        spinner1.setAdapter(na);
    }
}