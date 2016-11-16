package nyc.c4q.dereksantos.in_class_assignment_11_14;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ColorListAdapter extends RecyclerView.Adapter implements View.OnClickListener {

    private final Context context;
    private List<ColorPalette> colors;

    public ColorListAdapter(Context context) {
        this.context = context;
        this.colors = new ArrayList<>();
    }

    void setColorPalettes(List<ColorPalette> colorPalettes) {
        this.colors = colorPalettes;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ColorPaletteViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ColorPaletteViewHolder viewHolder = (ColorPaletteViewHolder) holder;
        ColorPalette colorPojo = colors.get(position);
        viewHolder.bind();

    }

    @Override
    public int getItemCount() {
        return colors.size();
    }

    @Override
    public void onClick(View view) {

    }
}
