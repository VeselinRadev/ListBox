package com.veselin.listbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setValuesTextView(249);
        setListView();
    }
    private void setListView(){
        String[] titles = new String[250];
        for(int i = 0; i < titles.length; i++){
            titles[i] = var1[i].substring(0, var1[i].indexOf("\n"));
        }
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.item_list_view, titles);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                setValuesTextView(i);
            }
        });
    }
    private void setValuesTextView(int index){
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        text1.setText(var2[index]);
        text2.setText(var1[index].substring(var1[index].indexOf("\n")));
    }
    private String[] var1 = {
            "title\ntext1",
            "title\ntext2",
            "title\ntext3",
            "title\ntext4",
            "title\ntext5",
            "title\ntext6",
            "title\ntext7",
            "title\ntext8",
            "title\ntext9",
            "title\ntext10",
            "title\ntext11",
            "title\ntext12",
            "title\ntext13",
            "title\ntext14",
            "title\ntext15",
            "title\ntext16",
            "title\ntext17",
            "title\ntext18",
            "title\ntext19",
            "title\ntext20",
            "title\ntext21",
            "title\ntext22",
            "title\ntext23",
            "title\ntext24",
            "title\ntext25",
            "title\ntext26",
            "title\ntext27",
            "title\ntext28",
            "title\ntext29",
            "title\ntext30",
            "title\ntext31",
            "title\ntext32",
            "title\ntext33",
            "title\ntext34",
            "title\ntext35",
            "title\ntext36",
            "title\ntext37",
            "title\ntext38",
            "title\ntext39",
            "title\ntext40",
            "title\ntext41",
            "title\ntext42",
            "title\ntext43",
            "title\ntext44",
            "title\ntext45",
            "title\ntext46",
            "title\ntext47",
            "title\ntext48",
            "title\ntext49",
            "title\ntext50",
            "title\ntext51",
            "title\ntext52",
            "title\ntext53",
            "title\ntext54",
            "title\ntext55",
            "title\ntext56",
            "title\ntext57",
            "title\ntext58",
            "title\ntext59",
            "title\ntext60",
            "title\ntext61",
            "title\ntext62",
            "title\ntext63",
            "title\ntext64",
            "title\ntext65",
            "title\ntext66",
            "title\ntext67",
            "title\ntext68",
            "title\ntext69",
            "title\ntext70",
            "title\ntext71",
            "title\ntext72",
            "title\ntext73",
            "title\ntext74",
            "title\ntext75",
            "title\ntext76",
            "title\ntext77",
            "title\ntext78",
            "title\ntext79",
            "title\ntext80",
            "title\ntext81",
            "title\ntext82",
            "title\ntext83",
            "title\ntext84",
            "title\ntext85",
            "title\ntext86",
            "title\ntext87",
            "title\ntext88",
            "title\ntext89",
            "title\ntext90",
            "title\ntext91",
            "title\ntext92",
            "title\ntext93",
            "title\ntext94",
            "title\ntext95",
            "title\ntext96",
            "title\ntext97",
            "title\ntext98",
            "title\ntext99",
            "title\ntext100",
            "title\ntext101",
            "title\ntext102",
            "title\ntext103",
            "title\ntext104",
            "title\ntext105",
            "title\ntext106",
            "title\ntext107",
            "title\ntext108",
            "title\ntext109",
            "title\ntext110",
            "title\ntext111",
            "title\ntext112",
            "title\ntext113",
            "title\ntext114",
            "title\ntext115",
            "title\ntext116",
            "title\ntext117",
            "title\ntext118",
            "title\ntext119",
            "title\ntext120",
            "title\ntext121",
            "title\ntext122",
            "title\ntext123",
            "title\ntext124",
            "title\ntext125",
            "title\ntext126",
            "title\ntext127",
            "title\ntext128",
            "title\ntext129",
            "title\ntext130",
            "title\ntext131",
            "title\ntext132",
            "title\ntext133",
            "title\ntext134",
            "title\ntext135",
            "title\ntext136",
            "title\ntext137",
            "title\ntext138",
            "title\ntext139",
            "title\ntext140",
            "title\ntext141",
            "title\ntext142",
            "title\ntext143",
            "title\ntext144",
            "title\ntext145",
            "title\ntext146",
            "title\ntext147",
            "title\ntext148",
            "title\ntext149",
            "title\ntext150",
            "title\ntext151",
            "title\ntext152",
            "title\ntext153",
            "title\ntext154",
            "title\ntext155",
            "title\ntext156",
            "title\ntext157",
            "title\ntext158",
            "title\ntext159",
            "title\ntext160",
            "title\ntext161",
            "title\ntext162",
            "title\ntext163",
            "title\ntext164",
            "title\ntext165",
            "title\ntext166",
            "title\ntext167",
            "title\ntext168",
            "title\ntext169",
            "title\ntext170",
            "title\ntext171",
            "title\ntext172",
            "title\ntext173",
            "title\ntext174",
            "title\ntext175",
            "title\ntext176",
            "title\ntext177",
            "title\ntext178",
            "title\ntext179",
            "title\ntext180",
            "title\ntext181",
            "title\ntext182",
            "title\ntext183",
            "title\ntext184",
            "title\ntext185",
            "title\ntext186",
            "title\ntext187",
            "title\ntext188",
            "title\ntext189",
            "title\ntext190",
            "title\ntext191",
            "title\ntext192",
            "title\ntext193",
            "title\ntext194",
            "title\ntext195",
            "title\ntext196",
            "title\ntext197",
            "title\ntext198",
            "title\ntext199",
            "title\ntext200",
            "title\ntext201",
            "title\ntext202",
            "title\ntext203",
            "title\ntext204",
            "title\ntext205",
            "title\ntext206",
            "title\ntext207",
            "title\ntext208",
            "title\ntext209",
            "title\ntext210",
            "title\ntext211",
            "title\ntext212",
            "title\ntext213",
            "title\ntext214",
            "title\ntext215",
            "title\ntext216",
            "title\ntext217",
            "title\ntext218",
            "title\ntext219",
            "title\ntext220",
            "title\ntext221",
            "title\ntext222",
            "title\ntext223",
            "title\ntext224",
            "title\ntext225",
            "title\ntext226",
            "title\ntext227",
            "title\ntext228",
            "title\ntext229",
            "title\ntext230",
            "title\ntext231",
            "title\ntext232",
            "title\ntext233",
            "title\ntext234",
            "title\ntext235",
            "title\ntext236",
            "title\ntext237",
            "title\ntext238",
            "title\ntext239",
            "title\ntext240",
            "title\ntext241",
            "title\ntext242",
            "title\ntext243",
            "title\ntext244",
            "title\ntext245",
            "title\ntext246",
            "title\ntext247",
            "title\ntext248",
            "title\ntext249",
            "title\ntext250",
    };
    String[] var2 = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse",
    };

}