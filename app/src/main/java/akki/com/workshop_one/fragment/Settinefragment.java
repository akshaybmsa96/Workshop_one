package akki.com.workshop_one.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import akki.com.workshop_one.R;

/**
 * Created by Akki on 17-08-2017.
 */

public class Settinefragment extends Fragment {
private View parent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        parent= inflater.inflate(R.layout.fragment, container, false);
     Button button=(Button)parent.findViewById(R.id.button);

        return parent;
    }
}
