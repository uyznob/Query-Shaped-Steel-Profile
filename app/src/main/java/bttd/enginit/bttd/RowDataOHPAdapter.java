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

class RowDataOHPAdapter extends ArrayAdapter<RowDataOHP> {
    private static final String TAG = "Row Data OHP Adapter";
    private Context mContext;
    private int mResource;

    public RowDataOHPAdapter(@NonNull Context context, int resource, @NonNull List<RowDataOHP> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the DataRow information
        String d = getItem(position).getD();
        Integer socay = getItem(position).getSocay();
        Double t = getItem(position).getT();
        Double klc = getItem(position).getKlc();

        RowDataOHP dataRow = new RowDataOHP(d,socay,t,klc);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView cell1 = convertView.findViewById(R.id.cell1);
        TextView cell2 = convertView.findViewById(R.id.cell2);
        TextView cell3 = convertView.findViewById(R.id.cell3);
        TextView cell4 = convertView.findViewById(R.id.cell4);


        cell1.setText(d);
        cell2.setText(socay.toString());
        cell3.setText(t.toString());
        cell4.setText(klc.toString());

        return convertView;
    }
}
