package nyc.c4q.dereksantos.in_class_assignment_11_14;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeScreenFragment extends Fragment {
    private static final String TAG = HomeScreenFragment.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private List<ColorPalette> data;
    private ColorListAdapter adapter;
    private TextView mHomeScreenTextView;
    private JSONObject jsonObject = new JSONObject("{\"display\":{\"text\":\"Man this is difficult\",\"color\":\"DarkSalmon\"},\"colorPalette\":[{\"name\":\"Crimson\",\"value\":\"DC143C\"},{\"name\":\"SpringGreen\",\"value\":\"00FF7F\"},{\"name\":\"Banana\",\"value\":\"E3CF57\"},{\"name\":\"DarkSalmon\",\"value\":\"E9967A\"}]}");
    private TextView mHomeScreenColorTextView;

    public HomeScreenFragment() throws JSONException {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_screen, container, false);

        mHomeScreenTextView = (TextView) rootView.findViewById(R.id.display_textview);
        mHomeScreenColorTextView = (TextView) rootView.findViewById(R.id.display_colorview);

        // Init RecyclerView
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.color_list);
        adapter = new ColorListAdapter(getContext());
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        try {
            String textToDisplay = jsonObject.getJSONObject("display").get("text").toString();
            String colorText = jsonObject.getJSONObject("display").get("color").toString();
            JSONArray jsonArray = jsonObject.getJSONArray("colorPalette");
            /*
            for (int i = 0; i < jsonArray.length(); i++) {
                ColorPalette colorPalette = jsonArray.getJSONObject(i);
                mDA
            }
            */
            mHomeScreenTextView.setText(textToDisplay);
            mHomeScreenColorTextView.setText(colorText);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return rootView;
    }

    /*
    private void loadJson() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://192.168.1.129:8080/") // try "http://10.0.2.2:8080" or "http://127.0.0.1:8080"
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ColorPaletteAPI colorPaletteAPI = retrofit.create(ColorPaletteAPI.class);

        Call<ColorPojo> call = colorPaletteAPI.getColorPojo();

        call.enqueue(new Callback<ColorPojo>() {
            @Override
            public void onResponse(Call<ColorPojo> call, Response<ColorPojo> response) {
                ColorPojo colorPojo = response.body();
                data = colorPojo.getColorPalette();
                adapter.setColorPalettes(data);

            }

            @Override
            public void onFailure(Call<ColorPojo> call, Throwable t) {
                Log.d("#########Error", t.getMessage());
            }
        });

    }
     */


}
