package nyc.c4q.dereksantos.in_class_assignment_11_14;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ColorPaletteAPI {

    @GET(" ")
    Call<ColorPojo> getColorPojo();
}
