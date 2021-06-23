package ricarth.alura.com.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ricarth.alura.com.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Lista de Alunos");

        setContentView(R.layout.activity_main);

        List<String> students = new ArrayList<String>(
                Arrays.asList("Alex", "Fran", "Jose", "Ricarth"));

        ListView listViewStudents = findViewById(R.id.activity_main_list_students);

        listViewStudents.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students));

    }
}
