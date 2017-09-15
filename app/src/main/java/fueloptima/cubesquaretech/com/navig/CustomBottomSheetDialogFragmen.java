package fueloptima.cubesquaretech.com.navig;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by Anand on 11-09-2017.
 */

public class CustomBottomSheetDialogFragmen extends BottomSheetDialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_dialog_bottom_sheet, container, false);
        return v;
    }


}
