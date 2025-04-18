package com.manoj.task4.internal;

public class runner6 {
    public static void main(String[] args) {
        Carens carens=new Carens();
        carens.setOwner("Manoj");carens.setCartype("SUV");carens.setPrice(1200000);carens.setTorque(110);
        System.out.println(carens);
        Carens carens1=new Carens();
        carens1.setOwner("ASHISH");carens.setCartype("SUV");carens.setPrice(1200000);carens.setTorque(110);
        Carens carens2=new Carens();
        carens2.setOwner("Manoj");carens.setCartype("SUV");carens.setPrice(1200000);carens.setTorque(110);
        boolean last=carens.equals(carens1);
        System.out.println(last);
        boolean last1=carens.equals(carens2);
        System.out.println(last1);

        Corolla corolla=new Corolla();
        carens.setOwner("ashutosh");carens.setCartype("Sedan");carens.setPrice(1200000);carens.setTorque(150);
        System.out.println(carens);
        Corolla corolla1=new Corolla();
        corolla1.setOwner("Ashutosh");carens.setCartype("sedan");carens.setPrice(1200000);carens.setTorque(150);
        Corolla  corolla2=new Corolla();
        carens2.setOwner("Manoj");carens.setCartype("sedan");carens.setPrice(1200000);carens.setTorque(150);
        boolean result=carens.equals(corolla1);
        System.out.println(result);
        boolean result1=carens.equals(corolla2);
        System.out.println(result1);

        Camry camry=new Camry();
        carens.setOwner("ashutosh");carens.setCartype("Sedan");carens.setPrice(1200000);carens.setTorque(150);
        System.out.println(carens);
        Camry camry1=new Camry();
        corolla1.setOwner("Ashutosh");carens.setCartype("sedan");carens.setPrice(1200000);carens.setTorque(150);
        Camry  camry2=new Camry();
        carens2.setOwner("Manoj");carens.setCartype("sedan");carens.setPrice(1200000);carens.setTorque(150);
        boolean rest=camry.equals(camry1);
        System.out.println(rest);
        boolean rest1=camry.equals(camry2);
        System.out.println(rest1);

        A8 a8=new A8();
        a8.setOwner("Manoj");carens.setCartype("Sedan");carens.setPrice(1200000);carens.setTorque(110);
        System.out.println(carens);
        A8 a10=new A8();
        a10.setOwner("ASHISH");carens.setCartype("SUV");carens.setPrice(1200000);carens.setTorque(110);
        A8 a9=new A8();
        a9.setOwner("Manoj");carens.setCartype("SUV");carens.setPrice(1200000);carens.setTorque(110);
        boolean mast=carens.equals(a10);
        System.out.println(mast);
        boolean mast1=a8.equals(a9);
        System.out.println(mast1);


                Altroz altroz = new Altroz();
                altroz.setOwner("Manoj");
                altroz.setCartype("Hatchback");
                altroz.setPrice(800000);
                altroz.setTorque(90);
                System.out.println(altroz);

                Altroz altroz1 = new Altroz();
                altroz1.setOwner("Manoj");
                altroz1.setCartype("Hatchback");
                altroz1.setPrice(800000);
                altroz1.setTorque(90);

                Altroz altroz2 = new Altroz();
                altroz2.setOwner("Manoj");
                altroz2.setCartype("Hatchback");
                altroz2.setPrice(800000);
                altroz2.setTorque(90);

                boolean guest = altroz.equals(altroz1);
                System.out.println(guest);

                boolean guest1 = altroz.equals(altroz2);
                System.out.println(guest1);

        Amaze amaze = new Amaze();
        amaze.setOwner("Manoj");
        amaze.setCartype("Sedan");
        amaze.setPrice(900000);
        amaze.setTorque(100);
        System.out.println(amaze);

        Amaze amaze1 = new Amaze();
        amaze1.setOwner("Ashish");
        amaze1.setCartype("Sedan");
        amaze1.setPrice(900000);
        amaze1.setTorque(100);

        Amaze amaze2 = new Amaze();
        amaze2.setOwner("Manoj");
        amaze2.setCartype("Sedan");
        amaze2.setPrice(900000);
        amaze2.setTorque(100);

        boolean best = amaze.equals(amaze1);
        System.out.println(best);

        boolean best1 = amaze.equals(amaze2);
        System.out.println(best1);

        Baleno baleno = new Baleno();
        baleno.setOwner("Manoj");
        baleno.setCartype("Hatchback");
        baleno.setPrice(750000);
        baleno.setTorque(95);
        System.out.println(baleno);

        Baleno baleno1 = new Baleno();
        baleno1.setOwner("Manoj");
        baleno1.setCartype("Hatchback");
        baleno1.setPrice(750000);
        baleno1.setTorque(95);

        Baleno baleno2 = new Baleno();
        baleno2.setOwner("Manoj");
        baleno2.setCartype("Hatchback");
        baleno2.setPrice(750000);
        baleno2.setTorque(95);

        boolean vote  = baleno.equals(baleno1);
        System.out.println(vote);

        boolean vote1 = baleno.equals(baleno2);
        System.out.println(vote1);

        Bolero bolero = new Bolero();
        bolero.setOwner("Manoj");
        bolero.setCartype("SUV");
        bolero.setPrice(950000);
        bolero.setTorque(120);
        System.out.println(bolero);

        Bolero bolero1 = new Bolero();
        bolero1.setOwner("Manoj");
        bolero1.setCartype("SUV");
        bolero1.setPrice(950000);
        bolero1.setTorque(120);

        Bolero bolero2 = new Bolero();
        bolero2.setOwner("Manoj");
        bolero2.setCartype("SUV");
        bolero2.setPrice(950000);
        bolero2.setTorque(120);

        boolean crest = bolero.equals(bolero1);
        System.out.println(crest);

        boolean crest1 = bolero.equals(bolero2);
        System.out.println(crest1);

        Brezza brezza = new Brezza();
        brezza.setOwner("Manoj");
        brezza.setCartype("Compact SUV");
        brezza.setPrice(1000000);
        brezza.setTorque(115);
        System.out.println(brezza);

        Brezza brezza1 = new Brezza();
        brezza1.setOwner("Ashish");
        brezza1.setCartype("Compact SUV");
        brezza1.setPrice(1000000);
        brezza1.setTorque(115);

        Brezza brezza2 = new Brezza();
        brezza2.setOwner("Manoj");
        brezza2.setCartype("Compact SUV");
        brezza2.setPrice(1000000);
        brezza2.setTorque(115);

        boolean worst = brezza.equals(brezza1);
        System.out.println(worst);

        boolean worst1 = brezza.equals(brezza2);
        System.out.println(worst1);

        ChevroletCruze chevy = new ChevroletCruze();
        chevy.setOwner("Manoj");
        chevy.setCartype("Sedan");
        chevy.setPrice(1300000);
        chevy.setTorque(160);
        System.out.println(chevy);

        ChevroletCruze chevy1 = new ChevroletCruze();
        chevy1.setOwner("Ashish");
        chevy1.setCartype("Sedan");
        chevy1.setPrice(1300000);
        chevy1.setTorque(160);

        ChevroletCruze chevy2 = new ChevroletCruze();
        chevy2.setOwner("Manoj");
        chevy2.setCartype("Sedan");
        chevy2.setPrice(1300000);
        chevy2.setTorque(160);

        boolean man = chevy.equals(chevy1);
        System.out.println(man);

        boolean man1 = chevy.equals(chevy2);
        System.out.println(man1);

        City city = new City();
        city.setOwner("Manoj");
        city.setCartype("Sedan");
        city.setPrice(1150000);
        city.setTorque(145);
        System.out.println(city);

        City city1 = new City();
        city1.setOwner("Ashish");
        city1.setCartype("Sedan");
        city1.setPrice(1150000);
        city1.setTorque(145);

        City city2 = new City();
        city2.setOwner("Manoj");
        city2.setCartype("Sedan");
        city2.setPrice(1150000);
        city2.setTorque(145);

        boolean win = city.equals(city1);
        System.out.println(win);

        boolean win1 = city.equals(city2);
        System.out.println(win1);

        Creta creta = new Creta();
        creta.setOwner("Manoj");
        creta.setCartype("SUV");
        creta.setPrice(1400000);
        creta.setTorque(170);
        System.out.println(creta);

        Creta creta1 = new Creta();
        creta1.setOwner("Ashish");
        creta1.setCartype("SUV");
        creta1.setPrice(1400000);
        creta1.setTorque(170);

        Creta creta2 = new Creta();
        creta2.setOwner("Manoj");
        creta2.setCartype("SUV");
        creta2.setPrice(1400000);
        creta2.setTorque(170);

        boolean lose = creta.equals(creta1);
        System.out.println(last);

        boolean lose1 = creta.equals(creta2);
        System.out.println(lose1);

        DucatiPanigale ducati = new DucatiPanigale();
        ducati.setOwner("Manoj");
        ducati.setBiketype("Sportbike");
        ducati.setPrice(1800000);
        ducati.setTorque(150);
        System.out.println(ducati);

        DucatiPanigale ducati1 = new DucatiPanigale();
        ducati1.setOwner("Ashish");
        ducati1.setBiketype("Sportbike");
        ducati1.setPrice(1800000);
        ducati1.setTorque(150);

        DucatiPanigale ducati2 = new DucatiPanigale();
        ducati2.setOwner("Manoj");
        ducati2.setBiketype("Sportbike");
        ducati2.setPrice(1800000);
        ducati2.setTorque(150);

        boolean post = ducati.equals(ducati1);
        System.out.println(post);

        boolean post1 = ducati.equals(ducati2);
        System.out.println(post1);

        FordMustang mustang = new FordMustang();
        mustang.setOwner("Manoj");
        mustang.setCartype("Sports Car");
        mustang.setPrice(3500000);
        mustang.setTorque(400);
        System.out.println(mustang);

        FordMustang mustang1 = new FordMustang();
        mustang1.setOwner("Ashish");
        mustang1.setCartype("Sports Car");
        mustang1.setPrice(3500000);
        mustang1.setTorque(400);

        FordMustang mustang2 = new FordMustang();
        mustang2.setOwner("Manoj");
        mustang2.setCartype("Sports Car");
        mustang2.setPrice(3500000);
        mustang2.setTorque(400);

        boolean make = mustang.equals(mustang1);
        System.out.println(make);

        boolean make1 = mustang.equals(mustang2);
        System.out.println(make1);

        Fortuner fortuner = new Fortuner();
        fortuner.setOwner("Manoj");
        fortuner.setCartype("SUV");
        fortuner.setPrice(4000000);
        fortuner.setTorque(400);
        System.out.println(fortuner);

        Fortuner fortuner1 = new Fortuner();
        fortuner1.setOwner("Ashish");
        fortuner1.setCartype("SUV");
        fortuner1.setPrice(4000000);
        fortuner1.setTorque(400);

        Fortuner fortuner2 = new Fortuner();
        fortuner2.setOwner("Manoj");
        fortuner2.setCartype("SUV");
        fortuner2.setPrice(4000000);
        fortuner2.setTorque(400);

        boolean late = fortuner.equals(fortuner1);
        System.out.println(late);

        boolean late1 = fortuner.equals(fortuner2);
        System.out.println(late1);

        HarleyDavidson harley = new HarleyDavidson();
        harley.setOwner("Manoj");
        harley.setBiketype("Cruiser");
        harley.setPrice(2500000);
        harley.setTorque(120);
        System.out.println(harley);

        HarleyDavidson harley1 = new HarleyDavidson();
        harley1.setOwner("Ashish");
        harley1.setBiketype("Cruiser");
        harley1.setPrice(2500000);
        harley1.setTorque(120);

        HarleyDavidson harley2 = new HarleyDavidson();
        harley2.setOwner("Manoj");
        harley2.setBiketype("Cruiser");
        harley2.setPrice(2500000);
        harley2.setTorque(120);

        boolean rate = harley.equals(harley1);
        System.out.println(rate);

        boolean rate1 = harley.equals(harley2);
        System.out.println(rate1);

        Harrier harrier = new Harrier();
        harrier.setOwner("Manoj");
        harrier.setCartype("SUV");
        harrier.setPrice(3500000);
        harrier.setTorque(350);
        System.out.println(harrier);

        Harrier harrier1 = new Harrier();
        harrier1.setOwner("Ashish");
        harrier1.setCartype("SUV");
        harrier1.setPrice(3500000);
        harrier1.setTorque(350);

        Harrier harrier2 = new Harrier();
        harrier2.setOwner("Manoj");
        harrier2.setCartype("SUV");
        harrier2.setPrice(3500000);
        harrier2.setTorque(350);

        boolean kite = harrier.equals(harrier1);
        System.out.println(kite);

        boolean kite1 = harrier.equals(harrier2);
        System.out.println(kite1);

        HondaCivic civic = new HondaCivic();
        civic.setOwner("Manoj");
        civic.setCartype("Sedan");
        civic.setPrice(2200000);
        civic.setTorque(180);
        System.out.println(civic);

        HondaCivic civic1 = new HondaCivic();
        civic1.setOwner("Ashish");
        civic1.setCartype("Sedan");
        civic1.setPrice(2200000);
        civic1.setTorque(180);

        HondaCivic civic2 = new HondaCivic();
        civic2.setOwner("Manoj");
        civic2.setCartype("Sedan");
        civic2.setPrice(2200000);
        civic2.setTorque(180);

        boolean must = civic.equals(civic1);
        System.out.println(must);

        boolean must1 = civic.equals(civic2);
        System.out.println(must1);

        Innova innova = new Innova();
        innova.setOwner("Manoj");
        innova.setCartype("MPV");
        innova.setPrice(3000000);
        innova.setTorque(400);
        System.out.println(innova);

        Innova innova1 = new Innova();
        innova1.setOwner("Ashish");
        innova1.setCartype("MPV");
        innova1.setPrice(3000000);
        innova1.setTorque(400);

        Innova innova2 = new Innova();
        innova2.setOwner("Manoj");
        innova2.setCartype("MPV");
        innova2.setPrice(3000000);
        innova2.setTorque(400);

        boolean went = innova.equals(innova1);
        System.out.println(went);

        boolean went1 = innova.equals(innova2);
        System.out.println(went1);

        JeepCompass jeepCompass = new JeepCompass();
        jeepCompass.setOwner("Manoj");
        jeepCompass.setCartype("SUV");
        jeepCompass.setPrice(2500000);
        jeepCompass.setTorque(350);
        System.out.println(jeepCompass);

        JeepCompass jeepCompass1 = new JeepCompass();
        jeepCompass1.setOwner("Ashish");
        jeepCompass1.setCartype("SUV");
        jeepCompass1.setPrice(2500000);
        jeepCompass1.setTorque(350);

        JeepCompass jeepCompass2 = new JeepCompass();
        jeepCompass2.setOwner("Manoj");
        jeepCompass2.setCartype("SUV");
        jeepCompass2.setPrice(2500000);
        jeepCompass2.setTorque(350);

        boolean ant = jeepCompass.equals(jeepCompass1);
        System.out.println(ant);

        boolean ant1 = jeepCompass.equals(jeepCompass2);
        System.out.println(ant1);

        KawasakiNinja kawasakiNinja = new KawasakiNinja();
        kawasakiNinja.setOwner("Manoj");
        kawasakiNinja.setBiketype("Sport");
        kawasakiNinja.setPrice(1000000);
        kawasakiNinja.setTorque(150);
        System.out.println(kawasakiNinja);

        KawasakiNinja kawasakiNinja1 = new KawasakiNinja();
        kawasakiNinja1.setOwner("Ashish");
        kawasakiNinja1.setBiketype("Sport");
        kawasakiNinja1.setPrice(1000000);
        kawasakiNinja1.setTorque(150);

        KawasakiNinja kawasakiNinja2 = new KawasakiNinja();
        kawasakiNinja2.setOwner("Manoj");
        kawasakiNinja2.setBiketype("Sport");
        kawasakiNinja2.setPrice(1000000);
        kawasakiNinja2.setTorque(150);

        boolean white = kawasakiNinja.equals(kawasakiNinja1);
        System.out.println(white);

        boolean white1 = kawasakiNinja.equals(kawasakiNinja2);
        System.out.println(white1);
    }
    }








