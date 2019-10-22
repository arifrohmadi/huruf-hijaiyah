package com.blogspot.arifrohmadi.hurufhijaiyah.model;

import com.blogspot.arifrohmadi.hurufhijaiyah.R;

import java.util.ArrayList;

public class HurufData {
    private static String[] hurufNames = {
            "Hamzah",
            "Ba'",
            "Ta'",
            "Tsa'",
            "Jim",
            "_Ha",
            "Kha",
            "Dal",
            "Dzal",
            "Ra'",
            "Zai",
            "Sin",
            "Syin",
            "Shad",
            "Dhad",
            "Tha'",
            "Zha'",
            "'Ain",
            "Ghain",
            "Fa'",
            "Qaf",
            "Kaf",
            "Lam",
            "Mim",
            "Nun",
            "Wau",
            "Ha'",
            "Ya'"
    };

    private static String[] hurufMakhraj = {
            "Makhraj Huruf: tenggorokan bagian bawah",
            "Makhraj Huruf: pertemuan dua bibir",
            "Makhraj Huruf: ujung lidah bertemu dengan pangkal gigi seri atas",
            "Makhraj Huruf: ujung lidah bertemu dengan ujung gigi seri atas",
            "Makhraj Huruf: tengah lidah",
            "Makhraj Huruf: tenggorokan bagian tengah",
            "Makhraj Huruf: tenggorokan bagian atas",
            "Makhraj Huruf: ujung lidah bertemu dengan pangkal gigi seri atas",
            "Makhraj Huruf: ujung lidah bertemu dengan ujung gigi seri atas",
            "Makhraj Huruf: punggung lidah bertemu dengan ujung langit-langit",
            "Makhraj Huruf: ujung lidah bertemu dengan pertemuan gigi seri atas dan bawah",
            "Makhraj Huruf: ujung lidah bertemu dengan pertemuan gigi seri atas dan bawah",
            "Makhraj Huruf: tengah lidah",
            "Makhraj Huruf: ujung lidah bertemu dengan pertemuan gigi seri atas dan bawah",
            "Makhraj Huruf: tepi lidah bertemu gigi geraham atas",
            "Makhraj Huruf: ujung lidah bertemu dengan pangkal gigi seri atas",
            "Makhraj Huruf: ujung lidah bertemu dengan ujung gigi seri atas",
            "Makhraj Huruf: tenggorokan bagian tengah",
            "Makhraj Huruf: tenggorokan bagian atas",
            "Makhraj Huruf: perut bibir bawah bertemu dengan ujung gigi seri atas",
            "Makhraj Huruf: pangkal lidah bertemu dengan langit-langit lunak",
            "Makhraj Huruf: pangkal lidah bertemu dengan batas langit-langit lunak dan langit-langit keras",
            "Makhraj Huruf: tepi lidah bagian bawah sampai ujung lidah bertemu dengan ujung langit-langit",
            "Makhraj Huruf: pertemuan dua bibir",
            "Makhraj Huruf: ujung lidah bertemu dengan ujung langit-langit",
            "Makhraj Huruf: melingkarkan kedua bibir",
            "Makhraj Huruf: tenggorokan bagian bawah",
            "Makhraj Huruf: tengah lidah"
    };

    private static String[] hurufSifat = {
            "Jahr, Syiddah, Istifal, Infitah, Ishmat",
            "Jahr, Syiddah, Istifal, Infitah, Idzlaq, Qolqolah",
            "Hams, Syiddah, Istifal, Infitah, Ishmat",
            "Hams, Rokhowah, Istifal, Infitah, Ishmat",
            "Jahr, Syiddah, Istifal, Infitah, Ishmat, Qolqolah",
            "Hams, Rokhowah, Istifal, Infitah, Ishmat",
            "Hams, Rokhowah, Isti'la', Infitah, Ishmat",
            "Jahr, Syiddah, Istifal, Infitah, Ishmat, Qolqolah",
            "Jahr, Rokhowah, Istifal, Infitah, Ishmat",
            "Jahr, Tawassuth, Istifal, Infitah, Idzlaq, Inhiraf, Takrir",
            "Jahr, Rokhowah, Istifal, Infitah, Ishmat, Shofir",
            "Hams, Rokhowah, Istifal, Infitah, Ishmat, Shofir",
            "Hams, Rokhowah, Istifal, Infitah, Ishmat, Tafasy-syi",
            "Hams, Rokhowah, Isti'la', Ithbaq, Ishmat, Shofir",
            "Jahr, Rokhowah, Isti'la', Ithbaq, Ishmat, Istitholah",
            "Jahr, Syiddah, Isti'la', Ithbaq, Ishmat, Qolqolah",
            "Jahr, Rokhowah, Isti'la', Ithbaq, Ishmat",
            "Jahr, Tawassuth, Istifal, Infitah, Ishmat",
            "Jahr, Rokhowah, Isti'la', Infitah, Ishmat",
            "Hams, Rokhowah, Istifal, Infitah, Idzlaq",
            "Jahr, Syiddah, Isti'la', Infitah, Ishmat, Qolqolah",
            "Hams, Syiddah, Istifal, Infitah, Ishmat",
            "Jahr, Tawassuth, Istifal, Infitah, Idzlaq, Inhiraf",
            "Jahr, Tawassuth, Istifal, Infitah, Idzlaq",
            "Jahr, Tawassuth, Istifal, Infitah, Idzlaq",
            "Jahr, Rokhowah, Istifal, Infitah, Ishmat, Lin",
            "Hams, Rokhowah, Istifal, Infitah, Ishmat",
            "Jahr, Rokhowah, Istifal, infitah, Ishmat, Lin"
    };

    private static int[] hurufImages = {
            R.drawable.hamzah,
            R.drawable.ba,
            R.drawable.ta,
            R.drawable.tsa,
            R.drawable.jim,
            R.drawable.ha,
            R.drawable.kha,
            R.drawable.dal,
            R.drawable.dzal,
            R.drawable.ra,
            R.drawable.zai,
            R.drawable.sin,
            R.drawable.syin,
            R.drawable.shad,
            R.drawable.dhad,
            R.drawable.tha,
            R.drawable.zha,
            R.drawable.ain,
            R.drawable.ghain,
            R.drawable.fa,
            R.drawable.qaf,
            R.drawable.kaf,
            R.drawable.lam,
            R.drawable.mim,
            R.drawable.nun,
            R.drawable.wau,
            R.drawable.hak,
            R.drawable.ya
    };

    private static int[] hurufImagesMakhraj = {
            R.drawable.mhamzah,
            R.drawable.mba,
            R.drawable.mta,
            R.drawable.mtsa,
            R.drawable.mjim,
            R.drawable.m_ha,
            R.drawable.mkha,
            R.drawable.mdal,
            R.drawable.mdzal,
            R.drawable.mra,
            R.drawable.mzai,
            R.drawable.msin,
            R.drawable.msyin,
            R.drawable.mshad,
            R.drawable.mdhad,
            R.drawable.mtha,
            R.drawable.mzha,
            R.drawable.main,
            R.drawable.mghain,
            R.drawable.mfa,
            R.drawable.mqaf,
            R.drawable.mkaf,
            R.drawable.mlam,
            R.drawable.mmim,
            R.drawable.mnun,
            R.drawable.mwau,
            R.drawable.mhak,
            R.drawable.mya
    };

    public static ArrayList<Huruf> getListData() {
        ArrayList<Huruf> list = new ArrayList<>();
        for (int position = 0; position < hurufNames.length; position++) {
            Huruf huruf = new Huruf();
            huruf.setName(hurufNames[position]);
            huruf.setDetail(hurufMakhraj[position]);
            huruf.setPhoto(hurufImages[position]);
            huruf.setSifat(hurufSifat[position]);
            huruf.setPhoto_makhraj(hurufImagesMakhraj[position]);
            list.add(huruf);
        }
        return list;
    }

}
