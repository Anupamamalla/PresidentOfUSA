package com.example.presidents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        List<President> presidentList = new ArrayList<>();
        presidentList.add(new President("Richard Nixon","Richard Milhous Nixon (January 9, 1913 – April 22, 1994) was an American politician who served as the 37th president of the United States from 1969 until his resignation in 1974.",R.drawable.richard));

        presidentList.add(new President("Gerald Ford","First president to ascend to the presidency without being elected to either the offices of the president or vice presiden",R.drawable.gerald));

        presidentList.add(new President("Jimmy Carter","First president who completed at least one full term in office and never made a nomination to the United States Supreme Court.",R.drawable.jimmy));

        presidentList.add(new President("Ronald Reagan","First president to be re-elected over the age of seventy, as he was 73 years old when he was re-elected in 1984.",R.drawable.ronald));

        presidentList.add(new President("George H. W. Bush","First president to have served as acting president (when Reagan was sedated for eight hours due to colon surgery",R.drawable.george));

        presidentList.add(new President("Bill Clinton","William Jefferson Clinton (born William Jefferson Blythe III; August 19, 1946) is an American politician who served as the 42nd president of the United States from 1993 to 2001. Prior to his presidency, he served as governor of Arkansas (1979-1981 and 1983-1992) and as attorney general of Arkansas (1977-1979). A member of the Democratic Party, Clinton was known as a New Democrat, and many of his policies reflected a centrist \"Third Way\" political philosophy. He is the husband of former Secretary of State and former U.S. Senator Hillary Clinton. Clinton is notable as one of only two U.S. presidents",R.drawable.bill));


        PresidentAdapter presidentAdapter = new PresidentAdapter(this,presidentList);

        recyclerView.setAdapter(presidentAdapter);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));




    }
}

