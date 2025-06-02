package kr.ac.kopo.actionbarandfragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyTabFragment extends Fragment {

    String tabName;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle data = getArguments();
        tabName = data.getString("tabName");
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout baseLayout = new LinearLayout(super.getActivity());
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        baseLayout.setLayoutParams(params);

        if(tabName.equals("Spring"))
            baseLayout.setBackgroundColor(Color.GREEN);
        if(tabName.equals("Summer"))
            baseLayout.setBackgroundColor(Color.RED);
        if(tabName.equals("Fall"))
            baseLayout.setBackgroundColor(Color.rgb(204,114,61));

        return baseLayout;
    }
}
