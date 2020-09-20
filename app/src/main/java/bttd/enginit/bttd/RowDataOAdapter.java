package bttd.enginit.bttd;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

class RowDataOAdapter extends ArrayAdapter<RowDataO> {
    private static final String TAG = "Row Data O Adapter";
    private Context mContext;
    private int mResource;

    public RowDataOAdapter(@NonNull Context context, int resource, @NonNull List<RowDataO> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the DataRow information
        Integer d = getItem(position).getD();
        Double D = getItem(position).getDD();
        Double t = getItem(position).getT();
        Double klr = getItem(position).getKlr();
        Double dtmc = getItem(position).getDtmc();

        RowDataO dataRow = new RowDataO(d, D, t, klr, dtmc);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView cell1 = convertView.findViewById(R.id.cell1);
        TextView cell2 = convertView.findViewById(R.id.cell2);
        TextView cell3 = convertView.findViewById(R.id.cell3);
        TextView cell4 = convertView.findViewById(R.id.cell4);
        TextView cell5 = convertView.findViewById(R.id.cell5);


        cell1.setText(d.toString());
        cell2.setText(D.toString());
        cell3.setText(t.toString());
        cell4.setText(klr.toString());
        cell5.setText(dtmc.toString());

        return convertView;
    }
}
