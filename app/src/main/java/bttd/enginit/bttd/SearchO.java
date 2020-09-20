package bttd.enginit.bttd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class SearchO extends Activity {
    private static final String TAG = "THÉP CHỬ I";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searcho_layout);

        ListView listView = findViewById(R.id.listView);
        ArrayList<RowDataO> rowDataList = new ArrayList<>();

        for (int i = 0; i <= dataCol1.length - 1; i++) {
            RowDataO temp = new RowDataO(dataCol1[i], dataCol2[i], dataCol3[i], dataCol4[i], dataCol5[i]);
            rowDataList.add(temp);
        }

        RowDataOAdapter adapter = new RowDataOAdapter(this, R.layout.adapter_searcho_layout, rowDataList);
        listView.setAdapter(adapter);
    }

    // Data
    private static Integer[] dataCol1 = {
            15,
            15,
            15,
            15,
            20,
            20,
            20,
            20,
            20,
            25,
            25,
            25,
            25,
            25,
            25,
            32,
            32,
            32,
            32,
            32,
            32,
            40,
            40,
            40,
            40,
            40,
            40
    };

    private static Double[] dataCol2 = {
            18.0,
            18.8,
            19.0,
            20.2,
            23.0,
            23.6,
            24.2,
            24.6,
            25.2,
            28.0,
            28.6,
            29.0,
            29.6,
            30.2,
            31.4,
            35.0,
            35.6,
            36.0,
            36.6,
            37.2,
            38.4,
            43.0,
            43.6,
            44.0,
            45.0,
            45.8,
            46.4
    };

    private static Double[] dataCol3 = {
            1.5,
            1.9,
            2.0,
            2.6,
            1.5,
            1.8,
            2.1,
            2.3,
            2.6,
            1.5,
            1.8,
            2.0,
            2.3,
            2.6,
            3.2,
            1.5,
            1.8,
            2.0,
            2.3,
            2.6,
            3.2,
            1.5,
            1.8,
            2.0,
            2.5,
            2.9,
            3.2
    };

    private static Double[] dataCol4 = {
            0.74,
            0.91,
            0.95,
            1.21,
            0.94,
            1.11,
            1.28,
            1.38,
            1.56,
            1.19,
            1.42,
            1.57,
            1.79,
            1.98,
            2.41,
            1.52,
            1.81,
            2.00,
            2.26,
            2.54,
            3.10,
            1.73,
            2.07,
            2.29,
            2.83,
            3.23,
            3.57
    };

    private static Double[] dataCol5 = {
            0.80,
            1.00,
            1.10,
            1.40,
            1.00,
            1.20,
            1.50,
            1.60,
            1.80,
            1.20,
            1.50,
            1.70,
            2.00,
            2.30,
            2.80,
            1.60,
            1.90,
            2.10,
            2.50,
            2.80,
            3.50,
            2.00,
            2.40,
            2.60,
            3.30,
            3.90,
            4.30
    };
}
