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

public class SearchFrag extends Fragment implements View.OnClickListener {
    private static final String TAG = "TRA BẢNG";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.searchfrag_layout, container, false);
        Button tgdcButton = view.findViewById(R.id.tgdcButton);
        Button tgkdcButton = view.findViewById(R.id.tgkdcButton);
        Button iButton = view.findViewById(R.id.iButton);
        Button cButton = view.findViewById(R.id.cButton);
        Button oButton = view.findViewById(R.id.oButton);
        Button ohpButton = view.findViewById(R.id.ohpButton);
        Button hhpButton = view.findViewById(R.id.hhpButton);
        Button ovdButton = view.findViewById(R.id.ovdButton);
        Button hvdButton = view.findViewById(R.id.hvdButton);
        Button omkmnButton = view.findViewById(R.id.omkmnButton);
        Button hmkmnButton = view.findViewById(R.id.hmkmnButton);

        tgdcButton.setOnClickListener(this);
        tgkdcButton.setOnClickListener(this);
        iButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        oButton.setOnClickListener(this);
        ohpButton.setOnClickListener(this);
        hhpButton.setOnClickListener(this);
        ovdButton.setOnClickListener(this);
        hvdButton.setOnClickListener(this);
        omkmnButton.setOnClickListener(this);
        hmkmnButton.setOnClickListener(this);
        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tgdcButton:
                Intent tgdcScreenIntent = new Intent(v.getContext(), SearchTGDC.class);
                startActivity(tgdcScreenIntent);
                break;
            case R.id.tgkdcButton:
                Intent tgkdcScreenIntent = new Intent(v.getContext(), SearchTGKDC.class);
                startActivity(tgkdcScreenIntent);
                break;
            case R.id.iButton:
                Intent iScreenIntent = new Intent(v.getContext(), SearchI.class);
                startActivity(iScreenIntent);
                break;
            case R.id.cButton:
                Intent cScreenIntent = new Intent(v.getContext(), SearchC.class);
                startActivity(cScreenIntent);
                break;
            case R.id.oButton:
                Intent oScreenIntent = new Intent(v.getContext(), SearchO.class);
                startActivity(oScreenIntent);
                break;
            case R.id.ohpButton:
                Intent ohpScreenIntent = new Intent(v.getContext(), SearchOHP.class);
                startActivity(ohpScreenIntent);
                break;
            case R.id.hhpButton:
                Intent hhpScreenIntent = new Intent(v.getContext(), SearchHHP.class);
                startActivity(hhpScreenIntent);
                break;
            case R.id.ovdButton:
                Intent ovdScreenIntent = new Intent(v.getContext(), SearchOVD.class);
                startActivity(ovdScreenIntent);
                break;
            case R.id.hvdButton:
                Intent hvdScreenIntent = new Intent(v.getContext(), SearchHVD.class);
                startActivity(hvdScreenIntent);
                break;
            case R.id.omkmnButton:
                Intent omkmnScreenIntent = new Intent(v.getContext(), SearchOMKMN.class);
                startActivity(omkmnScreenIntent);
                break;
            case R.id.hmkmnButton:
                Intent hmkmnScreenIntent = new Intent(v.getContext(), SearchHMKMN.class);
                startActivity(hmkmnScreenIntent);
                break;
            default:
                break;
        }
    }

}
