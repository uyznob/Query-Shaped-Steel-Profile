package bttd.enginit.bttd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static bttd.enginit.bttd.Utils.area4;
import static bttd.enginit.bttd.Utils.ix4;
import static bttd.enginit.bttd.Utils.iy4;

public class Tube extends Activity {
    private String hText, wText, tText;
    private Double h, w, t, area, ix, iy;
    private EditText hEditText, wEditText, tEditText, areaEditText, ixEditText, iyEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout
        setContentView(R.layout.tube_layout);
        // Take the edit text objects
        hEditText = findViewById(R.id.hEditText);
        wEditText = findViewById(R.id.wEditText);
        tEditText = findViewById(R.id.tEditText);
        areaEditText = findViewById(R.id.areaEditText);
        ixEditText = findViewById(R.id.ixEditText);
        iyEditText = findViewById(R.id.iyEditText);
        // Set up button as in layout
        Button calcButton = findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Take value
                hText = hEditText.getText().toString();
                wText = wEditText.getText().toString();
                tText = tEditText.getText().toString();
                if ((hText.matches("") || wText.matches("") || tText.matches("")) ||
                        (Double.parseDouble(hText) <= 0 || Double.parseDouble(wText) <= 0 || Double.parseDouble(tText) <= 0)) {
                    Toast.makeText(Tube.this, "Hãy nhập lại", Toast.LENGTH_SHORT).show();
                    return;
                }
                h = Double.parseDouble(hText);
                w = Double.parseDouble(wText);
                t = Double.parseDouble(tText);
                // Calculate properties
                area = area4(h, w, t);
                areaEditText.setText(area.toString());
                ix = ix4(h, w, t);
                ixEditText.setText(ix.toString());
                iy = iy4(h, w, t);
                iyEditText.setText(iy.toString());
            }
        });
    }

    public void onBackButtonClick(View view) {
        // Passing a Context and the Activity that we want to open
        Intent mainScreenIntent = new Intent(this, MainActivity.class);
        //Start activity and don't expect a result to be sent back
        startActivity(mainScreenIntent);
    }
}
