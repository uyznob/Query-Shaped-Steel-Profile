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


public class SearchOMKMN extends Activity implements AdapterView.OnItemSelectedListener {
    // Thép ống tròn Minh Ngọc
    private static final String TAG = "THÉP ỐNG MẠ KẼM MINH NGỌC";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchohp_layout);

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
            10,
            19,
            28,
            37,
            45,
            54,
            64,
            74,
            83,
            92,
            101,
            109,
            116,

            //Tăng thêm 1
    };

    private final static String[] spinnerList = {
            "15.9",
            "19.1",
            "21.2",
            "25.4",
            "26.65",
            "31.8",
            "33.5",
            "42.2",
            "48.1",
            "59.9",
            "75.6",
            "88.3",
            "113.5",
    };

    private final static Integer[] socay = {
            100,
            168,
            70,
            70,
            70,
            70,
            70,
            61,
            37,
            19,
            19,
            19,
            16,
    };

    private final static Double[] t = {
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
            1.8,
            2.0,
            2.2,
            2.3,
            2.4,
            2.5,
    };

    private final static Double[] klc = {
            3.45,
            3.77,
            4.08,
            4.70,
            5.00,
            2.41,
            2.63,
            2.84,
            3.25,
            3.45,
            2.79,
            3.04,
            3.29,
            3.75,
            4.01,
            3.54,
            3.87,
            4.20,
            4.83,
            5.14,
            6.05,
            6.63,
            5.43,
            5.94,
            6.46,
            7.47,
            7.97,
            9.44,
            10.40,
            11.34,
            4.48,
            4.91,
            5.33,
            6.15,
            6.56,
            7.75,
            8.52,
            9.27,
            9.64,
            10.00,
            10.36,
            6.84,
            7.50,
            8.15,
            9.45,
            10.09,
            11.98,
            13.23,
            14.45,
            15.05,
            15.65,
            16.25,
            5.43,
            5.94,
            6.46,
            7.47,
            7.97,
            9.44,
            10.40,
            11.34,
            11.80,
            12.26,
            12.72,
            8.25,
            9.05,
            9.85,
            11.43,
            12.21,
            14.53,
            16.05,
            17.56,
            18.30,
            19.05,
            19.78,
            7.31,
            8.02,
            8.72,
            10.11,
            10.80,
            12.83,
            14.17,
            15.48,
            16.14,
            16.78,
            17.43,
            12.16,
            13.24,
            15.38,
            16.45,
            19.61,
            21.70,
            23.77,
            24.80,
            25.83,
            26.85,
            10.09,
            10.98,
            12.74,
            13.62,
            16.22,
            17.94,
            19.63,
            20.47,
            21.31,
            22.14,
            19.34,
            20.69,
            24.70,
            27.36,
            29.99,
            31.30,
            32.61,
            33.91,
            12.16,
            13.24,
            15.38,
            16.45,
            19.61,
            21.70,
            23.77,
            24.80,
            25.83,
            26.85,
            29.79,
            33.01,
            36.21,
            37.80,
            39.39,
            40.98,
            24.70,
            27.36,
            29.99,
            31.30,
            32.61,
            33.91,
            29.79,
            33.01,
            36.21,
            37.80,
            39.39,
            40.98,
    };
}
