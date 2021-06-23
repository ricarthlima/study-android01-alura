package ricarth.alura.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dados estáticos para exemplo
        List<String> students = new ArrayList<String>(
                Arrays.asList("Alex", "Fran", "Jose"));

        ListView listViewStudents = findViewById(R.id.activity_main_list_students);

        listViewStudents.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students));

    }
}
