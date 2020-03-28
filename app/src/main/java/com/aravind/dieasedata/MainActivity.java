package com.aravind.dieasedata;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ProgressDialog progressDoalog;
    RecyclerView recyclerView;
    List<DieaseDetail> dieaseDetails;
    DieaseAdapter dieaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showProgress();

        ApiService requestInterface = RetrofitInstance.getRetrofitInstance().create(ApiService.class);
        Call<List<DieaseDetail>> call = requestInterface.getDieaseDetails();
        call.enqueue(new Callback<List<DieaseDetail>>() {
            @Override
            public void onResponse(Call<List<DieaseDetail>> call, Response<List<DieaseDetail>> response) {
                progressDoalog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<DieaseDetail>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed to fetch the data", Toast.LENGTH_SHORT).show();
            }

        });
    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateDataList(List<DieaseDetail> dieaseDetails) {
        recyclerView = findViewById(R.id.recyclerView);
        dieaseAdapter = new DieaseAdapter(dieaseDetails, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dieaseAdapter);
    }

    private void showProgress() {
        progressDoalog = new ProgressDialog(MainActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.setCancelable(false);
        progressDoalog.show();
    }
}