package com.aravind.dieasedata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DieaseAdapter extends RecyclerView.Adapter<DieaseAdapter.DieaseViewHolder> {

    private List<DieaseDetail> dieaseDetailList;
    private Context context;

    DieaseAdapter(List<DieaseDetail> dieaseDetailList, Context context) {
        this.dieaseDetailList = dieaseDetailList;
        this.context = context;
    }

    @NonNull
    @Override
    public DieaseAdapter.DieaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.custom_recycler_diease_view, null);
        return new DieaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DieaseAdapter.DieaseViewHolder holder, int position) {
        DieaseDetail dieaseDetail = dieaseDetailList.get(position);
        holder.dieaseName.setText(dieaseDetail.getDisease_name());
        holder.stateName.setText(dieaseDetail.getState_name());
        holder.districtName.setText(dieaseDetail.getDistrict_name());
        holder.goats.setText(dieaseDetail.getGoat());
        holder.cattles.setText(dieaseDetail.getCattle());
        holder.buffalos.setText(dieaseDetail.getBuaffalo());
        holder.sheeps.setText(dieaseDetail.getSheep());
        holder.pigs.setText(dieaseDetail.getPig());
        holder.outcome.setText(dieaseDetail.getOutcome());
    }

    @Override
    public int getItemCount() {
        return dieaseDetailList.size();
    }

    public class DieaseViewHolder extends RecyclerView.ViewHolder {

        TextView dieaseName;
        TextView stateName;
        TextView districtName;
        TextView goats;
        TextView cattles;
        TextView buffalos;
        TextView sheeps;
        TextView pigs;
        TextView outcome;

        DieaseViewHolder(@NonNull View itemView) {
            super(itemView);
            dieaseName = itemView.findViewById(R.id.tv_diease_result);
            stateName = itemView.findViewById(R.id.tv_state_result);
            districtName = itemView.findViewById(R.id.tv_district_result);
            goats = itemView.findViewById(R.id.tv_goats_result);
            cattles = itemView.findViewById(R.id.tv_cattle_result);
            buffalos = itemView.findViewById(R.id.tv_buffalo_result);
            sheeps = itemView.findViewById(R.id.tv_sheeps_result);
            pigs = itemView.findViewById(R.id.tv_pigs_result);
            outcome = itemView.findViewById(R.id.tv_outcome_result);
        }
    }
}
