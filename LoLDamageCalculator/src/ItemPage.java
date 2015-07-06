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


public class ItemPage extends ActionBarActivity {


    Item itemSelected;
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
                        itemSelected = ListOfItems.BF_SWORD;
                        
                        break;
                    case 1:
                        itemSelected = ListOfItems.BILGEWATER_CUTLASS;
                        break;
                    case 2:
                        itemSelected = ListOfItems.BLADE_OF_THE_RUINED_KING;
                        break;
                    case 3:
                        itemSelected = ListOfItems.DORANS_BLADE;
                        break;
                    case 4:
                        itemSelected = ListOfItems.ESSENCE_REAVER;
                        break;
                    case 5:
                        itemSelected = ListOfItems.FROZEN_MALLET;
                        break;
                    case 6:
                        itemSelected = ListOfItems.GUINSOOS_RAGEBLADE;
                        break;
                    case 7:
                        itemSelected = ListOfItems.HEXDRINKER;
                        break;
                    case 8:
                        itemSelected = ListOfItems.HEXTECH_GUNBLADE;
                        break;
                    case 9:
                        itemSelected = ListOfItems.INFINITY_EDGE;
                        break;
                    case 10:
                        itemSelected = ListOfItems.LAST_WHISPER;
                        break;
                    case 11:
                        itemSelected = ListOfItems.LONG_SWORD;
                        break;
                    case 12:
                        itemSelected = ListOfItems.MANAMUNE;
                        break;
                    case 13:
                        itemSelected = ListOfItems.MAW_OF_MALMORTIUS;
                        break;
                    case 14:
                        itemSelected = ListOfItems.MERCURIAL_SCIMITAR;
                        break;
                    case 15:
                        itemSelected = ListOfItems.MURAMANA;
                        break;
                    case 16:
                        itemSelected = ListOfItems.PHAGE;
                        break;
                    case 17:
                        itemSelected = ListOfItems.PICKAXE;
                        break;
                    case 18:
                        itemSelected = ListOfItems.RAVENOUS_HYDRA;
                        break;
                    case 19:
                        itemSelected = ListOfItems.SWORD_OF_THE_OCCULT;
                        break;
                    case 20:
                        itemSelected = ListOfItems.THE_BLACK_CLEAVER;
                        break;
                    case 21:
                        itemSelected = ListOfItems.THE_BLOODTHIRSTER;
                        break;
                    case 22:
                        itemSelected = ListOfItems.THE_BRUTALIZER;
                        break;
                    case 23:
                        itemSelected = ListOfItems.TIAMAT;
                        break;
                    case 24:
                        itemSelected = ListOfItems.TRINITY_FORCE;
                        break;
                    case 25:
                        itemSelected = ListOfItems.VAMPIRIC_SCEPTER;
                        break;
                    case 26:
                        itemSelected = ListOfItems.WARRIOR;
                        break;
                    case 27:
                        itemSelected = ListOfItems.YOUMUUS_GHOSTBLADE;
                        break;
                    case 28:
                        itemSelected = ListOfItems.ZEKES_HERALD;
                        break;
                    case 29:
                        itemSelected = ListOfItems.ZEPHYR;
                        break;
                        
                    //armor items
                    case 30:
                        itemSelected = ListOfItems.CLOTH_ARMOR;
                        break;
                    case 31:
                        itemSelected = ListOfItems.CHAIN_VEST;
                        break;
                    case 32:
                        itemSelected = ListOfItems.FROZEN_HEART;
                        break;
                    case 33:
                        itemSelected = ListOfItems.GLACIAL_SHROUD;
                        break;
                    case 34:
                        itemSelected = ListOfItems.GUARDIAN_ANGEL;
                        break;
                    case 35:
                        itemSelected = ListOfItems.ICEBORN_GAUNTLET;
                        break;
                    case 36:
                        itemSelected = ListOfItems.NINJA_TABI;
                        break;
                    case 37:
                        itemSelected = ListOfItems.RANDUINS_OMEN;
                        break;
                    case 38:
                        itemSelected = ListOfItems.SEEKERS_ARMGUARD;
                        break;
                    case 39:
                        itemSelected = ListOfItems.SUNFIRE_CAPE;
                        break;
                    case 40:
                        itemSelected = ListOfItems.THORNMAIL;
                        break;
                    case 41:
                        itemSelected = ListOfItems.WARDENS_MAIL;
                        break;
                    case 42:
                        itemSelected = ListOfItems.ZHONYAS_HOURGLASS;
                        break;
             
                        

                }
                Toast.makeText(ItemPage.this, itemSelected.name,
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
                R.drawable.bf_sword,
                R.drawable.bilgewater_cutlass,
                R.drawable.blade_of_the_ruined_king,
                R.drawable.essence_reaver,
                R.drawable.frozen_mallet,
                R.drawable.guinsoos_rageblade,
                R.drawable.hexdrinker,
                R.drawable.hextech_gunblade,
                R.drawable.infinity_edge,
                R.drawable.last_whisper,
                R.drawable.long_sword,
                R.drawable.manamune,
                R.drawable.maw_of_malmortius,
                R.drawable.mercurial_scimitar,
                R.drawable.muramana,
                R.drawable.phage,
                R.drawable.pickaxe,
                R.drawable.ravenous_hydra,
                R.drawable.sword_of_the_occult,
                R.drawable.the_black_cleaver,
                R.drawable.the_bloodthirster,
                R.drawable.the_brutalizer,
                R.drawable.tiamat,
                R.drawable.trinity_force,
                R.drawable.vampiric_scepter,
                R.drawable.warrior,
                R.drawable.youmuus_ghostblade,
                R.drawable.zekes_hearald,
                R.drawable.zephyr,
                //armor items
                R.drawable.cloth_armor,
                R.drawable.chain_vest,
                R.drawable.frozen_heart,
                R.drawable.glacial_shroud,
                R.drawable.guardian_angel,
                R.drawable.iceborn_gauntlet,
                R.drawable.ninja_tabi,
                R.drawable.raduins_omen,
                R.drawable.seekers_armguard,
                R.drawable.sunfire_cape,
                R.drawable.thornmail,
                R.drawable.wardens_mail,
                R.drawable.zhonyas_hourglass,
                
        };
    }
}