package ap.mobile.challengesatu;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private Button btPull;
  private HistoryAdapter historyAdapter;
  private RecyclerView rvHistory;
  private Handler handler;
  private Thread thread;
  private List<History> dataset;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    this.btPull = this.findViewById(R.id.btPull);
    this.btPull.setOnClickListener(this);

    this.dataset = new ArrayList<>();

    this.historyAdapter = new HistoryAdapter(this, dataset);
    this.rvHistory = this.findViewById(R.id.rvHistory);
    this.rvHistory.setLayoutManager(new LinearLayoutManager(this));
    this.rvHistory.setAdapter(this.historyAdapter);

    this.handler = new Handler(Looper.getMainLooper()) {
      @Override
      public void handleMessage(@NonNull Message msg) {
        super.handleMessage(msg);
      }
    };

  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.btPull) {
      // do something here...
      this.thread = new Thread(()->{

      });
    }
  }
}