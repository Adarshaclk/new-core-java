package com.java.inherMtd.internal;


public class Castclass  {

    public void hpz(HP pcsystem) {
        System.out.println("running inside the hp casting");
        if (pcsystem != null) {
            pcsystem.pc();
            if (pcsystem instanceof Laptop) {
                Laptop laptop1 = (Laptop) pcsystem;
                laptop1.ram();
            } else {
                System.out.println("laptop is not is hp");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void lenin(Shirt slag) {
        System.out.println("running inside the hp casting");
        if (slag != null) {
            slag.clt();
            if (slag instanceof Pant) {
                Shirt clth = (Pant) slag;
                clth.clt();
            } else {
                System.out.println("slag is not is pant");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void hpz(Sun planet) {
        System.out.println("running inside the earth casting");
        if (planet != null) {
            planet.slr();
            if (planet instanceof Earth) {
                Earth ert = (Earth) planet;
                ert.slr();
            } else {
                System.out.println("earth  is not is sun");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void tre(Tree stem) {
        System.out.println("running inside the tree casting");
        if (stem != null) {
            stem.tree();
            if (stem instanceof Plant) {
                Plant plant = (Plant) stem;
                plant.tree();
            } else {
                System.out.println("plant is not is tree");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void pen(Pen ink) {
        System.out.println("running inside the pen  casting");
        if (ink != null) {
            ink.wrt();
            if (ink instanceof Pencil) {
                Pencil lead = (Pencil) ink;
                lead.pncl();
            } else {
                System.out.println("pencil is not is pen");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void bed(Bedsheet cover) {
        System.out.println("running inside the bedsheet casting");
        if (cover != null) {
            cover.bdst();
            if (cover instanceof Pillow) {
                Pillow pill = (Pillow) cover;
                pill.pill();
            } else {
                System.out.println("pillow is not is bedsheet");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void alco(Alchol enne) {
        System.out.println("running inside the alchohol casting");
        if (enne != null) {
            enne.alc();
            if (enne instanceof Beer) {
                Beer beer = (Beer) enne;
                beer.ber();
            } else {
                System.out.println("alchol is not is beeer");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void sug(Samsung phn) {
        System.out.println("running inside the samsung casting");
        if (phn != null) {
            phn.sam();
            if (phn instanceof Mobile) {
                Mobile mob = (Mobile) phn;
                mob.mbl();
            } else {
                System.out.println("Mobile is not is samsung");
            }
        } else {
            System.out.println("value is null");
        }
    }


    public void mc(Mac apl) {
        System.out.println("running inside the mac casting");
        if (apl != null) {
            apl.Mc();
            if (apl instanceof Tab) {
                Tab tb = (Tab) apl;
                tb.tab();
            } else {
                System.out.println("tab is not is mac");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void roc(Rocket space) {
        System.out.println("running inside the rocket casting");
        if (space != null) {
            space.rct();
            if (space instanceof Sattelite) {
                Sattelite sat = (Sattelite) space;
                space.rct();
            } else {
                System.out.println("sattelite is not is rocket");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void brd(Bird kiwi) {
        System.out.println("running inside the kiwi casting");
        if (kiwi != null) {
            kiwi.brd();
            if (kiwi instanceof Eagle) {
                Eagle egl = (Eagle) kiwi;
                egl.egle();
            } else {
                System.out.println("Bird is not is eagle");
            }
        } else {
            System.out.println("value is null");
        }
    }


    public void flower(Flover lil) {
        System.out.println("running inside the flover casting");
        if (lil != null) {
            lil.flr();
            if (lil instanceof Rose) {
                Rose lily = (Rose) lil;
                lily.rse();
            } else {
                System.out.println("rose is not is flower");
            }
        } else {
            System.out.println("value is null");
        }

    }

    public void nava(Navagraha dboss) {
        System.out.println("running inside the navaraha casting");
        if (dboss != null) {
            dboss.nava();
            if (dboss instanceof Darshan) {
                Darshan darsh = (Darshan) dboss;
                darsh.darshu();
            } else {
                System.out.println("daarshan is not is navagraha");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void Btl(Bottle bisl) {
        System.out.println("running inside the bottle casting");
        if (bisl != null) {
            bisl.btl();
            if (bisl instanceof Glass) {
                Glass kin = (Glass) bisl;
                kin.gls();
            } else {
                System.out.println("glass is not is bottle");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void nut(Seed rag) {
        System.out.println("running inside the fruit casting");
        if (rag != null) {
            rag.sed();
            if (rag instanceof Friut) {
                Friut frt = (Friut) rag;
                frt.frt();
            } else {
                System.out.println("fruit is not is seed");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void sudee(Sudeep mx) {
        System.out.println("running inside the sudeep casting");
        if (mx != null) {
            mx.sude();
            if (mx instanceof MAX) {
                MAX sud = (MAX) mx;
                sud.sude();
            } else {
                System.out.println("max is not is sudeep");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void mgn(Ore mgni) {
        System.out.println("running inside the ore casting");
        if (mgni != null) {
            mgni.ore();
            if (mgni instanceof Iron) {
                Iron fe = (Iron) mgni;
                fe.iron();
            } else {
                System.out.println("ore is not is iron");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void soft(Bed foam) {
        System.out.println("running inside the bed casting");
        if (foam != null) {
            foam.bed();
            if (foam instanceof Foam) {
                Foam fom = (Foam) foam;
                fom.foam();
            } else {
                System.out.println("foam is not is bed");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void frige(LG frg) {
        System.out.println("running inside the fridge casting");
        if (frg != null) {
            frg.lg();
            if (frg instanceof Fridge) {
                Fridge fdge = (Fridge) frg;
                fdge.fridge();
            } else {
                System.out.println("fridge  is not is lg");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void mchn(IFB wash) {
        System.out.println("running inside the ifb casting");
        if (wash != null) {
            wash.wash();
            if (wash instanceof Washingmch) {
                Washingmch wsmn = (Washingmch) wash;
                wsmn.mch();
            } else {
                System.out.println("washing  is not is ifb");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void volt(Voltas ac) {
        System.out.println("running inside the voltas casting");
        if (ac != null) {
            ac.vlts();
            if (ac instanceof AC) {
                AC cool = (AC) ac;
                cool.Aircool();
            } else {
                System.out.println("ac is not is voltas");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void sefe(Door dor) {
        System.out.println("running inside the dooor casting");
        if (dor != null) {
            dor.dor();
            if (dor instanceof Window) {
                Window wind = (Window) dor;
                wind.Windo();
            } else {
                System.out.println("windwo is not is door");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void gates(Billagate msoft) {
        System.out.println("running inside the Billgates casting");
        if (msoft != null) {
            msoft.bill();
            if (msoft instanceof Micro) {
                Micro mic = (Micro) msoft;
                mic.micro();
            } else {
                System.out.println("laptop is not is hp");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void sky(Skybag bag) {
        System.out.println("running inside the skybag casting");
        if (bag != null) {
            bag.sky();
            if (bag instanceof Bag) {
                Bag bg = (Bag) bag;
                bg.bag();
            } else {
                System.out.println("Bag is not is  skybag ");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void frut(Fruit frti) {
        System.out.println("running inside the hp casting");
        if (frti != null) {
            frti.fruit();
            if (frti instanceof Apple) {
                Apple appi = (Apple) frti;
                appi.apple();
            } else {
                System.out.println("Apple  is not is fruit");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void gani(Ganesh zm) {
        System.out.println("running inside the gani casting");
        if (zm != null) {
            zm.gani();
            if (zm instanceof Zoom) {
                Zoom z = (Zoom) zm;
                z.zoom();
            } else {
                System.out.println("gani is not is zoom");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void samp(Hair hr) {
        System.out.println("running inside the hair casting");
        if (hr != null) {
            hr.hair();
            if (hr instanceof Band) {
                Band bnd = (Band) hr;
                bnd.band();
            } else {
                System.out.println("samp is not is hair");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void ovn(Oven heat) {
        System.out.println("running inside the oven casting");
        if (heat != null) {
            heat.oven();
            if (heat instanceof Heat) {
                Heat ht = (Heat) heat;
                ht.heat();
            } else {
                System.out.println("oven is not is heat");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void Rifl(Gun gn) {
        System.out.println("running inside the hp casting");
        if (gn != null) {
            gn.gun();
            if (gn instanceof MP5) {
                MP5 speed = (MP5) gn;
                speed.gun();
            } else {
                System.out.println("MP5  is not is gun");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void indus(India dil) {
        System.out.println("running inside the delhi casting");
        if (dil != null) {
            dil.india();
            if (dil instanceof Delhi) {
                Delhi dl = (Delhi) dil;
                dl.delhi();
            } else {
                System.out.println("Delhi is not is ininda");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void buff(Paper a) {
        System.out.println("running inside the paper casting");
        if (a != null) {
            a.paper();
            if (a instanceof A4) {
                A4 siz = (A4) a;
                siz.appr();
            } else {
                System.out.println("paper is not is a4");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void hond(Honda bik) {
        System.out.println("running inside the honda casting");
        if (bik != null) {
            bik.honda();
            if (bik instanceof Civic) {
                Civic civi = (Civic) bik;
                civi.civic();
            } else {
                System.out.println("Cvic  is not is honda");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void suzu(Suzuki sui) {
        System.out.println("running inside the suszuki casting");
        if (sui != null) {
            sui.suzuki();
            if (sui instanceof Swift) {
                Swift swt = (Swift) sui;
                swt.swift();
            } else {
                System.out.println("Swift  is not is Suzuki");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void yamah(Yamaha ruf) {
        System.out.println("running inside the yamaha casting");
        if (ruf != null) {
            ruf.yamaha();
            if (ruf instanceof RX) {
                RX fz = (RX) ruf;
                fz.rx();
            } else {
                System.out.println("yamaha  is not is rx");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void tvs(TVS xl) {
        System.out.println("running inside the hp casting");
        if (xl != null) {
            xl.tvs();
            if (xl instanceof Jpiter) {
                Jpiter jp = (Jpiter) xl;
                jp.Jpter();
            } else {
                System.out.println("xl is not is tvs");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void hero(Hero smot) {
        System.out.println("running inside the hero casting");
        if (smot != null) {
            smot.hero();
            if (smot instanceof Cdh) {
                Cdh cd = (Cdh) smot;
                cd.cdh();
            } else {
                System.out.println("cdh is not is hero");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void jcb(JCB pow) {
        System.out.println("running inside the jcb casting");
        if (pow != null) {
            pow.jcb();
            if (pow instanceof Hita) {
                Hita chi = (Hita) pow;
                chi.hita();
            } else {
                System.out.println("hita is not is jcb");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void bang(RCB dk) {
        System.out.println("running inside the hero casting");
        if (dk != null) {
            dk.rcb();
            if (dk instanceof Virat) {
                Virat vir = (Virat) dk;
                vir.virat();
            } else {
                System.out.println("Virat is not is rcb");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void karu(Karnataka nam) {
        System.out.println("running inside the hero casting");
        if (nam != null) {
            nam.state();
            if (nam instanceof Benlore) {
                Benlore beng = (Benlore) nam;
                beng.bnglr();
            } else {
                System.out.println("bengaluru  is not is karantaka");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void neer(Water pani) {
        System.out.println("running inside the hero casting");
        if (pani != null) {
            pani.water();
            if (pani instanceof Fish) {
                Fish fi = (Fish) pani;
                fi.fish();
            } else {
                System.out.println("fish is not is water");
            }
        } else {
            System.out.println("value is null");
        }

    }
    public void ment(Brain brin) {
        System.out.println("running inside the brain casting");
        if (brin != null) {
            brin.brain();
            if (brin instanceof Nueral) {
                Nueral nur = (Nueral) brin;
                nur.nuerl();
            } else {
                System.out.println("brain is not is neural");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void proces(CPU chp) {
        System.out.println("running inside the cpu casting");
        if (chp != null) {
            chp.cpu();
            if (chp instanceof Procces) {
                Procces prcs = (Procces) chp;
                prcs.Proces();
            } else {
                System.out.println("cpu  is not is process");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void par(Parle bisct) {
        System.out.println("running inside the palre casting");
        if (bisct != null) {
            bisct.parle();
            if (bisct instanceof G) {
                G ple = (G) bisct;
                ple.G();
            } else {
                System.out.println("g is not is parle");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void maru(Mari bisc) {
        System.out.println("running inside the mari casting");
        if (bisc != null) {
            bisc.mari();
            if (bisc instanceof Lite) {
                Lite ple = (Lite) bisc;
                ple.lite();
            } else {
                System.out.println("lite is not is mari");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void durga(Chrdurga ctd) {
        System.out.println("running inside the Chthdurga casting");
        if (ctd != null) {
            ctd.ctd();
            if (ctd instanceof Clk) {
                Clk ck = (Clk) ctd;
                ck.clk();
            } else {
                System.out.println("clk is not is ctd");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void davn(Davanagere benne) {
        System.out.println("running inside the hero casting");
        if (benne != null) {
            benne.dvg();
            if (benne instanceof Harihar) {
                Harihar har = (Harihar) benne;
                har.hari();
            } else {
                System.out.println("harihar  is not is dabaangere");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void tmkr(Thumkur madu) {
        System.out.println("running inside the tmukur casting");
        if (madu != null) {
            madu.tmkr();
            if (madu instanceof Pavgada) {
                Pavgada pav = (Pavgada) madu;
                pav.pvgd();
            } else {
                System.out.println("pavagada is not is tumukur");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void shiv(Shivmoga jog) {
        System.out.println("running inside the Shivmogga casting");
        if (jog != null) {
            jog.shmg();
            if (jog instanceof Sagara) {
                Sagara sag = (Sagara) jog;
                sag.sagara();
            } else {
                System.out.println("sagara is not is shivmogga");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void jdk(Java jvm) {
        System.out.println("running inside the java casting");
        if (jvm != null) {
            jvm.jva();
            if (jvm instanceof Jvm) {
                Jvm jm = (Jvm) jvm;
                jm.jvm();
            } else {
                System.out.println("jvm is not is java");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void rom(Romeo poem) {
        System.out.println("running inside the hero casting");
        if (poem != null) {
            poem.romeo();
            if (poem instanceof Juleat) {
                Juleat jlt = (Juleat) poem;
                jlt.juleat();
            } else {
                System.out.println("Juleat is not is Romeao");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void wi(Wifi net) {
        System.out.println("running inside the hero casting");
        if (net != null) {
            net.wifi();
            if (net instanceof Hotspot) {
                Hotspot htpt = (Hotspot) net;
                ((Hotspot) net).hotspot();
            } else {
                System.out.println("hotsspot is not is wifi");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void leo(Lion meat) {
        System.out.println("running inside the hero casting");
        if (meat != null) {
            meat.lion();
            if (meat instanceof Cat) {
                Cat ani = (Cat) meat;
               ani.cat();
            } else {
                System.out.println("cat is not is lion");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void furn(Table wod) {
        System.out.println("running inside the hero casting");
        if (wod != null) {
            wod.furniture();
            if (wod instanceof WoodenTable) {
                WoodenTable wtbl = (WoodenTable) wod;
                wtbl.polish();
            } else {
                System.out.println("tbale  is not is woodentabel");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void tovel(Towel swet) {
        System.out.println("running inside the tovwel casting");
        if (swet != null) {
            swet.cloth();
            if (swet instanceof BathTowel) {
                BathTowel btel = (BathTowel) swet;
              btel.absorb();
            } else {
                System.out.println("absobo is not is towel");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void curt( Curtain cls) {
        System.out.println("running inside the curtian casting");
        if (cls != null) {
            cls.fabric();
            if (cls instanceof WindowCurtain) {
                WindowCurtain wdcrt = (WindowCurtain) cls;
               wdcrt.cover();
            } else {
                System.out.println("fabric is not is curtain");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void truk(Truck vol) {
        System.out.println("running inside the truk casting");
        if (vol != null) {
            vol.load();
            if (vol instanceof MiniTruck) {
                MiniTruck mintrk = (MiniTruck) vol;
                mintrk.load();
            } else {
                System.out.println("minitruck is not is truk");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void irnbx(IronBox heat) {
        System.out.println("running inside the ironbox casting");
        if (heat != null) {
            heat.heat();
            if (heat instanceof SteamIron) {
                SteamIron stem = (SteamIron) heat;
                stem.steam();
            } else {
                System.out.println("hesaat is not is iron box");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void misle(Missile poes) {
        System.out.println("running inside the missile casting");
        if (poes != null) {
            poes.launch();
            if (poes instanceof GuidedMissile) {
                GuidedMissile gidmis = (GuidedMissile) poes;
                gidmis.target();
            } else {
                System.out.println("guidemissile is not is missile");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void lnd(Land bhoomi) {
        System.out.println("running inside the land casting");
        if (bhoomi != null) {
            bhoomi.property();
            if (bhoomi instanceof AgriLand) {
                AgriLand agrild = (AgriLand) bhoomi;
                agrild.cultivate();
            } else {
                System.out.println("agriland is not is land");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void rag(Ragi strng) {
        System.out.println("running inside the ragi casting");
        if (strng != null) {
            strng.grain();
            if (strng instanceof RagiMalt) {
                RagiMalt ragml = (RagiMalt) strng;
                ragml.drink();
            } else {
                System.out.println("ragi is not is malt");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void goldch(GoldChain gld) {
        System.out.println("running inside the goldchian casting");
        if (gld != null) {
            gld.shine();
            if (gld instanceof Gold) {
                Gold gold = (Gold) gld;
                gold.design();
            } else {
                System.out.println("gold is not is goldcahin");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void btry(Battery pwr) {
        System.out.println("running inside the hp casting");
        if (pwr != null) {
            pwr.power();
            if (pwr instanceof Exide) {
                Exide ex = (Exide) pwr;
                ex.charge();
            } else {
                System.out.println("exide is not is battry");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void tnk(Tank btltank) {
        System.out.println("running inside the tank casting");
        if (btltank != null) {
            btltank.fire();
            if (btltank instanceof BattleTank) {
                BattleTank bnk = (BattleTank) btltank;
                bnk.armor();
            } else {
                System.out.println("tank is not is battle");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void bwl(Bowl sop) {
        System.out.println("running inside the bowl casting");
        if (sop != null) {
            sop.hold();
            if (sop instanceof SoupBowl) {
                SoupBowl spbl = (SoupBowl) sop;
                spbl.serve();
            } else {
                System.out.println("spup is not is bowl");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void bw(Bow arr) {
        System.out.println("running inside the bow casting");
        if (arr != null) {
            arr.shoot();
            if (arr instanceof Bow) {
                Bow fg = (Bow) arr;
                fg.shoot();
            } else {
                System.out.println("longbow is not is bow");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void rce(Rice jera) {
        System.out.println("running inside the rice casting");
        if (jera != null) {
            jera.cook();
            if (jera instanceof BasmatiRice) {
                BasmatiRice bssmt = (BasmatiRice) jera;
                bssmt.aroma();
            } else {
                System.out.println("rice is not is basamthi");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void bisl(BislariBottle wtr) {
        System.out.println("running inside the bisleri casting");
        if (wtr != null) {
            wtr.fill();
            if (wtr instanceof WaterBottle) {
                WaterBottle wtrbtl = (WaterBottle) wtr;
                wtrbtl.drink();
            } else {
                System.out.println("wter is not is bisleri");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void print(Printer cpy) {
        System.out.println("running inside the printer casting");
        if (cpy != null) {
            cpy.print();
            if (cpy instanceof LaserPrinter) {
                LaserPrinter cp = (LaserPrinter) cpy;
                cp.speed();
            } else {
                System.out.println("laser is not is printer");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void dress(Kurtha krth) {
        System.out.println("running inside the hp casting");
        if (krth != null) {
            krth.wear();
            if (krth instanceof DesiKurtha) {
                DesiKurtha des = (DesiKurtha) krth;
                des.embroidery();
            } else {
                System.out.println("laptop is not is hp");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void xrx(Xerox cpy) {
        System.out.println("running inside the xerox casting");
        if (cpy != null) {
            cpy.copy();
            if (cpy instanceof ColorXerox) {
                ColorXerox colo = (ColorXerox) cpy;
                colo.colorPrint();
            } else {
                System.out.println("color  is not is xerox");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void trn(Train exp) {
        System.out.println("running inside the trina casting");
        if (exp != null) {
            exp.move();
            if (exp instanceof BulletTrain) {
                BulletTrain bull = (BulletTrain) exp;
                bull.highSpeed();
            } else {
                System.out.println("bullet is not is trian");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void spn(Spoon eat) {
        System.out.println("running inside the spon casting");
        if (eat != null) {
            eat.scoop();
            if (eat instanceof SilverSpoon) {
                SilverSpoon sil = (SilverSpoon) eat;
                sil.shine();
            } else {
                System.out.println("silver is not is spoon");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void frk(Fork chop) {
        System.out.println("running inside the fork casting");
        if (chop != null) {
            chop.pick();
            if (chop instanceof SaladFork) {
                SaladFork salad = (SaladFork) chop;
                salad.grip();
            } else {
                System.out.println("salad is not in fork");
            }
        } else {
            System.out.println("value is null");
        }
    }

    public void flm(Film mov) {
        System.out.println("running inside the film casting");
        if (mov != null) {
            mov.play();
            if (mov instanceof DocumentaryFilm) {
                DocumentaryFilm docf = (DocumentaryFilm) mov;
                docf.educate();
            } else {
                System.out.println("movie is not is film");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void swth(Switch on) {
        System.out.println("running inside the swithc casting");
        if (on != null) {
            on.turnOn();
            if (on instanceof SmartSwitch) {
                SmartSwitch smrt = (SmartSwitch) on;
                smrt.schedule();
            } else {
                System.out.println("smart is not is switch");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void pick(Pickle spc) {
        System.out.println("running inside the pickle casting");
        if (spc != null) {
            spc.preserve();
            if (spc instanceof MangoPickle) {
                MangoPickle ssd = (MangoPickle) spc;
                ssd.taste();
            } else {
                System.out.println("mango is not in pickle");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void tb(Tube pc) {
        System.out.println("running inside the paste casting");
        if (pc != null) {
            pc.squeeze();
            if (pc instanceof ToothpasteTube) {
                ToothpasteTube toth = (ToothpasteTube) pc;
                toth.mintFlavor();
            } else {
                System.out.println("tooth is not in tube");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void blank(Blanket com) {
        System.out.println("running inside the blanket casting");
        if (com != null) {
            com.cover();
            if (com instanceof WoolBlanket) {
                WoolBlanket wol = (WoolBlanket) com;
                wol.warm();
            } else {
                System.out.println("blanket is not is hp");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void std(Stand std) {
        System.out.println("running inside the stand casting");
        if (std != null) {
            std.hold();
            if (std instanceof MobileStand) {
                MobileStand mobs = (MobileStand) std;
                mobs.rotate();
            } else {
                System.out.println("mobile is not is stand");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void bgl(Bangle bgl) {
        System.out.println("running inside the bangle casting");
        if (bgl != null) {
            bgl.wear();
            if (bgl instanceof GoldBangle) {
                GoldBangle gldb = (GoldBangle) bgl;
                gldb.sparkle();
            } else {
                System.out.println("laptop is not is hp");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void mir(Mirror sli) {
        System.out.println("running inside the mirror casting");
        if (sli != null) {
            sli.reflect();
            if (sli instanceof WallMirror) {
                WallMirror walmi = (WallMirror) sli;
                walmi.hang();
            } else {
                System.out.println("Waall is not is mirror");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void eliv(Elevator step) {
        System.out.println("running inside the elivator casting");
        if (step != null) {
            step.move();
            if (step instanceof SmartElevator) {
                SmartElevator smtel = (SmartElevator) step;
                smtel.voiceControl();
            } else {
                System.out.println("elivator is not is smart");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void lmp(Lamp lit) {
        System.out.println("running inside the lamp casting");
        if (lit != null) {
            lit.glow();
            if (lit instanceof TableLamp) {
                TableLamp tbl = (TableLamp) lit;
                tbl.adjust();
            } else {
                System.out.println("lite is not is table");
            }
        } else {
            System.out.println("value is null");
        }

    }
    public void keych(Keychain chn) {
        System.out.println("running inside the keychain casting");
        if (chn != null) {
            chn.holdKeys();
            if (chn instanceof DigitalKeychain) {
                DigitalKeychain tbl = (DigitalKeychain) chn;
                tbl.track();
            } else {
                System.out.println("keychin is not is didgtal");
            }
        } else {
            System.out.println("value is null");
        }

    }
    public void key(Keyboard alp) {
        System.out.println("running inside the keyboard casting");
        if (alp != null) {
            alp.type();
            if (alp instanceof MechanicalKeyboard) {
                MechanicalKeyboard mkey = (MechanicalKeyboard) alp;
                mkey.clickySound();
            } else {
                System.out.println("mecahanic keyboard is not is keyboad");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void trm(Trimmer remov) {
        System.out.println("running inside the trimmer casting");
        if (remov != null) {
            remov.trim();
            if (remov instanceof BeardTrimmer) {
                BeardTrimmer shv = (BeardTrimmer) remov;
                shv.adjustLength();
            } else {
                System.out.println("lenght adjust is not is trimmmer");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void calend(Calendor date) {
        System.out.println("running inside the calrnde casting");
        if (date != null) {
            date.showDate();
            if (date instanceof DigitalCalendor) {
                DigitalCalendor smtel = (DigitalCalendor) date;
                smtel.setReminder();
            } else {
                System.out.println("didgital is not is calender");
            }
        } else {
            System.out.println("value is null");
        }

    }
    public void spect(Spects lense) {
        System.out.println("running inside the spects casting");
        if (lense != null) {
            lense.wear();
            if (lense instanceof SunGlasses) {
                SunGlasses glas = (SunGlasses) lense;
                glas.blockSunlight();
            } else {
                System.out.println("sun glass is not is glass");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void arti(Book cont) {
        System.out.println("running inside the book casting");
        if (cont != null) {
            cont.read();
            if (cont instanceof EBook) {
                EBook ebok = (EBook) cont;
                ebok.download();
            } else {
                System.out.println("ebook is not is ebook");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void wlt(Wallet mon) {
        System.out.println("running inside the wallet casting");
        if (mon != null) {
            mon.carryCash();
            if (mon instanceof DigitalWallet) {
                DigitalWallet dig = (DigitalWallet) mon;
                dig.scanQR();
            } else {
                System.out.println("card is not is wallet");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void spry(Perfume sml) {
        System.out.println("running inside the spry casting");
        if (sml != null) {
            sml.apply();
            if (sml instanceof BodySpray) {
                BodySpray bdsp = (BodySpray) sml;
                bdsp.refresh();
            } else {
                System.out.println("body is not is spray");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void ham(Hammer hrd) {
        System.out.println("running inside the hammer casting");
        if (hrd != null) {
            hrd.hit();
            if (hrd instanceof SledgeHammer) {
                SledgeHammer sld = (SledgeHammer) hrd;
                sld.breakConcrete();
            } else {
                System.out.println("sldhge is not is hammmer");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void charge(Charger pin) {
        System.out.println("running inside the charger casting");
        if (pin != null) {
            pin.plugIn();
            if (pin instanceof FastCharger) {
                FastCharger fst = (FastCharger) pin;
                fst.quickCharge();
            } else {
                System.out.println("fast charger is not is smart");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void bit(Bat sht) {
        System.out.println("running inside the bat casting");
        if (sht != null) {
            sht.swing();
            if (sht instanceof CricketBat) {
                CricketBat crkt = (CricketBat) sht;
                ((CricketBat) sht).hitBall();
            } else {
                System.out.println("bat is not is cricket bat");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void idl(Idol marble) {
        System.out.println("running inside the elivator casting");
        if (marble != null) {
            marble.worship();
            if (marble instanceof StoneIdol) {
                StoneIdol smtel = (StoneIdol) marble;
                smtel.polish();
            } else {
                System.out.println("stone  is not in idol");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void green(Chilli spce) {
        System.out.println("running inside the chilli casting");
        if (spce != null) {
            spce.spiceUp();
            if (spce instanceof GreenChilli) {
                GreenChilli chill = (GreenChilli) spce;
                chill.makePickle();
            } else {
                System.out.println("chilli is not is green");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void haven(Chikmagalru cool) {
        System.out.println("running inside the chikkamaglru casting");
        if (cool != null) {
            cool.ckmgr();
            if (cool instanceof Sakre) {
                Sakre sugar = (Sakre) cool;
                sugar.sakre();
            } else {
                System.out.println("sakre is not is chikkamagluru");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void rail(Metro speed) {
        System.out.println("running inside the metro casting");
        if (speed != null) {
            speed.travel();
            if (speed instanceof ExpressMetro) {
                ExpressMetro express= (ExpressMetro) speed;
                express.speed();
            } else {
                System.out.println(" exprress is not is matro");
            }
        } else {
            System.out.println("value is null");
        }
    }
    public void dl(Dell lght) {
        System.out.println("running inside the dell casting");
        if (lght != null) {
            lght.dell();
            if (lght instanceof Monitor) {
                Monitor express = (Monitor) lght;
                ((Monitor) lght).display();
            } else {
                System.out.println(" monter is not is dell");
            }
        } else {
            System.out.println("value is null");
        }

    }
    public void mlk(Milk wht) {
        System.out.println("running inside the milk casting");
        if (wht != null) {
            wht.drink();
            if (wht instanceof FlavoredMilk) {
                FlavoredMilk flacvr = (FlavoredMilk) wht;
               flacvr.addFlavor();
            } else {
                System.out.println(" dflavor is not is milk");
            }
        } else {
            System.out.println("value is null");
        }

    }




}



