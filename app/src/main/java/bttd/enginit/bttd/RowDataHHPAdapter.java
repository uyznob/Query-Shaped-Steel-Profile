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

class RowDataHHPAdapter extends ArrayAdapter<RowDataHHP> {
    private static final String TAG = "Row Data HHP Adapter";
    private Context mContext;
    private int mResource;

    public RowDataHHPAdapter(@NonNull Context context, int resource, @NonNull List<RowDataHHP> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the DataRow information
        String sohieu = getItem(position).getSohieu();
        Integer socay = getItem(position).getSocay();
        Double t = getItem(position).getT();
        Double klc = getItem(position).getKlc();

        RowDataHHP dataRow = new RowDataHHP(sohieu,socay,t,klc);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView cell1 = convertView.findViewById(R.id.cell1);
        TextView cell2 = convertView.findViewById(R.id.cell2);
        TextView cell3 = convertView.findViewById(R.id.cell3);
        TextView cell4 = convertView.findViewById(R.id.cell4);


        cell1.setText(sohieu);
        cell2.setText(socay.toString());
        cell3.setText(t.toString());
        cell4.setText(klc.toString());

        return convertView;
    }
}
