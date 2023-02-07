package com.abedkhan.makeup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

    public class skincare extends AppCompatActivity {
        List<skin> skinList;
        RecyclerView recyclerView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_skincare);



            skinList=new ArrayList<>();

            skinList.add(new skin("SENSITIVE SKIN","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRM1hyGXmNO8C9QwQfb6KwRKNJeQ2AbbjWJdlHa4K4N9wb2tP4LM2J07vqX1MQou-d_Xr0&usqp=CAU","Yes, you can use both face wash and facial cleanser in your skincare routine, depending on your skin type. If you are someone who is exposed to air pollutants frequently, consider using a cleanser first and then use a face wash afterwards to remove particles from your skin.\n" +
                    "\n" + "Parabens are hormone disruptors and can lead to breast cancer.\n" + "\n" +"C. Phthalates\n" + "Phthalates are salts that are used in cleansers for easy spreading.\n" + "\n" + "Phthalates are associated with reproductive and developmental toxins. They are endocrine disruptors.\n" +
                    "\n" + "D. Mineral oil\n" + "Mineral oil can clog pores and lead to breakouts. On the other hand, natural plant oils will nourish the skin without clogging the pores.\n" +
                    "\n" + "E. Fragrance\n" + "Fragrance is loaded with chemicals and might trigger allergic reactions in the skin. If you love fragrance-induced products, go for the ones with essential oils or plant extracts.\n"
                    ,"You should continue the treatment until the condition resolves. If it persists for more than one to two weeks"));
            skinList.add(new skin("DRY SKIN","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStH_I1je7h7DKb1r-lj0hoVKIvvybGNUhktg&usqp=CAU","Quick Facts about face masks:\n" +
                    "\n" + "Today, you can buy cosmetic face masks that promise to moisturize your skin or clear blemishes. While ingredients vary based on the kind or brand, they usually contain a combination of creams, fragrances, and cleansers.\n" + "\n" +
                    "Small children may like the way a cosmetic face mask smells and may be tempted to put it in their mouth. Generally, face masks are only mildly toxic and will not harm your child. However, there is a risk of choking if they put a large amount of the thick cream or film in their mouth. Be sure to keep face masks and other cosmetic products out of the reach of children.\n" + "\n" +
                    "If you notice that your child has ingested some of a cosmetic face mask, it is important not to panic. Most children will react to the taste, and may cough or gag. Take the product away from the child and wipe their mouth out with a soft wet cloth. You may give them some water to drink to get the taste out of their mouth. Do not try to induce vomiting.\n" + "\n" +
                    "After you have removed your child from the situation, immediately call the Missouri Poison Center at 1-800-222-1222. Treatment recommendations are often determined by the amount ingested. The poison center is open all day, every day for poisoning emergencies and questions and our team of medical professionals will help to walk you through the next steps.","You should continue the treatment until the condition resolves. If it persists for more than one to two weeks"));
            skinList.add(new skin("OILY SKIN","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvCw_alp_grTFnkmyLJvcYpGs4ta-7HuOkCg&usqp=CAU","Treatment products are used to address specific skin concerns such as acne, dark spots, hyperpigmentation, fine lines and inflammation. “Skin treatment products are all regulated and have to be approved by the FDA. They can be in the forms of creams, gels, lotions, solutions, serums and medicated facial pads,” explains Dr. Tonkovic-Capin.\n" +
                    "\n" + "The type of treatment you need and the benefits it delivers to your skin largely depends on the concern you’re dealing with.  The most common active ingredients in treatments are retinoids like tretinoin and adapalene to address fine lines and wrinkles, topical steroids for skin allergies and inflammation and salicylic acid and benzoyl peroxide to treat acne. Vitamin C and growth factors are also found in anti-aging treatment formulas.\n" + "\n" +
                    "“As soon as you develop some skin condition, you should start treating it before it gets worse. You should continue the treatment until the condition resolves. If it persists for more than one to two weeks, you should consult your healthcare provider,” says Dr. Tonkovic-Capin.","You should continue the treatment until the condition resolves. If it persists for more than one to two weeks"));
            skinList.add(new skin("RED SPOTS","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrdof_prKoom4lpR-0vn8a0FQUi7g8rYZprw&usqp=CAU","“Serums usually contain antioxidants, which help fight free radical damage,” says Dr. Jaliman. “They can also contain anti-aging ingredients such as retinols and peptides, which stimulate collagen production.” Because they penetrate deep into the skin, these products are great for hydrating dry skin. They are best used after your cleanser, and they can be used underneath moisturizer to treat the skin while sleeping.","if you really skin hydrated, look for hyaluronic acid, suggests Jaliman"));
            skinList.add(new skin("SCALY SKIN","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjf9oXvTwneeWstGai_C-eCX_RkEkLRdTqZA&usqp=CAU","To help keep your skin looking younger, Lolis recommends using moisturizer from head to toe. “The face, neck and décolletage should get moisturizer twice daily as should elbows, knees and feet,” she says. There are many kinds of moisturizers available for different skin types, but if you really want to keep your skin hydrated, look for moisturizers that  glycerin acid,suggests Jaliman.\n" +
                    "\n","You really want to keep your glycerin or hyaluronic acid, suggests Jaliman"));
            skinList.add(new skin("COMBINATION SKIN","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxCCvbs-H8ZkJPQ3ePQezuLT3EhQd_BVbmGQ&usqp=CAU","Sunscreens are essential for protecting your skin from UV damage, no matter the season. Luckily, there are plenty of ways to apply sunscreen beyond just the typical bottle. “Everyone should be using a moisturizer with SPF even in winter,” says Lolis. “If you’re outside or live in warmer climates, it’s even more important to protect your face. The key is to know your skin type and use sunscreen that is a suitable fit. Some sunscreens are greasy and may clog pores. This is why it’s best to use a moisturizer formulated to address a particular skin issue that has sunscreen built in.”\n" +
                    "\n","If you’re outside or live in warmer climates, it’s even more important to protect your face."));
            skinList.add(new skin("COMBINATION SKIN","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaYz85YQht2AE1zkcAU9hKtjU-WeINcBNkksj9rgq3CTexfBT3toGHL0uay9c-Wmvm83k&usqp=CAU","Sunscreens are essential for protecting your skin from UV damage, no matter the season. Luckily, there are plenty of ways to apply sunscreen beyond just the typical bottle. “Everyone should be using a moisturizer with SPF even in winter,” says Lolis. “If you’re outside or live in warmer climates, it’s even more important to protect your face. The key is to know your skin type and use sunscreen that is a suitable fit. Some sunscreens are greasy and may clog pores. This is why it’s best to use a moisturizer formulated to address a particular skin issue that has sunscreen built in.”\n" +
                    "\n","If you’re outside or live in warmer climates, it’s even more important to protect your face."));



            recyclerView=findViewById(R.id.userRecycleview);

            skinadapter skinadapter=new skinadapter(skinList,skincare.this);
            recyclerView.setAdapter(skinadapter);












        }
    }
