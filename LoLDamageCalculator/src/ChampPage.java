package com.example.steven.try5;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


public class ChampPage extends ActionBarActivity {


    Champion champSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ_page);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                switch(position) {
                    case 0:
                        champSelected = ListOfADCS.ASHE;
                        break;
                    case 1:
                        champSelected = ListOfADCS.CAITLYN;
                        break;
                    case 2:
                        champSelected = ListOfADCS.CORKI;
                        break;
                    case 3:
                        champSelected = ListOfADCS.DRAVEN;
                        break;
                    case 4:
                        champSelected = ListOfADCS.EZREAL;
                        break;
                    case 5:
                        champSelected = ListOfADCS.GRAVES;
                        break;
                    case 6:
                        champSelected = ListOfADCS.JINX;
                        break;
                    case 7:
                        champSelected = ListOfADCS.KALISTA;
                        break;
                    case 8:
                        champSelected = ListOfADCS.KOG_MAW;
                        break;
                    case 9:
                        champSelected = ListOfADCS.LUCIAN;
                        break;
                    case 10:
                        champSelected = ListOfADCS.MISS_FORTUNE;
                        break;
                    case 11:
                        champSelected = ListOfADCS.QUINN;
                        break;
                    case 12:
                        champSelected = ListOfADCS.SIVIR;
                        break;
                    case 13:
                        champSelected = ListOfADCS.TRISTANA;
                        break;
                    case 14:
                        champSelected = ListOfADCS.TWITCH;
                        break;
                    case 15:
                        champSelected = ListOfADCS.URGOT;
                        break;
                    case 16:
                        champSelected = ListOfADCS.VARUS;
                        break;
                    case 17:
                        champSelected = ListOfADCS.VAYNE;
                        break;

                }
                Toast.makeText(ChampPage.this, champSelected.name,
                Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_champ_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public class ImageAdapter extends BaseAdapter {
        private Context mContext;

        public ImageAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return mThumbIds.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {  // if it's not recycled, initialize some attributes
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
                imageView.setCropToPadding(true);
//                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setPadding(8, 8, 8, 8);
            } else {
                imageView = (ImageView) convertView;
        }


            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }
        private Integer[] mThumbIds = {
                R.drawable.ashe_square, R.drawable.caitlyn_square,
                R.drawable.corki_square, R.drawable.draven_square,
                R.drawable.ezreal_square, R.drawable.graves_square,
                R.drawable.jinx_square, R.drawable.kalista_square,
                R.drawable.kogmaw_square, R.drawable.lucian_square,
                R.drawable.missfortune_square, R.drawable.quinn_square,
                R.drawable.sivir_square, R.drawable.tristana_square,
                R.drawable.twitch_square, R.drawable.urgot_square,
                R.drawable.varus_square, R.drawable.vayne_square
        };
    }
}
