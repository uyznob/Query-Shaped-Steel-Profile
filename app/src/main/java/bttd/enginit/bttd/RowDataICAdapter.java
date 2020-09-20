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

class RowDataICAdapter extends ArrayAdapter<RowDataIC> {
    private static final String TAG = "Row Data I Adapter";
    private Context mContext;
    private int mResource;

    public RowDataICAdapter(@NonNull Context context, int resource, @NonNull List<RowDataIC> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the DataRow information
        String sohieu = getItem(position).getSohieu();
        Integer h = getItem(position).getH();
        Integer b = getItem(position).getB();
        Double d = getItem(position).getD();
        Double t = getItem(position).getT();
        Double klr = getItem(position).getKlr();
        Double dtmc = getItem(position).getDtmc();

        RowDataIC dataRow = new RowDataIC(sohieu, h, b, d, t, klr, dtmc);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView cell1 = convertView.findViewById(R.id.cell1);
        TextView cell2 = convertView.findViewById(R.id.cell2);
        TextView cell3 = convertView.findViewById(R.id.cell3);
        TextView cell4 = convertView.findViewById(R.id.cell4);
        TextView cell5 = convertView.findViewById(R.id.cell5);
        TextView cell6 = convertView.findViewById(R.id.cell6);
        TextView cell7 = convertView.findViewById(R.id.cell7);

        cell1.setText(sohieu);
        cell2.setText(h.toString());
        cell3.setText(b.toString());
        cell4.setText(d.toString());
        cell5.setText(t.toString());
        cell6.setText(klr.toString());
        cell7.setText(dtmc.toString());

        return convertView;
    }
}
