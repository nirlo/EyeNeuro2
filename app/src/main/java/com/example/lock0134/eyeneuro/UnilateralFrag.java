package com.example.lock0134.eyeneuro;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link UnilateralFrag.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link UnilateralFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UnilateralFrag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private List<NLevelItem> list;
    private View view;
    private Context context;
    private ListView listView;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public UnilateralFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UnilateralFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static UnilateralFrag newInstance(String param1, String param2) {
        UnilateralFrag fragment = new UnilateralFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_unilateral, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        context = getActivity();
        listView = (ListView) view.findViewById(R.id.uniAlgorithm);
        list = new ArrayList<NLevelItem>();
        final LayoutInflater inflater = LayoutInflater.from(context);
        for (int i = 0; i < 5; i++) {
/*
            final NLevelItem greatGrandParent = new NLevelItem(new String(getResources().getString(R.string.unilateral_b)), null, new NLevelView() {

                @Override
                public View getView(NLevelItem item) {
                    View view;
                    view = inflater.inflate(R.layout.list_item, null);
                    TextView tv = (TextView) view.findViewById(R.id.textView);
                    tv.setBackgroundColor(Color.GREEN);
                    String name = (String) ((SomeObject) item.getWrappedObject()).getName();
                    tv.setText(name);
                    return view;
                }
            });
            list.add(grandParent);
            int numChildren = rng.nextInt(4) + 1;
            for (int j = 0; j < numChildren; j++) {
                NLevelItem parent = new NLevelItem(new SomeObject("Parent " + j), grandParent, new NLevelView() {

                    @Override
                    public View getView(NLevelItem item) {
                        View view = inflater.inflate(R.layout.listitem, null);
                        TextView tv = (TextView) view.findViewById(R.id.textView);
                        tv.setBackgroundColor(Color.YELLOW);
                        String name = (String) ((SomeObject) item.getWrappedObject()).getName();
                        tv.setText(name);
                        return view;
                    }
                });

                list.add(parent);
                int grandChildren = rng.nextInt(5) + 1;
                for (int k = 0; k < grandChildren; k++) {
                    NLevelItem child = new NLevelItem(new SomeObject("child " + k), parent, new NLevelView() {

                        @Override
                        public View getView(NLevelItem item) {
                            View view = inflater.inflate(R.layout.listitem, null);
                            TextView tv = (TextView) view.findViewById(R.id.textView);
                            tv.setBackgroundColor(Color.GRAY);
                            String name = (String) ((SomeObject) item.getWrappedObject()).getName();
                            tv.setText(name);
                            return view;
                        }
                    });

                    list.add(child);
                }
            }
        */}
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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
