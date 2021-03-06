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


public class SearchOHP extends Activity implements AdapterView.OnItemSelectedListener {
    // Thép ống tròn Hòa phát
    private static final String TAG = "THÉP ỐNG HÒA PHÁT";

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

        for (int i = temp2 -1; i <= temp3 - 2; i++) {
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
            9,
            17,
            26,
            36,
            48,
            60,
            72,
            84,
            96,
            107,
            119,
            133,
            147,
            160,
            173,
            186,
            199,
            212,
            225,
            238,
            251,
            263,
            276,
            290,
            303,
            317,
            331     //Tăng thêm 1
    };

    private final static String[] spinnerList = {
            "12.7",
            "13.8",
            "15.9",
            "19.1",
            "21.2",
            "22.0",
            "22.2",
            "25.0",
            "25.4",
            "26.7",
            "28.0",
            "31.8",
            "32.0",
            "33.5",
            "35.0",
            "38.1",
            "40.0",
            "42.2",
            "48.1",
            "50.3",
            "50.8",
            "59.9",
            "75.6",
            "88.3",
            "108.0",
            "113.5",
            "126.8"
    };

    private final static Integer[] socay = {
            100	,
            100	,
            100	,
            168	,
            168	,
            168	,
            168	,
            113	,
            113	,
            113	,
            113	,
            80	,
            80	,
            80	,
            80	,
            61	,
            61	,
            61	,
            52	,
            52	,
            52	,
            37	,
            27	,
            24	,
            16	,
            16	,
            16	,
    };

    private final static Double[] t = {
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            0.7,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            0.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            0.9,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            1.0,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            1.1,
            1.2,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            1.4,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            4.3,
            4.5,
            1.5,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            4.3,
            4.5,
            5.0,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            4.3,
            4.5,
            5.0,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            4.3,
            4.5,
            5.0,
            6.0,
            1.8,
            2.0,
            2.3,
            2.5,
            2.8,
            3.0,
            3.2,
            3.5,
            3.8,
            4.0,
            4.3,
            4.5,
            5.0,
            6.0
    };

    private final static Double[] klc = {
            1.24,
            1.41,
            1.57,
            1.73,
            1.89,
            2.04,
            2.34,
            2.49,
            1.36,
            1.54,
            1.72,
            1.89,
            2.07,
            2.24,
            2.57,
            2.73,
            1.57,
            1.79,
            2.00,
            2.20,
            2.41,
            2.61,
            3.00,
            3.20,
            3.76,
            1.91,
            2.17,
            2.42,
            2.68,
            2.93,
            3.18,
            3.67,
            3.91,
            4.61,
            5.06,
            2.12,
            2.41,
            2.70,
            2.99,
            3.27,
            3.55,
            4.10,
            4.37,
            5.17,
            5.68,
            6.43,
            6.92,
            2.21,
            2.51,
            2.81,
            3.11,
            3.40,
            3.69,
            4.27,
            4.55,
            5.38,
            5.92,
            6.70,
            7.21,
            2.23,
            2.53,
            2.84,
            3.14,
            3.43,
            3.73,
            4.31,
            4.59,
            5.43,
            5.98,
            6.77,
            7.29,
            2.52,
            2.86,
            3.21,
            3.55,
            3.89,
            4.23,
            4.89,
            5.22,
            6.18,
            6.81,
            7.73,
            8.32,
            2.56,
            2.91,
            3.26,
            3.61,
            3.96,
            4.30,
            4.97,
            5.30,
            6.29,
            6.92,
            7.86,
            8.47,
            3.06,
            3.43,
            3.80,
            4.16,
            4.52,
            5.23,
            5.58,
            6.62,
            7.29,
            8.29,
            8.93,
            3.22,
            3.61,
            4.00,
            4.38,
            4.76,
            5.51,
            5.88,
            6.98,
            7.69,
            8.75,
            9.43,
            10.44,
            4.12,
            4.56,
            5.00,
            5.43,
            6.30,
            6.73,
            7.99,
            8.82,
            10.04,
            10.84,
            12.02,
            12.78,
            13.54,
            14.66,
            4.14,
            4.59,
            5.03,
            5.47,
            6.34,
            6.77,
            8.04,
            8.88,
            10.11,
            10.91,
            12.10,
            12.87,
            13.64,
            14.76,
            4.81,
            5.27,
            5.74,
            6.65,
            7.10,
            8.44,
            9.32,
            10.62,
            11.47,
            12.72,
            13.54,
            14.35,
            15.54,
            5.03,
            5.52,
            6.00,
            6.96,
            7.44,
            8.84,
            9.77,
            11.13,
            12.02,
            13.34,
            14.21,
            15.06,
            16.31,
            5.49,
            6.02,
            6.55,
            7.60,
            8.12,
            9.67,
            10.68,
            12.18,
            13.17,
            14.63,
            15.58,
            16.53,
            17.92,
            6.33,
            6.89,
            8.00,
            8.55,
            10.17,
            11.25,
            12.83,
            13.87,
            15.41,
            16.42,
            17.42,
            18.90,
            20.35,
            6.69,
            7.28,
            8.45,
            9.03,
            10.76,
            11.90,
            13.58,
            14.69,
            16.32,
            17.40,
            18.47,
            20.04,
            21.59,
            7.65,
            8.33,
            9.67,
            10.34,
            12.33,
            13.64,
            15.59,
            16.87,
            18.77,
            20.02,
            21.26,
            23.10,
            24.91,
            8.01,
            8.72,
            10.13,
            10.83,
            12.92,
            14.29,
            16.34,
            17.68,
            19.68,
            21.00,
            22.30,
            24.24,
            26.15,
            8.09,
            8.81,
            10.23,
            10.94,
            13.05,
            14.44,
            16.51,
            17.87,
            19.89,
            21.22,
            22.54,
            24.50,
            26.43,
            12.12,
            12.96,
            15.47,
            17.13,
            19.60,
            21.23,
            23.66,
            25.26,
            26.85,
            29.21,
            31.54,
            33.09,
            16.45,
            19.66,
            21.78,
            24.95,
            27.04,
            30.16,
            32.23,
            34.28,
            37.34,
            40.37,
            42.38,
            45.37,
            47.34,
            19.27,
            23.04,
            25.54,
            29.27,
            31.74,
            35.42,
            37.87,
            40.30,
            43.92,
            47.51,
            49.90,
            53.45,
            55.80,
            61.63,
            28.29,
            31.37,
            35.97,
            39.03,
            43.59,
            46.61,
            49.62,
            54.12,
            58.59,
            61.56,
            65.98,
            68.92,
            76.20,
            29.75,
            33.00,
            37.84,
            41.06,
            45.86,
            49.05,
            52.23,
            59.97,
            61.68,
            64.81,
            69.48,
            72.58,
            80.27,
            95.44,
            33.29,
            36.93,
            42.37,
            45.98,
            51.37,
            54.96,
            58.52,
            63.86,
            69.16,
            72.68,
            77.94,
            81.43,
            90.11,
            107.25
    };
}
