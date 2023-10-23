package cz.mendelu.pef.configuration;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SelectSectionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SectionDAOImplementation selectionDAOImplementation;
    private List<Section> sectionList = new ArrayList<>();
    private SelectSectionActivity.SectionAdapter sectionAdapter;
    public static int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_section);
        Section ei = new Section("B-SI-EI Ekonomická informatika", "Bakalárké štúdium");
        Section eia = new Section("B-SIA-EI Economics Informatics", "Bakalárké štúdium");
        Section fi = new Section("B-HPS-FI Financie", "Bakalárké štúdium");
        Section eiN = new Section("N-SI-EI Ekonomická informatika", "Naväzujúce štúdium");
        Section uad = new Section("N-HPS-UAD Účtovníctvo a dane", "Naväzujúce štúdium");
        sectionList.add(ei);
        sectionList.add(eia);
        sectionList.add(fi);
        sectionList.add(eiN);
        sectionList.add(uad);
        recyclerView = findViewById(R.id.recycler_view);
//        selectionDAOImplementation = new SectionDAOImplementation(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setList();
    }

    private void setList(){
//        sectionList.clear();
//        sectionList.addAll(selectionDAOImplementation.getAllSection());
        if (sectionAdapter == null){
            sectionAdapter = new SectionAdapter();
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(sectionAdapter);
        } else {
            sectionAdapter.notifyDataSetChanged();
        }
    }

    public void button_section(View view) {

    }

    public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.SectionViewHolder>{


        @NonNull
        @Override
        public SectionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
            View itemView = LayoutInflater.from(SelectSectionActivity.this).inflate(R.layout.row_selection_list, viewGroup, false);
            return new SectionViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull final SectionViewHolder sectionViewHolder, int position) {
            Section section = sectionList.get(position);
            sectionViewHolder.sectionName.setText(section.getName());
            sectionViewHolder.sectionType.setText(section.getType());
            section.getType();
            sectionViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int truePosition = sectionViewHolder.getAdapterPosition();
                    startActivity(SelectTermActivity.getIntent(SelectSectionActivity.this, sectionList.get(truePosition).getId()));
                }
            });
        }

        @Override
        public int getItemCount() {
            return sectionList.size();
        }

        public class SectionViewHolder extends RecyclerView.ViewHolder{

            public TextView sectionName;
            public TextView sectionType;

            public SectionViewHolder(@NonNull View itemView) {
                super(itemView);
                sectionName = itemView.findViewById(R.id.selection_name);
                sectionType = itemView.findViewById(R.id.selection_type);
            }
        }
    }
}
