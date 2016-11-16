package nyc.c4q.dereksantos.in_class_assignment_11_14;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ColorPaletteViewHolder extends RecyclerView.ViewHolder {
    private final TextView colorName;
    private final TextView colorValue;
    private final View mView;

    public ColorPaletteViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        colorName = (TextView) mView.findViewById(R.id.color_name);
        colorValue = (TextView) mView.findViewById(R.id.color_value);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.color_palette_holder, parent, false);
    }

    public void bind() {
    }

}
