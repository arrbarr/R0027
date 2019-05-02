package jawakening;

import java.util.Scanner;

public class jawakening {
		
		static int valinta;
		static Scanner lukija = new Scanner(System.in);
		static String nimi;
		static int el�m�t = 3;
		
	public static void main(String[] args) {
		
		System.out.println("Javakening");
		
		System.out.println("Her��t kosteasta ojanpenkasta. \nOlet pukeutunut likaisiin housuihin ja ohueen paitaan. \nEt muista mit��n mutta repussasi lukee nimi (Sy�t� nimesi)");
		nimi = lukija.nextLine();
		
		System.out.println("\"" + nimi + "� olenko se todella min�?� ajattelet kun nouset jaloillesi ja n�et vieress� olevan tien viev�n syv�lle mets��n."
				+ "\nMets�n lumo houkuttelee sinut sit� p�in ja ennen kun huomaatkaan, olet keskell� harmaata, pime�� mets��.");
		System.out.println();
		System.out.println("N�et pime�n polun jakaantuvan kahtia edess�si. "
				+ "\nMolemmat suunnat vaikuttavat samanlaisilta, joskin tunnet oikeanpuoleiselta polulta hennon tuulenvireen virtaavan poskeasi vasten.");
		System.out.println("1: Kulje oikealle \n2: Kulje vasemmalle");
		System.out.println("");
		valinta = lukija.nextInt();
		
		if (valinta==1) {
			oikeapolku();
		}
		else if(valinta==2) {
			vasenpolku();
		}
		
	}

	private static void oikeapolku() {
		System.out.println("Astut tuulenvireen suuntaan ja tunnet sen kylmenev�n jokaisella askeleella. "
				+ "\nPian huomaat olevasi kivisell� rannalla. Koitat tirkistell� vastarantaa mutta siniharmaan taivaan alla kiilt�� loputon vesi. "
				+ "\nKuulet kauempaa rantaa ty�skentelyn ��ni�. Huomaat siell� kaksi miest� veneen ��ress�. "
				+ "\nVene n�ytt�� olevan t�ynn� jauhopusseja. Miehet huomaavat sinut ja viittovat l�hemm�s. "
				+ "\nKun k�velet l�hemm�ksi, huomaat veneen olevan jumissa vedenrajassa miesten yritt�ess� saada sit� irti.");
		System.out.println("");
		System.out.println("[PAINA ENTER]");
		lukija.nextLine();
		lukija.nextLine();
		//tarina jatkuu metodien avulla
		oikeaPolkuTeht�v�1();
		oikeaPolkuTeht�v�2();
		oikeaPolkuTeht�v�3();
		oikeaPolkuTeht�v�4();
		}

	private static void oikeaPolkuTeht�v�1() {
		System.out.println("�Hei sin�! Voiks auttaa meit t�n kaa?� toinen miehist� sanoo ja viittoo venett� kohti. "
				+ "\nMietit jauhopussien m��r�� veneen kyydiss� ja arvelet, onkohan niit� liikaa. "
				+ "Veneen koko ja rakenne vihjaavat sen kantavuuden olevan noin 300kg. "
				+ "\nJauhopussien kyljess� oleva luku kertoo niiden painavat 30 kiloa per pussi. Veneen kyydiss� on 12 pussia. "
				+ "\nMiehet kumpikin n�ytt�v�t painavan noin sata kiloa.");
		System.out.println("Monta pussia ehdotat, ett� miehet ottavat mukaansa veneeseen?");
		System.out.println("");
		System.out.println("1: 3 pussia \n2: 5 pussia \n3: 10 pussia");
		System.out.println("");
		valinta = lukija.nextInt();
		
		if (valinta==1) {
			System.out.println("Kysyt miehi� karsimaan lastin kolmeen pussiin jauhoa. \nHe nauravat sinulle mutta selityksiesi j�lkeen suostuvat kokeilemaan. "
					+ "\nVene kelluu ja miehet p��sev�t liikkeelle mutta murehtivat j�lkeen j��neit� yhdeks�� pussia jauhoja.");
		}
		else if (valinta>=2) {
			System.out.println("Kysyt miehi� karsimaan lastia ja pienen suostuttelun j�lkeen he heitt�v�t muutaman kassin rannalle. "
					+ "\nMiehet saavat ty�nnetty� veneen veteen mutta heti kun yritt�v�t hyp�t� kyytiin, vene kaatuu ja uppoaa. "
					+ "\nVihaiset miehet kaivavat puukot taskuistaan ja puukottavat sinua.");
			System.out.println("[El�mi� j�ljell�: "+ (el�m�t-1) + "]");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			el�m�t = el�m�t - 1;
			if (el�m�t>0) {
				oikeaPolkuTeht�v�1();
			}
			if (el�m�t==0) {
				peliohi();
			}
		}
		else {
			sopiva();
			System.out.println("");
			oikeaPolkuTeht�v�1();
		}
		
	}

	private static void oikeaPolkuTeht�v�2() {
		System.out.println("");
		System.out.println("Lev�hd�t hetkeksi jauhopussien p��lle ja nukahdat nopeasti. \nKun her��t, on miltei pime��. Merituulen viileys paleltaa sinua.");
		System.out.println("");
		System.out.println("1: Leikkaa kankaisista jauhopusseista kaapu itsellesi \n2: �l� leikkaa kaapua");
		System.out.println("");
		valinta = lukija.nextInt();
		
		if (valinta==1) {
			System.out.println("Etsit rannalta ter�v�k�rkisen kiven, jolla alat pilkkomaan pusseja auki. "
					+ "\nMuutaman nyljetyn pussin j�lkeen olet saanut kyh�tty� kaavun ja tunnet sen antavan l�mm�n v�litt�m�sti pukiessasi sen p��lle.");
		}
		else if (valinta==2) {
			System.out.println("Hyvin nopeasti vy�ryv� y�pakkanen j��dytt�� sinut kuoliaaksi jauhopussien viereen.");
			System.out.println("[El�mi� j�ljell�: "+ (el�m�t-1) + "]");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			el�m�t = el�m�t - 1;
			if (el�m�t>0) {
				oikeaPolkuTeht�v�2();
			}
			if (el�m�t==0) {
				peliohi();
			}
		}
		else {
			sopiva();
			System.out.println("");
			oikeaPolkuTeht�v�2();
		}
		
	}

	private static void oikeaPolkuTeht�v�3() {
		System.out.println("");
		System.out.println("P��t�t tutkia reppusi sis�ll�n ja l�yd�t tulitikkuaskin. "
				+ "\nTunnet sis�ll� kolistelevan noin kolme tikkua. \nEt tied� tarkalleen, miten nuotio tehd��n mutta sinun t�ytyy yritt�� kylm�n pimeyden vy�ryess� yllesi.");
		System.out.println("");
		System.out.println("1: Kasaa pieni vuori jauhoista ja heit� sytytetty tulitikku siihen "
				+ "\n2: Ker�� kuivia lehti� ja tikkuja viereisest� mets�st� ja kokoa nuotio "
				+ "\n3: Sytyt� kasaamasi kaapu tuleen");
		System.out.println("");
		valinta = lukija.nextInt();
		
		if (valinta==2) {
			System.out.println("K�yt ker��m�ss� k�tesi t�ydelt� lehti� ja tikkuja ja kokoat niist� pienen kukkulan. "
					+ "\nYrit�t sytytt�� kukkulaa mutta tuuli sammuttaa ensimm�isen tulitikkusi. "
					+ "\nToinen tulitikku sytytt�� muutaman lehden tuleen joka onneksi levi�� viimein nuotioksi. ");
		}
		else if (valinta==1) {
			System.out.println("Ker��t maassa olevat jauhot k�sill�si pieneksi vuoreksi. "
					+ "\nMerituuli puhaltaa osan pois mutta j�ljelle j��v��n kukkulaan heit�t sytytetyn tulitikun. "
					+ "\nTulitikku sammuu v�litt�m�sti ja yrit�t uudelleen, kunnes aski on tyhj�. "
					+ "\nPimeys on jo laskeutunut ja kuulet susilauman puurajassa. \nPakenet merelle mutta et muista miten uidaan ja hukut nopeasti.");
			System.out.println("[El�mi� j�ljell�: "+ (el�m�t-1) + "]");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			el�m�t = el�m�t - 1;
			if (el�m�t>0) {
				oikeaPolkuTeht�v�3();
			}
			if (el�m�t==0) {
				peliohi();
			}
		}
		else if (valinta==3) {
			System.out.println("Riisut kaapusi ja tunnet j��t�v�n kylmyyden kehollasi. "
					+ "\nYrit�t t�risten sytytt�� kaapua tuleen mutta katkaiset kaksi ensimm�ist� tulitikkua. "
					+ "\nViimeinen syttyy ja onnistut sytytt�m��n kaapusi tuleen. \nSe tarjoama valo paljastaa loistavia silm�pareja puunrajassa. "
					+ "\nPaalu palaa loppuun hyvin nopeasti ja pimeyden langetessa sudet hy�kk��v�t ja raatelevat sinut.");
			System.out.println("[El�mi� j�ljell�: "+ (el�m�t-1) + "]");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			el�m�t = el�m�t - 1;
			if (el�m�t>0) {
				oikeaPolkuTeht�v�3();
			}
			if (el�m�t==0) {
				peliohi();
			}
		}
		else {
			sopiva();
			System.out.println("");
			oikeaPolkuTeht�v�3();
		}
	}

	private static void oikeaPolkuTeht�v�4() {
		System.out.println("");
		System.out.println("Tuli valaisee rantaa, polkua sek� mets�n rajaa. "
				+ "\nKuulet rapinaa mets�st� ja k��nnyt katsomaan huomaten ainakin kolme sutta aivan puurajassa. "
				+ "\nNouset nopeasti seisomaan ja mietit mit� voit tehd� susia vastaan.");
		System.out.println("");
		System.out.println("1: Leiki kuollutta \n2: Ota suurehko tulessa oleva oksa ja huido sill� l�henev�� susilaumaa \n3: Juokse pakoon");
		System.out.println("");
		valinta = lukija.nextInt();
		
		if (valinta==1) {
			System.out.println("Kaadut nopeasti maahan ja pysyt aivan liikkumatta ja hiljaa. "
					+ "\nSudet l�hestyv�t hitaasti mutta luulevat sinua kaukaa jauhopussiksi ja eiv�t uskalla tulla tutkimaan l�hemp�� sill� kaaduit aivan nuotion viereen ja sudet pelk��v�t roihuavaa tulta vieress�si. "
					+ "\nPienen ajan kuluttua uskallat nostaa p��t�si ja n�et ett� sudet ovat poissa. \nMakaat maassa viel� hieman pidemp��n, peloillasi ja tulen hiipuessa. \nLopulta nouset yl�s ja haet lis�� puita nuotioon.");
			System.out.println("");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			System.out.println("Selvi�t aamuun asti ja auringon sarastaessa huomaan veneen l�hestyv�n. "
					+ "\nKaksi miest� eiliselt� ovat palanneet jauhojaan varten. "
					+ "\nKun he huomaavat, ett� olet leikannut pusseja auki kaapua varten, he sitovat sinut ja heitt�v�t veneeseens�. "
					+ "\n�Myymme sinut sitten jauhojen sijasta� ");
			loppu();
		}
		else if (valinta==2) {
			System.out.println("Otat panikoiden tulessa olevan oksan nuotiosta ja huidot sit� l�henevi� susia kohti. "
					+ "\nVoimakas merituuli ja huidontasi sammuttavat oksan nopeasti ja sudet hy�kk��v�t kimppuusi.");
			System.out.println("[El�mi� j�ljell�: "+ (el�m�t-1) + "]");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			el�m�t = el�m�t - 1;
			if (el�m�t>0) {
				oikeaPolkuTeht�v�4();
			}
			if (el�m�t==0) {
				peliohi();
			}
		}
		else if (valinta==3) {
			System.out.println("Juokset pakoon kohti polkua mik� toi sinut t�lle rannalle mutta pimeydess� et n�e mihin astut ja kompastut kiveen. "
					+ "\nSusilauma raatelee sinut.");
			System.out.println("[El�mi� j�ljell�: "+ (el�m�t-1) + "]");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			el�m�t = el�m�t - 1;
			if (el�m�t>0) {
				oikeaPolkuTeht�v�4();
			}
			if (el�m�t==0) {
				peliohi();
			}
		}
		else {
			sopiva();
			System.out.println("");
			oikeaPolkuTeht�v�4();
		}
	}

	private static void vasenpolku() {
		System.out.println("Viile� tuulenvire ei houkuttele sinua ja p��t�t k�vell� toiseen suuntaan. "
				+ "\nPian polun varrella huomaat melko r�nsistyneen m�kin. "
				+ "Savupiipusta tuleva savu viittaa, ett� h�k�tys on asuttu. \nK�velet m�kin ovelle. "
				+ "Koputat oveen kolmesti ja muutaman kymmenen sekunnin kuluttua ovi aukeaa hieman ja raosta kurkistaa vanhan miehen silm�. "
				+ "\n�M-Mit�h? "+ nimi + "? Ei voi olla�� Ihmettelet miten t�m� vanha mies tiesi nimesi. "
				+ "\nMies kutsuu sinut sis��n ja sielt� hohkaava l�mp� houkuttelee sinut vastaanottamaan kutsun.");
		System.out.println("�En voi uskoa, ett� palasit� mies sanoo.");
		vasenPolkuTeht�v�1();
		vasenPolkuTeht�v�2();
		
		
	}

	private static void vasenPolkuTeht�v�1() {
		System.out.println("");
		System.out.println("Mies katsoo sinua odottaen jonkinlaista kommunikaatiota.[Miten vastaat]");
		System.out.println("1: \"Kuka sin� olet?\" \n2: \"Aa juu "+ nimi +" seh�n olen min�\" \n3: *Tuijota miest�*");
		System.out.println("");
		valinta = lukija.nextInt();
		
		if (valinta==2) {
			System.out.println("�Miksi palasit n�in monen vuoden j�lkeen? Noh se ei ole t�rke�� toivoisin ett� voisit auttaa minua er��n asian kanssa� mies tokaisee.");
		}
		else if (valinta==1) {
			System.out.println("Kysyt miehelt�, kuka h�n on. \n�Mit�? Etk� muista? O-olen is�si, Juhani� \nKatsot h�nt� pitk��n yritt�en muistaa jotakin. "
					+ "\nEt onnistu ja h�n on edelleen tuntematon vanha mies. \nMies on n�kyv�sti pettynyt ja sanoo ehk� sinun olisi paras l�hte�.");
			System.out.println("[El�mi� j�ljell�: "+ (el�m�t-1) + "]");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			el�m�t = el�m�t - 1;
			if (el�m�t>0) {
				vasenPolkuTeht�v�1();
			}
			if (el�m�t==0) {
				peliohi();
			}
		}
		else if (valinta==3) {
			System.out.println("Tuijotat miest� pitk��n, kunnes h�n alkaa kiusaantuneesti katselemaan muualle. "
					+ "\nJatkat tuijottamista ja hetken kuluttua mies kysyy, oletko kunnossa. "
					+ "\nJatkat tuijottamista ja h�n ehdottaa uudenlaista l��kett�. H�n nousee yl�s ja k�velee talon nurkassa olevan hyllyn luo. "
					+ "\nHylly on t�ynn� lasipurkkeja ja -pulloja jokainen miltei pullollaan eriv�risi� nesteit�. Mies poimii yhden niist� ja k�velee takaisin. "
					+ "\n�Tein t�m�n viime viikolla, en ole kerennyt kokeilemaan viel�.� H�n ojentaa pullon sinulle samalla kun et ole viel�k��n lopettanut tuijottamista. "
					+ "H�n juottaa sinulle kulauksen. "
					+ "\nN�k�si pimenee ja kaadut maahan. Mies on j�rkyttynyt kuolleesta ruumista kotonaan ja juo itse pullon loppuun.");
			System.out.println("[El�mi� j�ljell�: "+ (el�m�t-1) + "]");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			el�m�t = el�m�t - 1;
			if (el�m�t>0) {
				vasenPolkuTeht�v�1();
			}
			if (el�m�t==0) {
				peliohi();
			}
		}
		else {
			sopiva();
			System.out.println("");
			vasenPolkuTeht�v�1();
			}
		}
		

	private static void vasenPolkuTeht�v�2() {
		System.out.println("Mies johdattaa sinut nurkassa olevan hyllyn luo. Hylly on pullollaan lasipurkkeja t�ynn� v�rikk�it� nesteit�. "
				+ "\nMies poimii oranssin v�risen purkin ja avaa sen varovasti. �Haistaisitko t�t�?� mies kysyy ja ojentaa purkin nen�si eteen. "
				+ "\nTunnet polttavan hajun syv�ll� nen�ss�si miltei v�litt�m�sti ja vet�ydyt poisp�in purkista. "
				+ "\n�Noinko paha vai?� mies tokaisee ja kaivaa pienen viherkasvin er��st� hyllyn laatikosta. "
				+ "\nH�n kaataa hieman nestett� kasvin p��lle ja l�hes heti koko kasvi syttyy tuleen. ����K!� mies huutaa ja tiputtaa kasvin lattialle. "
				+ "\nTuli leimahtaa ja tarttuu pinoon sanomalehti�.");
		System.out.println("");
		System.out.println("1: Juokse talosta ulos \n2: T�yt� kattila vedell� ja heit� se tuleen");
		System.out.println("");
		valinta = lukija.nextInt();
		
		if (valinta==2) {
			System.out.println("Juokset nopeasti keitti��n ja poimit suurimman kattilan mink� n�et. "
					+ "\nT�yt�t kattilan vedell� ja kiiruhdat takaisin. \nHeit�t vedet tuleen ja se sammuu hieman. "
					+ "\nToistat samaa muutaman kerran kunnes tulipalo on t�ysin sammunut.");
			vasenPolkuValintaA();
		}
		else if (valinta==1) {
			System.out.println("Kiiruhdat paniikissa talosta ulos. Kuulet ulkoa tulen laajenevan ja miehen kauhistuneen huudon");
			vasenPolkuValintaB();
		}
		else {
			sopiva();
			System.out.println("");
			vasenPolkuTeht�v�2();
		}
			
	}

	private static void vasenPolkuValintaA() {
		// tuli sammutettu polku
		
	}

	private static void vasenPolkuValintaB() {
		// Karkauspolku
		
	}

	private static void loppu() {
		System.out.println("");
		System.out.println("Loppu! L�p�isit pelin!");
		System.out.println("");
		System.out.println("Pelinkehitt�j�t: Arttu Pahkin ja Ville Jaatinen");
		System.exit(0);
	}

	private static void peliohi() {
		System.out.println("Peli ohi! Sinulta loppuivat el�m�t!");
		System.exit(0);
	}

	private static void sopiva() {
		System.out.println("Sy�t� sopiva arvo");
		
	}

}
