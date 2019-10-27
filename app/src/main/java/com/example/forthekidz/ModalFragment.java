package com.example.forthekidz;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ModalFragment extends DialogFragment {
    @BindView(R.id.close_modal_button)
    TextView closeModalButton;
    @BindView(R.id.step_forward_block)
    ImageView step_forward_block;





    public ModalFragment() {
        // Required empty public constructor
    }


    public static ModalFragment newInstance() {
        ModalFragment fragment = new ModalFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_modal, container, false);
        ButterKnife.bind(this, view);

        step_forward_block.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View view, DragEvent event) {
                // Defines a variable to store the action type for the incoming event
                int action = event.getAction();
                // Handles each of the expected events
                switch (action) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        return true;

                    case DragEvent.ACTION_DRAG_ENTERED:
                        // Applies a YELLOW or any color tint to the View, when the dragged view entered into drag acceptable view
                        // Return true; the return value is ignored.
                        view.getBackground().setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_IN);

                        view.invalidate();

                        return true;
                    case DragEvent.ACTION_DRAG_LOCATION:
                        // Ignore the event
                        return true;
                    case DragEvent.ACTION_DRAG_EXITED:
                        // Re-sets the color tint to blue, if you had set the BLUE color or any color in ACTION_DRAG_STARTED. Returns true; the return value is ignored.

                        //  view.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);

                        //If u had not provided any color in ACTION_DRAG_STARTED then clear color filter.
                        view.getBackground().clearColorFilter();
                        // Invalidate the view to force a redraw in the new tint
                        view.invalidate();

                        return true;
                    case DragEvent.ACTION_DROP:
                        // Gets the item containing the dragged data
                        ClipData.Item item = event.getClipData().getItemAt(0);

                        // Gets the text data from the item.
                        String dragData = item.getText().toString();

                        // Turns off any color tints
                        view.getBackground().clearColorFilter();

                        // Invalidates the view to force a redraw
                        view.invalidate();

                        View v = (View) event.getLocalState();
                        ViewGroup owner = (ViewGroup) v.getParent();
                        owner.removeView(v);//remove the dragged view
                        LinearLayout container = (LinearLayout) view;//caste the view into LinearLayout as our drag acceptable layout is LinearLayout
                        container.addView(v);//Add the dragged view
                        v.setVisibility(View.VISIBLE);//finally set Visibility to VISIBLE

                        // Returns true. DragEvent.getResult() will return true.
                        return true;

//                    case DragEvent.ACTION_DRAG_ENDED:
//                        // Turns off any color tinting
//                        view.getBackground().clearColorFilter();
//
//                        // Invalidates the view to force a redraw
//                        view.invalidate();
//
//
//                        // returns true; the value is ignored.
//                        return true;

                    // An unknown action type was received.
                    default:
                        Log.e("DragDrop Example", "Unknown action type received by OnDragListener.");
                        break;
                }
                return false;
            }
        });

        step_forward_block.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDrag(null, shadowBuilder, v, 0);
                dismiss();
                return true;
            }
        });
        return view;
    }


    @OnClick(R.id.close_modal_button)
    public void closeModal(View view) {
        dismiss();
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Override
    public void onStart() {
        super.onStart();

        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(800 ,900 );
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
    }



    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
