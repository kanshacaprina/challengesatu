package ap.mobile.challengesatu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter {

  private final Context context;
  private List<History> histories;

  public HistoryAdapter(Context context, List<History> histories) {
    this.context = context;
    this.histories = histories;
  }

  public class VH extends RecyclerView.ViewHolder {

    private ImageView slot2;
    private History history;

    public VH(@NonNull View itemView) {
      super(itemView);
      this.slot2 = itemView.findViewById(R.id.ivSlotHis2);
    }

    private void bind(History h) {
      this.slot2.setImageResource(HistoryAdapter.getDrawable(h.slot3));
      this.history = h;
    }
  }

  public static int getDrawable(int slot) {
    switch (slot) {
      case 1:
        return R.drawable.slot_1;
      case 2:
        return R.drawable.slot_2;
      case 3:
        return R.drawable.slot_3;
      case 4:
        return R.drawable.slot_4;
      case 5:
        return R.drawable.slot_5;
      case 6:
        return R.drawable.slot_6;
      case 7:
        return R.drawable.slot_7;
      case 8:
        return R.drawable.slot_8;
      case 9:
        return R.drawable.slot_9;
    }
    return R.drawable.slot_1;
  }


  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return null;
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }
}
