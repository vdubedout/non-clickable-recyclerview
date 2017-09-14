package eu.dubedout.tests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.activity_main_list_container) ViewGroup listContainerView;
    @BindView(R.id.activity_main_list) RecyclerView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        TestAdapter adapter = new TestAdapter();
        listView.setAdapter(adapter);
        listView.setLayoutManager(new LinearLayoutManager(this));
        adapter.initializeTestItems();


        listContainerView.setOnClickListener(view -> Toast.makeText(this, "container clicked", Toast.LENGTH_SHORT).show());
    }

}
