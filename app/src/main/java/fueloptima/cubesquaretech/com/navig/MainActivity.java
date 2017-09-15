package fueloptima.cubesquaretech.com.navig;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    // BottomSheetBehavior variable
    //private BottomSheetBehavior bottomSheetBehavior;

    private Button showBottomSheetDialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // initViews();
       // initListeners();

       // bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheetLayout));
        //bottomSheetHeading = (TextView) findViewById(R.id.bottomSheetHeading);
        //expandBottomSheetButton = (Button) findViewById(R.id.expand_bottom_sheet_button);
        //collapseBottomSheetButton = (Button) findViewById(R.id.collapse_bottom_sheet_button);
        //hideBottomSheetButton = (Button) findViewById(R.id.hide_bottom_sheet_button);
        showBottomSheetDialogButton = (Button) findViewById(R.id.show_bottom_sheet_dialog_button);

        showBottomSheetDialogButtonClick();
    }

    /**
     * method to initialize the views
     */
//    private void initViews() {
////        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
//
//        //bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheetLayout));
//        //bottomSheetHeading = (TextView) findViewById(R.id.bottomSheetHeading);
//        //expandBottomSheetButton = (Button) findViewById(R.id.expand_bottom_sheet_button);
//        //collapseBottomSheetButton = (Button) findViewById(R.id.collapse_bottom_sheet_button);
//        //hideBottomSheetButton = (Button) findViewById(R.id.hide_bottom_sheet_button);
//        showBottomSheetDialogButton = (Button) findViewById(R.id.show_bottom_sheet_dialog_button);


  //  }


    /**
     * method to initialize the listeners
     */
//    private void initListeners() {
//        // register the listener for button click
//        //expandBottomSheetButton.setOnClickListener(this);
//        //collapseBottomSheetButton.setOnClickListener(this);
//        //hideBottomSheetButton.setOnClickListener(this);
////        showBottomSheetDialogButton.setOnClickListener(this);

//        // Capturing the callbacks for bottom sheet
//        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
//            @Override
//            public void onStateChanged(View bottomSheet, int newState) {
//
////                if (newState == BottomSheetBehavior.STATE_EXPANDED) {
////                    bottomSheetHeading.setText(getString(R.string.text_collapse_me));
////                } else {
////                    bottomSheetHeading.setText(getString(R.string.text_expand_me));
////                }
//
//                // Check Logs to see how bottom sheets behaves
//                switch (newState) {
//                    case BottomSheetBehavior.STATE_COLLAPSED:
//                        Log.e("Bottom Sheet Behaviour", "STATE_COLLAPSED");
//                        break;
//                    case BottomSheetBehavior.STATE_DRAGGING:
//                        Log.e("Bottom Sheet Behaviour", "STATE_DRAGGING");
//                        break;
//                    case BottomSheetBehavior.STATE_EXPANDED:
//                        Log.e("Bottom Sheet Behaviour", "STATE_EXPANDED");
//                        break;
//                    case BottomSheetBehavior.STATE_HIDDEN:
//                        Log.e("Bottom Sheet Behaviour", "STATE_HIDDEN");
//                        break;
//                    case BottomSheetBehavior.STATE_SETTLING:
//                        Log.e("Bottom Sheet Behaviour", "STATE_SETTLING");
//                        break;
//                }
//            }
//
//
//            @Override
//            public void onSlide(View bottomSheet, float slideOffset) {
//
//            }
//        });
//
//
//    }

    /**
     * onClick Listener to capture button click
     *
     * @param
     */

   void showBottomSheetDialogButtonClick()
    {
        showBottomSheetDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CustomBottomSheetDialogFragmen().show(getSupportFragmentManager(), "Dialog");
            }
        });


    }
}

