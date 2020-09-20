package bttd.enginit.bttd;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

class RowDataAdapter extends ArrayAdapter<RowData> {
    private static final String TAG = "Row Data Adapter";
    private Context mContext;
    private int mResource;

    public RowDataAdapter(@NonNull Context context, int resource, @NonNull ArrayList<RowData> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the DataRow information
        String sohieu = getItem(position).getSohieu();
        Double klr = getItem(position).getKlr();
        Double dtmc = getItem(position).getDtmc();

        RowData dataRow = new RowData(sohieu, klr, dtmc);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView cell1 = convertView.findViewById(R.id.cell1);
        TextView cell2 = convertView.findViewById(R.id.cell2);
        TextView cell3 = convertView.findViewById(R.id.cell3);

        cell1.setText(sohieu);
        cell2.setText(klr.toString());
        cell3.setText(dtmc.toString());

        return convertView;
    }
}
