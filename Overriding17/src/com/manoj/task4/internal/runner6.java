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
        Kodiaq kodiaq1 = new Kodiaq();
        kodiaq1.setOwner("Manoj");
        kodiaq1.setCartype("SUV");
        kodiaq1.setPrice(3000000);
        kodiaq1.setTorque(150);
        System.out.println(kodiaq1);

        Kodiaq kodiaq2 = new Kodiaq();
        kodiaq2.setOwner("Ashish");
        kodiaq2.setCartype("SUV");
        kodiaq2.setPrice(3000000);
        kodiaq2.setTorque(150);
        System.out.println(kodiaq2);

        Kodiaq kodiaq3 = new Kodiaq();
        kodiaq3.setOwner("Manoj");
        kodiaq3.setCartype("SUV");
        kodiaq3.setPrice(3000000);
        kodiaq3.setTorque(150);
        System.out.println(kodiaq3);

        boolean isEqual1 = kodiaq1.equals(kodiaq2);
        System.out.println(isEqual1);

        boolean isEqual2 = kodiaq1.equals(kodiaq3);
        System.out.println(isEqual2);

        LamborghiniHuracan lambo1 = new LamborghiniHuracan();
        lambo1.setOwner("Manoj");
        lambo1.setCartype("Sports");
        lambo1.setPrice(35000000);
        lambo1.setTorque(600);
        System.out.println(lambo1);

        LamborghiniHuracan lambo2 = new LamborghiniHuracan();
        lambo2.setOwner("Ashish");
        lambo2.setCartype("Sports");
        lambo2.setPrice(35000000);
        lambo2.setTorque(600);
        System.out.println(lambo2);

        LamborghiniHuracan lambo3 = new LamborghiniHuracan();
        lambo3.setOwner("Manoj");
        lambo3.setCartype("Sports");
        lambo3.setPrice(35000000);
        lambo3.setTorque(600);
        System.out.println(lambo3);

        boolean isMatch1 = lambo1.equals(lambo2);
        System.out.println(isMatch1);

        boolean isMatch2 = lambo1.equals(lambo3);
        System.out.println(isMatch2);

        LandRoverDiscovery landRoverDiscovery = new LandRoverDiscovery();
        landRoverDiscovery.setOwner("Manoj");
        landRoverDiscovery.setCartype("SUV");
        landRoverDiscovery.setPrice(9500000);
        landRoverDiscovery.setTorque(600);
        System.out.println(landRoverDiscovery);

        LandRoverDiscovery landRoverDiscovery1 = new LandRoverDiscovery();
        landRoverDiscovery1.setOwner("Ashish");
        landRoverDiscovery1.setCartype("SUV");
        landRoverDiscovery1.setPrice(9500000);
        landRoverDiscovery1.setTorque(600);

        LandRoverDiscovery landRoverDiscovery2 = new LandRoverDiscovery();
        landRoverDiscovery2.setOwner("Manoj");
        landRoverDiscovery2.setCartype("SUV");
        landRoverDiscovery2.setPrice(9500000);
        landRoverDiscovery2.setTorque(600);

        boolean dead1 = landRoverDiscovery.equals(landRoverDiscovery1);
        System.out.println(dead1);

        boolean dead2 = landRoverDiscovery.equals(landRoverDiscovery2);
        System.out.println(dead2);

        LexusRX lexusRX = new LexusRX();
        lexusRX.setOwner("Manoj");
        lexusRX.setCartype("Luxury SUV");
        lexusRX.setPrice(8500000);
        lexusRX.setTorque(550);
        System.out.println(lexusRX);

        LexusRX lexusRX1 = new LexusRX();
        lexusRX1.setOwner("Ashish");
        lexusRX1.setCartype("Luxury SUV");
        lexusRX1.setPrice(8500000);
        lexusRX1.setTorque(550);

        LexusRX lexusRX2 = new LexusRX();
        lexusRX2.setOwner("Manoj");
        lexusRX2.setCartype("Luxury SUV");
        lexusRX2.setPrice(8500000);
        lexusRX2.setTorque(550);

        boolean mark1 = lexusRX.equals(lexusRX1);
        System.out.println(result1);

        boolean mark2 = lexusRX.equals(lexusRX2);
        System.out.println(mark2);

        MaseratiLevante maseratiLevante = new MaseratiLevante();
        maseratiLevante.setOwner("Manoj");
        maseratiLevante.setCartype("Luxury SUV");
        maseratiLevante.setPrice(14000000);
        maseratiLevante.setTorque(580);
        System.out.println(maseratiLevante);

        MaseratiLevante maseratiLevante1 = new MaseratiLevante();
        maseratiLevante1.setOwner("Rahul");
        maseratiLevante1.setCartype("Luxury SUV");
        maseratiLevante1.setPrice(14000000);
        maseratiLevante1.setTorque(580);

        MaseratiLevante maseratiLevante2 = new MaseratiLevante();
        maseratiLevante2.setOwner("Manoj");
        maseratiLevante2.setCartype("Luxury SUV");
        maseratiLevante2.setPrice(14000000);
        maseratiLevante2.setTorque(580);

        boolean mask1 = maseratiLevante.equals(maseratiLevante1);
        System.out.println(mask1);

        boolean mask2 = maseratiLevante.equals(maseratiLevante2);
        System.out.println(mask2);

        MercedesBenzCClass mercedes = new MercedesBenzCClass();
        mercedes.setOwner("Manoj");
        mercedes.setCartype("Luxury Sedan");
        mercedes.setPrice(5500000);
        mercedes.setTorque(400);
        System.out.println(mercedes);

        MercedesBenzCClass mercedes1 = new MercedesBenzCClass();
        mercedes1.setOwner("Rahul");
        mercedes1.setCartype("Luxury Sedan");
        mercedes1.setPrice(5500000);
        mercedes1.setTorque(400);

        MercedesBenzCClass mercedes2 = new MercedesBenzCClass();
        mercedes2.setOwner("Manoj");
        mercedes2.setCartype("Luxury Sedan");
        mercedes2.setPrice(5500000);
        mercedes2.setTorque(400);

        boolean date1 = mercedes.equals(mercedes1);
        System.out.println(date1);

        boolean date2 = mercedes.equals(mercedes2);
        System.out.println(date2);

        MercedesBenzGLE gle = new MercedesBenzGLE();
        gle.setOwner("Manoj");
        gle.setCartype("Luxury SUV");
        gle.setPrice(8500000);
        gle.setTorque(700);
        System.out.println(gle);

        MercedesBenzGLE gle1 = new MercedesBenzGLE();
        gle1.setOwner("Manoj");
        gle1.setCartype("Luxury SUV");
        gle1.setPrice(8500000);
        gle1.setTorque(700);

        MercedesBenzGLE gle2 = new MercedesBenzGLE();
        gle2.setOwner("Manoj");
        gle2.setCartype("Luxury SUV");
        gle2.setPrice(8500000);
        gle2.setTorque(700);

        boolean base1 = gle.equals(gle1);
        System.out.println(base1);

        boolean base2 = gle.equals(gle2);
        System.out.println(base2);

        Nexon nexon = new Nexon();
        nexon.setOwner("Manoj");
        nexon.setCartype("Compact SUV");
        nexon.setPrice(950000);
        nexon.setTorque(260);
        System.out.println(nexon);

        Nexon nexon1 = new Nexon();
        nexon1.setOwner("Ankit");
        nexon1.setCartype("Compact SUV");
        nexon1.setPrice(950000);
        nexon1.setTorque(260);

        Nexon nexon2 = new Nexon();
        nexon2.setOwner("Manoj");
        nexon2.setCartype("Compact SUV");
        nexon2.setPrice(950000);
        nexon2.setTorque(260);

        boolean boost1 = nexon.equals(nexon1);
        System.out.println(boost1);

        boolean boost2 = nexon.equals(nexon2);
        System.out.println(boost2);

        NissanXTrail trail = new NissanXTrail();
        trail.setOwner("Manoj");
        trail.setCartype("SUV");
        trail.setPrice(2800000);
        trail.setTorque(320);
        System.out.println(trail);

        NissanXTrail trail1 = new NissanXTrail();
        trail1.setOwner("Ankit");
        trail1.setCartype("SUV");
        trail1.setPrice(2800000);
        trail1.setTorque(320);

        NissanXTrail trail2 = new NissanXTrail();
        trail2.setOwner("Manoj");
        trail2.setCartype("SUV");
        trail2.setPrice(2800000);
        trail2.setTorque(320);

        boolean bald1 = trail.equals(trail1);
        System.out.println(bald1);

        boolean bald2 = trail.equals(trail2);
        System.out.println(bald2);

        Octavia octavia = new Octavia();
        octavia.setOwner("Manoj");
        octavia.setCartype("Sedan");
        octavia.setPrice(2300000);
        octavia.setTorque(250);
        System.out.println(octavia);

        Octavia octavia1 = new Octavia();
        octavia1.setOwner("Ankit");
        octavia1.setCartype("Sedan");
        octavia1.setPrice(2300000);
        octavia1.setTorque(250);

        Octavia octavia2 = new Octavia();
        octavia2.setOwner("Manoj");
        octavia2.setCartype("Sedan");
        octavia2.setPrice(2300000);
        octavia2.setTorque(250);

        boolean roast1 = octavia.equals(octavia1);
        System.out.println(roast1);

        boolean roast2 = octavia.equals(octavia2);
        System.out.println(roast2);

        Polo polo = new Polo();
        polo.setOwner("Manoj");
        polo.setCartype("Hatchback");
        polo.setPrice(1000000);
        polo.setTorque(200);
        System.out.println(polo);

        Polo polo1 = new Polo();
        polo1.setOwner("Ankit");
        polo1.setCartype("Hatchback");
        polo1.setPrice(1000000);
        polo1.setTorque(200);

        Polo polo2 = new Polo();
        polo2.setOwner("Manoj");
        polo2.setCartype("Hatchback");
        polo2.setPrice(1000000);
        polo2.setTorque(200);

        boolean ghost1 = polo.equals(polo1);
        System.out.println(ghost1);

        boolean ghost2 = polo.equals(polo2);
        System.out.println(ghost2);

        Porsche porsche = new Porsche();
        porsche.setOwner("Manoj");
        porsche.setCartype("Sports Car");
        porsche.setPrice(2000000);
        porsche.setTorque(450);

        // Print details of the Porsche car
        System.out.println(porsche);

        // Create a second Porsche object with a different owner
        Porsche porsche1 = new Porsche();
        porsche1.setOwner("Ankit");
        porsche1.setCartype("Sports Car");
        porsche1.setPrice(2000000);
        porsche1.setTorque(450);

        Porsche porsche2 = new Porsche();
        porsche2.setOwner("Manoj");
        porsche2.setCartype("Sports Car");
        porsche2.setPrice(2000000);
        porsche2.setTorque(450);

        boolean paul1 = porsche.equals(porsche1);
        System.out.println(paul1);
        boolean paul2 = porsche.equals(porsche2);
        System.out.println(paul2);

        Punch punch = new Punch();
        punch.setOwner("Manoj");
        punch.setCartype("Compact SUV");
        punch.setPrice(800000);
        punch.setTorque(115);

        // Print details of the Punch car
        System.out.println(punch);

        // Create a second Punch object with a different owner
        Punch punch1 = new Punch();
        punch1.setOwner("Ravi");
        punch1.setCartype("Compact SUV");
        punch1.setPrice(800000);
        punch1.setTorque(115);

        Punch punch2 = new Punch();
        punch2.setOwner("Manoj");
        punch2.setCartype("Compact SUV");
        punch2.setPrice(800000);
        punch2.setTorque(115);

        boolean one1 = punch.equals(punch1);
        System.out.println(one1);


        boolean one2 = punch.equals(punch2);
        System.out.println(one2);

        Q5 q5 = new Q5();
        q5.setOwner("Manoj");
        q5.setCartype("Luxury SUV");
        q5.setPrice(5500000);
        q5.setTorque(370);

        // Print details of the Q5 car
        System.out.println(q5);

        // Create a second Q5 object with a different owner
        Q5 q5_1 = new Q5();
        q5_1.setOwner("Ravi");
        q5_1.setCartype("Luxury SUV");
        q5_1.setPrice(5500000);
        q5_1.setTorque(370);

        Q5 q5_2 = new Q5();
        q5_2.setOwner("Manoj");
        q5_2.setCartype("Luxury SUV");
        q5_2.setPrice(5500000);
        q5_2.setTorque(370);


        boolean weight1 = q5.equals(q5_1);
        System.out.println(weight1);

        boolean weight2 = q5.equals(q5_2);
        System.out.println(weight2);

        Rapid rapid = new Rapid();
        rapid.setOwner("Manoj");
        rapid.setCartype("Sedan");
        rapid.setPrice(1200000);
        rapid.setTorque(250);


        System.out.println(rapid);


        Rapid rapid_1 = new Rapid();
        rapid_1.setOwner("Kiran");
        rapid_1.setCartype("Sedan");
        rapid_1.setPrice(1200000);
        rapid_1.setTorque(250);

        Rapid rapid_2 = new Rapid();
        rapid_2.setOwner("Manoj");
        rapid_2.setCartype("Sedan");
        rapid_2.setPrice(1200000);
        rapid_2.setTorque(250);

        boolean foot1 = rapid.equals(rapid_1);
        System.out.println(foot1);
        boolean foot2 = rapid.equals(rapid_2);
        System.out.println(foot2);

        RapidTsi rapidTsi = new RapidTsi();
        rapidTsi.setOwner("Manoj");
        rapidTsi.setCartype("Sedan");
        rapidTsi.setPrice(1300000);
        rapidTsi.setTorque(240);

        System.out.println(rapidTsi);

        RapidTsi rapidTsi_1 = new RapidTsi();
        rapidTsi_1.setOwner("Kiran");
        rapidTsi_1.setCartype("Sedan");
        rapidTsi_1.setPrice(1300000);
        rapidTsi_1.setTorque(240);


        RapidTsi rapidTsi_2 = new RapidTsi();
        rapidTsi_2.setOwner("Manoj");
        rapidTsi_2.setCartype("Sedan");
        rapidTsi_2.setPrice(1300000);
        rapidTsi_2.setTorque(240);

        boolean left1 = rapidTsi.equals(rapidTsi_1);
        System.out.println(left1);

        boolean left2 = rapidTsi.equals(rapidTsi_2);
        System.out.println(left2);

        RollsRoyceCullinan rolls = new RollsRoyceCullinan();
        rolls.setOwner("Manoj");
        rolls.setCartype("Luxury SUV");
        rolls.setPrice(70000000);
        rolls.setTorque(900);

        System.out.println(rolls);

        RollsRoyceCullinan rolls_1 = new RollsRoyceCullinan();
        rolls_1.setOwner("Kiran");
        rolls_1.setCartype("Luxury SUV");
        rolls_1.setPrice(70000000);
        rolls_1.setTorque(900);

        RollsRoyceCullinan rolls_2 = new RollsRoyceCullinan();
        rolls_2.setOwner("Manoj");
        rolls_2.setCartype("Luxury SUV");
        rolls_2.setPrice(70000000);
        rolls_2.setTorque(900);

        boolean good1 = rolls.equals(rolls_1);
        System.out.println(good1);

        boolean good2 = rolls.equals(rolls_2);
        System.out.println(good2);

        Scorpio scorpio = new Scorpio();
        scorpio.setOwner("Manoj");
        scorpio.setCartype("SUV");
        scorpio.setPrice(1800000);
        scorpio.setTorque(320);

        System.out.println(scorpio);

        Scorpio scorpio_1 = new Scorpio();
        scorpio_1.setOwner("Kiran");
        scorpio_1.setCartype("SUV");
        scorpio_1.setPrice(1800000);
        scorpio_1.setTorque(320);

        Scorpio scorpio_2 = new Scorpio();
        scorpio_2.setOwner("Manoj");
        scorpio_2.setCartype("SUV");
        scorpio_2.setPrice(1800000);
        scorpio_2.setTorque(320);

        boolean look1 = scorpio.equals(scorpio_1);
        System.out.println(look1);

        boolean look2 = scorpio.equals(scorpio_2);
        System.out.println(look2);

        Seltos seltos = new Seltos();
        seltos.setOwner("Manoj");
        seltos.setCartype("SUV");
        seltos.setPrice(1500000);
        seltos.setTorque(250);

        System.out.println(seltos);

        Seltos seltos_1 = new Seltos();
        seltos_1.setOwner("Kiran");
        seltos_1.setCartype("SUV");
        seltos_1.setPrice(1500000);
        seltos_1.setTorque(250);

        Seltos seltos_2 = new Seltos();
        seltos_2.setOwner("Manoj");
        seltos_2.setCartype("SUV");
        seltos_2.setPrice(1500000);
        seltos_2.setTorque(250);

        boolean bad1 = seltos.equals(seltos_1);
        System.out.println(bad1);

        boolean bad2 = seltos.equals(seltos_2);
        System.out.println(bad2);

        Sonet sonet = new Sonet();
        sonet.setOwner("Manoj");
        sonet.setCartype("SUV");
        sonet.setPrice(1100000);
        sonet.setTorque(240);

        System.out.println(sonet);

        Sonet sonet_1 = new Sonet();
        sonet_1.setOwner("Kiran");
        sonet_1.setCartype("SUV");
        sonet_1.setPrice(1100000);
        sonet_1.setTorque(240);

        Sonet sonet_2 = new Sonet();
        sonet_2.setOwner("Manoj");
        sonet_2.setCartype("SUV");
        sonet_2.setPrice(1100000);
        sonet_2.setTorque(240);

        boolean volt1 = sonet.equals(sonet_1);
        System.out.println(result1);

        boolean volt2 = sonet.equals(sonet_2);
        System.out.println(volt2);

        SuzukiSwift swift = new SuzukiSwift();
        swift.setOwner("Manoj");
        swift.setCartype("Hatchback");
        swift.setPrice(800000);
        swift.setTorque(113);

        System.out.println(swift);

        SuzukiSwift swift_1 = new SuzukiSwift();
        swift_1.setOwner("Kiran");
        swift_1.setCartype("Hatchback");
        swift_1.setPrice(800000);
        swift_1.setTorque(113);

        SuzukiSwift swift_2 = new SuzukiSwift();
        swift_2.setOwner("Manoj");
        swift_2.setCartype("Hatchback");
        swift_2.setPrice(800000);
        swift_2.setTorque(113);

        boolean wait1 = swift.equals(swift_1);
        System.out.println(wait1);

        boolean wait2 = swift.equals(swift_2);
        System.out.println(wait2);

        Thar thar = new Thar();
        thar.setOwner("Manoj");
        thar.setCartype("SUV");
        thar.setPrice(1500000);
        thar.setTorque(300);

        System.out.println(thar);

        Thar thar_1 = new Thar();
        thar_1.setOwner("Ravi");
        thar_1.setCartype("SUV");
        thar_1.setPrice(1500000);
        thar_1.setTorque(300);

        Thar thar_2 = new Thar();
        thar_2.setOwner("Manoj");
        thar_2.setCartype("SUV");
        thar_2.setPrice(1500000);
        thar_2.setTorque(300);

        boolean bent1 = thar.equals(thar_1);
        System.out.println(bent1);

        boolean bent2 = thar.equals(thar_2);
        System.out.println(bent2);

        Tiguan tiguan = new Tiguan();
        tiguan.setOwner("Manoj");
        tiguan.setCartype("SUV");
        tiguan.setPrice(2500000);
        tiguan.setTorque(350);

        System.out.println(tiguan);

        Tiguan tiguan_1 = new Tiguan();
        tiguan_1.setOwner("Ravi");
        tiguan_1.setCartype("SUV");
        tiguan_1.setPrice(2500000);
        tiguan_1.setTorque(350);

        Tiguan tiguan_2 = new Tiguan();
        tiguan_2.setOwner("Manoj");
        tiguan_2.setCartype("SUV");
        tiguan_2.setPrice(2500000);
        tiguan_2.setTorque(350);

        boolean rock1 = tiguan.equals(tiguan_1);
        System.out.println(rock1);

        boolean rock2 = tiguan.equals(tiguan_2);
        System.out.println(rock2);

        public static void main(String[] args) {
            TriumphStreetTriple triumphStreetTriple = new TriumphStreetTriple();
            triumphStreetTriple.setOwner("Manoj");
            triumphStreetTriple.setBiketype("Sport");
            triumphStreetTriple.setPrice(900000);
            triumphStreetTriple.setTorque(85);

            System.out.println(triumphStreetTriple);

            TriumphStreetTriple triumphStreetTriple_1 = new TriumphStreetTriple();
            triumphStreetTriple_1.setOwner("Ravi");
            triumphStreetTriple_1.setBiketype("Sport");
            triumphStreetTriple_1.setPrice(900000);
            triumphStreetTriple_1.setTorque(85);

            TriumphStreetTriple triumphStreetTriple_2 = new TriumphStreetTriple();
            triumphStreetTriple_2.setOwner("Manoj");
            triumphStreetTriple_2.setBiketype("Sport");
            triumphStreetTriple_2.setPrice(900000);
            triumphStreetTriple_2.setTorque(85);

            boolean boot1 = triumphStreetTriple.equals(triumphStreetTriple_1);
            System.out.println(boot1);

            boolean boot2 = triumphStreetTriple.equals(triumphStreetTriple_2);
            System.out.println(boot2);

            Vento vento = new Vento();
            vento.setOwner("Manoj");
            vento.setCartype("Sedan");
            vento.setPrice(1200000);
            vento.setTorque(250);

            System.out.println(vento);

            Vento vento_1 = new Vento();
            vento_1.setOwner("Ravi");
            vento_1.setCartype("Sedan");
            vento_1.setPrice(1200000);
            vento_1.setTorque(250);

            Vento vento_2 = new Vento();
            vento_2.setOwner("Manoj");
            vento_2.setCartype("Sedan");
            vento_2.setPrice(1200000);
            vento_2.setTorque(250);

            boolean mike1 = vento.equals(vento_1);
            System.out.println(mike1);

            boolean mike2 = vento.equals(vento_2);
            System.out.println(mike2);

            Venue venue = new Venue();
            venue.setOwner("Manoj");
            venue.setCartype("SUV");
            venue.setPrice(1000000);
            venue.setTorque(200);

            System.out.println(venue);

            Venue venue_1 = new Venue();
            venue_1.setOwner("Ravi");
            venue_1.setCartype("SUV");
            venue_1.setPrice(1000000);
            venue_1.setTorque(200);

            Venue venue_2 = new Venue();
            venue_2.setOwner("Manoj");
            venue_2.setCartype("SUV");
            venue_2.setPrice(1000000);
            venue_2.setTorque(200);

            boolean jolt1 = venue.equals(venue_1);
            System.out.println(jolt1);

            boolean jolt2 = venue.equals(venue_2);
            System.out.println(jolt2);

            Verna verna = new Verna();
            verna.setOwner("Manoj");
            verna.setCartype("Sedan");
            verna.setPrice(1200000);
            verna.setTorque(250);

            System.out.println(verna);

            Verna verna_1 = new Verna();
            verna_1.setOwner("Ravi");
            verna_1.setCartype("Sedan");
            verna_1.setPrice(1200000);
            verna_1.setTorque(250);

            Verna verna_2 = new Verna();
            verna_2.setOwner("Manoj");
            verna_2.setCartype("Sedan");
            verna_2.setPrice(1200000);
            verna_2.setTorque(250);

            boolean run1 = verna.equals(verna_1);
            System.out.println(run1);

            boolean run2 = verna.equals(verna_2);
            System.out.println(run2);

        }
        }
    }
        }
















