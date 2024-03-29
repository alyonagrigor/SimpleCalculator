package com.example.calculatorfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity implements ButtonFragment.OnFragmentSendDataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSendData(StringBuilder selectedItem) {
        JournalFragment fragment = (JournalFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_container_view);
        if (fragment != null)
            fragment.setSelectedItem(selectedItem);
    }
}