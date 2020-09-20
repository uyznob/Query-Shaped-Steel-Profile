package bttd.enginit.bttd;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class SearchOVD extends Activity implements AdapterView.OnItemSelectedListener {
    // Thép ống tròn Việt Đức
    private static final String TAG = "THÉP ỐNG VIỆT ĐỨC";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchovd_layout);

        Spinner spinner = findViewById(R.id.spinner);
        // Application of the Array to the Spinner
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, spinnerList);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinner.setAdapter(spinnerArrayAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

        ListView listView = findViewById(R.id.listView);
        ArrayList<RowDataOHP> rowDataList = new ArrayList<>();

        Integer temp1 = parent.getSelectedItemPosition();
        Integer temp2 = spinnerListRowid[temp1];
        Integer temp3 = spinnerListRowid[temp1 + 1];

        for (int i = temp2 - 1; i <= temp3 - 2; i++) {
            RowDataOHP temp = new RowDataOHP(spinnerList[temp1], socay[temp1], t[i], klc[i]);
            rowDataList.add(temp);
        }

        RowDataOHPAdapter adapter = new RowDataOHPAdapter(this, R.layout.adapter_searchohp_layout, rowDataList);
        listView.setAdapter(adapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    // Data
    private final static Integer[] spinnerListRowid = {
            1,
            7,
            13,
            19,
            25,
            31,
            36,
            41,
            47,
            52    //Tăng thêm 1
    };

    private final static String[] spinnerList = {
            "21.2",
            "26.7",
            "33.5",
            "42.2",
            "48.1",
            "59.9",
            "75.6",
            "88.3",
            "113.5",
    };

    private final static Integer[] socay = {
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
    };

    private final static Double[] t = {
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
    };

    private final static Double[] klc = {
            2.99,
            3.20,
            3.55,
            4.10,
            4.37,
            5.17,
            3.80,
            4.16,
            4.52,
            5.23,
            5.58,
            6.62,
            4.81,
            5.27,
            5.74,
            6.65,
            7.10,
            8.44,
            6.10,
            6.69,
            7.28,
            8.45,
            9.03,
            10.76,
            6.97,
            7.65,
            8.33,
            9.67,
            10.34,
            12.33,
            9.57,
            10.42,
            12.12,
            12.96,
            15.47,
            15.37,
            16.45,
            19.66,
            21.78,
            23.89,
            18.00,
            19.27,
            23.04,
            25.54,
            28.03,
            29.27,
            29.75,
            33.00,
            36.23,
            37.84,
            39.45,
    };
}
