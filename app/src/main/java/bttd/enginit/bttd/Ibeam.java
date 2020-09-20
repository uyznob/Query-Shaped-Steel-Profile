package bttd.enginit.bttd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static bttd.enginit.bttd.Utils.area5;
import static bttd.enginit.bttd.Utils.ix5;
import static bttd.enginit.bttd.Utils.iy5;


public class Ibeam extends Activity {
    private String hText, wText, twText, tfText;
    private Double h, w, tw, tf, area, ix, iy;
    private EditText hEditText, wEditText, twEditText, tfEditText, areaEditText, ixEditText, iyEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout
        setContentView(R.layout.ibeam_layout);
        // Take the edit text objects
        hEditText = findViewById(R.id.hEditText);
        wEditText = findViewById(R.id.wEditText);
        twEditText = findViewById(R.id.twEditText);
        tfEditText = findViewById(R.id.tfEditText);
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
                twText = twEditText.getText().toString();
                tfText = tfEditText.getText().toString();
                if ((hText.matches("") || wText.matches("") || twText.matches("") || tfText.matches("")) ||
                        (Double.parseDouble(hText) <= 0 || Double.parseDouble(wText) <= 0 || Double.parseDouble(twText) <= 0 || Double.parseDouble(tfText) <= 0)) {
                    Toast toast = Toast.makeText(Ibeam.this, "Hãy nhập lại", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                h = Double.parseDouble(hText);
                w = Double.parseDouble(wText);
                tw = Double.parseDouble(twText);
                tf = Double.parseDouble(tfText);
                // Calculate properties
                area = area5(h, w, tw, tf);
                areaEditText.setText(area.toString());
                ix = ix5(h, w, tw, tf);
                ixEditText.setText(ix.toString());
                iy = iy5(h, w, tw, tf);
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
