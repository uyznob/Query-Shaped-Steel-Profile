package bttd.enginit.bttd;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class SearchC extends Activity {
    private static final String TAG = "THÉP CHỬ C";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchic_layout);

        ImageView imageView = findViewById(R.id.imageView);
        Resources res = getResources(); /** from an Activity */
        imageView.setImageDrawable(res.getDrawable(R.drawable.cc));

        ListView listView = findViewById(R.id.listView);
        ArrayList<RowDataIC> rowDataList = new ArrayList<>();

        for (int i = 0; i <= dataCol1.length - 1; i++) {
            RowDataIC temp = new RowDataIC(dataCol1[i], dataCol2[i], dataCol3[i], dataCol4[i], dataCol5[i], dataCol6[i], dataCol7[i]);
            rowDataList.add(temp);
        }

        RowDataICAdapter adapter = new RowDataICAdapter(this, R.layout.adapter_searchic_layout, rowDataList);
        listView.setAdapter(adapter);
    }

    // Data
    private static String[] dataCol1 = {
            "5",
            "6.5",
            "8",
            "10",
            "12",
            "14",
            "14",
            "16",
            "16",
            "18a",
            "18",
            "20",
            "20a",
            "22",
            "22a",
            "24",
            "24a",
            "27",
            "30",
            "33",
            "36",
            "40"
    };

    private static Integer[] dataCol2 = {
            50,
            65,
            80,
            100,
            120,
            140,
            140,
            160,
            160,
            180,
            180,
            200,
            200,
            220,
            220,
            240,
            240,
            270,
            300,
            336,
            360,
            400
    };

    private static Integer[] dataCol3 = {
            32,
            36,
            40,
            46,
            52,
            58,
            60,
            64,
            68,
            70,
            74,
            76,
            80,
            82,
            87,
            90,
            95,
            95,
            100,
            105,
            110,
            115
    };

    private static Double[] dataCol4 = {
            4.4,
            4.4,
            4.5,
            4.5,
            4.8,
            4.9,
            4.9,
            5.0,
            5.0,
            5.1,
            5.1,
            5.2,
            5.2,
            5.4,
            5.4,
            5.6,
            5.6,
            6.0,
            6.5,
            7.0,
            7.5,
            8.0
    };

    private static Double[] dataCol5 = {
            7.0,
            7.2,
            7.4,
            7.6,
            7.8,
            8.1,
            8.7,
            8.4,
            9.0,
            8.7,
            9.3,
            9.0,
            9.7,
            9.5,
            10.2,
            10.0,
            10.7,
            10.5,
            11.0,
            11.7,
            12.6,
            13.5
    };

    private static Double[] dataCol6 = {
            4.84,
            5.90,
            7.05,
            8.59,
            10.40,
            12.30,
            13.30,
            14.20,
            15.30,
            16.30,
            17.40,
            18.40,
            19.80,
            21.00,
            22.60,
            24.00,
            25.80,
            27.70,
            31.80,
            36.50,
            41.90,
            48.30
    };

    private static Double[] dataCol7 = {
            6.16,
            7.51,
            8.98,
            10.90,
            11.30,
            15.60,
            17.00,
            18.10,
            19.50,
            20.70,
            22.20,
            23.40,
            25.20,
            26.70,
            28.80,
            30.60,
            32.90,
            35.20,
            40.50,
            46.50,
            53.40,
            61.50
    };

}
