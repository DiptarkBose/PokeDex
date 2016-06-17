package com.first.pro.pokedex;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();
        str = intent.getStringExtra("pokemon");
        AddInfo();
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }

    public void AddInfo() {
        if (str.equalsIgnoreCase("arceus")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.arceus);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("It is described in mythology as the Pokémon that shaped the universe with its 1,000 arms.");

            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Normal");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("MultiType");
        } else if (str.equalsIgnoreCase("Rayquaza")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.rayquazamega);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("RAYQUAZA lived for hundreds of millions of years in the earth’s ozone layer, never descending to the ground. This POKéMON appears to feed on water and particles in the atmosphere.");

            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Dragon/Flying");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Delta Stream");
        } else if (str.equalsIgnoreCase("Mewtwo")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.mewtwomegay);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("MEWTWO is a POKéMON that was created by genetic manipulation. However, even though the scientific power of humans created this POKéMON’s body, they failed to endow MEWTWO with a compassionate heart.");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Psychic");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Insomnia");
        } else if (str.equalsIgnoreCase("Groudon")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.groudonprimal);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("GROUDON has long been described in mythology as the POKéMON that raised lands and expanded continents. This POKéMON took to sleep after a cataclysmic battle with KYOGRE.");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Ground/Fire");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Desolate Land");
        } else if (str.equalsIgnoreCase("Kyogre")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.kyogreprimal);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("KYOGRE is named in mythology as the POKéMON that expanded the sea by covering the land with torrential rains and towering tidal waves. It took to sleep after a cataclysmic battle with GROUDON.");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Water");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Primordial Sea");
        } else if (str.equalsIgnoreCase("Garchomp")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.garchompmega);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("It flies at speeds equal to a jet fighter plane. It never allows its prey to escape.");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Dragon/Ground");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Sand Force");
        } else if (str.equalsIgnoreCase("Kyurem")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.kyuremblack);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("It generates a powerful, freezing energy inside itself, but its body became frozen when the energy leaked out.");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Dragon/Ice");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("TeraVolt");
        } else if (str.equalsIgnoreCase("Metagross")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.metagrossmega);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("METAGROSS has four brains in total. Combined, the four brains can breeze through difficult calculations faster than a supercomputer. This POKéMON can float in the air by tucking in its four legs.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Steel/Psychic");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Tough Claws");
        } else if (str.equalsIgnoreCase("salamence")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.salamencemega);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("It becomes uncontrollable if it is enraged. It destroys everything with shredding claws and fire.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Dragon/Flying");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Aerilate");
        } else if (str.equalsIgnoreCase("Giratina")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.giratinaaltered);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("It was banished for its violence. It silently gazed upon the old world from the Distortion World.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Ghost/Dragon");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Pressure");
        } else if (str.equalsIgnoreCase("Lugia")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.lugia);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("LUGIA’s wings pack devastating power - a light fluttering of its wings can blow apart regular houses. As a result, this POKéMON chooses to live out of sight deep under the sea.");

            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Psychic/Flying");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Pressure");
        } else if (str.equalsIgnoreCase("hoopa")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.hoopa);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("Pokédex entries are not yet known.");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Psychic/Dark");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Magician");
        } else if (str.equalsIgnoreCase("swampert")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.swampert);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("SWAMPERT predicts storms by sensing subtle differences in the sounds of waves and tidal winds with its fins. If a storm is approaching, it piles up boulders to protect itself.");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Water/Ground");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Swift Swim");
        } else if (str.equalsIgnoreCase("charizard")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.charizardmegax);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("CHARIZARD flies around the sky in search of powerful opponents. It breathes fire of such great heat that it melts anything. However, it never turns its fiery breath on any opponent weaker than itself.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Fire/Dragon");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Tough Claws");
        } else if (str.equalsIgnoreCase("Sceptile")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.sceptilemega);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("The leaves growing on SCEPTILE’s body are very sharp edged. This POKéMON is very agile - it leaps all over the branches of trees and jumps on its foe from above or behind.");

            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Grass/Dragon");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Overgrow");
        } else if (str.equalsIgnoreCase("Lucario")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.lucario);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("It’s said that no foe can remain invisible to LUCARIO, since it can detect auras. Even foes it could not otherwise see.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Fightimg/Steel");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Adaptability");
        } else if (str.equalsIgnoreCase("darkrai")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.darkrai);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("Folklore has it that on moonless nights, this Pokémon will make people see horrific nightmares.");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Dark");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Bad Dreams");
        } else if (str.equalsIgnoreCase("scizor")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.scizor);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("SCIZOR has a body with the hardness of steel. It is not easily fazed by ordinary sorts of attacks. This POKéMON flaps its wings to regulate its body temperature.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Bug/Steel");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Technician");
        } else if (str.equalsIgnoreCase("Hydreigon")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.hydreigon);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("This brutal Pokémon travels the skies on its six wings. Anything that moves seems like a foe to it, triggering its attack.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Dark/Dragon");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Levitate");
        } else if (str.equalsIgnoreCase("samurott")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.samurott);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("One swing of the sword incorporated in its armor can fell an opponent. A simple glare from one of them quiets everybody.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Water");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Torrent");
        } else if (str.equalsIgnoreCase("Pikachu")) {
            ImageView img = new ImageView(this);
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.pikachu);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("This POKéMON has electricity-storing pouches on its cheeks. These appear to become electrically charged during the night while PIKACHU sleeps. It occasionally discharges electricity when it is dozy after waking up.\n");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("Electric");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("Static");
        } else {
            ImageView img = new ImageView((this));
            img = (ImageView) findViewById(R.id.imageView);
            Drawable pokemon = getResources().getDrawable(R.drawable.missingno);
            img.setImageDrawable(pokemon);

            TextView tv1 = (TextView) findViewById(R.id.info_textView);
            tv1.setText("????????");
            TextView tv2 = (TextView) findViewById(R.id.type_textView);
            tv2.setText("???");

            TextView tv3 = (TextView) findViewById(R.id.ability_textview);
            tv3.setText("???");
        }

    }

    public void GoBack(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }
}
