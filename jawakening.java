package jawakening;

import java.util.Scanner;

public class jawakening {

		static int valinta;
		static String hahmoNimi;
		static int vaikeustaso;
		static Scanner lukija = new Scanner(System.in);

		public static void main(String[] args) {

			System.out.println("\r\n" + "\r\n" + "     _  ___      ___   _  _____ _  _ ___ _  _  ___ \r\n"
					+ "  _ | |/_\\ \\    / /_\\ | |/ / __| \\| |_ _| \\| |/ __|\r\n"
					+ " | || / _ \\ \\/\\/ / _ \\| ' <| _|| .` || || .` | (_ |\r\n"
					+ "  \\__/_/ \\_\\_/\\_/_/ \\_\\_|\\_\\___|_|\\_|___|_|\\_|\\___|\r\n"
					+ "                                                   \r\n" + "\r\n" + "");
			System.out.println("		***Created by: ***");
			System.out.println("	  Arttu Pahkin & Ville Jaatinen	 ");
			System.out.println("");

			// Pyydetään käyttäjältä hahmon nimi

			System.out.println("Nimeä hahmosi:");
			hahmoNimi = lukija.nextLine();

			System.out.println("Hei " + hahmoNimi + "! Aloitetaan seikkailu!");
			System.out.println();

			// Vaikeustason valinta

			System.out.println("Vaikeustasot:\n" + "1. Normaali\n" + "2. Zero Deaths");
			vaikeustaso = lukija.nextInt();

			// Kysytään kunnes käyttäjä antaa kelvollisen syötteen
			if (vaikeustaso > 2 || vaikeustaso < 1)

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-2 vaikeustason valitsemiseen.");
					vaikeustaso = lukija.nextInt();

				} while (vaikeustaso > 2 || vaikeustaso < 1);

			// Talletetaan valinta muuttujaan vaikeustaso. Muuttujan arvo = elämien määrä
			// (hyödynnetään for loopissa)

			if (vaikeustaso == 1 || vaikeustaso == 2)
				switch (vaikeustaso) {

				case 1:
					vaikeustaso = 5;

					System.out.println("Normaali vaikeustaso valittu.");
					break;

				case 2:
					vaikeustaso = 1;

					System.out.println("Zero Deaths valittu. Sinulta ei ainakaan puutu rohkeutta...");
					break;
				}

			System.out.println();

			System.out.println("[PAINA ENTER ALOITTAAKSESI PELIN]");
			lukija.nextLine();
			lukija.nextLine();

			System.out.println(
					"Heräät kosteasta ojanpenkasta. \nOlet pukeutunut likaisiin housuihin ja ohueen paitaan. \nEt muista mitään mutta repussasi lukee nimi");

			System.out.println("\"" + hahmoNimi
					+ "… olenko se todella minä?” ajattelet kun nouset jaloillesi ja näet vieressä olevan tien vievän syvälle metsään."
					+ "\nMetsän lumo houkuttelee sinut sitä päin ja ennen kun huomaatkaan, olet keskellä harmaata, pimeää metsää.");
			System.out.println();
			System.out.println("Näet pimeän polun jakaantuvan kahtia edessäsi. "
					+ "\nMolemmat suunnat vaikuttavat samanlaisilta, joskin tunnet oikeanpuoleiselta polulta hennon tuulenvireen virtaavan poskeasi vasten.");
			System.out.println("1: Kulje oikealle \n2: Kulje vasemmalle");
			System.out.println("");
			valinta = lukija.nextInt();
			if (valinta > 2 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-2 vaikeustason valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 2 || valinta < 1);
			}

			if (valinta == 1) {
				oikeapolku();
			} else if (valinta == 2) {
				vasenpolku();
			}

		}

		//OIKEA POLKU
		
		private static void oikeapolku() {
			System.out.println("Astut tuulenvireen suuntaan ja tunnet sen kylmenevän jokaisella askeleella. "
					+ "\nPian huomaat olevasi kivisellä rannalla. Koitat tirkistellä vastarantaa mutta siniharmaan taivaan alla kiiltää loputon vesi. "
					+ "\nKuulet kauempaa rantaa työskentelyn ääniä. Huomaat siellä kaksi miestä veneen ääressä. "
					+ "\nVene näyttää olevan täynnä jauhopusseja. Miehet huomaavat sinut ja viittovat lähemmäs. "
					+ "\nKun kävelet lähemmäksi, huomaat veneen olevan jumissa vedenrajassa miesten yrittäessä saada sitä irti.");
			System.out.println("");
			System.out.println("[PAINA ENTER]");
			lukija.nextLine();
			lukija.nextLine();
			// tarina jatkuu metodien avulla
			oikeaPolkuTehtävä1();
			oikeaPolkuTehtävä2();
			oikeaPolkuTehtävä3();
			oikeaPolkuTehtävä4();
		}

		private static void oikeaPolkuTehtävä1() {
			System.out.println("”Hei sinä! Voiks auttaa meit tän kaa?” toinen miehistä sanoo ja viittoo venettä kohti. "
					+ "\nMietit jauhopussien määrää veneen kyydissä ja arvelet, onkohan niitä liikaa. "
					+ "Veneen koko ja rakenne vihjaavat sen kantavuuden olevan noin 300kg. "
					+ "\nJauhopussien kyljessä oleva luku kertoo niiden painavat 30 kiloa per pussi. Veneen kyydissä on 12 pussia. "
					+ "\nMiehet kumpikin näyttävät painavan noin sata kiloa.");
			System.out.println("Monta pussia ehdotat, että miehet ottavat mukaansa veneeseen?");
			System.out.println("");
			System.out.println("1: 3 pussia \n2: 5 pussia \n3: 10 pussia");
			System.out.println("");
			valinta = lukija.nextInt();

			if (valinta > 3 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-3 vaihtoehdon valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 3 || valinta < 1);
			}

			if (valinta == 1) {
				System.out.println(
						"Kysyt miehiä karsimaan lastin kolmeen pussiin jauhoa. \nHe nauravat sinulle mutta selityksiesi jälkeen suostuvat kokeilemaan. "
								+ "\nVene kelluu ja miehet pääsevät liikkeelle mutta murehtivat jälkeen jääneitä yhdeksää pussia jauhoja.");
			} else if (valinta >= 2) {
				System.out.println(
						"Kysyt miehiä karsimaan lastia ja pienen suostuttelun jälkeen he heittävät muutaman kassin rannalle. "
								+ "\nMiehet saavat työnnettyä veneen veteen mutta heti kun yrittävät hypätä kyytiin, vene kaatuu ja uppoaa. "
								+ "\nVihaiset miehet kaivavat puukot taskuistaan ja puukottavat sinua.");
				System.out.println("[Elämiä jäljellä: " + (vaikeustaso - 1) + "]");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				vaikeustaso = vaikeustaso - 1;
				if (vaikeustaso > 0) {
					oikeaPolkuTehtävä1();
				}
				if (vaikeustaso == 0) {
					peliohi();
				}
			} else {
				sopiva();
				System.out.println("");
				oikeaPolkuTehtävä1();
			}

		}

		private static void oikeaPolkuTehtävä2() {
			System.out.println("");
			System.out.println(
					"Levähdät hetkeksi jauhopussien päälle ja nukahdat nopeasti. \nKun heräät, on miltei pimeää. Merituulen viileys paleltaa sinua.");
			System.out.println("");
			System.out.println("1: Leikkaa kankaisista jauhopusseista kaapu itsellesi \n2: Älä leikkaa kaapua");
			System.out.println("");
			valinta = lukija.nextInt();

			if (valinta > 2 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-2 vaihtoehdon valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 2 || valinta < 1);
			}

			if (valinta == 1) {
				System.out.println("Etsit rannalta teräväkärkisen kiven, jolla alat pilkkomaan pusseja auki. "
						+ "\nMuutaman nyljetyn pussin jälkeen olet saanut kyhättyä kaavun ja tunnet sen antavan lämmön välittömästi pukiessasi sen päälle.");
			} else if (valinta == 2) {
				System.out.println("Hyvin nopeasti vyöryvä yöpakkanen jäädyttää sinut kuoliaaksi jauhopussien viereen.");
				System.out.println("[Elämiä jäljellä: " + (vaikeustaso - 1) + "]");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				vaikeustaso = vaikeustaso - 1;
				if (vaikeustaso > 0) {
					oikeaPolkuTehtävä2();
				}
				if (vaikeustaso == 0) {
					peliohi();
				}
			} else {
				sopiva();
				System.out.println("");
				oikeaPolkuTehtävä2();
			}

		}

		private static void oikeaPolkuTehtävä3() {
			System.out.println("");
			System.out.println("Päätät tutkia reppusi sisällön ja löydät tulitikkuaskin. "
					+ "\nTunnet sisällä kolistelevan noin kolme tikkua. \nEt tiedä tarkalleen, miten nuotio tehdään mutta sinun täytyy yrittää kylmän pimeyden vyöryessä yllesi.");
			System.out.println("");
			System.out.println("1: Kasaa pieni vuori jauhoista ja heitä sytytetty tulitikku siihen "
					+ "\n2: Kerää kuivia lehtiä ja tikkuja viereisestä metsästä ja kokoa nuotio "
					+ "\n3: Sytytä kasaamasi kaapu tuleen");
			System.out.println("");
			valinta = lukija.nextInt();

			if (valinta > 3 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-3 vaihtoehdon valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 3 || valinta < 1);
			}

			if (valinta == 2) {
				System.out.println("Käyt keräämässä kätesi täydeltä lehtiä ja tikkuja ja kokoat niistä pienen kukkulan. "
						+ "\nYrität sytyttää kukkulaa mutta tuuli sammuttaa ensimmäisen tulitikkusi. "
						+ "\nToinen tulitikku sytyttää muutaman lehden tuleen joka onneksi leviää viimein nuotioksi. ");
			} else if (valinta == 1) {
				System.out.println("Keräät maassa olevat jauhot käsilläsi pieneksi vuoreksi. "
						+ "\nMerituuli puhaltaa osan pois mutta jäljelle jäävään kukkulaan heität sytytetyn tulitikun. "
						+ "\nTulitikku sammuu välittömästi ja yrität uudelleen, kunnes aski on tyhjä. "
						+ "\nPimeys on jo laskeutunut ja kuulet susilauman puurajassa. \nPakenet merelle mutta et muista miten uidaan ja hukut nopeasti.");
				System.out.println("[Elämiä jäljellä: " + (vaikeustaso - 1) + "]");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				vaikeustaso = vaikeustaso - 1;
				if (vaikeustaso > 0) {
					oikeaPolkuTehtävä3();
				}
				if (vaikeustaso == 0) {
					peliohi();
				}
			} else if (valinta == 3) {
				System.out.println("Riisut kaapusi ja tunnet jäätävän kylmyyden kehollasi. "
						+ "\nYrität täristen sytyttää kaapua tuleen mutta katkaiset kaksi ensimmäistä tulitikkua. "
						+ "\nViimeinen syttyy ja onnistut sytyttämään kaapusi tuleen. \nSe tarjoama valo paljastaa loistavia silmäpareja puunrajassa. "
						+ "\nPaalu palaa loppuun hyvin nopeasti ja pimeyden langetessa sudet hyökkäävät ja raatelevat sinut.");
				System.out.println("[Elämiä jäljellä: " + (vaikeustaso - 1) + "]");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				vaikeustaso = vaikeustaso - 1;
				if (vaikeustaso > 0) {
					oikeaPolkuTehtävä3();
				}
				if (vaikeustaso == 0) {
					peliohi();
				}
			} else {
				sopiva();
				System.out.println("");
				oikeaPolkuTehtävä3();
			}
		}

		private static void oikeaPolkuTehtävä4() {
			System.out.println("");
			System.out.println("Tuli valaisee rantaa, polkua sekä metsän rajaa. "
					+ "\nKuulet rapinaa metsästä ja käännyt katsomaan huomaten ainakin kolme sutta aivan puurajassa. "
					+ "\nNouset nopeasti seisomaan ja mietit mitä voit tehdä susia vastaan.");
			System.out.println("");
			System.out.println(
					"1: Leiki kuollutta \n2: Ota suurehko tulessa oleva oksa ja huido sillä lähenevää susilaumaa \n3: Juokse pakoon");
			System.out.println("");
			valinta = lukija.nextInt();

			if (valinta > 3 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-3 vaihtoehdon valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 3 || valinta < 1);
			}

			if (valinta == 1) {
				System.out.println("Kaadut nopeasti maahan ja pysyt aivan liikkumatta ja hiljaa. "
						+ "\nSudet lähestyvät hitaasti mutta luulevat sinua kaukaa jauhopussiksi ja eivät uskalla tulla tutkimaan lähempää sillä kaaduit aivan nuotion viereen ja sudet pelkäävät roihuavaa tulta vieressäsi. "
						+ "\nPienen ajan kuluttua uskallat nostaa päätäsi ja näet että sudet ovat poissa. \nMakaat maassa vielä hieman pidempään, peloillasi ja tulen hiipuessa. \nLopulta nouset ylös ja haet lisää puita nuotioon.");
				System.out.println("");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				System.out.println("Selviät aamuun asti ja auringon sarastaessa huomaan veneen lähestyvän. "
						+ "\nKaksi miestä eiliseltä ovat palanneet jauhojaan varten. "
						+ "\nKun he huomaavat, että olet leikannut pusseja auki kaapua varten, he sitovat sinut ja heittävät veneeseensä. "
						+ "\n”Myymme sinut sitten jauhojen sijasta” ");
				loppu();
			} else if (valinta == 2) {
				System.out.println("Otat panikoiden tulessa olevan oksan nuotiosta ja huidot sitä läheneviä susia kohti. "
						+ "\nVoimakas merituuli ja huidontasi sammuttavat oksan nopeasti ja sudet hyökkäävät kimppuusi.");
				System.out.println("[Elämiä jäljellä: " + (vaikeustaso - 1) + "]");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				vaikeustaso = vaikeustaso - 1;
				if (vaikeustaso > 0) {
					oikeaPolkuTehtävä4();
				}
				if (vaikeustaso == 0) {
					peliohi();
				}
			} else if (valinta == 3) {
				System.out.println(
						"Juokset pakoon kohti polkua mikä toi sinut tälle rannalle mutta pimeydessä et näe mihin astut ja kompastut kiveen. "
								+ "\nSusilauma raatelee sinut.");
				System.out.println("[Elämiä jäljellä: " + (vaikeustaso - 1) + "]");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				vaikeustaso = vaikeustaso - 1;
				if (vaikeustaso > 0) {
					oikeaPolkuTehtävä4();
				}
				if (vaikeustaso == 0) {
					peliohi();
				}
			} else {
				sopiva();
				System.out.println("");
				oikeaPolkuTehtävä4();
			}
		}

		//VASEN POLKU
		
		private static void vasenpolku() {
			System.out.println("Viileä tuulenvire ei houkuttele sinua ja päätät kävellä toiseen suuntaan. "
					+ "\nPian polun varrella huomaat melko ränsistyneen mökin. "
					+ "Savupiipusta tuleva savu viittaa, että hökötys on asuttu. \nKävelet mökin ovelle. "
					+ "Koputat oveen kolmesti ja muutaman kymmenen sekunnin kuluttua ovi aukeaa hieman ja raosta kurkistaa vanhan miehen silmä. "
					+ "\n”M-Mitäh? " + hahmoNimi + "? Ei voi olla…” Ihmettelet miten tämä vanha mies tiesi nimesi. "
					+ "\nMies kutsuu sinut sisään ja sieltä hohkaava lämpö houkuttelee sinut vastaanottamaan kutsun.");
			System.out.println("”En voi uskoa, että palasit” mies sanoo.");
			vasenPolkuTehtävä1();
			vasenPolkuTehtävä2();
			vasenPolkuBoss();
			vasenPolkuEnding();

		}

		private static void vasenPolkuTehtävä1() {
			System.out.println("");
			System.out.println("Mies katsoo sinua odottaen jonkinlaista kommunikaatiota.[Miten vastaat]");
			System.out.println(
					"1: \"Kuka sinä olet?\" \n2: \"Aa juu " + hahmoNimi + " sehän olen minä\" \n3: *Tuijota miestä*");
			System.out.println("");
			valinta = lukija.nextInt();

			if (valinta > 3 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-3 vaihtoehdon valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 3 || valinta < 1);
			}

			if (valinta == 2) {
				System.out.println("*****");
				System.out.println(
						"”Miksi palasit näin monen vuoden jälkeen? Noh se ei ole tärkeää… toivoisin että voisit auttaa minua erään asian kanssa” mies tokaisee.");
			} else if (valinta == 1) {
				System.out.println("*****");
				System.out.println(
						"Kysyt mieheltä, kuka hän on. \n”Mitä? Etkö muista? O-olen isäsi, Juhani” \nKatsot häntä pitkään yrittäen muistaa jotakin. "
								+ "\nEt onnistu ja hän on edelleen tuntematon vanha mies. \nSaat miehestä kylmiä väreitä ja päätät liueta paikalta. "
								+ "\nPeruuttaessasi pois ovelta kompastut omiin jalkoihisi, ja murrat kallosi talon kiviportaisiin.");
				System.out.println("[Elämiä jäljellä: " + (vaikeustaso - 1) + "]");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				vaikeustaso = vaikeustaso - 1;
				if (vaikeustaso > 0) {
					vasenPolkuTehtävä1();
				}
				if (vaikeustaso == 0) {
					peliohi();
				}
			} else if (valinta == 3) {
				System.out.println("*****");
				System.out.println("Tuijotat miestä pitkään, kunnes hän alkaa kiusaantuneesti katselemaan muualle. "
						+ "\nJatkat tuijottamista ja hetken kuluttua mies kysyy, oletko kunnossa. "
						+ "\nJatkat tuijottamista ja hän ehdottaa uudenlaista lääkettä. Hän nousee ylös ja kävelee talon nurkassa olevan hyllyn luo. "
						+ "\nHylly on täynnä lasipurkkeja ja -pulloja jokainen miltei pullollaan erivärisiä nesteitä. Mies poimii yhden niistä ja kävelee takaisin. "
						+ "\n”Tein tämän viime viikolla, en ole kerennyt kokeilemaan vielä.” Hän ojentaa pullon sinulle samalla kun et ole vieläkään lopettanut tuijottamista. "
						+ "Hän juottaa sinulle kulauksen. "
						+ "\nNäkösi pimenee ja kaadut maahan. Mies on hymäilee kylmästi ja alkaa raahata kylmentyvää ruumistasi kohti kellaria."
						+ "\nViimeisellä silmänräpäytykselläsi näet kellarin kelmeässä valossa lihakoukun ja aiempien matkaajien luurankoja."
						+ "\nEt ole ensimmäinen, ja tuskin myöskään viimeinen...");
				System.out.println("[Elämiä jäljellä: " + (vaikeustaso - 1) + "]");
				System.out.println("[PAINA ENTER]");
				lukija.nextLine();
				lukija.nextLine();
				vaikeustaso = vaikeustaso - 1;
				if (vaikeustaso > 0) {
					vasenPolkuTehtävä1();
				}
				if (vaikeustaso == 0) {
					peliohi();
				}
			} else {
				sopiva();
				System.out.println("");
				vasenPolkuTehtävä1();
			}
		}

		private static void vasenPolkuTehtävä2() {
			System.out.println(
					"Mies johdattaa sinut nurkassa olevan hyllyn luo. Hylly on pullollaan lasipurkkeja täynnä värikkäitä nesteitä. "
							+ "\nMies poimii oranssin värisen purkin ja avaa sen varovasti. ”Haistaisitko tätä?” mies kysyy ja ojentaa purkin nenäsi eteen. "
							+ "\nTunnet polttavan hajun syvällä nenässäsi miltei välittömästi ja vetäydyt poispäin purkista. "
							+ "\n”Noinko paha vai?” mies tokaisee ja kaivaa pienen viherkasvin eräästä hyllyn laatikosta. "
							+ "\nHän kaataa hieman nestettä kasvin päälle ja lähes heti koko kasvi syttyy tuleen. ”ÄÄÄK!” mies huutaa ja tiputtaa kasvin lattialle. "
							+ "\nTuli leimahtaa ja tarttuu pinoon sanomalehtiä.");
			System.out.println("");
			System.out.println("1: Juokse talosta ulos \n2: Täytä kattila vedellä ja heitä se tuleen");
			System.out.println("");
			valinta = lukija.nextInt();

			if (valinta > 2 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-2 vaihtoehdon valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 2 || valinta < 1);
			}

			if (valinta == 2) {
				System.out.println("*****");
				System.out.println("Juokset nopeasti keittiöön ja poimit suurimman kattilan minkä näet. "
						+ "\nTäytät kattilan vedellä ja kiiruhdat takaisin. \nHeität vedet tuleen ja se sammuu hieman. "
						+ "\nToistat samaa muutaman kerran kunnes tulipalo on täysin sammunut.");
				vasenPolkuValintaA();
			} else if (valinta == 1) {
				System.out.println("*****");
				System.out.println(
						"Kiiruhdat paniikissa talosta ulos. Kuulet ulkoa tulen laajenevan ja miehen kauhistuneen huudon");
				vasenPolkuValintaB();
			} else {
				sopiva();
				System.out.println("");
				vasenPolkuTehtävä2();
			}

		}

		private static void vasenPolkuValintaA() {
			//Yllätyskuolema
			System.out.println();
			System.out.println("*****");
			System.out.println("Nostat katseesi ja huomaat kauhuksesi miehen lukinneen kaikki uloskäynnit tulen viedessä huomiosi. "
					+ "\nMiehen heittäessä hupullisen kaapunsa pois, tunnistat tämän välittömästi."
					+ "\nUlrich Kallosaha! Tuo takametsien druidi ja kuningaskunnan pelätyin kannibaali!"
					+ "\nYrität epätoivoisesti löytää pakoreittiä, mutta tiedät jo itsekin sen olevan liian myöhäistä."
					+ "\nMustan magian taitajana Ulrich loihtii ranteitasi ja nilkkojasi kylmäävät kahleet etkä kykene enää liikkumaan."
					+ "\nEnnen kuin huomaatkaan Ulrich on napannut käteensä tikarin, jolla hän kaivertaa rintakehäsi auki."
					+ "\nTunnet sielun karkaavan kehostasi Ulrichin nostaessa yhä sykkivän sydämesi käteensä.");
			yllätysLoppu();

		}

		private static void vasenPolkuValintaB() {
			// Pako ja totuuden kohtaaminen
			System.out.println("Vilkaiset taaksesi ja näät talon luhistuvan silmissä liekkien keskelle."
					+ "\nYllätykseksesi mies kävelee liekeistä vahingoittumattomana, tälläkertaa ilman hupullista kaapuaan."
					+ "\nTunnistat miehen välittömästi. Ulrich Kallosaha! Tuo takametsien druidi ja kuningaskunnan pelätyin kannibaali!"
					+ "\n”En pitänyt sinua pelkurina, " + hahmoNimi + ". Kuka vain normaali ihminen olisi pyrkinyt sammuttamaan tulen,"
					+ "\nmikä olisi antanut minulle aikaa estää pakosi!”"
					+ "\n”Nyt pakotat minut kuitenkin turvautumaan mustaan magiaan!”");

		}
		
		private static void vasenPolkuBoss() {
			
			System.out.println("Ulrich noituu syvän kuilun Helvettiin, josta nousee jättiläismäinen kolmipäinen kerberos."
					+ "\nKerberos valmistautuu hyökkäämään kolmen kitansa voimin."
					+ "\nValmistaudut väistämän. Et tiedä suuntaa mutta vaistosi ohjaa sinut hyppäämään");
			System.out.println();
			System.out.println("1: Oikealle \n2: Vasemmalle");
			System.out.println("");
			valinta = lukija.nextInt();

			if (valinta > 2 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-2 vaihtoehdon valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 2 || valinta < 1);
			}

			if (valinta == 1) {
				System.out.println("*****");
				System.out.println("Onnistut väistämään pedon ensimmäisen iskun.");
				vasenPolkuBossFight();
			} else if (valinta == 2) {
				System.out.println("*****");
				System.out.println(
						"Väistät pedon iskun, mutta samalla hyppäät orjantappurapensaaseen ja menetät yhden elämän.");
				vaikeustaso = vaikeustaso-1;
				if(vaikeustaso == 0) {
					peliohi();
				}
				else {
				vasenPolkuBossFight();}
			} else {
				sopiva();
				System.out.println("");
				vasenPolkuBoss();
			}
			
		}
		
		private static void vasenPolkuBossFight() {
			
			System.out.println();
			System.out.println("BOSSFIGHT");
			System.out.println("Elämät: "+ vaikeustaso + "       Kerberos: 15");
			System.out.println();
			System.out.println("Päädyt erinäisten pelonsekaisten vaiheiden jälkeen järkäleen taakse."
					+ "\nOnni on todella puolellasi sillä löydät järkäleen takaa piilon, joka on täynnä aseita."
					+ "\nOn aika taistella, toteat mielessäsi. Piilossa on JOUSIPYSSY, TIKARI ,KEIHÄS ja KIVI.");
			System.out.println();
			taisteluloop();
			
		}
			
			private static void taisteluloop() {
				
				int kerberos = 15;
				int jousipyssy = 8;
				int tikari = 2;
				int keihäs = 4;
				int kivi =15;
				
			System.out.println("[Tästä lähtien jokainen käyttämäsi vuoro vie sinulta yhden elämän. Saat valitan joka kierros aseen,"
					+ "\njoka vie Kerberokselta tietyn määrän elämiä pois. Kerberoksella on 15 elämää.]");
			System.out.println();
			
			do {
			System.out.println("Millä aseella hyökkäät?");
			System.out.println(
					"1: JOUSIPYSSY \n2: TIKARI \n3: KEIHÄS \n4: KIVI");
			
			//Taistelu loop
			
			System.out.println("");
			valinta = lukija.nextInt();

			if (valinta > 4 || valinta < 1) {

				do {

					System.out.println("Valinta ei ole kelvollinen, käytä numeroita 1-4 vaihtoehdon valitsemiseen.");
					valinta = lukija.nextInt();

				} while (valinta > 4 || valinta < 1);
			}

			if (valinta == 1) {
				kerberos = kerberos - jousipyssy;
				vaikeustaso = vaikeustaso -1;
				
				System.out.println("*****");
				System.out.println("Elämät: "+ vaikeustaso + "       Kerberos: " + kerberos);
				System.out.println("Jousipyssyn nuoli lävistää Kerberoksen lihaksen tehokkaasti, ja saa pedin kirkumaan tuskasta.");
			}
			
			else if (valinta == 2) {
				kerberos = kerberos - tikari;
				vaikeustaso = vaikeustaso -1;
				
				System.out.println("*****");
				System.out.println("Elämät: "+ vaikeustaso + "       Kerberos: " + kerberos);
				System.out.println("Tikari viiltää Kerberosta, muttei tee kovin paljon vahinkoa.");
			}
			
			else if (valinta == 3) {
				kerberos = kerberos - keihäs;
				vaikeustaso = vaikeustaso -1;
				
				System.out.println("*****");
				System.out.println("Elämät: "+ vaikeustaso + "       Kerberos: " + kerberos);
				System.out.println("Keihäs osoittautuu kohtuulliseksi aseeksi pidemmältä etäisyydeltä, ja pisto vahingoittaa Kerberosta.");
			}
			
			else if (valinta == 4) {
				kerberos = kerberos - kivi;
				
				System.out.println("*****");
				System.out.println("Elämät: "+ vaikeustaso + "       Kerberos: " + kerberos);
				System.out.println("Kivi lentää Kerberoksen yli, mutta osuu Ulrichiin tappavasti.");
			}
			
			else {
				sopiva();
				System.out.println("");
				vasenPolkuBoss();
			}
			
			}while (kerberos > 0 && vaikeustaso > 0);
			
			
		}
			
		private static void vasenPolkuEnding() {
			System.out.println();
			System.out.println("Viimeisen iskun jälkeen Kerberos ja Ulrich imeytyvät sulkeutuvan Helvetin portin mukana Helvettiin."
					+ "\nHaukot henkeäsi, etkä voi uskoa että olet vielä hengissä."
					+ "\n" +hahmoNimi +", nimi joka tullaan muistamaan ikuisesti Kerberoksen ja Ulrich Kallosahan selättäjänä!");
			System.out.println();
			System.out.println("***ONNEKSI OLKOON, LÄPÄISIT PELIN JA SINULLE JÄI " + vaikeustaso +" ELÄMÄÄ!***");
			System.out.println();
			System.out.println("  _    ___  ___ ___ _   _ _ \r\n" + 
					" | |  / _ \\| _ | _ | | | | |\r\n" + 
					" | |_| (_) |  _|  _| |_| |_|\r\n" + 
					" |____\\___/|_| |_|  \\___/(_)\r\n" + 
					"                            ");
			System.out.println("*Pelinkehittäjät: Arttu Pahkin ja Ville Jaatinen*");
			
		}

		
		//MUITA KÄYTETTÄVIÄ METODEJA
		
		private static void loppu() {
			System.out.println("");
			System.out.println("  _    ___  ___ ___ _   _ _ \r\n" + 
					" | |  / _ \\| _ | _ | | | | |\r\n" + 
					" | |_| (_) |  _|  _| |_| |_|\r\n" + 
					" |____\\___/|_| |_|  \\___/(_)\r\n" + 
					"                            ");
			System.out.println("***ONNEKSI OLKOON, LÄPÄISIT PELIN JA SINULLE JÄI " + vaikeustaso +" ELÄMÄÄ!***");
			System.out.println("");
			System.out.println("*Pelinkehittäjät: Arttu Pahkin ja Ville Jaatinen*");
			System.exit(0);
		}
		
		private static void yllätysLoppu() {
			System.out.println("");
			System.out.println("  _    ___  ___ ___ _   _ _ \r\n" + 
					" | |  / _ \\| _ | _ | | | | |\r\n" + 
					" | |_| (_) |  _|  _| |_| |_|\r\n" + 
					" |____\\___/|_| |_|  \\___/(_)\r\n" + 
					"                            ");
			System.out.println("Valitettavasti kaikki tarinat eivät pääty onnellisesti...");
			System.out.println("");
			System.out.println("*Pelinkehittäjät: Arttu Pahkin ja Ville Jaatinen*");
			System.exit(0);
		}

		private static void peliohi() {
			System.out.println(" _   __ _   _  _____  _      _____  _____  _ \r\n"
					+ "| | / /| | | ||  _  || |    |_   _||_   _|| |\r\n"
					+ "| |/ / | | | || | | || |      | |    | |  | |\r\n"
					+ "|    \\ | | | || | | || |      | |    | |  | |\r\n"
					+ "| |\\  \\| |_| |\\ \\_/ /| |____ _| |_   | |  |_|\r\n"
					+ "\\_| \\_/ \\___/  \\___/ \\_____/ \\___/   \\_/  (_)");
			System.exit(0);
		}

		private static void sopiva() {
			System.out.println("Syötä sopiva arvo");

		}

	}
