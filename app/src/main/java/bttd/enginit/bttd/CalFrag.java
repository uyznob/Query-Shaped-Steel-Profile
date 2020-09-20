package bttd.enginit.bttd;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CalFrag extends Fragment implements View.OnClickListener {
    private static final String TAG = "TÍNH TOÁN";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.caltab_layout, container, false);

        Button recButton = view.findViewById(R.id.recButton);
        Button circButton = view.findViewById(R.id.circButton);
        Button pipeButton = view.findViewById(R.id.pipeButton);
        Button tubeButton = view.findViewById(R.id.tubeButton);
        Button ibeamButton = view.findViewById(R.id.ibeamButton);
        Button channelButton = view.findViewById(R.id.channelButton);
        Button doubleangleButton = view.findViewById(R.id.doubleangleButton);

        recButton.setOnClickListener(this);
        circButton.setOnClickListener(this);
        pipeButton.setOnClickListener(this);
        tubeButton.setOnClickListener(this);
        ibeamButton.setOnClickListener(this);
        channelButton.setOnClickListener(this);
        doubleangleButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.recButton:
                Intent rectangleScreenIntent = new Intent(v.getContext(), Rectangle.class);
                startActivity(rectangleScreenIntent);
                break;
            case R.id.circButton:
                Intent circleScreenIntent = new Intent(v.getContext(), Circle.class);
                startActivity(circleScreenIntent);
                break;
            case R.id.pipeButton:
                Intent pipeScreenIntent = new Intent(v.getContext(), Pipe.class);
                startActivity(pipeScreenIntent);
                break;
            case R.id.tubeButton:
                Intent tubeScreenIntent = new Intent(v.getContext(), Tube.class);
                startActivity(tubeScreenIntent);
                break;
            case R.id.ibeamButton:
                Intent ibeamScreenIntent = new Intent(v.getContext(), Ibeam.class);
                startActivity(ibeamScreenIntent);
                break;
            case R.id.channelButton:
                Intent channelScreenIntent = new Intent(v.getContext(), Channel.class);
                startActivity(channelScreenIntent);
                break;
            case R.id.doubleangleButton:
                Intent doubleangleScreenIntent = new Intent(v.getContext(), Doubleangle.class);
                startActivity(doubleangleScreenIntent);
                break;
            default:
                break;
        }
    }

}
