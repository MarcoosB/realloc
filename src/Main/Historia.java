

package Main;


import back.Admin;
import back.LogrosTitle;
import imagenes.*;


public class Historia {

 GameManager gm;
 // Player player;
 Admin admin;
 String key;

 public Historia(GameManager gm, Admin admin, String key) {
  this.gm = gm;
  this.admin = admin;
  this.key = key;
 }


 public void menu(int pagina) {


  if (pagina != 4000) {

   switch (pagina) {

    case 1:

     pagina1();

     break;
    case 2:
     pagina2();
     break;
    case 3:
     pagina3();
     break;
    case 4:
     pagina4();
     break;
    case 5:
     pagina5();
     break;
    case 6:
     pagina6();
     break;
    case 7:
     pagina7();
     break;
    case 8:
     pagina8();
     break;
    case 9:
     pagina9();
     break;
    case 10:
     pagina10();
     break;
    case 11:
     pagina11();
     break;
    case 12:
     pagina12();
     break;
    case 13:
     pagina13();
     break;
    case 14:
     pagina14();
     break;
    case 15:
     pagina15();
     break;
    case 16:
     pagina16();
     break;
    case 17:
     pagina17();
     break;
    case 18:
     pagina18();
     break;
    case 19:
     pagina19();
     break;
    case 20:
     pagina20();
     break;
    case 21:
     pagina21();
     break;
    case 22:
     pagina22();
     break;
    case 23:
     pagina23();
     break;
    case 24:
     pagina24();
     break;
    case 25:
     pagina25();
     break;
    case 26:
     pagina26();
     break;
    case 27:
     pagina27();
     break;
    case 28:
     pagina28();
     break;
    case 29:
     pagina29();
     break;
    case 30:
     pagina30();
     break;
    case 31:
     pagina31();
     break;
    case 32:
     pagina32();
     break;
    case 33:
     pagina33();
     break;
    case 34:
     pagina34();
     break;
    case 35:
     pagina35();
     break;
    case 36:
     pagina36();
     break;
    case 37:
     pagina37();
     break;
    case 38:
     pagina38();
     break;
    case 39:
     pagina39();
     break;
    case 40:
     pagina40();
     break;
    case 41:
     pagina41();
     break;
    case 42:
     pagina42();
     break;
    case 43:
     pagina43();
     break;
    case 44:
     pagina44();
     break;

    case 45:
     pagina45();
     break;
    case 46:
     pagina46();
     break;
    case 47:
     pagina47();
     break;
    case 48:
     pagina48();
     break;
    case 49:
     pagina49();
     break;
    case 50:
     pagina50();
     break;
    case 51:
     pagina51();
     break;
    case 52:
     pagina52();
     break;
    case 53:
     pagina53();
     break;
    case 54:
     pagina54();
     break;
     case 55:
     pagina55();
     break;
    case 56:
     pagina56();
     break;
    case 57:
     pagina57();
     break;
    case 58:
     pagina58();
     break;
    case 59:
     pagina59();
     break;
    case 60:
     pagina60();
     break;
    case 61:
     pagina61();
     break;
    case 62:
     pagina62();
     break;
    case 63:
     pagina63();
     break;
    case 64:
     pagina64();
     break;
    case 65:
     pagina65();
     break;
    case 66:
     pagina66();
     break;
    case 67:
     pagina67();
     break;
    case 68:
     pagina68();
     break;
    case 69:
     pagina69();
     break;
    case 70:
     pagina70();
     break;
    case 71:
     pagina71();
     break;
    case 72:
     pagina72();
     break;
    case 73:
     pagina73();
     break;
    case 74:
     pagina74();
     break;
    case 75:
     pagina75();
     break;
    case 76:
     pagina76();
     break;
    case 77:
     pagina77();
     break;
    case 78:
     pagina78();
     break;
    case 79:
     pagina79();
     break;
    case 80:
     pagina80();
     break;
    case 81:
     pagina81();
     break;
    case 82:
     pagina82();
     break;
    case 83:
     pagina83();
     break;
    case 84:
     pagina84();
     break;
    case 85:
     pagina85();
     break;
    case 86:
     pagina86();
     break;
    case 87:
     pagina87();
     break;
    case 88:
     pagina88();
     break;
    case 89:
     pagina89();
     break;
    case 90:
     pagina90();
     break;
    case 91:
     pagina91();
     break;
    case 92:
     pagina92();
     break;
    case 93:
     pagina93();
     break;
    case 94:
     pagina94();
     break;
    case 95:
     pagina95();
     break;
    case 96:
     pagina96();
     break;
    case 97:
     pagina97();
     break;
    case 98:
     pagina98();
     break;
    case 99:
     pagina99();
     break;
    case 100:
     pagina100();
     break;
    case 101:
     pagina101();
     break;
    case 102:
     pagina102();
     break;
    case 103:
     pagina103();
     break;
    case 104:
     pagina104();
     break;
    case 105:
     pagina105();
     break;
    case 106:
     pagina106();
     break;
    case 107:
     pagina107();
     break;
    case 108:
     pagina108();
     break;
    case 109:
     pagina109();
     break;
    case 110:
     pagina110();
     break;
    case 111:
     pagina111();
     break;
    case 112:
     pagina112();
     break;
    case 113:
     pagina113();
     break;
    case 114:
     pagina114();
     break;
    case 115:
     pagina115();
     break;
    case 116:
     pagina116();
     break;
    case 117:
     pagina117();
     break;
    case 118:
     pagina118();
     break;
    case 119:
     pagina119();
     break;
    case 120:
     pagina120();
     break;
    case 121:
     pagina121();
     break;
    case 122:
     pagina122();
     break;
    case 123:
     pagina123();
     break;
    case 124:
     pagina124();
     break;
    case 125:
     pagina125();
     break;
    case 126:
     pagina126();
     break;
    case 127:
     pagina127();
     break;
    case 128:
     pagina128();
     break;
    case 129:
     pagina129();
     break;
    case 130:
     pagina130();
     break;
    case 131:
     pagina131();
     break;
    case 132:
     pagina132();
     break;
    case 133:
     pagina133();
     break;
    case 134:
     pagina134();
     break;
    case 135:
     pagina135();
     break;
    case 136:
     pagina136();
     break;
    case 137:
     pagina137();
     break;
    case 138:
     pagina138();
     break;
    case 139:
     pagina139();
     break;
    case 140:
     pagina140();
     break;
    case 141:
     pagina141();
     break;
    case 142:
     pagina142();
     break;
    case 143:
     pagina143();
     break;
    case 144:
     pagina144();
     break;
    case 145:
     pagina145();
     break;
    case 146:
     pagina146();
     break;
    case 147:
     pagina147();
     break;
    case 148:
     pagina148();
     break;
    case 149:
     pagina149();
     break;
    case 150:
     pagina150();
     break;
    case 151:
     pagina151();
     break;
    case 152:
     pagina152();
     break;
    case 153:
     pagina153();
     break;
    case 154:
     pagina154();
     break;
    case 155:
     pagina155();
     break;
    case 156:
     pagina156();
     break;
    case 157:
     pagina157();
     break;
    case 158:
     pagina158();
     break;
    case 159:
     pagina159();
     break;
    case 160:
     pagina160();
     break;
    case 161:
     pagina161();
     break;
    case 162:
     pagina162();
     break;
    case 163:
     pagina163();
     break;
    case 164:
     pagina164();
     break;
    case 165:
     pagina165();
     break;
    case 166:
     pagina166();
     break;
    case 167:
     pagina167();
     break;
    case 168:
     pagina168();
     break;
    case 169:
     pagina169();
     break;
    case 170:
     pagina170();
     break;
    case 171:
     pagina171();
     break;
    case 172:
     pagina172();
     break;
    case 173:
     pagina173();
     break;
    case 174:
     pagina174();
     break;
    case 175:
     pagina175();
     break;
    case 176:
     pagina176();
     break;
    case 177:
     pagina177();
     break;
    case 178:
     pagina178();
     break;
    case 179:
     pagina179();
     break;
    case 180:
     pagina180();
     break;
    case 181:
     pagina181();
     break;
    case 182:
     pagina182();
     break;
    case 183:
     pagina183();
     break;
    case 184:
     pagina184();
     break;
    case 185:
     pagina185();
     break;
    case 186:
     pagina186();
     break;
    case 187:
     pagina187();
     break;
    case 188:
     pagina188();
     break;
    case 189:
     pagina189();
     break;
    case 190:
     pagina190();
     break;
    case 191:
     pagina191();
     break;
    case 192:
     pagina192();
     break;
    case 193:
     pagina193();
     break;
    case 194:
     pagina194();
     break;
    case 195:
     pagina195();
     break;
    case 196:
     pagina196();
     break;
    case 197:
     pagina197();
     break;
    case 198:
     pagina198();
     break;
    case 199:
     pagina199();
     break;
    case 200:
     pagina200();
     break;
    case 201:
     pagina201();
     break;
    case 202:
     pagina202();
     break;
    case 203:
     pagina203();
     break;
    case 204:
     pagina204();
     break;
    case 205:
     pagina205();
     break;
    case 206:
     pagina206();
     break;
    case 207:
     pagina207();
     break;
    case 208:
     pagina208();
     break;
    case 209:
     pagina209();
     break;
    case 210:
     pagina210();
     break;
    case 211:
     pagina211();
     break;
    case 212:
     pagina212();
     break;
    case 213:
     pagina213();
     break;
    case 214:
     pagina214();
     break;
    case 215:
     pagina215();
     break;
    case 216:
     pagina216();
     break;
    case 217:
     pagina217();
     break;
    case 218:
     pagina218();
     break;
    case 219:
     pagina219();
     break;
    case 220:
     pagina220();
     break;
    case 221:
     pagina221();
     break;
    case 222:
     pagina222();
     break;
    case 223:
     pagina223();
     break;
    case 224:
     pagina224();
     break;
    case 225:
     pagina225();
     break;
    case 226:
     pagina226();
     break;
    case 227:
     pagina227();
     break;
    case 228:
     pagina228();
     break;
    case 229:
     pagina229();
     break;
    case 230:
     pagina230();
     break;
    case 231:
     pagina231();
     break;
    case 232:
     pagina232();
     break;
    case 233:
     pagina233();
     break;
    case 234:
     pagina234();
     break;
    case 235:
     pagina235();
     break;
    case 236:
     pagina236();
     break;
    case 237:
     pagina237();
     break;
    case 238:
     pagina238();
     break;
    case 239:
     pagina239();
     break;
    case 240:
     pagina240();
     break;
    case 241:
     pagina241();
     break;
    case 242:
     pagina242();
     break;
    case 243:
     pagina243();
     break;
    case 244:
     pagina244();
     break;
    case 245:
     pagina245();
     break;
    case 246:
     pagina246();
     break;
    case 247:
     pagina247();
     break;
    case 248:
     pagina248();
     break;
    case 249:
     pagina249();
     break;
    case 250:
     pagina250();
     break;
    case 251:
     pagina251();
     break;
    case 252:
     pagina252();
     break;
    case 253:
     pagina253();
     break;
    case 254:
     pagina254();
     break;
    case 255:
     pagina255();
     break;
    case 256:
     pagina256();
     break;
    case 257:
     pagina257();
     break;
    case 258:
     pagina258();
     break;
    case 259:
     pagina259();
     break;
    case 260:
     pagina260();
     break;
    case 261:
     pagina261();
     break;
    case 262:
     pagina262();
     break;
    case 263:
     pagina263();
     break;
    case 264:
     pagina264();
     break;
    case 265:
     pagina265();
     break;
    case 266:
     pagina266();
     break;
    case 267:
     pagina267();
     break;
    case 268:
     pagina268();
     break;
    case 269:
     pagina269();
     break;
    case 270:
     pagina270();
     break;
    case 271:
     pagina271();
     break;
    case 272:
     pagina272();
     break;
    case 273:
     pagina273();
     break;
    case 274:
     pagina274();
     break;
    case 275:
     pagina275();
     break;
    case 276:
     pagina276();
     break;
    case 277:
     pagina277();
     break;
    case 278:
     pagina278();
     break;
    case 279:
     pagina279();
     break;
    case 280:
     pagina280();
     break;
    case 281:
     pagina281();
     break;
    case 282:
     pagina282();
     break;
    case 283:
     pagina283();
     break;
    case 284:
     pagina284();
     break;
    case 285:
     pagina285();
     break;
    case 286:
     pagina286();
     break;
    case 287:
     pagina287();
     break;
    case 288:
     pagina288();
     break;
    case 289:
     pagina289();
     break;
    case 290:
     pagina290();
     break;
    case 291:
     pagina291();
     break;
    case 292:
     pagina292();
     break;
    case 293:
     pagina293();
     break;
    case 294:
     pagina294();
     break;
    case 295:
     pagina295();
     break;
    case 296:
     pagina296();
     break;
    case 297:
     pagina297();
     break;
    case 298:
     pagina298();
     break;
    case 299:
     pagina299();
     break;
    case 300:
     pagina300();
     break;
    case 301:
     pagina301();
     break;
    case 302:
     pagina302();
     break;
    case 303:
     pagina303();
     break;
    case 304:
     pagina304();
     break;
    case 305:
     pagina305();
     break;
    case 306:
     pagina306();
     break;
    case 307:
     pagina307();
     break;
    case 308:
     pagina308();
     break;
    case 309:
     pagina309();
     break;
    case 310:
     pagina310();
     break;
    case 311:
     pagina311();
     break;
    case 312:
     pagina312();
     break;
    case 313:
     pagina313();
     break;
    case 314:
     pagina314();
     break;
    case 315:
     pagina315();
     break;
    case 316:
     pagina316();
     break;
    case 317:
     pagina317();
     break;
    case 318:
     pagina318();
     break;
    case 319:
     pagina319();
     break;
    case 320:
     pagina320();
     break;
    case 321:
     pagina321();
     break;
    case 322:
     pagina322();
     break;
    case 323:
     pagina323();
     break;
    case 324:
     pagina324();
     break;
    case 325:
     pagina325();
     break;
    case 326:
     pagina326();
     break;
    case 327:
     pagina327();
     break;
    case 328:
     pagina328();
     break;
    case 329:
     pagina329();
     break;
    case 330:
     pagina330();
     break;
    case 331:
     pagina331();
     break;
    case 332:
     pagina332();
     break;
    case 333:
     pagina333();
     break;
    case 334:
     pagina334();
     break;
    case 335:
     pagina335();
     break;
    case 336:
     pagina336();
     break;
    case 337:
     pagina337();
     break;
    case 338:
     pagina338();
     break;
    case 339:
     pagina339();
     break;
    case 340:
     pagina340();
     break;
    case 341:
     pagina341();
     break;
    case 342:
     pagina342();
     break;
    case 343:
     pagina343();
     break;
    case 344:
     pagina344();
     break;
    case 345:
     pagina345();
     break;
    case 346:
     pagina346();
     break;
    case 347:
     pagina347();
     break;
    case 348:
     pagina348();
     break;
    case 349:
     pagina349();
     break;
    case 350:
     pagina350();
     break;
    case 351:
     pagina351();
     break;
    case 352:
     pagina352();
     break;
    case 353:
     pagina353();
     break;
    case 354:
     pagina354();
     break;
    case 355:
     pagina355();
     break;
    case 356:
     pagina356();
     break;
    case 357:
     pagina357();
     break;
    case 358:
     pagina358();
     break;
    case 359:
     pagina359();
     break;
    case 360:
     pagina360();
     break;
    case 361:
     pagina361();
     break;
    case 362:
     pagina362();
     break;
    case 363:
     pagina363();
     break;
    case 364:
     pagina364();
     break;
    case 365:
     pagina365();
     break;
    case 366:
     pagina366();
     break;
    case 367:
     pagina367();
     break;
    case 368:
     pagina368();
     break;
    case 369:
     pagina369();
     break;
    case 370:
     pagina370();
     break;
    case 371:
     pagina371();
     break;
    case 372:
     pagina372();
     break;
    case 373:
     pagina373();
     break;
    case 374:
     pagina374();
     break;
    case 375:
     pagina375();
     break;
    case 376:
     pagina376();
     break;
    case 377:
     pagina377();
     break;
    case 378:
     pagina378();
     break;
    case 379:
     pagina379();
     break;
    case 380:
     pagina380();
     break;
    case 381:
     pagina381();
     break;
    case 382:
     pagina382();
     break;
    case 383:
     pagina383();
     break;
    case 384:
     pagina384();
     break;
    case 385:
     pagina385();
     break;
    case 386:
     pagina386();
     break;
    case 387:
     pagina387();
     break;
    case 388:
     pagina388();
     break;
    case 389:
     pagina389();
     break;
    case 390:
     pagina390();
     break;
    case 391:
     pagina391();
     break;
    case 392:
     pagina392();
     break;
    case 393:
     pagina393();
     break;
    case 394:
     pagina394();
     break;
    case 395:
     pagina395();
     break;
    case 396:
     pagina396();
     break;
    case 397:
     pagina397();
     break;
    case 398:
     pagina398();
     break;
    case 399:
     pagina399();
     break;
    case 400:
     pagina400();
     break;

   }


  }


 }


 public void pagina1() {



        String pag1= "Damián se apoyaba en la pared, aturdido y sin comprender lo que pasaba. La sangre que salía del cuerpo sin vida de Gabriel formaba un enorme charco a su alrededor, aunque parecía no notarlo. \n" +
                "Con manos torpes y temblorosas tomó su celular y empezó a marcar, 9…1……..1\n" +
                "Un mensaje automático respondió el llamado, así que Damián espero a que uno de los operadores tome su llamada. \n" +
                "\n" +
                "Pero no pudo.\n";

        gm.ui.crearEscenarioGabrielAchurado(1, pag1, Fondos.F_PASILLO, Principales.G_ACHURADO,"2",null);
        gm.ui.reproductorUI.cargarSonido("SoundFX/11 llamada de espera final.wav");
        gm.ui.reproductorUI.reproducirSonido();
        admin.getPlayer(key).setPuntoGuardado(1);
        admin.guardarPLayers();


 }

 public void pagina2() {

  String pag2 = "Una fuerte luz blanca ilumino el pasillo, ensegueciendote un momento. A través de la pared de hormigón que tenías justo en frente, emergió un grupo de personas. \n" + "\n";

  gm.ui.crearEscenarioSolo(2, pag2, Fondos.F_BLANCO, "3", "1");
  admin.getPlayer(key).setPuntoGuardado(2);
  admin.guardarPLayers();

 }



 public void pagina3() {


  String pag2 = "-Rápido, quiero que acordonen el área e instalen un prolongador espacial, cualquier persona que quiera atravesar este pasillo debe entrar en un bucle indefinido, por lo menos hasta que terminemos-.\n" +
          "\n" +
          "Damián, devastado y sin entender nada, miraba hacia todos lados. ¿Cómo habían atravesado la pared? ¿Quiénes eran? El grupo se movía como si no estuvieras allí, ignorando completamente tu presencia.\n" +

          "El hombre, de estatura promedio y un pelo muy canoso para la edad que aparentaba, caminaba nervioso en todas direcciones, dando ordenes al grupo.\n" +
          "-No quiero que pasen nada por alto, conocemos su modus operandi, sabemos que siempre es mas rapido, pero todos cometen errores. Y mucho mas si se confían.\n" +
          "\n";

  gm.ui.crearEscenarioUnPersonaje(3, pag2, Fondos.F_PASILLO, Principales.M_COSTADO, "4", "2");
  admin.getPlayer(key).setPuntoGuardado(3);
  admin.guardarPLayers();

 }

 public void pagina4() {

  String pag3 = "Frente a vos, paso caminando una mujer. Ella iba vestida igual que el hombre que acelerado, con un traje gris y una camisa blanca. Los demás vestían una especie de uniforme negro que te hacía acordar a la policía.\n" +
          "\n" +
          "Mirandote, se detuvo y se dirigio al hombre de traje- Eu, Manuel, parece que tenemos un testigo, listo para el bardo del papeleo?-.\n";

  gm.ui.crearEscenarioUnPersonaje(4, pag3, Fondos.F_PASILLO, Principales.P_FRENTE, "5", "3");
  admin.getPlayer(key).setPuntoGuardado(4);
  admin.guardarPLayers();
 }

 public void pagina5() {

  String pag4 = ("-S...Son la policía?-preguntaste, aun descolocado por la situación.\n" +
          "-Si, si, algo muy similar- dijo el hombre, tomándote del brazo para ayudarte a levantarte. –Soy Manuel, detective de la YTP y bla, bla, bla.- Sin dejarte decir nada, te enseña rápidamente una placa y de un bolsillo, saca una especie de lapicera. –Y ahora necesito que mires acá par…\n");
  gm.ui.crearEscenarioDosPersonajes(5, pag4, Fondos.F_PASILLO, Principales.M_SERIO, Principales.P_FRENTE, "6", "4");
  admin.getPlayer(key).setPuntoGuardado(5);
  admin.guardarPLayers();
 }

 public void pagina6() {

  String pag5 = ("Oscuridad y silencio fue todo lo que siguió.\n" +
          "\n" +
          "Pero de repente, empezaste a recobrar tus sentidos. Escuchas algunas voces, sin entender del todo lo que dicen, mientras tus ojos se abren lentamente y empiezan a acostumbrarse a la luz de la habitación en la que estas.\n");
  gm.ui.crearEscenarioSolo(6, pag5, Fondos.F_NEGRO, "7", "5");
  admin.getPlayer(key).setPuntoGuardado(6);
  admin.guardarPLayers();

 }

 public void pagina7() {

  String pag6 = ("Frente a vos, están sentadas las dos personas con traje que atravesaron la pared en la COMICON.\n" +
          "-Bien, ya estás de vuelta con nosotros, Damián- dijo la mujer.\n" +
          "¿Quiénes son? ¿Como saben mi nombre?-preguntaste echándole una mirada al lugar donde te encontrabas. Unos tubos de luz fría se apostaban en las paredes, resaltando el blanco de las paredes. Las sillas, de un metal reluciente hacían juego con la mesa donde reposaban unas carpetas y lapiceras.\n" +
          "\n" +
          "-Do…¿dónde estoy?\n");
  gm.ui.crearEscenarioDosPersonajes(7, pag6, Fondos.F_INTERROGATORIO, Principales.M_CEJA_ARQUEADA, Principales.P_FRENTE, "8", "6");
  admin.getPlayer(key).setPuntoGuardado(7);
  admin.guardarPLayers();
 }

 public void pagina8() {

  String pag7 = ("-Esta es una de las salas de interrogatorio de la YTP- respondió el hombre al que se habían referido como Manuel.- Somos la detective Paz Malaquistain y yo soy el detective Manuel Lublo.\n" +
          "-La YTP- retomo su compañera- es la Yapeyu Time Police, una agencia encargada de conservar el flujo y la continuidad del tiempo.\n" +
          "Miraste en todas direcciones desconcertado. Luego de unos instantes, conseguiste formular otra frase.\n");

  gm.ui.crearEscenarioDosPersonajes(8, pag7, Fondos.F_INTERROGATORIO, Principales.M_SERIO, Principales.P_FRENTE, "9", "7");
  admin.getPlayer(key).setPuntoGuardado(8);
  admin.guardarPLayers();

 }

 public void pagina9() {

  String pag8 = ("-¿Me están hablando en serio? ¿Qué policía del tiempo? ¿Qué paso con Gabriel, donde esta?- Empezaste a recriminarles, levantándote de tu asiento.\n" +
          "-Damián, tranquilo por favor, necesitamos que te sientes, respires y nos escuches- dijo Paz- Podemos explicarte todo, pero tenés que prestarnos atención.\n" +
          "Así fue como empezó la extensa explicación. Te conto sobre los viajes, la línea del tiempo y detallo por encima, la funcionalidad de la YTP.\n");


  gm.ui.crearEscenarioDosPersonajes(9, pag8, Fondos.F_INTERROGATORIO, Principales.M_CEJA_ARQUEADA, Principales.P_FRENTE, "10", "8");
  admin.getPlayer(key).setPuntoGuardado(9);
  admin.guardarPLayers();
 }

 public void pagina10(){

  String pag9 = ("-Pero entonces, que tiene que ver esto con la convención, con Gabriel y conmigo, ¿qué hago acá?- inquiriste a los agentes.\n" +
          "-Cualquier lugar donde haya una distorsión temporal es un caso que nos compete. El lugar donde mataron a tu amigo dio una señal muy fuerte y característica, así que era incluso prioritario-explico Manuel, quien puso play en una grabadora para dar inicio a la declaración.\n");

  gm.ui.crearEscenarioDosPersonajes(10, pag9, Fondos.F_INTERROGATORIO, Principales.M_SERIO, Principales.P_FRENTE, "11", "9");
  admin.getPlayer(key).setPuntoGuardado(10);
  admin.guardarPLayers();

 }

 public void pagina11(){

  String pag10 = ("-¿Me están hablando en serio? ¿Qué policía del tiempo? ¿Qué paso con Gabriel, donde esta?- Empezaste a recriminarles, levantándote de tu asiento.\n" +
          "-Damián, tranquilo por favor, necesitamos que te sientes, respires y nos escuches- dijo Paz- Podemos explicarte todo, pero tenés que prestarnos atención.\n" +
          "Así fue como empezó la extensa explicación. Te conto sobre los viajes, la línea del tiempo y detallo por encima, la funcionalidad de la YTP.\n");
  gm.ui.crearEscenarioDosPersonajes(11, pag10, Fondos.F_INTERROGATORIO, Principales.M_SERIO, Principales.P_COSTADO, "12", "10");
  admin.getPlayer(key).setPuntoGuardado(11);
  admin.guardarPLayers();
 }

 public void pagina12() {

  String pag11 = ("En ese momento, ambos oficiales se irguieron y abrieron sus ojos, acortando la distancia con la que la mesa te separaba de ellos.\n" +
          "-Para, para, para- dijo Manuel- ¿cómo era el tipo este? ¿te hablo? ¿no lo seguiste?- lanzo una pregunta tras otra sin dejarte responder.\n" +
          "-No, no tenía pensado seguirlo tampoco. Tendría más o menos mi altura, ponele que un poco menos. La ropa le cubría la cara y además entre la gente, apenas pude ver que me hacia el gesto. La verdad un poco me asusté y seguí de largo.\n");
  gm.ui.crearEscenarioDosPersonajes(12, pag11, Fondos.F_INTERROGATORIO, Principales.M_CEJA_ARQUEADA, Principales.P_FRENTE, "13", "11");
  admin.getPlayer(key).setPuntoGuardado(12);
  admin.guardarPLayers();
 }

 public void pagina13() {

  String pag12 = ("Ambos agentes se miran, intercambiando brevemente una disimulada mirada cómplice, se disculpan con vos y se van de la sala de interrogatorio, dejándote solo unos instantes.\n" +
          "\n" +
          "Cuando vuelve, se sientan y  Paz te dice.\n" +
          "-Decime una cosa Damián. ¿Te gustaría ser un oficial en la YTP?\n");
  gm.ui.crearEscenarioDosPersonajes(13, pag12, Fondos.F_INTERROGATORIO, Principales.M_COSTADO_DER, Principales.P_COSTADO, "14", "12");
  admin.getPlayer(key).setPuntoGuardado(13);
  admin.guardarPLayers();
 }

 public void pagina14() {

  String pag13 = ("Un año más tarde...");
  gm.ui.crearEscenarioSolo(14, pag13, Fondos.F_NEGRO, "15", "13");
  admin.getPlayer(key).setPuntoGuardado(14);
  admin.guardarPLayers();
 }

 public void pagina15() {

  String pag14 = ("Corrías por el techo de una Iglesia de estilo barroco. Quien huía de vos era un sicario, enviado por un cliente insatisfecho a encargarse de Jean-Honoré Fragonard. Lamentablemente, el pobre idiota lo había matado, pero esa anomalía temporal no podía permitirse. Tomaste una Unidad de Transporte Nanotecnológico, o UTN, una especie de carta de color rojo que servía para transportarse en el espacio únicamente y a una distancia algo recortada.\n" +
          "\n" +
          "Tu perseguido no supo de donde habías salido, pero antes de que pueda intentar reaccionar, yacía boca abajo en el piso, derrotado.\n");

  gm.ui.crearEscenarioSolo(15, pag14, Fondos.F_IGLESIA, "16", "14");
  admin.getPlayer(key).setPuntoGuardado(15);
  admin.guardarPLayers();


 }

 public void pagina16() {

  String pag15 = ("-Impresionante lo tuyo Dami. O bajas unos cambios o vas a dejar a Manuel sin laburo- dijo Paz cuando por fin te alcanzo. El que era su otro compañero esperaba ya debajo del edificio, había abierto un portal que llevaba a la central y evitaba mirarte, con el ego dañado por otro caso que resolvías.");
  gm.ui.crearEscenarioDosPersonajes(16, pag15, Fondos.F_IGLESIA, Principales.P_FRENTE, Principales.M_COSTADO_DER, "17", "15");
  admin.getPlayer(key).setPuntoGuardado(16);
  admin.guardarPLayers();

 }

 public void pagina17(){

  gm.ui.crearEscenaPortalYTP(17, Fondos.F_PORTAL_VIOLETA, "18", "16");
  admin.getPlayer(key).setPuntoGuardado(17);
  admin.guardarPLayers();

 }


 public void pagina18() {

  String pag16 = ("Al volver a la central, todos te esperaban. Cumplías ya un año siendo agente de la YTP, y con el caso de hoy, te convertías en el cadete con la mayor cantidad de casos resueltos en ese tiempo. \n" +
          "Todos en la pequeña fiesta eran amables y cariñosos, pero la conciencia te carcomía y no podías terminar de concentrarte. Luego de un rato de celebración,  de dar la mano y recibir elogios, aprovechaste un momento de tranquilidad para escabullirte e ir a visitar a Gabriel.\n");
  gm.ui.crearEscenarioSolo(18, pag16, Fondos.F_OFICINA, "19", "17");
  admin.desbloquearLogro(key, LogrosTitle.FELIZ_ANIVERSARIO);
  gm.ui.reproductorUI.cargarSonido("SoundFX/1 sonido de confetti.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(18);
  admin.guardarPLayers();

 }

 public void pagina19() {

  String pag17 = ("-Y eso amigo. Creo que es la décima vez en la que viajo para tratar de evitarlo, pero siempre se me adelanta. Hago algo distinto y lo sabe, repito lo de la vez anterior y lo sabe. \n" +
          "Y encima esos sueños, apenas me queda recuerdo, pero son como si estuviera ahí, se sienten como los intentos que hago de rescatarte. Y no se. Te prometo que voy a descubrir cómo hacerlo, pronto no voy a tener que visitar solo una lápida- descargaste lo que te pasaba con la tumba de tu amigo. Dejando unas flores, volviste a tu casa para tratar de conciliar el sueño.\n");
  gm.ui.crearEscenarioSolo(19, pag17, Fondos.F_EXTERIOR, "20", "18");
  admin.getPlayer(key).setPuntoGuardado(19);
  admin.guardarPLayers();
 }

 public void pagina20(){

  String pag20= (". . .");
  gm.ui. gm.ui.crearEscenarioSolo(20, pag20, Fondos.F_NEGRO, "21", "19");
  admin.getPlayer(key).setPuntoGuardado(20);
  admin.guardarPLayers();

 }

 public void pagina21() {

  String pag18 = ("Corrías por la convención. Esquivaste al grupo de Stormtroopers que quería detenerte. A la cuenta de 3, debías agacharte para evitar el escudo de un descuidado cosplayer del Capitán América.\n" +
          "El tiempo te sonreía, aun sobraban segundos, esta vez lo conseguirías.\n" +
          "Entraste por el pasillo y aún estaba ahí, de pie y algo desorientado, Gabriel se volteo al escucharte.\n" +
          "-Acá estas, te busque por todos lados- dijo la viva imagen de tu amigo- Vení, apúrate.\n" +
          "Todo empezaba a desvanecerse y notaste que Gabriel te daba un papel en la mano. ¿eso era nuevo?\n" +
          "Sin tiempo para terminar de pensar, despertaste agitado en tu cama\n");

  gm.ui.crearEscenarioUnPersonaje(21, pag18, Fondos.F_COMICCON, Principales.G_CHILL, "22", "20");
  admin.getPlayer(key).setPuntoGuardado(21);
  admin.guardarPLayers();

 }

 public void pagina22() {

  String pag19 = ("Otra vez esos sueños. Otro camino que tomas para llegar a salvarlo. Te frotas los ojos cuando notas que en una de tus manos apretabas con fuerza un papel.\n" +
          "Abrís la hoja arrugada recordando lo que acababa de pasar en el sueño, solo que esta vez lo tenías ahí, de alguna manera habías conseguido comunicarte.\n");

  gm.ui.crearEscenarioSolo(22, pag19, Fondos.F_HABITACION, "23", "21");
  gm.ui.reproductorUI.cargarSonido("SoundFX/5 respiracion agitada.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(22);
  admin.guardarPLayers();

 }

 public void pagina23() {

  String pag20 = ("Pero el Gabriel del sueño no era de mucha ayuda. El trozo de papel parecía ser la esquina arrancada de un libro donde solo podias ver un numero que debía  ser algún tipo de índice. \n" +
          "Pero de que libro podía tratarse? \n" + "Aun así, algo dentro tuyo te advirtió que no lo tiraras, por lo que decidiste guardarlo en un cajón.");
  gm.ui.crearEscenarioSolo(23, pag20, Fondos.F_HABITACION, "24", "22");
  admin.getPlayer(key).setPuntoGuardado(23);
  admin.guardarPLayers();

 }

 public void pagina24() {

  String pag21 = ("Luego de desperezarte, te levantas para cambiarte. Tenías una norma que cada vez que soñabas con salvar a Gabriel, debías intentarlo de la forma en que lo soñaste.\n" +
          "Al llegar a la YTP, tomaste tu equipamiento y revisaste cuantas cartas para viaje en el tiempo te quedaban. Seis azules y 4 rojas debían bastar. Tomaste una carta azul, diseñadas para viajes temporales en un lapso máximo de veinte minutos, con las rojas podías moverte en el espacio, abriendo portales de entrada y salida. Juntaste un ejemplar de cada una, activando la última carta, la violeta, fusionando la habilidad de la carta azul junto a la de la roja, aunque, ironicamente, formaban un portal de color azul\n");
  gm.ui.crearEscenarioSolo(24, pag21, Fondos.F_OFICINA, "25", "23");
  admin.getPlayer(key).setPuntoGuardado(24);
  admin.guardarPLayers();
 }

 public void pagina25() {
  String pag22 = ("Esta combinación te permitía desplazarte a tu gusto por tiempo y espacio, al lugar y momento deseado, aun así, lo más recomendado era no viajar al interior de un lugar, coordenadas imprecisas o algún cambio inesperado podían traer graves consecuencias en la integridad del viajero.\n" +
          "Cruzando a través de la puerta, viajaste hasta llegar al estacionamiento de la COMICON.\n");
  gm.ui.crearEscenarioSolo(25, pag22, Fondos.F_NEGRO, "26", "24");
  admin.getPlayer(key).setPuntoGuardado(25);
  admin.guardarPLayers();
 }

 public void pagina26(){

  gm.ui.crearEscenaPortalCartas(26, Fondos.F_PORTAL_AZUL, "27", "25");
  admin.getPlayer(key).setPuntoGuardado(26);
  admin.guardarPLayers();
 }

 public void pagina27() {

  String pag23 = ("Sin perder tiempo, corriste hacia el edificio siguiendo el mismo camino que en tus sueños. Sorteaste a los Stormtroopers, esquivaste el escudo del Capitán. Todo iba tal perfecto, el pasillo estaba justo frente a vos y aun sobraba tiempo.");
  gm.ui.crearEscenarioSolo(27, pag23, Fondos.F_COMICCON, "28", "26");
  gm.ui.reproductorUI.cargarSonido("SoundFX/damianCorriendo.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(27);
  admin.guardarPLayers();
 }

 public void pagina28() {

  String pag24 = ("-Gabriel, Gabriel- lo llamaste al entrar por el pasillo, pero no podía responderte. El cuerpo sin vida de tu amigo yacía boca abajo, con la misma carta que siempre. Desolado pateas el suelo ¿cómo es posible? Aún quedaba tiempo, habías visto que era posible. Sin más tiempo para lamentarte, actualizaste la hora de muerte de Gabriel y volviste al presente, evitando encontrarte con tu yo de la convención.");
  gm.ui.crearEscenarioGabrielAchurado(28, pag24, Fondos.F_PASILLO, Principales.G_ACHURADO, "29", "27");
  admin.getPlayer(key).setPuntoGuardado(28);
  admin.guardarPLayers();
 }

 public void pagina29(){

  gm.ui.crearEscenaPortalCartas(29, Fondos.F_PORTAL_AZUL, "30", "28");
  admin.getPlayer(key).setPuntoGuardado(29);
  admin.guardarPLayers();
 }

 public void pagina30(){

  String pag30 = (". . .");
  gm.ui.crearEscenarioSolo(30, pag30, Fondos.F_OFICINA, "31", "29");
  gm.ui.reproductorUI.cargarSonido("SoundFX/8 pi pi pi.wav");
  gm.ui.reproductorUI.reproducirSonidoEnBucle();
  admin.getPlayer(key).setPuntoGuardado(30);
  admin.guardarPLayers();


 }

 public void pagina31() {

  String pag25 = ("-Che señor récord, ¿me vas a responder o no?- dijo Paz, sarcástica.\n" +
          "Desde que habías vuelto a la oficina, no podías dejar de pensar en la nota que apareció en tu mano al despertar, en ese numero, sabias que debía ser algo importante. Abstrayéndote de tus pensamientos, volviste a la realidad.\n" +
          "-Que decís, me colgué un segundo nada más- respondiste riendo-. Decime, ¿qué pasó?\n");

  gm.ui.crearEscenarioUnPersonaje(31, pag25, Fondos.F_OFICINA, Principales.P_NOJA_FRENTE, "32", "30");
  gm.ui.reproductorUI.cargarSonido("SoundFX/8 pi pi pi.wav");
  gm.ui.reproductorUI.reproducirSonidoEnBucle();
  admin.getPlayer(key).setPuntoGuardado(31);
  admin.guardarPLayers();

 }

 public void pagina32() {

  String pag26 = ("Veinticinco de abril de mil ocho ochentaiseis, tenemos trabajo- te indico tu compañera, retirándose. Además, tu DTM está tirando una alerta azul ¿Cómo no la escuchaste?\n" +
          "Rápidamente apagaste la alarma de tu DTM y seguiste a Paz, tratando de pensar que podía pasar en esas fechas.\n" +
          "-¿Abril de 1886? ¿Qué pasa en esos días? El primero de mayo es la huelga del trabajador, ¿tiene algo que ver?\n" +
          " -Si, que nunca se va a existir ni esa huelga ni el día del trabajador, las jornadas de ocho horas no van a ser una realidad y en su lugar, van a votar una jornada laboral de doce horas\n");
  gm.ui.crearEscenarioUnPersonaje(32, pag26, Fondos.F_OFICINA, Principales.P_ESPALDA, "33", "31");
  gm.ui.reproductorUI.cargarSonido("SoundFX/8 pi pi pi.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(32);
  admin.guardarPLayers();


 }

 public void pagina33() {

  String pag27 = ("Mientras escuchabas las consecuencias de lo sucedido, te equipabas con lo necesario para viajar. La tecnología de sus trajes hacía que estos se adapten a la vestimenta común de la época a la que iban. Aunque entre ustedes se seguían viendo con sus trajes de detectives, cualquier local los vería con ropa adecuada a su tiempo.\n" +
          "-Mataron a Engel, Fischer, Fielden y Parson, la mitad de los mártires de la huelga- prosiguió tu compañera. Ya detectamos a unos posibles sospechosos, policías infiltrados en el grupo de los trabajadores, unos corruptos que no te das una idea.\n");

  gm.ui.crearEscenarioUnPersonaje(33, pag27, Fondos.F_OFICINA, Principales.P_COSTADO, "34", "32");
  admin.getPlayer(key).setPuntoGuardado(33);
  admin.guardarPLayers();
 }

 public void pagina34() {

  String pag28 = ("Llegaron a la Sala de Salto Temporal, una habitación ideada para realizar viajes en el tiempo sin gastar tarjetas. Manuel, fumando como de costumbre, los esperaba.\n" +
          "-Dale pibe, apurando- dijo aspirando una última bocanada de humo.\n" +
          "Sin mediar más palabras, los tres entraron por el portal y salieron en un callejón vacío de la Nueva York del siglo diecinueve.\n");
  gm.ui.crearEscenarioDosPersonajes(34, pag28, Fondos.F_OFICINA, Principales.P_ESPALDA, Principales.M_CEJA_ARQUEADA, "35", "33");
  admin.getPlayer(key).setPuntoGuardado(34);
  admin.guardarPLayers();
 }

 public void pagina35(){

        gm.ui.crearEscenaPortalYTP(35, Fondos.F_PORTAL_VIOLETA, "36", "34");
        admin.getPlayer(key).setPuntoGuardado(35);
        admin.guardarPLayers();
 }

 public void pagina36() {

  String pag29 = ("-Alteré los registros para que quede en la jurisprudencia de Brooklyn, ahí tenemos un agente que nos incluyó como detectives del caso- explicaba Manuel mientras se dirigían a donde estaban detenidos los sospechosos- Luego de algunas investigaciones, pudimos reducir la lista a tres sospechosos. Jamás vamos a ganar el caso, son policías y jueces corruptos. Debemos saber quién lo hizo para poder detenerlo y que así la huelga y el posterior atentado sucedan, tal como lo dicta El Ojo de las Eras.");

  gm.ui.crearEscenarioUnPersonaje(36, pag29, Fondos.F_HUELGA, Principales.M_COSTADO_DER, "37", "35");
  admin.getPlayer(key).setPuntoGuardado(36);
  admin.guardarPLayers();
 }

 public void pagina37() {
  String pag30 = ("-¿El que? ¿Qué es eso?- preguntaste extrañado, en tu año en la YTP no habías escuchado de tal cosa.\n" +
          "Manuel se rio de forma burlona y replico- Muchos casos resueltos, pero todavía estas verde pibe. \n" +
          "Sin poder preguntar sobre el tema, llegaron a donde aguardaban los policías junto a los acusados, Thomas McKeenly, Steven Henderson y Matthew Bale.\n");

  gm.ui.crearEscenarioUnPersonaje(37, pag30, Fondos.F_HUELGA, Principales.M_Y_BUENO, "38", "36");
  admin.getPlayer(key).setPuntoGuardado(37);
  admin.guardarPLayers();
 }

 public void pagina38() {
  String pag31 = ("Tomaron las declaraciones un acusado a la vez, pero no cooperaron para nada, cada uno de ellos dijo solo una frase y rechazaron cualquier otro tipo de pregunta.\n" +
          "\n");

  gm.ui.crearEscenarioSolo(38, pag31, Fondos.F_HUELGA, "39", "37");
  admin.getPlayer(key).setPuntoGuardado(38);
  admin.guardarPLayers();
 }

 public void pagina39() {
  String pag32 = ("Thomas dijo: yo no fui. Steven no fue.\n" +
          "Steven: Thomas no fue. Fue Matthew.\n" +
          "Matthew: yo no fui, fue Thomas.\n" +
          "Luego de una ardua investigación, concluyeron en que uno de los acusados daba dos declaraciones verdaderas, otro una verdadera y una falsa y el restante, mentia en ambas declaraciones. Sabiendo esto, debes decidir quién es el culpable.\n");

  gm.ui.ventanaJBotones(39, pag32, Fondos.F_HUELGA, "42", "41", "40", Principales.P_FRENTE, Principales.M_SERIO);
  admin.getPlayer(key).setPuntoGuardado(39);
  admin.guardarPLayers();
 }

 public void pagina40() {

  String pag33 = ("Decidido, concluiste en viva voz- Fue Matthew él es el culpable.\n" +
          "Manuel y Paz lo meditaron, pero rápidamente te corrigieron. \n" +
          "-No, estas mal-corrigio Paz- Fue Thomas, el dijo una verdad y una mentira. La verdad es que no fue Steven y la mentira es que el no fue.\n" +
          "Rápidamente reparaste en tu error y te disculpaste, pero sabias que Manuel no lo iba a dejar pasar por un buen tiempo.\n");

  gm.ui.crearEscenarioDosPersonajes(40, pag33, Fondos.F_HUELGA, Principales.P_NOJA_FRENTE, Principales.M_CEJA_ARQUEADA, "43", null);
  admin.getPlayer(key).setPuntoGuardado(40);
  admin.guardarPLayers();

 }

 public void pagina41() {
  String pag34 = ("Decidido, concluiste en viva voz- Fue Steven él es el culpable \n" +
          "Manuel y Paz lo meditaron, pero rápidamente te corrigieron.\n" +
          "-No, estas mal-corrigio Paz- Fue Thomas, el dijo una verdad y una mentira. La verdad es que no fue Steven y la mentira es que el no fue.\n" +
          "Rápidamente reparaste en tu error y te disculpaste, pero sabias que Manuel no lo iba a dejar pasar por un buen tiempo.\n");

  gm.ui.crearEscenarioDosPersonajes(41, pag34, Fondos.F_HUELGA, Principales.P_NOJA_FRENTE, Principales.M_CEJA_ARQUEADA, "43", null);
  admin.getPlayer(key).setPuntoGuardado(41);
  admin.guardarPLayers();
 }

 public void pagina42() {

  String pag35 = ("Fue Thomas, el dijo una verdad y una mentira. La verdad es que no fue Steven y la mentira es que el no fue. \n" +
          "Luego de pensarlo, Paz y Manuel, este último a regañadientes, te dieron la razón.\n" +
          "-Bien, bien. Estuviste rápido- te felicitó Paz con una leve sonrisa mientras volvían hacia el portal.\n");

  gm.ui.crearEscenarioDosPersonajes(42, pag35, Fondos.F_HUELGA, Principales.P_FRENTE, Principales.M_COSTADO_DER, "43", null);
  admin.getPlayer(key).setPuntoGuardado(42);
  admin.guardarPLayers();
 }

 public void pagina43() {

  String pag36 = ("Con el caso resuelto, viajaron al día anterior al atentado y detuvieron al culpable, restaurando la línea del tiempo junto a la jornada de 8 horas y el día del trabajador.\n"+
          "Finalmente, cerraron el caso y regresaron a la YTP");
  gm.ui.crearEscenarioSolo(43, pag36, Fondos.F_HUELGA, "44", null);
  admin.getPlayer(key).setPuntoGuardado(43);
  admin.guardarPLayers();

 }

 public void pagina44(){

  gm.ui.crearEscenaPortalYTP(44, Fondos.F_PORTAL_VIOLETA, "45", "43");
  admin.getPlayer(key).setPuntoGuardado(44);
  admin.guardarPLayers();
 }


 public void pagina45() {

  String pag37 = ("Mientras con tu compañera dejaban el equipamiento que habían llevado, aprovechaste el momento para despejarte la duda que te había perseguido durante todo el día.");
  gm.ui.crearEscenarioUnPersonaje(45, pag37, Fondos.F_OFICINA, Principales.P_ESPALDA, "46", "44");
  admin.getPlayer(key).setPuntoGuardado(45);
  admin.guardarPLayers();

 }

 public void pagina46() {
  String pag38 = ("—Paz — al escuchar que le hablabas se dio vuelta para prestarte atención—. Esto que hablaban hoy con Manuel, el Ojo de Las Eras, ¿qué es?");
  gm.ui.crearEscenarioUnPersonaje(46, pag38, Fondos.F_OFICINA, Principales.P_FRENTE, "47", "45");
  admin.getPlayer(key).setPuntoGuardado(46);
  admin.guardarPLayers();
 }

 public void pagina47() {

  String pag39 = ("—Veo que te quedaste con eso, ¿no? – te pregunto Paz divertida- el Ojo de Las Eras es una antigua leyenda. Es una mujer, se dice más antigua que el tiempo mismo, que sabe lo que debe y lo que va a pasar y que se aparece antes los héroes más importantes de diferentes épocas, en sus momentos difíciles, como una ayuda, un guía. Se le apareció a San Martin, a Churchill cuando se plantó a los alemanes, y por lo que se sabe, se les apareció a los mártires del día del trabajador, por eso la mencionamos.");
  gm.ui.crearEscenarioUnPersonaje(47, pag39, Fondos.F_OFICINA, Principales.P_FRENTE, "48", "46");
  admin.getPlayer(key).setPuntoGuardado(47);
  admin.guardarPLayers();
 }

 public void pagina48() {

  String pag40 = ("—Pero decís que es una leyenda, ¿no existe entonces? ¿Qué es lo que vieron los héroes?\n" +
          "—No, para nada, al contrario de hecho— respondió Paz ante tu duda- es muy real, tiene un rastro y una carga en la línea del espacio tiempo muy característica. Esta siempre ahí, solo que nunca vas a poder verla.\n" +
          "—Nunca, a menos que ella lo quiera— respondiste \n" +
          "—Asi es, nunca, a menos que ella lo quiera— dijo Paz, y ambos se retiraron a sus respectiva oficinas, pero el tema quedo dando vueltas en tu cabeza.\n");

  gm.ui.crearEscenarioUnPersonaje(48, pag40, Fondos.F_OFICINA, Principales.P_FRENTE, "49", "47");
  admin.getPlayer(key).setPuntoGuardado(48);
  admin.guardarPLayers();

 }

 public void pagina49(){

  String pag41 = (" . . . ");

  gm.ui.crearEscenarioSolo(49, pag41, Fondos.F_OFICINA, "50", "48");
  admin.getPlayer(key).setPuntoGuardado(49);
  admin.guardarPLayers();

 }

 public void pagina50(){

  String pag41 = (" . . . ");

  gm.ui.crearEscenarioSolo(50, pag41, Fondos.F_NEGRO, "51", "49");
  admin.getPlayer(key).setPuntoGuardado(50);
  admin.guardarPLayers();
 }

 public void pagina51() {

  String pag41 = ("Otra vez estabas en la convención, pero en esta ocasión, te encontrabas en la puerta que salía a un callejón. Siempre habías intentado entrando por la entrada principal, esta vez había que variar un poco.\n" +
          "\n" +
          "Esquivaste un grupo de trabajadores del lugar, pero no aminoraste la marcha, habías aprendido casi de memoria los diferentes pasillos y caminos del edificio. Torciste a la derecha, luego, un par de metros más adelante, hacia la izquierda y ahora recto.\n");

  gm.ui.crearEscenarioSolo(51, pag41, Fondos.F_COMICCON, "52", "50");
  gm.ui.reproductorUI.cargarSonido("SoundFX/damianCorriendo.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(51);
  admin.guardarPLayers();

 }

 public void pagina52() {

  String pag42 = ("Finalmente saliste, justo al lado de los baños que daban al pasillo. Había mucha gente reunida así que ibas a un ritmo lento, pero aun te sobraba más de un minuto, tu mejor tiempo hasta la fecha.\n" +
          "Y justo ahí lo volviste a sentir, la misma sensación que hace un año. \n" +
          "Una mirada fría y penetrante que se clavaba justo en tu cuello.\n");

  gm.ui.crearEscenarioSolo(52, pag42, Fondos.F_COMICCON,"53", "51");
  gm.ui.reproductorUI.cargarSonido("SoundFX/genteHablandoMucha.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(52);
  admin.guardarPLayers();

 }

 public void pagina53(){

  String pag42= ("Volteaste rápidamente y separados por unos cuantos metros, la figura misteriosa te miraba a través de los visitantes de la COMICON.\n"+
          "Mantuvieron la mirada solo un segundo porque un grupo de personas obstaculizo tu vista y para entonces, la figura había desaparecido.\n");

  gm.ui.crearEscenarioUnPersonaje(53, pag42, Fondos.F_COMICCON, Principales.D_ESPALDA, "54", "52");
  gm.ui.reproductorUI.cargarSonido("SoundFX/spiderMan.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(53);
  admin.guardarPLayers();


 }

 public void pagina54() {

  String pag43 = ("A tus espaldas, alguien te tomó por el brazo provocando que te sobresaltes y des un giro brusco, levantando el brazo liberado, preparado para ser el primero en golpear.\n");
  gm.ui.crearEscenarioSolo(54, pag43, Fondos.F_COMICCON, "55", "53");
  admin.getPlayer(key).setPuntoGuardado(54);
  admin.guardarPLayers();
 }

 public void pagina55(){

  String pag54= ("—Paraa amigo, calmate— Gabriel te miraba algo asustado, pero riendo por el susto que te había provocado— Me había olvidado que eras tan asustadizo.\n" +
          "Ahora más calmado, te soltás del brazo de tu amigo quien te miraba sano y salvo. Pero antes de poder decirle algo, siguió.\n" +
          "—Ah casi me olvidaba, me dejaron esto para vos.\n" +
          "Tu amigo te tendió su mano y tomaste lo que te alcanzaba, una hoja de papel escrita.\n" +
          "—¿Qué es esto? ¿Quién te lo dio?— inquirís rápidamente a tu Gabriel, pero en ese momento todo se vuelve oscuro y sentís como si jalaran de tu cuerpo, elevándote y alejándote de la convención.\n");


  gm.ui.crearEscenarioUnPersonaje(55, pag54, Fondos.F_COMICCON, Principales.G_CHILL, "56", "54");
  gm.ui.reproductorUI.cargarSonido("SoundFX/genteHablandoMucha.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(55);
  admin.guardarPLayers();
 }

 public void pagina56() {

  String pag44 = ("Te despertás sobresaltado y tardas en reconocer el lugar donde te encontras. Estas en tu escritorio, sin darte cuenta te quedaste dormido en la silla y ahora con las luces apagadas parecía que estabas solo. " +
          "Apagaste tu monitor y dispuesto a marcharte ves una luz que se asoma desde la oficina de Paz.\n");

  gm.ui.crearEscenarioSolo(56, pag44, Fondos.F_OFICINA, "57", "55");
  admin.getPlayer(key).setPuntoGuardado(56);
  gm.ui.reproductorUI.cargarSonido("SoundFX/5 respiracion agitada.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.guardarPLayers();
 }

 public void  pagina57(){

  String pag56= ("Te acercas para encontrarte con tu compañera detrás de su escritorio, escribiendo en su computadora, concentrada.\n" +
          "—¿Qué paso? ¿Te atrasaste con las entregas?— decís desde la puerta, rompiendo el silencio de las oficinas vacías.\n" +
          "Paz gritó y pegó un vuelco en su silla, muy asustada ante tu imprevista aparición.\n" +
          "—¿Qué haces acá? Casi me matas del susto.");

  gm.ui.crearEscenarioUnPersonaje(57, pag56, Fondos.F_OFICINA, Principales.P_APUNTANDO, "58", "56");
  admin.getPlayer(key).setPuntoGuardado(57);
  admin.guardarPLayers();
 }

 public void pagina58() {
  String pag45 = ("—Tengo que ponerte aprueba, tenés que estar atenta ante cualquier situación. Nunca sabes cuando puede escabullirse alguien acá.\n" +
          "—No, no digas eso que estoy sola, me descompongo- se quejó Paz ante tus burlas y luego replicó—. ¿Y vos que haces acá? ¿Estás bien? Por tu cara no pareciera.\n");
  gm.ui.crearEscenarioUnPersonaje(58, pag45, Fondos.F_OFICINA, Principales.P_NOJA_FRENTE, "59", "57");
  admin.getPlayer(key).setPuntoGuardado(58);
  admin.guardarPLayers();
 }

 public void pagina59(){

  String pag46 = ("Querías decirle que estabas bien, pero sentiste una necesidad de desahogarte y de ser escuchado, necesitabas que alguien te hiciera esa misma pregunta, solo para poder soltarlo");
  gm.ui.crearEscenarioUnPersonaje(59, pag46, Fondos.F_OFICINA, Principales.P_NOJA_FRENTE, "60", "58");
  admin.getPlayer(key).setPuntoGuardado(59);
  admin.guardarPLayers();

 }

 public void pagina60(){

  String pag46 = ("—Hace un tiempo, bastante de hecho, tengo una serie de sueños recurrentes. En estos estoy en la COMIC CON, solo que ahora se lo que va a pasar y salvo a Gabriel.\n" +
          " Son tan reales, se siente como si estuviera ahí. Pero cuando me despierto y vuelvo a la realidad, no sé, se hace difícil.\n");
  gm.ui.crearEscenarioUnPersonaje(60, pag46, Fondos.F_OFICINA, Principales.P_NOJA_FRENTE, "61", "59");
  admin.getPlayer(key).setPuntoGuardado(60);
  admin.guardarPLayers();

 }

 public void pagina61(){

  String pag46 = ("—Él era muy importante para vos, ¿no? Hace un año renunciaste a tu vida cotidiana para ser un agente, según vos con el propósito de atrapar al que lo mato. \n" +
          "No se hace eso por cualquier amigo.\n" +
          "—Gabriel era un hermano, lo más cercano que tuve a uno. \n" +
          "Cuando íbamos al primario, mi familia atravesaba una situación complicada, bastante la verdad. \n" +
          "Paz te miraba, dándote tu espacio para hablar\n" +
          "—Había días que cenaba galletitas de agua con té o torta fritas y mate cocido. Otros días, más de los que recuerdo, me iba a dormir sin comer nada— mientras recordabas todo, reíste suavemente, cediendo ante la emoción de revivir toda esa situación, tan lejana del ahora—. \n" +
          "Encima, Gabriel siempre llevaba vianda al colegio y aunque nunca le pedía, él siempre me convidaba. En algún momento le contó a sus papás, porque empezaron a invitarme a almorzar a su casa todos los días, después me quedaba toda la tarde, merendaba y volvía a casa.\n" +
          "Él y su familia estuvieron siempre para mí y para mis papás. Es lo mínimo que puedo hacer por todos ellos.\n");
  gm.ui.crearEscenarioUnPersonaje(61, pag46, Fondos.F_OFICINA, Principales.P_FRENTE, "62", "60");
  admin.getPlayer(key).setPuntoGuardado(61);
  admin.guardarPLayers();
 }

 public void pagina62(){

  String pag46 = ("Paz te escuchaba atentamente, con una mirada triste, conmovida ante el pasado que compartieron vos y tú difunto amigo, pero rápidamente cambio su gesto a uno más serio, dándote una advertencia.\n" +
          "—Lo lamento mucho, entiendo porque Gabriel es tan importante para vos y lo difícil que puede ser todo. Pero, no obstante, tengo que advertirte que no trates de salvarlo, impedir lo que sucedió o intentes cambiar algo. \n" +
          "Hay un largo historial de intentos fracasos catastróficos de otros agentes que intentaron cosas como esa.\n");
  gm.ui.crearEscenarioUnPersonaje(62, pag46, Fondos.F_OFICINA, Principales.P_APUNTANDO, "63", "61");
  admin.getPlayer(key).setPuntoGuardado(62);
  admin.guardarPLayers();

 }

 public void pagina63(){

  String pag46 = ("—No, no, obvio que no— mentiste rápidamente, desviando la conversación—. A todo esto, no me dijiste que hacías acá a esta hora.\n" +
          "—Nada, tenía que terminar algunas cosas más, algunos informes y otros papeleos, pero en un rato ya me iba. ¿Vos que vas a hacer?\n" +
          "—Irme también, ya se me hizo tarde para algunas cosas y es mejor si voy para casa. Descansa, Paz. Nos vemos mañana.\n");
  gm.ui.crearEscenarioUnPersonaje(63, pag46, Fondos.F_OFICINA, Principales.P_FRENTE, "64", "62");
  admin.getPlayer(key).setPuntoGuardado(63);
  admin.guardarPLayers();

 }

 public void pagina64(){

  String pag46 = ("Diste media vuelta, dispuesto a marcharte cuando, debajo del umbral de la puerta, Paz voltea y de dirige hacia vos.\n" +
          "—¿El papel ese lo querés tirar en el tacho o lo necesitas para algo?\n" +
          "—¿El qué? ¿Qué papel?— preguntaste extrañado y recién por fin lo notaste. \n" +
          "Desde que te habías despertado, sujetabas un pedazo de papel con tanta fuerza que tu mano adormecida había olvidado que estaba ahí. \n" +
          "—No, no, era algo que me había anotado para hacer, gracias, Paz. Hasta mañana.                 Te despediste atolondrado y saliste, desenvolviendo el bollo arrugado que sostenías.\n");
  gm.ui.crearEscenarioUnPersonaje(64, pag46, Fondos.F_OFICINA, Principales.P_COSTADO, "65", "63");
  admin.getPlayer(key).setPuntoGuardado(64);
  admin.guardarPLayers();

 }

 public void pagina65(){

  String pag46 = ("Era una vez más, como imaginaste en el momento que tu compañera lo menciono, el pie de página arrancado de un libro, indicando el número de esta. Volvías a pensar en que importancia podía tener esto, pero sacudiste la cabeza ahuyentando todo eso, ahora no había tiempo.\n" +
          "Guardaste el papel en el cajón de tu escritorio y te escondiste en la oficia, esperado hasta que Paz se hubiese ido.\n");
  gm.ui.crearEscenarioSolo(65, pag46, Fondos.F_OFICINA, "66", "64");
  admin.getPlayer(key).setPuntoGuardado(65);
  admin.guardarPLayers();

 }

 public void pagina66(){

  String pag46 = ("Una vez que escuchaste que cerraba la puerta, te dirigiste a la Sala de Salto Temporal. \n" +
          "Accionaste los circuitos del tiempo, ingresaste la fecha destino y, parado frente al portal, cerras tus ojos, debatiendo que hacer.\n" +
          "Pensás en lo que hablaste hace un rato con tu compañera, en todo lo que pasaron con Gabriel. Suspiras, abrís los ojos y cruzas el portal, listo para salvar a tu amigo.\n");
  gm.ui.crearEscenarioSolo(66, pag46, Fondos.F_OFICINA, "67", "65");
  admin.getPlayer(key).setPuntoGuardado(66);
  admin.guardarPLayers();

 }

 public void pagina67(){

  gm.ui.crearEscenaPortalYTP(67, Fondos.F_PORTAL_VIOLETA, "68", "66");
  admin.getPlayer(key).setPuntoGuardado(67);
  admin.guardarPLayers();
 }

 public void pagina68(){

  String pag46 = ("Como en tu sueño, entraste corriendo y sin perder tiempo por la puerta trasera. Esquivaste a los trabajadores, seguiste por los pasillos y finalmente llegaste a los baños, todo en la misma cantidad de tiempo que la prevista, con más de un minuto de sobra.\n" +
          "Mientras te abrías paso entre la multitud, miraste para todos lados, buscando a la figura escondido entre la gente, intentando sentir su presencia.\n" +
          "Pero no estaba en ningún lado.\n");
  gm.ui.crearEscenarioSolo(68, pag46, Fondos.F_COMICCON, "69", "67");
  gm.ui.reproductorUI.cargarSonido("SoundFX/correSilencioGente.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(68);
  admin.guardarPLayers();

 }

 public void pagina69(){

  String pag46 = ("Cruzaste por fin el umbral que separaba la convención del frio pasillo donde tantas veces habías tenido que ver a tu amigo muerto, rodeado de un charco de sangre.\n" +
          "Esperanzado, buscaste a Gabriel en todas direcciones, pero sin éxito. Ni su cuerpo ni él estaban ahí. \n" +
          "Pensando que quizás aun no llego al pasillo y que incluso podés interceptarlo antes, estas a punto de volver a la convención, cuando de repente, detrás de unas cortinas, aparece Gabriel, caminando.\n");
  gm.ui.crearEscenarioSolo(69, pag46, Fondos.F_PASILLO, "70", "68");
  admin.getPlayer(key).setPuntoGuardado(69);
  admin.guardarPLayers();

 }

 public void pagina70(){

  String pag46 = ("—Acá estas amigo, te estaba buscando, ¿dónde habías ido? — le decís emocionado a Gabriel, cuando notas algo raro. ");
  gm.ui.crearEscenarioUnPersonaje(70, pag46, Fondos.F_PASILLO, Principales.G_COSTADO,"71", "69");
  admin.getPlayer(key).setPuntoGuardado(70);
  admin.guardarPLayers();

 }

 public void pagina71(){

  String pag46 = ("Caminaba tambaleándose y con una mirada de terror en sus ojos.\n" +
          "Cayo sobre tus brazos y ahí pudiste notar la herida de un puñal en su espalda. \n" +
          "Su sangre escurría por tus manos mientras en vano tratabas de detener la hemorragia.\n" +
          "Gabriel entonces, con sus últimas fuerzas, giro su cabeza hacia vos y de sus labios, como un leve suspiro, pudiste escuchar.\n" +
          "—¿P..Por qué?\n");
  gm.ui.crearEscenarioGabrielAchurado(71, pag46, Fondos.F_PASILLO, Principales.G_ACHURADO, "72", "70");
  admin.getPlayer(key).setPuntoGuardado(71);
  admin.guardarPLayers();

 }

 public void pagina72(){

  String pag46 = ("Eso fue suficiente para quebrarte. \n" +
          "Soltaste un grito desgarrador y lastimero, tan fuerte que fue escuchado en toda la convención. \n" +
          "Sabias que eso había llamado la atención, debías irte cuanto antes de ahí. \n" +
          "Te levantaste y echando una última mirada al cuerpo de tu amigo, volvés a tu tiempo a través del portal violeta, esta vez usando el de las cartas.\n");
  gm.ui.crearEscenarioGabrielAchurado(72, pag46, Fondos.F_PASILLO, Principales.G_ACHURADO, "73", "71");
  gm.ui.reproductorUI.cargarSonido("SoundFX/gritoDesgarrador.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(72);
  admin.guardarPLayers();

 }

 public void pagina73(){

  gm.ui.crearEscenaPortalCartas(73, Fondos.F_PORTAL_AZUL, "74", "72");
  admin.getPlayer(key).setPuntoGuardado(73);
  admin.guardarPLayers();

 }



 public void pagina74() {
  String pag60 = "Llegaste a tu departamento, muy alterado y nervioso. Te desvestiste, pusiste la ropa a lavar y entraste a la ducha.\n" +
          "Bajo el chorro incesante de la lluvia, veías como el " +
          "agua arrastraba consigo los restos de sangre de Gabriel, desagotando en un pequeño remolino por el" +
          " desagüe. Tus ánimos habían desaparecido, pero limpiaste de tu cuerpo cualquier rastro carmesí.\n" +
          "No sabias cuanto tiempo pasaste bajo la ducha, pero en ningún momento pudiste pensar, te habias limitado unicamente a observar un punto fijo, mientras te lavabas, intentado asimilar si lo que estabas viviendo era real o era otro " +
          "de tus sueños recurrentes.";

  gm.ui.crearEscenarioSolo(74, pag60, Fondos.F_HABITACION, "75", "73");
  gm.ui.reproductorUI.cargarSonido("SoundFX/ducha.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(74);
  admin.guardarPLayers();
 }

 public void pagina75() {
  String pag61 = "Con apenas fuerzas para acostarte, te cambiaste y te metiste dentro de la cama. \n" +
          "Hora tras hora la noche avanzó sin que pudieras conciliar el sueño y cuando sonó la alarma, la apagaste inmediatamente y te levantaste.\n\n" +
          "Con tus fuerzas drenadas te alistas como podes y marchas a la oficina. \n" +
          "Ver a Gabriel muerto tantas veces te había afectado, pero verlo morir en tus brazos, escuchar sus últimas palabras mientras su sangre manchaba tu ropa y se extendía por tu cuerpo simplemente había sido demasiado.\n" +
          "“¿Por qué?” te pregunto, vos tampoco entendías porque le pasaba esto, pero sabias que ibas a" +
          " detenerlo, esta vez no lo lograste por poco, pero estabas cerca, lo presentías.\n";

  gm.ui.crearEscenarioSolo(75, pag61, Fondos.F_HABITACION, "76", "74");
  admin.getPlayer(key).setPuntoGuardado(75);
  admin.guardarPLayers();
 }

 public void pagina76() {
  String pag62 = "Al llegar a la oficina tenían un junta informativa. Dividieron casos y papeleos, discutieron tópicos, pero tu atención estaba en otro lado, simplemente no te concentrabas.\n" +
          "Cuando la reunión había terminado y te disponías a volver a tu escritorio, las alarmas de toda la YTP comenzaron a sonar. \n" +
          "Las DTM en la muñeca de tus compañeros y tuyas empezó a soltar un destello anaranjado.\n";

  gm.ui.crearEscenarioSolo(76, pag62, Fondos.F_OFICINA, "77", "75");
  admin.getPlayer(key).setPuntoGuardado(76);
  admin.guardarPLayers();
 }

 public void pagina77() {
  String pag63 = "-¿Naranja? ¿Qué quiere decir que sea naranja?- preguntaste, pero al levantar la cabeza, Manuel y Paz estaban veían aterrorizados el dispositivo en su muñeca.\n" +
          "-Quiere decir que este es un problema grande, muy grande- respondió Paz\n" +
          "\n";

  gm.ui.crearEscenarioDosPersonajes(77, pag63, Fondos.F_OFICINA, Principales.M_SERIO, Principales.P_APUNTANDO, "78", "76");
  gm.ui.reproductorUI.cargarSonido("SoundFX/Alerta naranja.wav");
  gm.ui.reproductorUI.reproducirSonidoEnBucle();
  admin.getPlayer(key).setPuntoGuardado(77);
  admin.guardarPLayers();
 }

 public void pagina78() {
  String pag64 = "Caminaban por el pasillo a toda velocidad, oficiales se preparaban con equipamiento especial, un despliegue que no habías visto antes.\n" +
          "-Como sabes, el color tradicional es el celeste, un destello para una desviación en la continuidad temporal. Una alerta roja es para un cambio, algo más significativo- explicaba Manuel mientras todos tomaban su equipo- ahora, una alerta naranja se produce cuando una desviación produce un cambio, como si dos líneas temporales diferentes chocasen y eso alterara la continuidad de nuestro tiempo.\n" +
          "-¿Cómo es que nunca vi una?- le preguntaste.\n" +
          "-Eso es porque es extremadamente raro que esto suceda. El ultimo registro que data de uno de estos eventos es de hace más de quinientos años. Incluso existe un protocolo para estos casos.\n";

  gm.ui.crearEscenarioUnPersonaje(78, pag64, Fondos.F_OFICINA, Principales.M_COSTADO, "79", "77");
  gm.ui.reproductorUI.cargarSonido("SoundFX/Alerta naranja.wav");
  gm.ui.reproductorUI.reproducirSonidoEnBucle();
  admin.getPlayer(key).setPuntoGuardado(78);
  admin.guardarPLayers();
 }

 public void pagina79() {
  String pag65 = "-¿Y por qué no seguimos el protocolo? No veo que hagamos nada diferente- retrucaste ante las palabras de Manuel.\n" +
          "-Eso es porque ya no lo enseñan, nadie acá sabe el protocolo- dijo Paz antes de que los tres pasen por el portal en la Sala de Salto Temporal.\n";

  gm.ui.crearEscenarioUnPersonaje(79, pag65, Fondos.F_OFICINA, Principales.P_DADA_VUELTA, "80", "78");
  gm.ui.reproductorUI.cargarSonido("SoundFX/Alerta naranja.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(79);
  admin.guardarPLayers();
 }

 public void pagina80(){

  gm.ui.crearEscenaPortalYTP(80, Fondos.F_PORTAL_VIOLETA, "81", "79");
  admin.getPlayer(key).setPuntoGuardado(80);
  admin.guardarPLayers();

 }

 public void pagina81() {
  String pag66 = "Se encontraban en la China de Gengis Khan, en pleno apogeo de sus campañas, un rio invierno de 1215.\n" +
          "-¿Y qué fue exactamente lo que pasó?- Preguntaste a tus compañeros, se sabía que Gengis era un conquistador sanguinario y peligroso, era de mucho riesgo caminar por sus tierras.\n";

  gm.ui.crearEscenarioUnPersonaje(81, pag66, Fondos.F_EXTERIOR, Principales.P_ESPALDA, "82", "80");
  admin.getPlayer(key).setPuntoGuardado(81);
  admin.guardarPLayers();
 }

 public void pagina82() {
  String pag67 = "-Nunca te enseñamos a discernir rastros temporales, eso es culpa nuestra. Cuando tenemos la alerta de una variación temporal, buscamos información de las fechas y de las personas importantes del lugar donde se produjo y luego de eso rastreamos sus identificadores temporales para saber dónde están, y qué les pasó.\n" +
          "-Okey, entiendo. Pero entonces ¿Qué es lo que paso acá? ¿Algo con Gengis Khan?- preguntaste mientras los agentes que los acompañaban desplegaban un operativo improvisado.\n";

  gm.ui.crearEscenarioUnPersonaje(82, pag67, Fondos.F_EXTERIOR, Principales.M_CEJA_ARQUEADA, "83", "81");
  admin.getPlayer(key).setPuntoGuardado(82);
  admin.guardarPLayers();
 }

 public void pagina83() {
  String pag68 = "-Si, paso algo con Gengis Khan- respondió Manuel, malhumorado como siempre pero preocupado como pocas veces lo habías visto- desapareció sin dejar ningún tipo de rastro\n" +
          "Los oficiales se dispersaron, Paz y vos empezaron a tratar de seguir algún rastro, pero todo era un caos. Había residuos temporales, rastros inútiles, todo estaba disperso y la desorganización de la YTP ante este imprevisto dificultaba todo aún más.\n" +
          "Manuel fumaba a un costado, con cara de preocupación levantaba la mirada cada tanto observando todo el caos.\n";

  gm.ui.crearEscenarioUnPersonaje(83, pag68, Fondos.F_EXTERIOR, Principales.M_NOJAU, "84", "82");
  admin.getPlayer(key).setPuntoGuardado(83);
  admin.guardarPLayers();
 }

 public void pagina84() {
  String pag69 = "-Por lo menos podría hacer algo, no que está ahí parado fumando, como si nada- le expresaste a Paz, molesto- todos estamos desorientados.\n" +
          "-Eh, no, eso no- Paz dejo lo que estaba haciendo para responderte, molesta- Manuel es un gran agente, uno de los mejores de hecho.\n" +
          "Te sentiste atacado, y la única defensa que se te ocurrió fue el contraataque.\n" +
          "-Si, tan bueno que en los últimos 5 meses resolvió 2 casos nada más.\n" +
          "Paz, ahora más molesta que antes se acerca a vos.\n";

  gm.ui.crearEscenarioUnPersonaje(84, pag69, Fondos.F_EXTERIOR, Principales.P_DADA_VUELTA, "85", "83");
  admin.getPlayer(key).setPuntoGuardado(84);
  admin.guardarPLayers();
 }

 public void pagina85() {
  String pag70 = "-Vos mismo lo dijiste, un año llevas acá, el lleva más de veinte. Incluso fue director de la YTP, a la vez que era agente y resolvió más casos en dos años de los que vos podés resolver en cinco. Yo entiendo si no se llevan bien, pero no por eso tenés que faltarle el respeto, hay mucho que podrías y deberías aprender de él.\n" +
          "Con eso dicho, Paz se alejó y te quedaste parado, pensado seriamente en lo que te dijo\n";

  gm.ui.crearEscenarioUnPersonaje(85, pag70, Fondos.F_EXTERIOR, Principales.P_NOJA_FRENTE, "86", "84");
  admin.getPlayer(key).setPuntoGuardado(85);
  admin.guardarPLayers();
 }

 public void pagina86() {
  String pag71 = "Pero eso no duro mucho, ya habría tiempo para pensar después, prestaste atención a tu alrededor y viste como la caótica operación había empeorado. Huellas mezcladas por la escena, oficiales fingiendo hacer algo, pistas inútiles. Y ahí seguía Manuel, pero cuando lo viste, rompió su silencio y se movió. \n" +
          "Apago su cigarrillo, ajusto su corbata y con su característico ceño fruncido, comenzó a dar órdenes.\n";

  gm.ui.crearEscenarioUnPersonaje(86, pag71, Fondos.F_EXTERIOR, Principales.M_COSTADO, "87", "85");
  admin.getPlayer(key).setPuntoGuardado(86);
  admin.guardarPLayers();
 }

 public void pagina87() {
  String pag72 = "-Ortega, quedate quieto de una vez que de tanto ir y venir vas a arruinar cualquier tipo de pista que hubiéramos podido encontrar. Giménez, Rolón, dejen de hacerse los que laburan y tracen un perímetro de cien metros.\n" +
          "Mirabas a Manuel, como de repente había cambiado completamente su energía, activándose algo dentro de él. De forma natural empezaba a organizar a tus colegas y sus tareas, ordenando un poco la desordenada operación.\n" +
          "-Mr. Orange y Ender, quiero que investiguen a los alrededores, traten de trazar un mapeo de por lo menos un kilómetro a la redonda, busquen rastros de civilización y de cualquier otra cosa que pueda ser útil. Los demás empiecen con un rastrillaje por la zona. \n";

  gm.ui.crearEscenarioUnPersonaje(87, pag72, Fondos.F_EXTERIOR, Principales.M_SERIO, "88", "86");
  admin.getPlayer(key).setPuntoGuardado(87);

  admin.desbloquearLogro(key, LogrosTitle.A_TRABAJAR);

  admin.guardarPLayers();
 }

 public void pagina88() {
  String pag73 = "Las palabras de Manuel, el hecho de que tomara las riendas de la desorganizada situación produjo un notable cambio positivo en el grupo. La energía, el flujo había cambiado y también los ánimos de todos. Cuando tu compañero ya designo las tareas a todos, encamino hacia tu lado.\n" +
          "-Dale nene, mové. Vamos a buscar a Paz y empecemos a averiguar qué fue que pasó acá.\n" +
          "Sin siquiera amagar a decirle nada, apuraste el paso y lo seguiste.\n";

  gm.ui.crearEscenarioUnPersonaje(88, pag73, Fondos.F_EXTERIOR, Principales.M_COSTADO_DER, "89", "87");
  admin.getPlayer(key).setPuntoGuardado(88);
  admin.guardarPLayers();
 }

 public void pagina89() {
  String pag74 = "Caminaron un poco por la zona, era un terreno montañoso dado que se encontraban en plena campaña por la conquista de Zhongdu, la actual Pekín. Estaban en las afueras de Juyongguan, en medio de un territorio boscoso. A la vez que buscaban a Paz. escudriñaban con la mirada el suelo y la vegetación en busca de cualquier rastro útil.\n" +
          "Cuando ya habían andado un rato y seguían sin obtener señales de Paz, se preocuparon un poco, aunque el poder ver su huella temporal en sus escáneres los tranquilizaba. \n";

  gm.ui.crearEscenarioSolo(89, pag74, Fondos.F_EXTERIOR, "90", "88");
  admin.getPlayer(key).setPuntoGuardado(89);
  admin.guardarPLayers();
 }

 public void pagina90() {
  String pag75 = "Escucharon a pocos metros suyos como se sacudía la vegetación así que ambos se pusieron alerta, levantaron sus muñecas, dispuestos a usar las armas que incluían sus relojes de agente.\n" +
          "De entre las plantas se asomó Paz, caminando apurada y despreocupada.\n" +
          "-Miren quienes están acá ¿ya hicieron algo o siguen dando vueltas al pedo? Vengan, encontré alguien que puede ser de ayuda.\n" +
          "-¿Alguien?- preguntaron Manuel y vos al unísono, pero Paz se había dado vuelta y volvía sobre sus pasos, ignorándolos.\n";

  gm.ui.crearEscenarioUnPersonaje(90, pag75, Fondos.F_EXTERIOR, Principales.P_APUNTANDO, "91", "89");
  admin.getPlayer(key).setPuntoGuardado(90);
  admin.guardarPLayers();
 }

 public void pagina91() {
  String pag76 = "Luego de que anduvieron entre el bosque y la alta vegetación sin mediar conversaciones entre ustedes, llegaron a un claro. Unas pocas chozas se alzaban improvisando una pequeña aldea.";

  gm.ui.crearEscenarioSolo(91, pag76, Fondos.F_EXTERIOR, "92", "90");
  admin.getPlayer(key).setPuntoGuardado(91);
  admin.guardarPLayers();
 }

 public void pagina92() {
  String pag77 = "-¿Ya hablaste con alguien? ¿Tenés idea si te vieron?- preguntó Manuel a Paz mientras, ocultos todavía en el bosque, analizaban el lugar.\n" +
          "-No, no. Vi un poco, todas familias de pescadores y trabajadores. No hablo chino, pero tampoco lo necesitaba, se los veía algo alterados, preocupados. Analice los rastros cercanos en la DTM y no encontré a nadie importante o que pareciera peligroso.\n" +
          "-Okey, okey… ¿les parece bien que nos acerquemos?- pregunta Manuel, mirando a uno y a otro.\n" +
          "Ambos asienten y decididos, se levantan para acercarse a la pequeña comunidad.\n";

  gm.ui.crearEscenarioUnPersonaje(92, pag77, Fondos.F_EXTERIOR, Principales.M_CEJA_ARQUEADA, "93", "91");
  admin.getPlayer(key).setPuntoGuardado(92);
  admin.guardarPLayers();
 }

 public void pagina93() {
  String pag78 =("A medida que se acercaban, las personas de las chozas empezaban a salir. Las cabezas de los más pequeños se asomaban por las ventanas. Para cuando llegaron al centro de la aldea, los esperaban una señora mayor junto a un hombre adulto\n" +
          "-站住。你们是谁？来这里干什么？ \n" +
          "Naturalmente no entendiste las palabras de la señora, la cual parecía tener algún tipo de autoridad. Tus compañeros no habían contemplado esto antes de acercarse, la diferencia de idiomas aguaba cualquier intento de conseguir información.\n");

  gm.ui.crearEscenarioUnPersonaje(93, pag78, Fondos.F_EXTERIOR, Principales.M_COSTADO_DER, "94", "92");
  admin.getPlayer(key).setPuntoGuardado(93);
  admin.guardarPLayers();
 }

 public void pagina94() {
  String pag79 =("-你好，请原谅我们的冒昧打扰，我们是来和平的。\n" +
          "No imaginas cual fue tu cara al escuchar a Manuel respondiendo a la mujer en lo que creías, era un chino perfecto. Sin dudas había cosas acerca de tu amargado compañero que no sabias.\n" +
          "Escuchaste con atención el resto de la conversación, aunque sin entender nada, intentabas descifrar la cara de tu compañero. \n" +
          "Pero antes de que pudieran terminar la charla, los habitantes del lugar volvieron a revolucionarse y ustedes voltearon en la dirección a donde todos veían. \n");

  gm.ui.crearEscenarioUnPersonaje(94, pag79, Fondos.F_EXTERIOR, Principales.M_COSTADO_DER, "95", "93");
  admin.getPlayer(key).setPuntoGuardado(94);

  admin.desbloquearLogro(key, LogrosTitle.CHIN_CHON_CHIN);

  admin.guardarPLayers();
 }

 public void pagina95() {
  String pag80 = "Mr. Orange y Ender venían caminando y cuando los vieron se acercaron. Al ver que todos estaban juntos, los locales, de los cuales se habían ganado su confianza, se tranquilizaron. \n" +
          "\n" +
          "-Señor, no esperábamos encontrarlo por acá. Parece que se nos adelantaron-dijo Orange y después agrego- ¿Cómo fue por acá? ¿Averiguaron algo?\n";

  gm.ui.crearEscenarioUnPersonaje(95, pag80, Fondos.F_EXTERIOR, Principales.M_COSTADO, "96", "94");
  admin.getPlayer(key).setPuntoGuardado(95);
  admin.guardarPLayers();
 }

 public void pagina96() {
  String pag81 = "Mientras oficial y agente seguían conversando, tu atención se desvió de la conversación hacia los locales. Hablaban entre ellos, alterados, sin dejar de observar a los recién llegados, señalándolos mientras hacían comentarios que no podías entender.\n" +
          "Preocupado empezaste a observarlos, tratando de notar algo raro que tuviesen, sin poder distinguir nada hasta que caíste en cuenta.\n" +
          "-Mr. Orange, Ender- dijiste interrumpiendo la conversación- donde están sus DTM ¿les paso algo?\n" +
          "-No, están acá. ¿Qué les pudo pasar?- te respondió Ender, pero cuando los agentes descubrieron sus brazos, las caras de todos cambiaron.\n";

  gm.ui.crearEscenarioUnPersonaje(96, pag81, Fondos.F_EXTERIOR, Principales.M_CEJA_ARQUEADA, "97", "95");
  admin.getPlayer(key).setPuntoGuardado(96);
  admin.guardarPLayers();
 }

 public void pagina97() {
  String pag82 = "Ahora, alzando sus voces, los locales pedían respuestas a Manuel. Los DTM permiten a los locales verlos caracterizados como gente de la época, sin ellos, serán vistos con sus ropas modernas.\n" +
          "El caos se desenvolvió, los aldeanos alterados gritaban, Manuel trataba de calmarlos sin mucha suerte mientras los apuntaban con lanzas improvisadas utilizadas para la pesca. \n" +
          "Ender era la única otra persona en el grupo que entendía algo de chino por lo que trataba de traducir.\n" +
          "-Nos reclaman que somos como el hombre que trajo tragedia. El mismo que habían visto. Manuel trata de convencerlos que también buscamos a esa…\n" +
          "Un aullido rompió el cielo, proveniente del terreno un poco más elevado a sus espaldas. La líder de la tribu señalo horrorizada en esa dirección y grito.\n";

  gm.ui.crearEscenarioUnPersonaje(97, pag82, Fondos.F_EXTERIOR, Principales.M_NOJAU, "98", "96");
  admin.getPlayer(key).setPuntoGuardado(97);
  admin.guardarPLayers();
 }

 public void pagina98() {
  String pag83 = "-SUBOTAI\n" +
          "Y echó a correr. \n";

  gm.ui.crearEscenarioSolo(98, pag83, Fondos.F_EXTERIOR, "99", "97");
  admin.getPlayer(key).setPuntoGuardado(98);
  admin.guardarPLayers();
 }

 public void pagina99() {
  String pag84 = "El silbido de ciento de proyectiles inundo el lugar, sus sombras se proyectaban en el suelo y avanzaban, inmutables, hacia ustedes.\n" +
          "La lluvia de flechas del ejercito Mongol cayó sobre el lugar, clavandose en las casas, en el suelo, o alcanzando a miembros del pequeño poblado.\n" +
          "Cuando volteaste hacia tus compañeros, pudiste observar como Mr. Orange caía arrodillado. Tres flechas se habían abierto camino desde su espalda hasta su pecho y con un último alarido, comenzaba a desangrarse.\n" +
          "-Corran, corran, corran- gritaron los demás, huyendo hacia las profundidades del bosque, moviéndose en zigzag como un desesperado intento por esquivar el letal ataque.\n";

  gm.ui.crearEscenarioUnPersonaje(99, pag84, Fondos.F_EXTERIOR, Principales.P_DADA_VUELTA, "100", "98");
  gm.ui.reproductorUI.cargarSonido("SoundFX/LluviaFlechas.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(99);
  admin.guardarPLayers();
 }

 public void pagina100() {
  String pag85 = "Mientras el grupo huía entre los arboles, viste a Paz detenerse durante un instante, tirando algo a un costado, entre la vegetación.\n" +
          "-Subotai es la mano derecha de Gengis Khan, el quedó al mando del ejército mongol con la desaparición de su camarada. No sé cómo nos encontraron.\n" +
          "-Quizás nos siguieron a Mr. Orange y a mí, tal vez estaban recorriendo la zona en busca del conquistador. Sea lo que sea, no quiero parar a preguntarles- respondió Ender a Manuel.\n" +
          "Divisaron una salida a un claro a una corta distancia. \n" +
          "Creyéndose a salvo apuraron la marcha, pero al llegar, una realidad diferente aplaco su emoción.\n";

  gm.ui.crearEscenarioUnPersonaje(100, pag85, Fondos.F_EXTERIOR, Principales.P_ESPALDA, "101", "99");
  admin.getPlayer(key).setPuntoGuardado(100);
  admin.guardarPLayers();
 }

 public void pagina101(){

  String pag85 = "Sobre caballos se encontraban varios miembros del ejército mongol, esperándolos.\n" +
          "Antes de poder dar la vuelta para tratar de huir en la otra dirección, se vieron rodeados.\n" +
          "Sin más remedio que rendirse, fueron tomados como prisioneros del ejercito oriental, atados de manos a un caballo y obligados a seguir el ritmo.\n";

  gm.ui.crearEscenarioSolo(101, pag85, Fondos.F_EXTERIOR, "102", "100");
  admin.getPlayer(key).setPuntoGuardado(101);
  admin.guardarPLayers();

 }

 public void pagina102(){

  String pag85 = "Manuel lideraba la marcha, con Paz detrás y cerrando el grupo, estaban vos y Ender, en ese orden. \n" +
          "El ejercito mongol iba casi al galope, forzándolos a correr, y más de una vez, alguno tropezaba y era arrastrado por unos metros.\n" +
          "Delante tuyo, Paz se retorcía disimuladamente, pero no intentado liberarse de las fuertes ataduras en sus muñecas, sino que buscaba alcanzar su bolsillo.\n";

  gm.ui.crearEscenarioUnPersonaje(102, pag85, Fondos.F_EXTERIOR, Principales.P_ESPALDA, "103", "101");
  admin.getPlayer(key).setPuntoGuardado(102);
  admin.guardarPLayers();

 }

 public void pagina103() {

  String pag85 = "-Paz… Paz- susurraste detrás de ella- ¿Qué haces?\n" +
          "-Mientras huíamos, tire detrás de unos árboles una carta roja. Tengo que alcanzar la segunda para abrir el de salida y poder volver ahí.\n" +
          "-Te vi que habías parado un segundo. No me imagine que era por eso, no se me había ocurrido, es una fantástica idea.\n" +
          "Paz soltó una leve risa, halagada por tus felicitaciones, pero apenas ofendida por tu sorpresa ante su plan.\n" +
          "-¿Qué? ¿Te pensás que solo Manuel y vos pueden tener ideas? Estas muy equivocado entonces.\n";

  gm.ui.crearEscenarioUnPersonaje(103, pag85, Fondos.F_EXTERIOR, Principales.P_DADA_VUELTA, "104", "102");
  admin.getPlayer(key).setPuntoGuardado(103);
  admin.guardarPLayers();

 }

 public void pagina104() {

  String pag85 = "-Tus manos, amañatadas en tu espalda se desesperaban por intentar ayudar a tu compañera en su lucha. Veías como sus dedos se acercaban al bolsillo donde estaba la que es su oportunidad de escape, pero no podía alcanzarla, las ligaduras mantenían sus brazos firmes y dificultaba cualquier movimiento. \n" +
          "La ansiedad te mataba, tenías miedo de que sus captores lo noten por tu culpa, pero en el momento que un gran palacio surgió ante ustedes y se detuvieron, supiste que los intentos de escape debían esperar.\n" +
          "Los desataron del caballo y los obligaron a entrar, siendo arrastrados hasta el salón central.\n";

  gm.ui.crearEscenarioUnPersonaje(104, pag85, Fondos.F_EXTERIOR, Principales.P_ESPALDA, "105", "103");
  admin.getPlayer(key).setPuntoGuardado(104);
  admin.guardarPLayers();
 }

 public void pagina105(){

  String pag85 = "Allí, Subotai, el nuevo líder del ejercito mongol empezó a interrogarlos. Solo Manuel respondía a sus palabras, tratando de calmar al enfurecido guerrero.\n" +
          "La desesperación de no entender ni una palabra de la conversación era abrumadora.\n" +
          "Pero para lo que aconteció un momento después, no necesitabas entender lo que decían.\n";

  gm.ui.crearEscenarioSolo(105, pag85, Fondos.F_CHINA, "106", "104");
  admin.getPlayer(key).setPuntoGuardado(105);
  admin.guardarPLayers();

 }

 public void pagina106() {

  String pag85 = "Cortaron las ataduras de Ender, tirando de su pelo para levantarlo a la fuerza y llevarlo frente al grupo. \n" +
          "Apuntaban a su cuello con una de las espadas y Manuel, gritando con desesperación, no logro convencer al sangriento general, quien espada en mano, se paró frente a su vencido compañero y lanzo una estocada directa a su pecho.\n";

  gm.ui.crearEscenarioSolo(106, pag85, Fondos.F_CHINA, "107", "105");
  admin.getPlayer(key).setPuntoGuardado(106);
  admin.guardarPLayers();
 }

 public void pagina107() {

  String pag85 = "Todo transcurrió muy rápido. \n" +
          "Ender, con sus manos liberadas puso velozmente una carta roja en el lugar donde se dirigía la estocada y sentiste como en tus manos dormidas se abría el portal de salida, liberándote de tus sogas.\n" +
          "No sabias en qué momento había colocado el artefacto entre tus dedos, pero no ibas a desaprovechar la oportunidad.\n" +
          "Ante la mirada sorprendida de todos los mongoles, introdujiste tus manos liberadas por el portal abierto, tomando la espada de las manos de Subotai y con un rápido movimiento, liberaste también las ataduras de Paz, quien tomo su UTN roja y abrió la salida hacia la libertad, saltando dentro y llevándose consigo a Manuel, todavía con las manos atadas.\n";

  gm.ui.crearEscenarioSolo(107, pag85, Fondos.F_CHINA, "108", "106");
  admin.getPlayer(key).setPuntoGuardado(107);
  admin.guardarPLayers();

 }

 public void pagina108() {

  String pag85 = "Los soldados del desaparecido Gengis Khan se recuperaron de la conmoción del momento actuaron rápido, atacando. " +
          "Desviaste un par de estocadas y atravesaste a un soldado en el pecho, aunque la espada te pesaba y tus movimientos eran torpes comparados a los entrenados guerreros.\n" +
          "\n" +
          "Pero frente a tus ojos, viste como Ender corría la misma suerte que el soldado mongol. Un miembro del ejercito oriental batió su espada y con un rápido y conciso corte, despego la cabeza de tu compañero de sus hombros.\n" +
          "Sin posibilidad de pelear, te sumergiste dentro del portal abierto momentos antes por tu compañera, y al salir de vuelta al bosque, Paz selló la abertura espacial.\n";

  gm.ui.crearEscenarioSolo(108, pag85, Fondos.F_CHINA, "109", "107");
  admin.getPlayer(key).setPuntoGuardado(108);
  admin.guardarPLayers();

 }

 public void pagina109() {
  String pag85 = "-¿Y Ender? ¿Dónde está Ender?- preguntaba Manuel, retorciéndose en sus todavía aprensadas muñecas.\n" +
          "Sin ser capaz de pronunciar palabra, miras a tus compañeros, con una expresión abatida y solamente negas con la cabeza.\n" +
          "Paz sollozó y Manuel gritó con ira e impotencia, vos, todavía con la espada en mano, cortaste las sogas que sostenían las manos de Manuel, limpiaste la hoja y decidís conservarla.\n" +
          "Dejas unos momentos para que puedan descansar y recuperarse de lo pasado, pero viendo cómo se aproxima el atardecer, sugerís\n" +
          "-Vamos, busquemos al resto del grupo y asegurémonos de que estén bien.\n";

  gm.ui.crearEscenarioUnPersonaje(109, pag85, Fondos.F_EXTERIOR, Principales.M_NOJAU,"110", "108");
  admin.getPlayer(key).setPuntoGuardado(109);
  admin.guardarPLayers();
}

 public void pagina110() {

  String pag85 = "Desandaron el camino de vuelta a donde esperaba el grupo, ya habían pasado algunas horas y la luz, aunque no se había ido completamente, si había disminuido bastante. En todo momento reino el silencio entre ustedes, más allá de algún quejido por el esfuerzo de caminar en el terreno irregular. El ambiente se sentía pesado y triste, sin ánimo alguno.\n" +
          "\n" +
          "Cuando llegaron por fin al claro donde había sido desplegado el operativo, los últimos rayos del sol desaparecían detrás del horizonte. \n" +
          "Cuando sus compañeros los vieron venir, se acercaron emocionados, pero al notar lo desarreglados que se encontraban y la pesadumbre en sus rostros, supieron que algo andaba mal.\n";

  gm.ui.crearEscenarioSolo(110, pag85, Fondos.F_EXTERIOR,"111", "109");
  admin.getPlayer(key).setPuntoGuardado(110);
  admin.guardarPLayers();
 }

 public void pagina111() {

  String pag85 = "-Señor, ¿Que paso? Desaparecieron por horas, tampoco tenemos señales de Mr. Orange ni de Ender desde que salieron a hacer el reconocimiento- preguntó Ortega, aunque se veía en su rostro que conocía el destino de sus camaradas.\n" +
          "-Fuimos emboscados y capturados por parte del ejercito mongol. Mr. Orange y Ender fueron asesinados en cumplimiento de su deber. De no ser por ellos, nosotros no estaríamos acá- respondió Manuel.\n" +
          "Murmullos y lamentos se escucharon en el grupo reunido alrededor de ustedes, afectado ante el fatal destino de los dos oficiales.\n";

  gm.ui.crearEscenarioUnPersonaje(111, pag85, Fondos.F_EXTERIOR, Principales.M_COSTADO,"112", "110");
  admin.getPlayer(key).setPuntoGuardado(111);
  admin.guardarPLayers();

 }

 public void pagina112() {

  String pag85 = "De tu bolsillo sacaste las credenciales de oficiales de la YTP de tus difuntos compañeros, acercándolas al grupo.\n" +
          "-Fueron muy valientes y grandes compañeros. Se que no es mucho, pero quería traer algo para poder rendirles honor y que sean recordados.\n" +
          "Manuel te miro, sorprendido de lo que habías hecho. Se acerco y las recibió de tu mano, agradeciéndote.\n" +
          "-Tendrán su reconocido homenaje al volver- dijo tu compañero y volviéndose al grupo, continuó-. Por lo que veo, colocaron un prolongador temporal, muy bien muchachos. ¿Encontraron algo interesante?\n" +
          "-De hecho, lo hicimos- respondió Ortega\n";

  gm.ui.crearEscenarioUnPersonaje(112, pag85, Fondos.F_EXTERIOR, Principales.M_SERIO,"113", "111");
  admin.getPlayer(key).setPuntoGuardado(112);
  admin.guardarPLayers();

 }

 public void pagina113() {

  String pag85 = "Caminaron un poco, siguiendo al oficial hasta una zona señalizada e iluminada con faroles led.\n" +
          "-Es casi al final del perímetro, lo encontramos gracias a lo que nos enseñaste- decía Ortega a Manuel mientras se acercaban.\n" +
          "-Nunca se revisa lo suficiente- dijeron los hombres al unísono, riendo suavemente, tratando de encontrar, en la camadería del grupo de agentes, un pequeño consuelo para el desolador final de sus amigos.\n";

  gm.ui.crearEscenarioUnPersonaje(113, pag85, Fondos.F_EXTERIOR, Principales.M_COSTADO_DER,"114", "112");
  admin.getPlayer(key).setPuntoGuardado(113);
  admin.guardarPLayers();

 }

 public void pagina114() {

  String pag85 = "Cuando llegaron frente a la prueba, esta era una clara e inconfundible marca de neumático.\n" +
          "-¿Ya tomaron fotos y una copia de la huella?- preguntó Paz- ¿Encontraron algo más?\n" +
          "-Si, también residuos de poli glicol, que es…\n" +
          "-Líquido para frenos– completaste, agachándote para prestar atención a la marca en el barro.\n";

  gm.ui.crearEscenarioUnPersonaje(114, pag85, Fondos.F_EXTERIOR, Principales.P_FRENTE,"115", "113");
  admin.getPlayer(key).setPuntoGuardado(114);
  admin.guardarPLayers();
 }

 public void pagina115() {

  String pag85 = "Manuel y Paz empezaron a hablar entre ellos, algo alejados, pero lograbas escuchar algo de la conversación.\n" +
          "-…con que así es como lo hace, no puedo creerlo- decía tu compañera.\n" +
          "-Pero ¿un auto? ¿De verdad? ¿Cómo se nos pudo escapar?- cuestionaba Manuel.\n" +
          "-No lo sé, pero no hay dudas de que es él. Su rastro está en el área, tenue, pero inconfundible.\n" +
          "\n" +
          "Definitivamente hablaban de la figura. Nunca te habían contado del caso, pero sabías que la YTP y vos estaban bajo el mismo objetivo: el asesino de Gabriel. \n" +
          "Aunque claro, esto fuera por motivos diferentes.\n";

  gm.ui.crearEscenarioDosPersonajes(115, pag85, Fondos.F_EXTERIOR, Principales.M_CEJA_ARQUEADA, Principales.P_ESPALDA,"116", "114");
  admin.getPlayer(key).setPuntoGuardado(115);
  admin.guardarPLayers();
 }

 public void pagina116() {

  String pag85 = "-Bueno- dijo Manuel acercándose a vos y al resto del grupo- creo que fue un día más que largo, es momento de volver.\n" +
          "Se reunieron y juntaron todo lo desplegado para el operativo, deshicieron el prolongador temporal y se comunicaron con la estación para abrir el portal de salida.\n";

  gm.ui.crearEscenarioUnPersonaje(116, pag85, Fondos.F_EXTERIOR, Principales.M_COSTADO_DER,"117", "115");
  admin.getPlayer(key).setPuntoGuardado(116);
  admin.guardarPLayers();

 }

 public void pagina117() {


  gm.ui.crearEscenaPortalYTP(117, Fondos.F_PORTAL_VIOLETA, "118", "116");
  admin.getPlayer(key).setPuntoGuardado(117);
  admin.guardarPLayers();

 }

 public void pagina118() {

  String pag85 = "Cuando volvieron a la YTP, los esperaban sus colegas junto con algunos miembros de la directiva. \n" +
          "Entre tanta gente que buscaba saber un poco más de lo sucedido te separas de tus dos compañeros, pero alcanzas a ver como la directora y Manuel hablan y este es custodiado hacia la oficina de tu superior.";

  gm.ui.crearEscenarioUnPersonaje(118, pag85, Fondos.F_OFICINA, Principales.M_COSTADO,"119", "117");
  admin.getPlayer(key).setPuntoGuardado(118);
  admin.guardarPLayers();

 }

 public void pagina119() {

  String pag85 = "—Manuel, Manuel— llamas a tu compañero, quien se voltea a verte mientras te abrís paso entre la gente— ¿Está todo bien? ¿A dónde te llevan?";

  gm.ui.crearEscenarioUnPersonaje(119, pag85, Fondos.F_OFICINA, Principales.M_CEJA_ARQUEADA,"120", "118");
  admin.getPlayer(key).setPuntoGuardado(119);
  admin.guardarPLayers();

 }

 public void pagina120() {

  String pag85 = "—No te preocupes pibe, es una cuestión de protocolo, siendo el más alto mando de la operación tengo que ir a dar testimonio de lo que paso— y sonriendo agregó— no pienses que me vas a robar el puesto tan fácil eh.";

  gm.ui.crearEscenarioUnPersonaje(120, pag85, Fondos.F_OFICINA, Principales.M_Y_BUENO,"121", "119");
  admin.getPlayer(key).setPuntoGuardado(120);
  admin.guardarPLayers();

 }

 public void pagina121() {

  String pag85 = "Poco a poco, el tumulto fue reduciéndose, yendo llevados a la sala de ceremonias para rendir tributo a los oficiales caídos. En una ceremonia emotiva, se despidieron de sus compañeros y sus nombres fueron grabados en el Salón de los Caídos.\n" +
          "Terminado el acto, fuiste a los vestidores a dejar tu uniforme. Había sido un día muy largo e intenso, sumado a tu falta de sueño. \n" +
          "La muerte de Gabriel en tus brazos, sus últimas palabras, todo lo ocurrido esa tarde en China. Solo querías descansar, solo necesitabas un poco de paz.\n";

  gm.ui.crearEscenarioSolo(121, pag85, Fondos.F_OFICINA,"122", "120");
  admin.getPlayer(key).setPuntoGuardado(121);
  admin.guardarPLayers();

 }

 public void pagina122() {

  String pag85 = "Manuel entró al vestidor, abriendo la puerta de improvisto y con un fuerte golpe, provocando que te sobresaltes.\n" +
          "—Upa, disculpame, la próxima te golpeo la puerta antes de entrar— dijo con el habitual sarcasmo con el que se dirigía a vos.\n" +
          "Te limitaste a mirarlo y seguir con lo tuyo, haciendo él lo propio, colgando su traje.\n";

  gm.ui.crearEscenarioUnPersonaje(122, pag85, Fondos.F_OFICINA, Principales.M_Y_BUENO,"123", "121");
  admin.getPlayer(key).setPuntoGuardado(122);
  admin.guardarPLayers();


 }

 public void pagina123() {

  String pag85 = "—Quiero agradecerte— dijo Manuel, rompiendo el silencio mientras te hablaba sobre su hombro— el haber tenido la consideración de traer las identificaciones de Mr. Orange y de Ender,  tu rápido accionar para que podamos escapar de los mongoles.\n" +
          "—No es nada, sentía que era lo menos…\n" +
          "—No obstante— dijo Manuel interrumpiéndote— hay algo que tengo que hablar con vos. Paz me contó acerca de lo de tu amigo, y yo no me olvido de cómo decías que venías acá a detener al que lo hizo.\n" +
          "Manuel ahora te miraba muy serio, preparado para cualquier cosa que trataras de hacer o decir para defenderte.\n";

  gm.ui.crearEscenarioUnPersonaje(123, pag85, Fondos.F_OFICINA, Principales.M_SERIO,"124", "122");
  admin.getPlayer(key).setPuntoGuardado(123);
  admin.guardarPLayers();

 }

 public void pagina124() {

  String pag85 = "—Tarde o temprano te vas a enterar. Lo que pasó hoy es obra de la misma persona, un criminal temporal al cual le seguimos la pista hace años y con lo de esta tarde, con su descuido de dejar una huella en el lugar, estamos más cerca que nunca de atraparlo, y no pienso dejar que hagas algo que pueda mínimamente interferir, ralentizar o arruinar esta investigación.\n" +
          "—Creo que esto sirvió para que veas que no sos ninguna clase de superpoderoso, algún estilo raro de elegido profético, no sos nada más que un tipo común y corriente— Manuel hablaba sin darse una pausa siquiera para respirar, su postura y su tono se habían vuelto más agresivas y desafiantes.\n" +
          "—En muchas ocasiones me haces acordar a mí. Tantos casos, tanta visibilidad te tocaron el ego y se nota, así que escucha lo que te digo y recordá mis palabas. \n";

  gm.ui.crearEscenarioUnPersonaje(124, pag85, Fondos.F_OFICINA, Principales.M_NOJAU,"125", "123");
  admin.getPlayer(key).setPuntoGuardado(124);
  admin.guardarPLayers();

 }

 public void pagina125() {

  String pag85 = "—Hace algunos años, yo tenía un compañero, un amigo muy cercano. Mano a mano competíamos el uno con el otro en la cantidad de casos resueltos, con ingenio y preparación resolvíamos casos que complicaban a los más experimentados.\n" +
          "—Aun así, éramos diferentes. Él,  altruista y humilde, nunca buscaba los créditos y en muchas veces, me los cedía a mí, lo que provocaba que mi ego y orgullo se multiplicaran. Me hicieron creer que  yo era especial, que era diferente— hizo una pausa para reír, sacudiendo su cabeza— ¿sabes? Incluso en un punto empecé a buscar al Ojo de las Eras, creyéndome digno y alguien preparado para algo más grande. Que ridículo.\n";

  gm.ui.crearEscenarioUnPersonaje(125, pag85, Fondos.F_OFICINA, Principales.M_CEJA_ARQUEADA,"126", "124");
  admin.getPlayer(key).setPuntoGuardado(125);
  admin.guardarPLayers();

 }

 public void pagina126() {

  String pag85 = "—Para colmo fui nombrado director, y claro que no quería dejar de lado la atención que recibía. Mis responsabilidades al frente de la YTP, los casos a resolver, las tareas que se acumulaban, todo eso hizo que me alejara de lo importante, siendo absorbido por el trabajo— hizo una pausa, reflexiva y apenada y continuó— en el medio de un caso que resolvíamos juntos, yo… lo perdí. Me han dicho mil veces que no es culpa mía, pero sé que pude hacer más,  que debí hacer más, y eso intenté. Cometí el grave error de creer que podía hacer lo que los demás no, viaje al pasado en repetidas ocasiones, para tratar de salvarlo, provocando caos en la línea del tiempo, aunque no lo sabía.\n" +
          "Mirabas a Manuel, sorprendido e impactado por lo que te contaba. Veías a tu compañero, pero este no era el hombre con el que tenías roces, era el sabio y experimentado agente, una persona con sus debilidades, exponiéndose.\n";

  gm.ui.crearEscenarioUnPersonaje(126, pag85, Fondos.F_OFICINA, Principales.M_SERIO,"127", "125");
  admin.getPlayer(key).setPuntoGuardado(126);
  admin.guardarPLayers();

 }

 public void pagina127() {

  String pag85 = " —Me atraparon antes de que pueda conseguirlo, me destituyeron como director y fui apartado de cualquier misión a la espera de un juicio. Fue difícil, fui en contra de todo lo que defendemos como institución, de lo que protegemos. \n" +
          "—Mi historial como agente, mi servicio a la YTP hizo que fallaran a mi favor y consiguió que no me echaran, pero fui enviado al archivo, degradado a simplemente acomodar bibliotecas.\n" +
          "—Un tiempo después, un criminal que había logrado detener escapó y fui llamado como asesor. Lo di todo y pudieron atraparlo, por lo que fui reinsertado, aunque el Manuel al que le devolvieron su placa no era ni una sombra de aquel joven e intrépido detective.\n";

  gm.ui.crearEscenarioUnPersonaje(127, pag85, Fondos.F_OFICINA, Principales.M_CEJA_ARQUEADA,"128", "126");
  admin.getPlayer(key).setPuntoGuardado(127);
  admin.guardarPLayers();

 }

 public void pagina128() {

  String pag85 = "—Mi cuerpo y mis sentidos estaban oxidados, me fueron reasignados múltiples compañeros debido a mi adusto carácter. Todo hasta que llego Paz, joven y prometedora, supo adaptarse a mi mal genio y pudimos entablar una bella amistad, basada en el respeto mutuo.\n" +
          "—Vos fuiste más complicado— prosiguió, lanzándote una sonrisa— pero también despertaste una parte mía que se había tomado una larga siesta, y quiero agradecerte por eso. No sos un mal pibe, por eso te estoy diciendo esto. No cometas el mismo error que yo, algunas cosas deben hacerse, aun sin saber las consecuencias.\n";

  gm.ui.crearEscenarioUnPersonaje(128, pag85, Fondos.F_OFICINA, Principales.M_SERIO,"129", "127");
  admin.getPlayer(key).setPuntoGuardado(128);
  admin.guardarPLayers();


 }

 public void pagina129() {

  String pag85 = "Conocías esa frase, era la misma que estaba escrita en el papel clavado en el cuerpo de Gabriel, cuando lo encontraste por primera vez en ese pasillo. \n" +
          "Herviste en ira y en un par de zancadas agresivas, acortaste la distancia con Manuel.\n" +
          " —Hay una sola cosa en la que tenés razón, Manuel. Yo no pienso cometer error alguno.\n" +
          "Diciendo esto, diste media vuelta y te fuiste. \n";

  gm.ui.crearEscenarioUnPersonaje(129, pag85, Fondos.F_OFICINA, Principales.M_SERIO,"130", "128");
  admin.getPlayer(key).setPuntoGuardado(129);
  admin.guardarPLayers();

 }

 public void pagina130() {

  String pag85 = "Tu cabeza daba vueltas, tratando de procesar toda la información que había recibido en tan poco tiempo. Manuel, su amigo, su experiencia tan similar, pero, sobre todo, pensabas en la última frase que había dicho.\n" +
          "Eran idénticas, no podía ser coincidencia. Manuel tendría que saber algo. \n" +
          "Sin dejar de pensarlo, llegaste a tu casa y tomaste una pizarra de corcho donde llevabas registro de tu investigación de la figura misteriosa.\n" +
          "Clavaste de forma individual cada trozo de papel que habías extraído de tus sueños y en la columna “Personas de Interés”, colocaste una foto de Manuel.\n";

  gm.ui.crearEscenarioSolo(130, pag85, Fondos.F_HABITACION,"131", "129");
  admin.getPlayer(key).setPuntoGuardado(130);
  admin.guardarPLayers();

 }

 public void pagina131() {

  String pag85 = "Te sentaste frente a tu escritorio y tomaste el archivo donde llevabas todas las pistas del caso, tratando de encontrar cual podía ser la conexión de tu compañero con la muerte de tu amigo.\n" +
          "Las horas pasaban mientras tus ojos cedían centímetro a centímetro ante el cansancio de tan largo día.\n";

  gm.ui.crearEscenarioSolo(131, pag85, Fondos.F_HABITACION,"132", "130");
  admin.getPlayer(key).setPuntoGuardado(131);
  admin.guardarPLayers();

 }

 public void pagina132() {

  String pag85 = ".  .  . —Damián.";

  gm.ui.crearEscenarioSolo(132, pag85, Fondos.F_NEGRO, "133", "131");
  admin.getPlayer(key).setPuntoGuardado(132);
  admin.guardarPLayers();

 }

 public void pagina133() {

  String pag85 = ".  .  . —Damián— . . .";

  gm.ui.crearEscenarioSolo(133, pag85, Fondos.F_NEGRO, "134", "132");
  admin.getPlayer(key).setPuntoGuardado(133);
  admin.guardarPLayers();

 }

 public void pagina134() {

  String pag85 = "—DAMIÁN— el ultimo sacudón fue suficiente para despertarte de tu improvisada siesta—. Tampoco es que tardé tanto en llegar, exagerado.\n" +
          "Frente a vos se encontraba Gabriel, que te miraba divertido. Estabas sentado en la entrada de la convención. Mientras esperabas por tu amigo, cerraste tus ojos y te habías quedado dormido.\n";

  gm.ui.crearEscenarioUnPersonaje(134, pag85, Fondos.F_COMICCON, Principales.G_CHILL,"135", "133");
  admin.getPlayer(key).setPuntoGuardado(134);
  admin.guardarPLayers();

 }

 public void pagina135() {

  String pag85 = "—Yo... perdón— mirabas en todas direcciones, adaptándote al lugar, que te parecía tan distante y desconocido—, tuve un sueño demasiado real. Era un policía del tiempo que viajaba para mantener la continuidad del espacio-tiempo y mientras trataba de salvarte.\n" +
          "—¿Salvarme de qué?\n" +
          "¿Salvarlo de qué? Te preguntaste a vos mismo. Las imágenes de ese sueño tan real empezaban a hacerse difusas. Hiciste un esfuerzo sobrehumano para tratar de pensar en algo, pero ya casi no recordabas nada.\n" +
          "—No… no sé, no me puedo acordar— le respondiste a Gabriel.\n";

  gm.ui.crearEscenarioUnPersonaje(135, pag85, Fondos.F_COMICCON, Principales.G_CHILL,"136", "134");
  admin.getPlayer(key).setPuntoGuardado(135);
  admin.guardarPLayers();

 }

 public void pagina136() {

  String pag85 = "Continuaron con normalidad, dieron algunas vueltas, charlaron, conocieron personas y se tomaron varias fotos. Luego de visitar algunos puestos, revisaron el itinerario del día, donde decidieron ir al Q&A de los actores del estreno de Netflix más comentado del último tiempo.\n" +
          "De camino a la conferencia escuchas a Gabriel decirte algo, pero entre tantas personas y tanto ruido no conseguís entenderlo bien.\n" +
          "Te diste la vuelta con la intención de prestarle atención y pedirle que repita lo que había dicho.\n" +
          " —¿Cómo amigo? No te escuche.\n";

  gm.ui.crearEscenarioSolo(136, pag85, Fondos.F_COMICCON,"137", "135");
  admin.getPlayer(key).setPuntoGuardado(136);
  admin.guardarPLayers();

 }

 public void pagina137() {

  String pag85 = "—Que me acompañes, hay un stand de Alfaguara que quiero chusmear antes de ir— te respondió Gabriel, quien ya se había encaminado en esa dirección. \n" +
          "Mientras seguías a tu amigo, pasan por al lado de los baños, donde tu cabeza giró instintivamente hacia el extrañamente familiar pasillo que se encontraba al lado de estos.\n";

  gm.ui.crearEscenarioUnPersonaje(137, pag85, Fondos.F_COMICCON, Principales.G_CHILL,"138", "136");
  admin.getPlayer(key).setPuntoGuardado(137);
  admin.guardarPLayers();

 }

 public void pagina138() {

  String pag85 = "Pero ahí no había nadie ¿Por qué siquiera habías querido voltear? \n" +
          "Sacudís la cabeza, alejando tus pensamientos y apuras el paso para alcanzar a Gabriel.\n";

  gm.ui.crearEscenarioSolo(138, pag85, Fondos.F_COMICCON,"139", "137");
  gm.ui.reproductorUI.cargarSonido("SoundFX/spiderManBajito.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(138);
  admin.guardarPLayers();

 }

 public void pagina139() {

  String pag85 = "—Desaparecías de la nada, ¿no? — le dijiste cuando por fin lo alcanzaste, pero él se encontraba de espaldas a vos, con un libro en las manos—. ¿Qué encontraste?\n" +
          "—Se llama “Atlas de los Grandes Conquistadores”. Se ve interesante, da un poco de contexto social y económico de las áreas que dominaron en su momento diferentes conquistadores. Hay fotos de los paisajes, alfabetos... También tiene un apartado dedicado a estrategias bélicas y políticas que utilizaron.\n" +
          "Gabriel hojeaba el ejemplar, deteniéndose cada tanto en los pasajes que le resultaban más interesantes.\n";

  gm.ui.crearEscenarioUnPersonaje(139, pag85, Fondos.F_COMICCON, Principales.G_CHILL,"140", "138");
  gm.ui.reproductorUI.cargarSonido("SoundFX/genteHablandoMucha.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(139);
  admin.guardarPLayers();

 }

 public void pagina140() {

  String pag85 = "—Que terrible ¿no? Pensar en todo la destrucción que dejaron a su paso, la cantidad de sangre que derramaron. Y hay personas que lo justifican.\n" +
          "—Si, pero tampoco es tan así— te respondió Gabriel, mirándote—, siempre es mejor fijarse en el contexto.\n" +
          "—¿Me estás diciendo en serio? ¿Qué contexto hay para justificar las barbaridades que cometieron?\n" +
          "La tranquilidad con la que tu amigo planteaba su postura hacía que te sientas algo incomodo y ciertamente, te tomaba por sorpresa.\n";

  gm.ui.crearEscenarioUnPersonaje(140, pag85, Fondos.F_COMICCON, Principales.G_CHILL,"141", "139");
  gm.ui.reproductorUI.cargarSonido("SoundFX/genteHablandoMucha.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(140);
  admin.guardarPLayers();

 }

 public void pagina141() {

  String pag85 = "—Simplemente hicieron las cosas de formas diferentes a o tradicional. Si lo anterior nunca funciono ¿por qué no probar algo nuevo?\n" +
          "—Si, pero tampoco me parece una alternativa coherente la violencia injustificada, la barbarie de esas personas. Destruyendo civilizaciones, masacrando pueblos ¿te parece normal eso? — no entendías lo que estaba pasando. Gabriel siempre había tenido un punto de vista algo poco cuestionable, ¿pero esto? Era inquietante.\n" +
          "—Su error fue desviarse de sus propósitos iniciales, dejar a la gente pensar. Todo lo que habían conseguido, lo perdieron por errores puntuales.\n" +
          " Gabriel no te miraba, sus ojos estaban perdidos en una profunda reflexión\n";

  gm.ui.crearEscenarioUnPersonaje(141, pag85, Fondos.F_COMICCON, Principales.G_CHILL,"142", "140");
  gm.ui.reproductorUI.cargarSonido("SoundFX/genteHablandoMucha.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(141);
  admin.guardarPLayers();

 }

 public void pagina142() {

  String pag85 = "—¿Podés imaginarlo? Tener la fuerza, los medios para poder conquistar países enteros, conseguir que la gente te siga y que tus ideales prevalezcan incluso siglos después de tu muerte.\n" +
          "El ambiente se había vuelto oscuro y pesado, las personas que recorrían la convención habían desaparecido, el edificio estaba ahora desierto y en un silencio absoluto. \n" +
          "Un escalofrío recorrió tu espalda mientras veías a tu amigo, inmerso una vez más en su lectura.\n" +
          "—¿De qué hablas Gabriel?— dijiste cortante\n";

  gm.ui.crearEscenarioGabrielPoderos(142, pag85, Fondos.F_COMICCON, Principales.G_PODEROSO,"143", "141");
  gm.ui.reproductorUI.cargarSonido("SoundFX/genteHablandoMuchaCorto.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(142);
  admin.guardarPLayers();

 }

 public void pagina143() {

  String pag85 = "—He leído y estudiado múltiples sociedades, variedad de culturas, y todo eso me enseño algo— se acercó a vos, sus ojos destellaban avaricia—. El ser humano no aprende, Damián. Comete los mismos errores mil veces, esperando que la mil uno sea diferente, confían en algo ilusorio como los gobiernos y el estado.\n" +
          "—¿Y cuál es tu alternativa? ¿Una dictadura? Hay ejemplos de sobra de porque son un fracaso y una aberración a los derechos humanos.\n";

  gm.ui.crearEscenarioGabrielPoderos(143, pag85, Fondos.F_COMICCON, Principales.G_PODEROSO, "144", "142");
  admin.getPlayer(key).setPuntoGuardado(143);
  admin.guardarPLayers();

 }

 public void pagina144() {

  String pag85 = "—En lo absoluto. Lo que yo propongo es un imperio. Los dictadores tenían los medios para doblegar naciones, mas no conocían la forma de hacer funcionar el país. Yo tengo el conocimiento, se exactamente lo que debería hacer. En un sistema democrático no puedo gobernar tres, cuatro, o más paises a la vez, no puedo salvar a la humanidad de su inevitable autodestrucción si tengo que esperar unas votaciones y depender de cien tipos sentados en una cámara, velando por sus propios intereses mientras que afuera, sus votantes los defienden, ilusos, pensando que a ellos les importa el pueblo.";

  gm.ui.crearEscenarioUnPersonaje(144, pag85, Fondos.F_COMICCON, Principales.G_COSTADO, "145", "143");
  admin.getPlayer(key).setPuntoGuardado(144);
  admin.guardarPLayers();

 }

 public void pagina145() {

  String pag85 = "—No, Damián, no. La democracia nos llevó a donde nos encontramos. Si tan solo pudiera, si tan solo tuviese el poder necesario, yo lo cambiaría todo.\n" +
          "Miras horrorizado a Gabriel, sin poder dar crédito a lo que escuchas. Sabes que algo no está bien, toda sensación de tranquilidad que tenías al despertar había sido consumida por un pavor paralizante. \n";

  gm.ui.crearEscenarioUnPersonaje(145, pag85, Fondos.F_COMICCON, Principales.G_ENOJADO, "146", "144");
  admin.getPlayer(key).setPuntoGuardado(145);
  admin.guardarPLayers();

 }

 public void pagina146() {

  String pag85 = "—Quiero que tengas esto Damián, sé que te va a ser útil— dijo Gabriel entregándote el libro que había estado leyendo.\n" +
          "\n" +
          "Cuando levantaste la vista, la voz e imagen de Gabriel se distorsionaban.\n";

  gm.ui.crearEscenarioUnPersonaje(146, pag85, Fondos.F_COMICCON, Principales.G_CHILL, "147", "145");
  admin.getPlayer(key).setPuntoGuardado(146);
  admin.guardarPLayers();

 }

 public void pagina147() {

  String pag85 = "—A vosdfjja te vsdj… ¿por qué? ...jksabhypo..sder salvarlssnjsdfw..cassss\n" +
          "Aparecían visiones de Gabriel, con un puñal clavado en su espalda.\n" +
          "Muerto.\n" +
          " Eso era, Gabriel había sido asesinado, nada de esto era real, todo era un sueño muy retorcido, macabro, y vos en realidad estabas en...\n";

  gm.ui.crearEscenarioUnPersonaje(147, pag85, Fondos.F_GABGLITCH, Principales.VACIO, "148", "146");
  gm.ui.reproductorUI.cargarSonido("SoundFX/Audio Glitch.wav");
  gm.ui.reproductorUI.reproducirSonidoEnBucle();
  admin.getPlayer(key).setPuntoGuardado(147);
  admin.guardarPLayers();

 }

 public void pagina148() {

  String pag85 = "Despertás en tu escritorio, empapado en una transpiración fría, con el estómago revuelto y un fuerte dolor de cabeza, este sueño había sido diferente a los otros y no por una buena razón.\n" +
          "Te levantas para tomar agua y una pastilla, pero al salir de la cama, tropezás con un libro. Estaba abierto en una página que hablaba sobre la orquestación del Plan Condor y la participación de Nixon como ex presidente de los Estados Unidos. \n" +
          "Extrañadísimo, lo das vuelta para leer su título, horrorizado.\n";

  gm.ui.crearEscenarioSolo(148, pag85, Fondos.F_HABITACION, "149", "147");
  gm.ui.reproductorUI.cargarSonido("SoundFX/5 respiracion agitada.wav");
  gm.ui.reproductorUI.reproducirSonidoEnBucle();
  admin.getPlayer(key).setPuntoGuardado(148);
  admin.guardarPLayers();

 }

 public void pagina149() {

  String pag85 = "“Atlas de los Grandes Conquistadores”. \n" +
          "No entendías como era posible ¿toda esa pesadilla había sido lo mismo que esos sueños donde salvabas a Gabriel? ¿Cómo podía ser que sustrajera todos estos elementos de un simple sueño?\n" +
          "Tu cabeza no paraba de dar vueltas, cuestionándote sobre todo esto. Descartaste la idea de preguntarle a Paz, no podías confiar en nadie de la YTP hasta que descubras que relación tenía Manuel con la muerte de Gabriel.\n";

  gm.ui.crearEscenarioSolo(149, pag85, Fondos.F_HABITACION, "150", "148");
  admin.getPlayer(key).setPuntoGuardado(149);
  admin.guardarPLayers();

 }

 public void pagina150() {

  String pag85 = "Por más que estabas cansado, era crucial que no dejes de ir a la oficina, debías seguir de cerca la investigación de la huella encontrada en China. \n" +
          "Te apuraste a alistarte y decidiste llevar el libro y los recortes que habías conseguido en tus sueños. Saliste a esperar el 511∞, un transporte público que pasaba por la casa de los agentes y los dejaba en la puerta de la YTP.\n";

  gm.ui.crearEscenarioSolo(150, pag85, Fondos.F_HABITACION, "151", "149");
  admin.getPlayer(key).setPuntoGuardado(150);
  admin.guardarPLayers();

 }

 public void pagina151() {

  String pag85 = "Al llegar, te encontraste con una oficina más activa de lo habitual.\n" +
          "Oficiales al teléfono, agentes caminando de un lado a otro, un movimiento que no recordabas haber visto en el año que llevabas en la agencia. \n" +
          "Pasaste por la oficinas de tus compañeros, pero ambas estaban vacías, así que te acercas a la sala de conferencias, lugar que estaba siendo ocupado por Manuel, Paz y otros tres de los mejores detectives del buró.\n";

  gm.ui.crearEscenarioSolo(151, pag85, Fondos.F_OFICINA, "152", "150");
  admin.getPlayer(key).setPuntoGuardado(151);
  admin.guardarPLayers();

 }

 public void pagina152() {

  String pag85 = "—… no es un Citroën. La descripción no coincide con ningún modelo de la marca, además que las ruedas corresponden a un modelo de auto de fines de los 70, principio de los 80. Ninguno de la marca francesa tenía ruedas de este estilo.\n" +
          "Llegaste a media conversación, Manuel le daba la negativa a la teoría de Ortega. \n" +
          "Te sentás junto a Paz y le susurras, con el fin de molestar lo menos posible, Manuel, de espaldas, miraba las imágenes de la presentación donde destacaban las huellas encontradas el día anterior, algunas imágenes de diferentes autos y un retrato hablado, hecho por la dibujante forense Yanuzo, miembro de la YTP, y basado en el testimonio de la anciana de la tribu China.\n";

  gm.ui.crearEscenarioUnPersonaje(152, pag85, Fondos.F_OFICINA, Principales.M_COSTADO,"153", "151");
  admin.getPlayer(key).setPuntoGuardado(152);
  admin.guardarPLayers();

 }

 public void pagina153() {

  String pag85 = "Llegaste a media conversación, Manuel le daba la negativa a la teoría de Ortega. \n" +
          "Te sentás junto a Paz y le susurras, con el fin de molestar lo menos posible, Manuel, de espaldas, miraba las imágenes de la presentación donde destacaban las huellas encontradas el día anterior, algunas imágenes de diferentes autos y un retrato hablado, hecho por la dibujante forense Yanuzo, miembro de la YTP, y basado en el testimonio de la anciana de la tribu China.\n";

  gm.ui.crearEscenarioUnPersonaje(153, pag85, Fondos.F_OFICINA, Principales.P_ESPALDA,"154", "152");
  admin.getPlayer(key).setPuntoGuardado(153);
  admin.guardarPLayers();

 }

 public void pagina154() {

  String pag85 = "—¿Qué me perdí? — le preguntas. No habías llegado tarde, pero la junta parecía tener un buen rato en marcha— ¿Por qué no me avisaron de esta reunión? Soy parte del equipo si vamos al caso.\n" +
          "Paz no se atrevía a mírate, parecía sentirse culpable. Todos en la mesa tenían una carpeta frente suyo, con detalles de la investigación y una copia de lo mostrado en pantalla, todos menos vos.\n" +
          "—Paz— insististe— ¿Qué pasa?\n";

  gm.ui.crearEscenarioUnPersonaje(154, pag85, Fondos.F_OFICINA, Principales.P_ESPALDA,"155", "153");
  admin.getPlayer(key).setPuntoGuardado(154);
  admin.guardarPLayers();

 }

 public void pagina155() {

  String pag85 = "—Perdoname, yo le insistí. Sé que es importante para vos y que podés ser de mucha ayuda, pero él está a cargo de la investigación.\n" +
          "Clavaste tus ojos en Manuel, quien había volteado y ya se había percatado de tu presencia en la sala.\n";

  gm.ui.crearEscenarioUnPersonaje(155, pag85, Fondos.F_OFICINA, Principales.P_DADA_VUELTA,"156", "154");
  admin.getPlayer(key).setPuntoGuardado(155);
  admin.guardarPLayers();

 }

 public void pagina156() {

  String pag85 = "—Señor Marsachi, lamento informarle que fue apartado de la investigación. Luego de un extenso debate, se llegó a la conclusión de que, debido a su implicación emocional, resultaría contraproducente para la misma. Le pido amablemente que se retire y vuelva a sus ocupaciones actuales.\n" +
          "Manuel y vos se miraban fijo, desafiantes, como si el primero que apartase la vista del otro resultaría el perdedor de una batalla invisible.\n" +
          "Hirviendo en ira, te levantas de la mesa, apuntando a tu canoso compañero.\n" +
          "—¿Vos me estas jodiendo? ¿Ayer te quieres hacer el amigo, y ahora me salís con esto? Te deseo mucha suerte en la investigación. Me parece que en los últimos años les fue bárbaro siguiéndole el rastro.\n" +
          "Sin darle tiempo a responder, te marchas a tu escritorio.\n";

  gm.ui.crearEscenarioUnPersonaje(156, pag85, Fondos.F_OFICINA, Principales.M_SERIO,"157", "155");
  admin.getPlayer(key).setPuntoGuardado(156);
  admin.guardarPLayers();


 }

 public void pagina157(){

  String pag85 = ".  .  . ";

  gm.ui.crearEscenarioSolo(157, pag85, Fondos.F_OFICINA, "158", "156");
  admin.getPlayer(key).setPuntoGuardado(157);
  admin.guardarPLayers();

 }

 public void pagina158() {

  String pag85 = "El tiempo pasaba y mientras tu concentración empeoraba, la frustración aumentaba. Cada vez que querías leer algún archivo de un caso, completar algún formulario del anterior, pensabas en la sala de conferencias, en la información que se estaba debatiendo ahí. \n" +
          "Pero, sobre todo, pensabas en Manuel. Si ya tenías tus sospechas, apartarte de la investigación era prácticamente una confesión. Él estaba involucrado, y de una forma mucho más cercana a lo que creías en un principio.\n ";

  gm.ui.crearEscenarioSolo(158, pag85, Fondos.F_OFICINA, "159", "157");
  admin.getPlayer(key).setPuntoGuardado(158);
  admin.guardarPLayers();

 }

 public void pagina159() {

  String pag85 = "Sin poder terminar una sola de las múltiples tareas que habías empezado, decidís abrir tu maletín para buscar tu credencial e ir a reclamar un snack al comedor. \n" +
          "Y fue ahí cuando lo viste, el libro y las notas que habías guardado antes de salir, esperando a ser leídos, a que puedas comprender cuál es su importancia.\n" +
          "Empezás a hojear el libro, leyendo su contenido sin poder encontrar algo que sientas que pueda ser de ayuda. Leíste el capítulo dedicado al antiguo Egipto, otro enfocado en los Otomanos. \n ";
  gm.ui.crearEscenarioSolo(159, pag85, Fondos.F_OFICINA, "160", "158");
  admin.getPlayer(key).setPuntoGuardado(159);
  admin.guardarPLayers();

 }

 public void pagina160() {

  String pag85 = "Llegas a un capítulo dedicado a los colonos que conquistaban en nombre de la iglesia y en el apartado de religión, había un cuadro que llamó poderosamente tu atención\n" +
          "“Los Cuatro Jinetes del Apocalipsis, por Viktor Vasnetsov”\n" +
          "Del primero al último, con sus diferentes objetos en mano, representaban a la Conquista, con la corona de oro; la Guerra, espada en mano; el Hambre, representado en la oscuridad de su caballo negro y, por último, la Muerte, portando su característica hoz.\n" +
          "Un escalofrío recorrió tu espalda al contemplar la imagen. No podías explicar porqué, pero algo dentro tuyo sabía que significaba algo más.\n";
  gm.ui.crearEscenarioCuadro(160, pag85, Fondos.F_OFICINA, Varios.CUADRO,"161", "159");
  admin.getPlayer(key).setPuntoGuardado(160);
  admin.guardarPLayers();

 }

 public void pagina161() {

  String pag85 = "Estabas a punto de cerrar el libro y ponerte con otra cosa, pero decidiste leer una última página, solo para ver qué había. \n" +
          "Cuando cambiaste la hoja, tus dedos sintieron el tacto inconfundible del papel roto. Levantaste la página para analizar la rasgadura y caíste en cuenta de que estaba arrancado el pie de página, concretamente, el número. Un número como los que habías extraído de tus sueños.\n" +
          "Saltaste hacia tus cajones, buscando desesperadamente el pequeño trozo de papel que había sido fragmentado de su hoja.\n";
  gm.ui.crearEscenarioSolo(161, pag85, Fondos.F_OFICINA, "162", "160");
  admin.getPlayer(key).setPuntoGuardado(161);
  admin.guardarPLayers();

 }

 public void pagina162() {

  String pag85 = "—Dale loco, ¿Dónde están?\n" +
          "Respondiendo a tu pregunta, los encontraste en el abarrotado cajón, mezclado con diversos objetos.\n" +
          "Analizaste la página con la que habías dado, la 126-127 y buscaste entre las hojas fraccionadas. Juntaste ambos, encajaban perfectamente.\n" +
          "Hiciste lo mismo con las dos páginas restantes y las leíste, tratando de deducir su significado.\n";
  gm.ui.crearEscenarioSolo(162, pag85, Fondos.F_OFICINA, "163", "161");
  admin.getPlayer(key).setPuntoGuardado(162);
  admin.guardarPLayers();

 }

 public void pagina163() {

  String pag85 = "La página 125-126 nos hablaba acerca de las Pagoda, construcciones chinas en forma de torres, que sirvieron como puestos de avanzada para el ejercito mongol.\n" +
          "La siguiente, la 343-344 se explaya en la religión romana y habla particularmente sobre la diosa Nix, la personificación de la noche, la diosa de la oscuridad.\n" +
          "Por último, en la página 571-572 nos cuenta sobre la campaña de Napoleón en España, el derrocamiento del rey Carlos IV y la importancia de este acontecimiento para la Guerra de la Independencia Española.\n";
  gm.ui.crearEscenarioSolo(163, pag85, Fondos.F_OFICINA, "164", "162");
  admin.getPlayer(key).setPuntoGuardado(163);
  admin.guardarPLayers();

 }

 public void pagina164() {

  String pag85 = "Aún más perdido que antes, cerras el libro como un inconsciente intento de ganar concentración, pensando que pueden significar todo esto y la relevancia que puede tener con los sueños. Pensabas acerca del contenido del que hablaban las páginas, debía haber algún mensaje ahí, la respuesta. ¿Una película? ¿Un comic? O tal vez… un libro.\n" +
          "Conocías los gustos de Gabriel, ahí debía estar la clave…\n";
  gm.ui.crearEscenarioSolo(164, pag85, Fondos.F_OFICINA, "165", "163");
  admin.getPlayer(key).setPuntoGuardado(164);
  admin.guardarPLayers();

 }

 public void pagina165() {

  String pag85 = "-Primero lo primero... ¿El Emperador...? ¿Los Chinos...?...¿Algún libro de historia- te debatís en tu cabeza, tratando de pensar que palabra podría incluirse en el título"+'\n'+
          "-No, debe ser “La”... ¿Pero la qué?";
  gm.ui.generarEscenaHojasTorre(165, pag85, Fondos.F_OFICINA, "166", Varios.HOJA_TORRE);
  admin.getPlayer(key).setPuntoGuardado(165);
  admin.guardarPLayers();

 }

 public void pagina166() {

  String pag85 = "“...La Torre”. Si, tenia sentido. Pero, ¿La Torre...";
  gm.ui.generarEscenaHojasOscuridad(166, pag85, Fondos.F_OFICINA, "167", Varios.HOJA_OSCURA);
  admin.getPlayer(key).setPuntoGuardado(166);
  admin.guardarPLayers();


 }

 public void pagina167() {

  String pag85 = "“...¡La Torre Oscura!”, si, eso era, la saga de libros. " +'\n'+
          "Pero... ¿el autor? ¿Quién era el autor?";
  gm.ui.generarEscenaHojasRey(167, pag85, Fondos.F_OFICINA, "168", Varios.HOJA_REY);
  admin.getPlayer(key).setPuntoGuardado(167);
  admin.guardarPLayers();

 }

 public void pagina168() {

  String pag85 = "“La Torre Oscura”, la saga de Stephen King. Nunca habías sido el mayor fanático, pero tu amigo disfrutaba sus libros.\n" +
          "Rápidamente tomaste tu celular y buscaste en Google “La Torre Oscura Stephen King comprar”. " +'\n'+
          "Un simple video o resumen no iba a ser suficiente, debías leer todo lo que pudieras.\n";
  gm.ui.crearEscenarioSolo(168, pag85, Fondos.F_OFICINA, "169", "167");
  admin.getPlayer(key).setPuntoGuardado(168);
  admin.guardarPLayers();

 }

 public void pagina169() {

  String pag85 = "En las búsquedas sugeridas apareció el local de Mochi Glasspainting, el mismo que había en la COMIC CON aquel día. Comparando precios ves que en Mochi se encuentra la saga al precio más accesible, por lo que agregas los siete libros al carrito. Antes de poder pagar, un artículo sugerido llama tu atención.";
  gm.ui.crearEscenarioSolo(169, pag85, Fondos.F_OFICINA, "170", "168");
  admin.getPlayer(key).setPuntoGuardado(169);
  admin.guardarPLayers();

 }

 public void pagina170() {

  String pag85 = "“Ofertas Imperdibles: Traductor Multiversal: ̶$̶1̶5̶.̶0̶0̶0̶   -> $7.500”\n" +
          "“El traductor definitivo, abarca idiomas desde el español y el inglés, hasta idioma perruno. Cuenta con la categoría de lenguajes de tus sagas favoritas” \n" +
          "Era sin duda una oferta muy atractiva, y luego de lo visto en China, sabias que podía resultar muy útil. " +'\n'+
          "Lo sumás a tu carrito de compras y pagás los artículos.\n";
  gm.ui.crearEscenarioSolo(170, pag85, Fondos.F_OFICINA, "171", "169");
  admin.getPlayer(key).setPuntoGuardado(170);
  admin.guardarPLayers();

 }

 public void pagina171() {

  String pag85 = "El día transcurrió sin mayores contratiempos, pudiste avanzar con tus ocupaciones, pero la espina del caso siendo resuelto a tus espaldas, los avances e información que hubieras podido rescatar de ahí no te abandono en ningún momento.\n" +
          "A las cuatro de la tarde se cumplió el horario laboral, la mayoría de los oficiales y agentes reportaron su salida y regresaron a sus hogares. Vos te cambiaste y enfilaste hacia la salida.\n" +
          "Inevitablemente pasaste por la oficina de Manuel, donde se escuchaba que el seguía adentro, batallando con el caso y la pista más reciente.\n";
  gm.ui.crearEscenarioSolo(171, pag85, Fondos.F_OFICINA, "172", "170");
  admin.getPlayer(key).setPuntoGuardado(171);
  admin.guardarPLayers();

 }

 public void pagina172() {

  String pag85 = "Te dirigiste a la parada del 511∞, donde se encontraba Paz esperando también por el colectivo. Todavía herido por lo de más temprano trataste de ignorar su presencia, pero era inútil, estaban uno al lado del otro y lo incómodo de la situación no ayudo a tu cometido.";
  gm.ui.crearEscenarioUnPersonaje(172, pag85, Fondos.F_PARADA_BONDI,  Principales.P_ESPALDA,"173", "171");
  //Tarareo
  admin.getPlayer(key).setPuntoGuardado(172);
  admin.guardarPLayers();

 }

 public void pagina173() {

  String pag85 = "Desde tu DTM chequeaste la aplicación que informa la llegada del colectivo, pero te encontraste con ese característico mensaje : “La empresa no reporto salidas”, por lo que sabias que la espera sería larga.\n" +
          "Paso un largo rato sin señales del vehículo cuando por fin Paz rompió el silencio.\n";
  gm.ui.crearEscenarioUnPersonaje(173, pag85, Fondos.F_PARADA_BONDI,  Principales.P_ESPALDA,"174", "172");
  admin.getPlayer(key).setPuntoGuardado(173);
  admin.guardarPLayers();

 }

 public void pagina174() {

  String pag85 = "—Esta porquería siempre lo mismo, tarda tres años y nunca hay lugar— dijo molesta.\n" +
          "—Nunca te lo tomás, ¿Qué te quejás? \n" +
          "—Bueno, pero siempre que lo tomo pasa lo mismo— respondió Paz en su defensa.\n" +
          "No le respondiste, por lo que la conversación se detuvo ahí.\n" +
          "Pero el colectivo seguía sin aparecer, y algo arrepentido por tu rudeza, tomás la iniciativa para seguir la conversación.\n";
  gm.ui.crearEscenarioUnPersonaje(174, pag85, Fondos.F_PARADA_BONDI,  Principales.P_DADA_VUELTA,"175", "173");
  admin.getPlayer(key).setPuntoGuardado(174);
  admin.guardarPLayers();

 }

 public void pagina175() {

  String pag85 = "—Perdoname, sé que vos querías que sea parte del caso y que trataste de convencerlo, no tenés la culpa y no debería enojarme con vos.\n" +
          "—Gracias, lo aprecio. Y en verdad lamento que hayas sido apartado— te respondió tu compañera.\n" +
          "—¿Te puedo preguntar cómo fue la investigación? Extraoficialmente, claro.\n" +
          "Paz te miro y lo dudo por un momento, pero finalmente accedió.\n";
  gm.ui.crearEscenarioUnPersonaje(175, pag85, Fondos.F_PARADA_BONDI,  Principales.P_COSTADO,"176", "174");
  admin.getPlayer(key).setPuntoGuardado(175);
  admin.guardarPLayers();

 }

 public void pagina176() {

  String pag85 = "—La mujer china, la de la aldea, nos contó sobre un encuentro que tuvo, lo llamaba una visión, una aparición, pero no la podemos culpar, es el año mil doscientos— comento, y luego continuó explicando— el día de la desaparición de Gengis habían salido a comerciar en una aldea cercana. De camino de vuelta, atravesaron ese claro, donde según sus palabras, un fuerte rayo golpeo el suelo y surgió un enorme ave de metal, que levanto sus alas y un hombre desmonto de ella.\n" +
          "Paz debió ver tu cara de confusión, porque agregó.\n";
  gm.ui.crearEscenarioUnPersonaje(176, pag85, Fondos.F_PARADA_BONDI,  Principales.P_FRENTE,"177", "175");
  admin.getPlayer(key).setPuntoGuardado(176);
  admin.guardarPLayers();

 }

 public void pagina177() {

  String pag85 = "—Si, no tiene mucho sentido, pero hay que tener en cuenta la época. Pero bueno, eso, junto con la huella podría significar un avión, pero el líquido de frenos te dice que…\n" +
          "—Es un auto— completaste.\n" +
          "—Que es un auto, exacto, por eso había imágenes hoy y discutíamos modelos y marcas. Descartamos muchas, Manuel se quedó para tratar de avanzar un poco más, está muy cerca según él, una vez descubra que auto es va a resultar más sencillo seguirle el rastro, siendo un auto viejo, es fácil saber cuándo y dónde se vendió uno.\n";
  gm.ui.crearEscenarioUnPersonaje(177, pag85, Fondos.F_PARADA_BONDI,  Principales.P_FRENTE,"178", "176");
  admin.getPlayer(key).setPuntoGuardado(177);
  admin.guardarPLayers();

 }

 public void pagina178() {

  String pag85 = " El 511∞ destelló y apareció frente a ustedes, subieron y compartieron asiento el resto del viaje, conversando sobre cosas ajenas al caso.\n" +
          "A medida que se fue vaciando el colectivo, ustedes seguían entretenidos, contando historias, conociéndose un poco más, alejados de la locura que había sido la YTP en las últimas semanas.\n" +
          "Finalmente llegó tu parada y bajaste, despidiéndote de tu compañera\n";
  gm.ui.crearEscenarioUnPersonaje(178, pag85, Fondos.F_INTERIOR_BONDI,  Principales.P_COSTADO,"179", "177");
  admin.getPlayer(key).setPuntoGuardado(178);
  admin.guardarPLayers();

 }

 public void pagina179() {

  String pag85 = "Entraste a tu casa y dejaste tus cosas a las cinco y poco más.\n" +
          " La hora que se había ido entre la espera y el viaje había sido frustrante, pero estaba a punto de llegar tu pedido de Mochi y pensabas quedarte despierto hasta encontrar una respuesta.\n" +
          "Cuando el correo toco el timbre bajas apresurado, firmás la entrega y volvés a tu departamento. \n" +
          "Rapidamente vacías el contenido de la caja sobre la mesa y te detenés a analizar el Traductor Multiversal.\n";
  gm.ui.crearEscenarioSolo(179, pag85, Fondos.F_HABITACION, "180", "178");
  admin.getPlayer(key).setPuntoGuardado(179);
  admin.guardarPLayers();

 }

 public void pagina180() {

  String pag85 = "Parecía un pequeño auricular, según con una batería que podía durar años (afirmación tan dudosa como su rango de idiomas) y solo tenías que encenderlo y llevarlo puesto,  consiguiendo así la habilidad de hablar y entender infinidad de idiomas.\n" +
          "Lo pusiste a prueba con videos, películas y series. Era increíble, ¡En verdad funcionaba! Dado lo cómodo y poco invasivo que resultaba para tu oreja, decidís dejarlo puesto.\n" +
          "Ordenas los libros sobre la mesa y comenzas la lectura de “El Pistolero”, la primera entrega de la saga. \n";
  gm.ui.crearEscenarioSolo(180, pag85, Fondos.F_HABITACION, "181", "179");
  admin.getPlayer(key).setPuntoGuardado(180);
  admin.guardarPLayers();

 }

 public void pagina181() {

  String pag85 = "Mientras tanto, aunque no lo sabias, Manuel seguía en la YTP, deambulando por su oficina, buscando la solución al caso que tanto tiempo lo había tenido en vela, por fin estaba a punto de descubrirlo, pero... \n" +
          "¿Cuál era la pieza que le faltaba?";
  gm.ui.crearEscenarioUnPersonaje(181, pag85, Fondos.F_OFICINA, Principales.M_SERIO,"182", "180");
  admin.getPlayer(key).setPuntoGuardado(181);
  admin.guardarPLayers();

 }

 public void pagina182() {

  String pag85 = "Con ambos haciendo sus propias investigaciones, terminaste el primer libro con la sensación de que no había nada especial en él. \n" +
          "Manuel por su parte, había descartado más modelos de autos, pero sin conseguir un avance definitivo.\n";
  gm.ui.crearEscenarioSolo(182, pag85, Fondos.F_HABITACION, "183", "181");
  admin.getPlayer(key).setPuntoGuardado(182);
  admin.guardarPLayers();

 }

 public void pagina183() {

  String pag85 = "Las horas pasaban de forma fugaz, se hizo de noche y la madrugada avanzaba implacable mientras vos seguías aferrado a la saga. \n" +
          "Habías dejado atrás las primeras tres entregas y ya estabas por la mitad del cuarto, más extenso que los anteriores. Tu única pausa había sido para calentar unas empanadas que habías descongelado, pero retomaste la lectura en el momento. \n" +
          "Terminado el cuarto libro, dejas anotadas un par de cosas relevantes, pero sabías que había más.\n";
  gm.ui.crearEscenarioSolo(183, pag85, Fondos.F_HABITACION, "184", "182");
  admin.getPlayer(key).setPuntoGuardado(183);
  admin.guardarPLayers();

 }

 public void pagina184() {

  String pag85 = "Manuel se debatía, exasperado. Estaba seguro de que esto era mucho más sencillo de lo que parecía, que el solo estaba complicando las cosas por demás.\n" +
          "Una y otra vez repetía en su cabeza las palabras de la anciana, “un gran pájaro de metal que levantó sus alas y descendió un hombre”… “un gran pájaro de metal que levantó sus alas y”… levantó...\n" +
          " —LEVANTÓ— exclamo Manuel en un grito de entusiasmo—  No puede ser, ¿cómo no me di cuenta antes?\n" +
          "Manuel buscaba autos más comunes y de lo más vendido, pero todo tenía más sentido ahora. El pájaro “levantó” sus alas, y había un modelo de esos años que sus puertas se abrían hacia arriba.\n" +
          "Utilizando un sistema similar al de la policía, accedió a la base de datos del gobierno. \n" +
          "No iba a ser difícil rastrear el movimiento de aquel auto en particular, ya fuera que lo robaron o compraron, había muy pocos DeLorean DMC-12 en el país.\n";
  gm.ui.crearEscenarioUnPersonaje(184, pag85, Fondos.F_OFICINA, Principales.M_CEJA_ARQUEADA, "185", "183");
  admin.getPlayer(key).setPuntoGuardado(184);
  admin.guardarPLayers();

 }

 public void pagina185() {

  String pag85 = "Leías cada vez más rápido, devorando las páginas. La respuesta había llegado en la mitad de la saga, cuando nos contaban sobre como los personajes tenían sueños vívidos, además de la habilidad de manipular objetos en visiones. \n" +
          "Caíste en cuenta de lo que significaba, la figura misteriosa poseía una habilidad muy similar a esta, él podía infiltrarse en tus sueños, ver a través de ellos. \n" +
          "\n" +
          "Y tú versión de los sueños o tu inconsciente lo sabía y quería advertirte de eso.\n";
  gm.ui.crearEscenarioSolo(185, pag85, Fondos.F_HABITACION,"186", "184");
  admin.getPlayer(key).setPuntoGuardado(185);
  admin.guardarPLayers();

 }

 public void pagina186() {

  String pag85 = "Te abrigas, tomas tus cosas y pedís un Uber. \n" +
          "Si la figura podía ver tus sueños y saber tus movimientos gracias a ellos, ahora ibas a hacer algo diferente, ibas a viajar sin soñar, tomándolo de improviso.\n";
  gm.ui.crearEscenarioSolo(186, pag85, Fondos.F_HABITACION,"187", "185");
  admin.getPlayer(key).setPuntoGuardado(186);
  admin.guardarPLayers();

 }

 public void pagina187() {

  String pag85 = "Llegas a la fachada de la YTP, un kiosco 24 horas de color violeta. Le dijiste la palabra clave al que atendía el supuesto local y te dio acceso a las escaleras y ascensor.\n" +
          "Sabias que Manuel podía estar por ahí, por lo que abrís la puerta y subís por las escaleras hasta el techo. Al estar situada en el edificio más alto de la ciudad y cerca de la mayor concentración de flujo espaciotemporal, hacer los viajes desde ahí era lo ideal para que sean más seguros.\n";
  gm.ui.crearEscenarioSolo(187, pag85, Fondos.F_FACHADA,"188", "186");
  admin.getPlayer(key).setPuntoGuardado(187);
  admin.guardarPLayers();

 }

 public void pagina188() {

  String pag85 = "En tu ascenso hacia la terraza, pasabas por el lugar donde se situaban las oficinas, desconociendo que ahí adentro, Manuel había dado con la pieza faltante.";
  gm.ui.crearEscenarioSolo(188, pag85, Fondos.F_ESCALERAS_V2,"189", "187");
  admin.getPlayer(key).setPuntoGuardado(188);
  admin.guardarPLayers();

 }

 public void pagina189() {

  String pag85 = "Navegaba buscando los registros de los DMC-12 que había en el país, de los pocos que se encontraban no había registro de perdidas o ventas en el último tiempo, solo quedaban dos opciones.\n" +
          "Y ahí apareció, una denuncia por robo que seguía abierta, la policía nunca había dado con el responsable, pero Manuel sabía que no iba a ser difícil encontrarlo.\n" +
          "Buscó en el mapa satelital el lugar donde se había efectuado el robo, sus alrededores, locales, posibles salidas a rutas o avenidas y trazo varias posibles rutas de escape, investigando en las cámaras de seguridad en el horario estimado que se había producido.\n" +
          "Luego de una exhaustiva búsqueda, dio con una cámara que había grabado al perpetrador de frente.\n" +
          "Agrando la imagen para poder identificarlo, pero no se imaginaba lo que vería cuando cargó.\n";
  gm.ui.crearEscenarioUnPersonaje(189, pag85, Fondos.F_OFICINA, Principales.M_SERIO,"190", "188");
  admin.getPlayer(key).setPuntoGuardado(189);
  admin.guardarPLayers();

 }

 public void pagina190() {

  String pag85 = "—No, no... no puede ser. No tiene sentido— dijo para el mismo.";
  gm.ui.crearEscenarioUnPersonaje(190, pag85, Fondos.F_OFICINA, Principales.M_NOJAU,"191", "189");
  admin.getPlayer(key).setPuntoGuardado(190);
  admin.guardarPLayers();

 }

 public void pagina191() {

  String pag85 = "No dejó que el impacto del descubrimiento nublase su accionar. Rápidamente accedió a su DTM y grabo un mensaje que se retransmitiría a los oficiales.\n" +
          "—Soy el agente especial Manuel Lublo. Solicito la presencia del comando A y C de inmediato. Tenemos un 3312 y no puede esperar.\n" +
          "Los dispositivos de los oficiales sonaron y reprodujeron el mensaje. En cuestión de minutos, todos estaban preparados y esperando las palabras de su superior.\n";
  gm.ui.crearEscenarioUnPersonaje(191, pag85, Fondos.F_OFICINA, Principales.M_COSTADO_DER,"192", "190");
  admin.getPlayer(key).setPuntoGuardado(191);
  admin.guardarPLayers();

 }


 public void pagina192() {

  String pag85 = "Manuel se dirigió al pelotón y dio un breve discurso.\n" +
          "—Desde hace un tiempo que venimos detrás del rastro de un habilidoso criminal temporal. Siempre se nos adelantó y consiguió esquivarnos, pero hoy pude por fin descifrar quien es y tengo la convicción de que sé su próximo movimiento. Ahora nos dirigiremos ahí, pero necesito que pase lo que pase, cumplan con el cometido de la misión, capturar o neutralizar, depende su respuesta a nuestra llegada.\n";
  gm.ui.crearEscenarioSolo(192, pag85, Fondos.F_OFICINA,"193", "191");
  admin.getPlayer(key).setPuntoGuardado(192);
  admin.guardarPLayers();

 }

 public void pagina193() {

  String pag85 = "Estabas en lo alto del edificio, en la terraza del piso 43. Con algo de vértigo observabas la larga distancia que te separaba del suelo. \n" +
          "Pensabas en las aves, en su punto de vista del mundo, en esa habilidad de poder saltar al vacío sin miedo, de poder guiarse a través de largas distancias solo con su instinto, de su libertad.\n";
  gm.ui.crearEscenarioSolo(193, pag85, Fondos.F_VISTA_A,"194", "192");
  admin.getPlayer(key).setPuntoGuardado(193);
  admin.guardarPLayers();

 }

 public void pagina194() {

  String pag85 = "Frente a tus ojos sostenías tu credencial de la YTP, recordando algunas misiones, experiencias vividas durante tu tiempo ahí y lo que significaba para vos, asi como lo que te motivo a aceptar la invitación que te habían ofrecido Paz y Manuel en aquella sala de interrogatorio. \n"+
          "Había sido un año largo, muy duro. Habías visto a tu amigo morir en repetidas ocasiones, habías trabajado arduamente para rescatarlo y por fin estabas a un solo paso de conseguirlo, por fin ibas a poder ser libre.\n" +
          "Pero, aun así, seguías aferrado al edificio, seguías atado a tus miedos. Nunca habías intentado esto, ni tenías una idea de lo que podía pasar. \n";
  gm.ui.crearEscenarioCredencial(194, pag85, Fondos.F_VISTA_A, Varios.YTP,"195", "193");
  admin.getPlayer(key).setPuntoGuardado(194);
  admin.guardarPLayers();

 }

 public void pagina195() {

  String pag85 = "Tus pensamientos te llevaron una vez más a los pájaros, a su primero vuelo, cuando antes de dejar el nido eran empujadas por sus propios padres al vacío, confiando en que los pichones tendrían ya la capacidad de poder aventurarse y levantar vuelo.\n" +
          "Quizás solo eso necesitabas, un empujón a lo desconocido.\n";
  gm.ui.crearEscenarioSolo(195, pag85, Fondos.F_VISTA_A,"196", "194");
  admin.getPlayer(key).setPuntoGuardado(195);
  admin.guardarPLayers();

 }

 public void pagina196(){

  String pag85 = "Cerraste los ojos y saltaste por el borde del edificio, bajando a toda velocidad directo al duro asfalto. \n" +
          "En unos segundos que parecían eternos, pensaste en todo lo que significaba ese momento y fusionando una carta azul y otra roja, arrojaste el portal al suelo, atravesándolo.\n";
  gm.ui.crearEscenarioSolo(196, pag85, Fondos.F_VISTA_A,"197", "195");
  admin.getPlayer(key).setPuntoGuardado(196);
  admin.guardarPLayers();

 }

 public void pagina197() {

  gm.ui.crearEscenaPortalCartas(197, Fondos.F_PORTAL_AZUL,"198", "196");
  admin.getPlayer(key).setPuntoGuardado(197);
  admin.guardarPLayers();

 }


 public void pagina198() {

  String pag85 = "Tus pies se apoyaron sobre el suelo de hormigón, viajaste directamente al interior del edificio de la COMICCON, tomaste un riesgo muy grande al hacerlo, pero sabías que eso tomaría a la figura por sorpresa. Lamentablemente, tu calculo de las coordenadas fue ligeramente impreciso y no habías dado directamente en el pasillo.";
  gm.ui.crearEscenarioSolo(198, pag85, Fondos.F_DEPOSITO,"199", "197");
  admin.getPlayer(key).setPuntoGuardado(198);
  admin.guardarPLayers();

 }

 public void pagina199() {

  String pag85 = "Te encontrabas en lo que debía ser una especie de depósito, era una sala muy grande y repleta de cajas apiladas contra las paredes. Al otro lado del lugar, había una cortina que improvisaba una puerta y comunicaba directamente al pasillo donde Gabriel iba a ser asesinado. ";
  gm.ui.crearEscenarioSolo(199, pag85, Fondos.F_DEPOSITO,"200", "198");
  admin.getPlayer(key).setPuntoGuardado(199);
  admin.guardarPLayers();

 }

 public void pagina200() {

  String pag85 = "Fijas rumbo hacia el lugar, pero con un fuerte destello que te recordaba a un rayo, irrumpe a toda velocidad un DeLorean que parecía una réplica exacta del usado en la saga de Volver Al Futuro.\n";
  gm.ui.crearEscenarioSolo(200, pag85, Fondos.F_DEPOSITO, "201", "199");
  gm.ui.reproductorUI.cargarSonido("SoundFX/DeloreanSalto.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(200);
  admin.guardarPLayers();

 }

 public void pagina201() {

  String pag85 = "La explosión causada por el vehículo te arroja unos metros en el aire, cayendo entre algunas cajas y elementos de limpieza amontonados en un rincón.\n" +
          "La puerta del auto se abre y su conductor desciende. La figura misteriosa, encapuchada, camina hacia el pasillo, ignorando tu presencia.\n" +
          "Todavía aturdido por el golpe y con cierta dificultad te reincorporas, sacudís el polvo de tu cuerpo y te erguís, inflando el pecho para parecer de mayor tamaño. Veías como se alejaba a un ritmo tranquilo así que, desde lo profundo de tus pulmones, le gritas para llamar su atención.\n";
  gm.ui.crearEscenarioSolo(201, pag85, Fondos.F_DEPOSITO, "202", "200");
  gm.ui.reproductorUI.cargarSonido("SoundFX/DamianVolando.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(201);
  admin.guardarPLayers();

 }

 public void pagina202() {

  String pag85 = "—EY, NO ME DES LA ESPALDA ¿o pensabas que ibas a adelantarte por siempre?\n" +
          "La figura se detiene y mira en tu dirección, no ves su rostro, pero podías saber que estaba sorprendido de encontrarte ahí.\n";
  gm.ui.crearEscenarioUnPersonaje(202, pag85, Fondos.F_DEPOSITO, Principales.D_ESPALDA, "203", "201");
  admin.getPlayer(key).setPuntoGuardado(202);
  admin.guardarPLayers();

 }

 public void pagina203() {

  String pag85 = "—No tendrías que estar acá. Te advirtieron las veces suficientes de lo peligroso que sería intervenir.\n" +
          "—No necesito que vos también me quieras decir que hacer— había algo familiar en su voz, en él ¿sería acaso Manuel, confirmando tus sospechas?\n" +
          "—No cambias, eh. Cientos de intentos y seguís siendo el mismo porfiado y arrogante. No te metas, no sabes lo que podés provocar.\n" +
          "La figura dijo eso y volteo, encaminándose de nuevo hacia el pasillo. Lo veías alejarse, pero no ibas a permitir que se escape, así que agarras un escobillón de los varios que había tirados y se lo arrojas.\n";
  gm.ui.crearEscenarioUnPersonaje(203, pag85, Fondos.F_DEPOSITO, Principales.D_ESPALDA,"204", "202");
  admin.getPlayer(key).setPuntoGuardado(203);
  admin.guardarPLayers();

 }

 public void pagina204() {

  String pag85 = "En un rápido movimiento, la figura esquiva el proyectil inclinándose para atrás. En ese movimiento, la capucha cae de su cabeza revelando su rostro.\n" +
          "—No… no, no, no. No puede ser, no hay manera— horrorizado, veías el familiar rostro de la figura, la misma cara que veías todos los días al despertar, en las vidrieras de la calle, en los reflejos del agua.\n" +
          "Te estabas viendo a vos mismo.\n";
  gm.ui.crearEscenarioFiguraVolteada(204, pag85, Fondos.F_DEPOSITO,Principales.D_DADO_VUELTA,"205", "203");
  gm.ui.reproductorUI.cargarSonido("SoundFX/spiderMan.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(204);
  admin.guardarPLayers();

 }

 public void pagina205() {

  String pag85 = "—Bastante de cagon lo de atacarte por la espalda, eh— dijo—. Me esperaba más de mí mismo, por lo menos del que llegara a encontrarme. \n" +
          "Como parece que no vas a dejarme hacer lo que tengo que hacer, primero voy a encargarme de que no interfieras.\n" +
          "Recorto la distancia hacia vos con grandes zancadas, tranquilo. En sus ojos, atravesados por una cicatriz cada uno, solo podía apreciarse cansancio, resignación. \n" +
          "Su rostro delataba que era unos pocos años mayor que vos.\n";
  gm.ui.crearEscenarioFiguraVolteada(205, pag85, Fondos.F_DEPOSITO,Principales.D_DADO_VUELTA,"206", "204");
  admin.getPlayer(key).setPuntoGuardado(205);
  admin.guardarPLayers();

 }

 public void pagina206() {

  String pag85 = "Te tomó un poco por sorpresa, y sin estar seguro de cómo reaccionar, le arrojas una mopa, que esquiva ágilmente. Ya casi estaba sobre vos, así que le arrojas otra escoba, pero esta vez, coloca una carta portal en su mano izquierda y la escoba viaja a través de ella. Rápidamente, coloca el portal de salida en su otra mano y ataja el proyectil que salía disparado.\n" +
          "Lo aferra en su mano y te suelta un sólido golpe en la espalda, que provoca que caigas de bruces al suelo.\n";
  gm.ui.crearEscenarioFiguraVolteada(206, pag85, Fondos.F_DEPOSITO,Principales.D_DADO_VUELTA,"207", "205");
  admin.getPlayer(key).setPuntoGuardado(206);
  admin.guardarPLayers();

 }

 public void pagina207() {

  String pag85 = "Te tomó un poco por sorpresa, y sin estar seguro de cómo reaccionar, le arrojas una mopa, que esquiva ágilmente. Ya casi estaba sobre vos, así que le arrojas otra escoba, pero esta vez, coloca una carta portal en su mano izquierda y la escoba viaja a través de ella. Rápidamente, coloca el portal de salida en su otra mano y ataja el proyectil que salía disparado.\n" +
          "Lo aferra en su mano y te suelta un sólido golpe en la espalda, que provoca que caigas de bruces al suelo.\n";
  gm.ui.crearEscenarioFiguraVolteada(207, pag85, Fondos.F_DEPOSITO,Principales.D_DADO_VUELTA,"208", "206");
  admin.getPlayer(key).setPuntoGuardado(207);
  admin.guardarPLayers();

 }

 public void pagina208() {

  String pag85 = "Sin perder tiempo, das un ágil giro antes de levantarte, colocándote en la espalda de tu otro yo, y le tiras una patada directo a sus piernas con la intención de derribarlo, en vano ya que gira de un salto y te acierta una patada voladora directo en las costillas, arrojándote a un costado.\n" +
          "—Otra vez por la espalda, vení de frente Damián, no pelees como traicionero.\n" +
          "Te costaba respirar, pero te recompones a tiempo para esquivar un rodillazo que iba dirigido directo a tu pecho.\n";
  gm.ui.crearEscenarioFiguraCostado(208, pag85, Fondos.F_DEPOSITO,Principales.D_COSTADO,"209", "207");
  admin.getPlayer(key).setPuntoGuardado(208);
  admin.guardarPLayers();

 }

 public void pagina209() {

  String pag85 = "Das media vuelta y lanzas una serie de golpes contra tu adversario. \n" +
          "Inmutable, el Damián más viejo detuvo cada uno de ellos. No se resistía, solo caminaba hacia atrás, tranquilo, amortizando tu implacable avance. \n" +
          "Cada uno de los golpes que arrojabas era más desesperado que el anterior, y uno tras otro se convertían en una sarta de torpes manotazos, conmocionado ante la evidente ventaja que te sacaba tu contraparte.\n";
  gm.ui.crearEscenarioFiguraCostado(209, pag85, Fondos.F_DEPOSITO,Principales.D_COSTADO,"210", "208");
  admin.getPlayer(key).setPuntoGuardado(209);
  admin.guardarPLayers();

 }

 public void pagina210() {

  String pag85 = "—¿Por qué? ¿Por qué lo hiciste? Merezco mínimamente una explicación— Damián del futuro sostenía la espada que habías rescatado de China sobre su hombro, defendiéndose con una sola mano— un año intentando, un año atormentado con sueños y traumatizado por ver a Gabriel morir una y otra vez.\n" +
          "—¿Y crees que tener que asesinarlo es más fácil? Vos solo tenías que seguirme, evitar que Gabriel pueda descubrir el DeLorean y todo sería solucionado. Pero no, tenías que buscarlo, tenías que evitarme.\n";
  gm.ui.crearEscenarioFiguraVolteada(210, pag85, Fondos.F_DEPOSITO,Principales.D_DADO_VUELTA,"211", "209");
  admin.getPlayer(key).setPuntoGuardado(210);
  admin.guardarPLayers();

 }

 public void pagina211() {

  String pag85 = "El combate se había ya alejado de la sala donde se encontraban antes, desplazándose por la continuación del pasillo que daba al exterior.\n" +
          "—Hay algunas cosas que deben hacerse, aun sin conocer las consecuencias— dijo la figura, que esquivaba los golpes con la mano en los bolsillos.\n";
  gm.ui.crearEscenarioFiguraCostado(211, pag85, Fondos.F_PASILLO,Principales.D_COSTADO,"212", "210");
  admin.getPlayer(key).setPuntoGuardado(211);
  admin.guardarPLayers();

 }

 public void pagina212() {

  String pag85 = "—Estoy cansado de esa frase, cansado de intentar, cansado de…\n" +
          "Fuiste interrumpido por una alarma en el DTM del Damián del futuro, quien se distrajo y pudiste por fin, colocarle un golpe. Pero eso no le preocupaba, no; su atención estaba en el presagio de ese sonido.\n" +
          "—Ya es tarde. No estoy ahí— dijo mirando en dirección a la sala donde todo había comenzado, de donde volvió a salir el destello de color azul, indicando que el DeLorean había sido utilizado para viajar en el tiempo—. No tenes ni la más mínima idea de lo que hiciste.\n";
  gm.ui.crearEscenarioFiguraCostado(212, pag85, Fondos.F_PASILLO,Principales.D_COSTADO,"213", "211");
  gm.ui.reproductorUI.cargarSonido("SoundFX/8 pi pi pi.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(212);
  admin.guardarPLayers();

 }

 public void pagina213() {

  String pag85 = "Esas fueron sus últimas palabras, ya que un instante y justo frente a tus ojos, la figura se desvaneció completamente. Una sensación indescriptible recorrió tu cuerpo entero y sabías exactamente porqué. \n" +
          "La figura había dejado de existir \n" +
          "—Damián… Damián— lo llamas, esperanzado de que todo eso no acabase de pasar justo frente a vos y que en realidad, la figura este ahí para darte más explicaciones, para entender de una vez por todas que es lo que pasa.\n";
  gm.ui.crearEscenarioSolo(213, pag85, Fondos.F_PASILLO,"214", "212");
  admin.getPlayer(key).setPuntoGuardado(213);
  admin.guardarPLayers();

 }

 public void pagina214() {

  String pag85 = "Todo había sido tan rápido que no alcanzabas a asimilarlo.\n" +
          " Te enteras de que vos mismo eras el asesino de Gabriel, y ahora, la figura que perseguiste por un año se desvanece frente a vos. \n" +
          "Tu cabeza da vueltas y vueltas, sentís un gran malestar y para peor, justo en frente tuyo se abre un portal violeta y de él, emerge Manuel con un grupo de oficiales de la YTP.\n";
  gm.ui.crearEscenarioSolo(214, pag85, Fondos.F_PASILLO,"215", "213");
  admin.getPlayer(key).setPuntoGuardado(214);
  admin.guardarPLayers();

 }

 public void pagina215() {

  String pag85 = "—Rápido, ya saben qué hacer. Quiero un prolongador temporal en el lugar, acordonen el área— daba indicaciones rápidas a su pelotón y luego, volteo a mirarte.";
  gm.ui.crearEscenarioUnPersonaje(215, pag85, Fondos.F_PASILLO, Principales.M_COSTADO,"216", "214");
  gm.ui.reproductorUI.cargarSonido("SoundFX/6 soldados marchando.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(215);
  admin.guardarPLayers();

 }

 public void pagina216() {

  String pag85 = "—Damián Marsachi, quedas arrestado por infringir la norma 47 del código de los agentes del tiempo, por la violación a la ley 123, 198 bis y 31 de la constitución espaciotemporal. Además, se te juzgara por el asesinato de Gabriel. \n" +
          "Todo lo que digas puede y será usado en tu contra, tenes derecho a un abogado, si no podés pagarlo, la comisión temporal te asignara uno.\n" +
          "—No, Manuel, no entendes— tu compañero se acercaba a vos, listo para esposarte sin siquiera prestarte atención—. No era yo, o sea, si era yo, pero era una versión del futuro, un poco más grande, diferente.\n" +
          "Manuel se detuvo y te miró, todavía algo incrédulo, pero preocupado por tus palabras.\n";
  gm.ui.crearEscenarioUnPersonaje(216, pag85, Fondos.F_PASILLO, Principales.M_SERIO,"217", "215");
  admin.getPlayer(key).setPuntoGuardado(216);
  admin.guardarPLayers();

 }

 public void pagina217() {

  String pag85 = "—¿Y por qué no está acá?\n" +
          "—Desapareció. Se desvaneció, mejor dicho. Sentí que simplemente, no sé cómo explicarlo…que ya no existe.\n";
  gm.ui.crearEscenarioUnPersonaje(217, pag85, Fondos.F_PASILLO, Principales.M_CEJA_ARQUEADA,"218", "216");
  admin.getPlayer(key).setPuntoGuardado(217);
  admin.guardarPLayers();

 }

 public void pagina218() {

  String pag85 = "El semblante de Manuel se tornó en una agresiva expresión. Los policías del tiempo caminaban alrededor de ustedes, colectando pruebas, rastrillando la sala.\n" +
          "—¿Qué fue lo que hiciste? ¿Interferiste de alguna manera en lo que estaba haciendo? Te explique las consecuencias que tenía el entrometerse en la línea del tiempo— Manuel ahora gritaba, enfurecido.\n";
  gm.ui.crearEscenarioUnPersonaje(218, pag85, Fondos.F_PASILLO, Principales.M_NOJAU,"219", "217");
  gm.ui.reproductorUI.cargarSonido("SoundFX/6 soldados marchando.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(218);
  admin.guardarPLayers();

 }

 public void pagina219() {

  String pag85 = "Las alarmas en los DTM de todos los agentes de la YTP empezaron a sonar descontroladamente. Un centelleo anaranjado iluminaba las pantallas. Luego otro, y otro más. En cuestión de segundos ya no podía distinguirse nada, las alertan naranjas eran tantas que los dispositivos no daban a vasto.\n" +
          "—¿Ves? ¿Ves lo que ocasionas? Ese sonido nos dice que las líneas temporales se están mezclando y separando constantemente. Futuro, pasado, presente, nada de eso tiene sentido. Vos, yo, cualquier persona puede sufrir una laceración temporal debido a que sus otras versiones se mezclan entre sí, o peor aún, puede…\n";
  gm.ui.crearEscenarioUnPersonaje(219, pag85, Fondos.F_PASILLO, Principales.M_NOJAU,"220", "218");
  gm.ui.reproductorUI.cargarSonido("SoundFX/Alerta naranja multiple.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(219);
  admin.guardarPLayers();

 }

 public void pagina220() {

  String pag85 = "¡SPLORCH! \n" +
          "Manuel y vos quedan empapados de pies a cabezas, limpias de tus ojos la sustancia densa de la que habían sido cubiertos y ambos miran perturbados al culpable de aquel desagradable sonido. \n" +
          "El cuerpo decapitado de un oficial caía al suelo junto a sus pies, los restos de su cabeza explotada estaban esparcidos por todo el pasillo.\n";
  gm.ui.crearEscenarioUnPersonaje(220, pag85, Fondos.F_PASILLO, Principales.M_KETCHUP,"221", "219");
  gm.ui.reproductorUI.cargarSonido("SoundFX/3 head explode.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(220);
  admin.guardarPLayers();

 }

 public void pagina221() {

  String pag85 = "Al lado de ustedes pasaba un agente corriendo, las llamas envolvían su cuerpo y devoraban su carne mientras gritaba de agonía.\n" +
          "Alaridos de dolor y desesperación resonaban entre las paredes, oficiales sin extremidades deambulaban, completamente desorientados en una desenfrenada pérdida de sangre.\n" +
          "Otro de los agentes se había convertido en un niño y sus ropas que ahora le quedaban inmensas, provocaban que se tropiece y caiga sobre los ríos de sangre que escurrían por el suelo.\n" +
          "Manuel y vos observaban todo, congelados.\n";
  gm.ui.crearEscenarioUnPersonaje(221, pag85, Fondos.F_PASILLO, Principales.M_KETCHUP,"222", "220");
  admin.getPlayer(key).setPuntoGuardado(221);
  admin.guardarPLayers();

 }

 public void pagina222() {

  String pag85 = "—Tenemos que irnos. No…no hay forma de ayudarlos, tenemos que volver a la central y tratar de planificar como resolver todo esto— dijo tu compañero  quien recobrando la compostura, pero con esa mirada de terror estampada en su rostro, activa un portal de vuelta a su tiempo—. ¡Dale, Damián, salta!\n" +
          "Estabas petrificado, tu cuerpo no respondía. Tu mente estaba agotada de tanta muerte, tanto caos ¿Acaso esto podía seguir empeorando?\n" +
          "Ves hacia el interior del portal, pero este sufría las mismas consecuencias que la línea del tiempo y tus desafortunados compañeros. Diferentes universos y líneas temporales se mezclaban dentro, no sabias que pasaría si entrabas por ahí, podías salir en cualquier lado.\n";
  gm.ui.crearEscenarioUnPersonaje(222, pag85, Fondos.F_PASILLO, Principales.M_KETCHUP,"223", "221");
  admin.getPlayer(key).setPuntoGuardado(222);
  admin.guardarPLayers();

 }

 public void pagina223() {

  String pag85 = "—Tranquilo, vamos a salir en el momento exacto que viajamos acá, la mañana del 28 de noviembre del 2024. \n" +
          "Sujetas a tu compañero, pero este pierde el equilibrio. Lleva sus manos al pecho, donde su sangre esparcía un tinte carmesí desde su corazón por toda su ropa.\n" +
          "—¡Manuel, no! — pero era tarde, habías resbalado dentro del portal y la abertura de este se había cerrado.\n";
  gm.ui.crearEscenarioUnPersonaje(223, pag85, Fondos.F_PASILLO, Principales.M_KETCHUP,"224", "222");
  admin.getPlayer(key).setPuntoGuardado(223);
  admin.guardarPLayers();

 }

 public void pagina224() {

  String pag85 = "Observabas una tierra donde humanos y dinosaurios convivían en la actualidad, un futuro post apocalíptico que te recordaba mucho a la saga Mad Max.\n" +
          "Pero sin mucho tiempo para apreciar los escenarios, el portal da un giro busco y sentís como comenzas a dar vueltas.\n";
  gm.ui.crearEscenarioSolo(224, pag85, Fondos.F_PORTAL_VIOLETA, "225", "223");
  gm.ui.reproductorUI.cargarSonido("SoundFX/portalGoTo.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(224);
  admin.guardarPLayers();

 }

 public void pagina225() {

  String pag85 = "Mientras girabas descontroladamente, notaste como tu portal se mezclaba con otros parecidos, como los universos chocaban entre sí, haciendo que durante unos instantes en diferentes líneas. Pasaste por la Inglaterra del sigo XVIII, captando la mirada de algún transeúnte, luego por un futuro distópico donde un Milei androide daba un discurso presidencial ante una multitud que tenía su mismo corte de pelo; flotaste en el espacio, en una línea temporal donde la tierra había estallado.\n" +
          "Y finalmente caes de bruces al suelo, en un frio asfalto en una calle llena de pozos.\n";
  gm.ui.crearEscenarioSolo(225, pag85, Fondos.F_PORTAL_VIOLETA, "226", "224");
  gm.ui.reproductorUI.cargarSonido("SoundFX/portalGoTo.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(225);
  admin.guardarPLayers();

 }

 public void pagina226() {

  String pag85 = "Respiras agitadamente, no podes siquiera abrir tus ojos y sentís como la ansiedad empieza a afectar tus sentidos. Pensas en quedarte ahí, tirado en el piso, rendido. Pero no podías hacer eso, no podías perder tiempo, debías llegar a la YTP para advertirles, para tratar de solucionar todo.";
  gm.ui.crearEscenarioSolo(226, pag85, Fondos.F_NEGRO, "227", "225");
  admin.getPlayer(key).setPuntoGuardado(226);
  admin.guardarPLayers();

 }

 public void pagina227() {

  String pag85 = "Corres la distancia que te separa con la fachada que oculta la estación. Estabas a una distancia considerable, pero en la situación en la que te encontras, eso era lo último que te preocupaba.\n" +
          "Llegas hasta el kiosco violeta, atendido por un agente encubierto y decís la palabra clave.\n";
  gm.ui.crearEscenarioSolo(227, pag85, Fondos.F_FACHADA, "228", "226");
  admin.getPlayer(key).setPuntoGuardado(227);
  admin.guardarPLayers();

 }

 public void pagina228() {

  String pag85 = "—¿Qué querés? — te mira desconcertado frente a tus palabras.\n" +
          " —David… David, soy yo… por favor, déjame pasar.\n" +
          "—¿Cómo sabes mi nombre? ¿Quién carajo sos?\n" +
          "No podías creerlo, no querías. Sin decir nada más, salís corriendo del local y das vueltas por la vereda, deambulando e intentado pensar. \n" +
          "Tomas tu teléfono para comunicarte con la central y preguntarles que estaba sucediendo, así que marcas el interno y… \n";
  gm.ui.crearEscenarioSolo(228, pag85, Fondos.F_FACHADA, "229", "227");
  admin.getPlayer(key).setPuntoGuardado(228);
  admin.guardarPLayers();

 }

 public void pagina229() {

  String pag85 = "“El numero solicitado no corresponde a un abonado en servi…”\n" +
          "La respuesta de una voz pregrabada, fría y sin alma termina de abatirte, sin terminar de escuchar el mensaje, cortas la llamada.\n" +
          "Con manos torpes tanteas en tus bolsillos, buscando tus Unidad de Traslado Nanotecnológico. Revolves un bolsillo del saco, del pantalón, los del otro lado… pero no están por ningún lado. \n";
  gm.ui.crearEscenarioSolo(229, pag85, Fondos.F_FACHADA, "230", "228");
  gm.ui.reproductorUI.cargarSonido("SoundFX/11 llamada de espera NO EXISTE.wav");
  gm.ui.reproductorUI.reproducirSonido();
  admin.getPlayer(key).setPuntoGuardado(229);
  admin.guardarPLayers();

 }

 public void pagina230() {

  String pag85 = "—No, no, no, no. Okey, capaz se cayeron, todavía puedo acceder al DTM— dijiste para vos mismo, pero al mirar en tu muñeca, en el lugar donde hace solo unos minutos estaba tu reloj, no había nada. \n" +
          "Todo rastro y evidencia que tenías de la YTP se había desvanecido por completo.\n" +
          "Tus rodillas, temblorosas, te traicionan y dejan de responder. Caes al suelo, tu piel de un blanco más pálido que el papel. \n" +
          "Y lloras, lloras como la única forma que te queda para responder a todo lo que estaba sucediendo, sentado sobre el cordón, te sentiste inútil y perdido.\n";
  gm.ui.crearEscenarioSolo(230, pag85, Fondos.F_FACHADA, "231", "229");
  admin.getPlayer(key).setPuntoGuardado(230);
  admin.guardarPLayers();

 }

 public void pagina231() {

  String pag85 = "Entonces desde la distancia, una voz electrónica empezó a llegar a tus oídos y aunque en principio ignorabas lo que decía, las palabras que lograbas entender captaron rápidamente tu atención. \n" +
          "El televisor del kiosco, puesto en el noticiero, daba los títulos de la tarde.\n";
  gm.ui.crearEscenarioSolo(231, pag85, Fondos.F_FACHADA, "232", "230");
  admin.getPlayer(key).setPuntoGuardado(231);
  admin.guardarPLayers();

 }

 public void pagina232() {

  String pag85 = "—…en otras noticias, el ejército de Gengis Khan logro tomar el poder de Corea del Norte, proclamando así todo el sur del continente asiático. En el lado del Medio Oriente, Carlomagno se afianza en la conquista del territorio, evitando cualquier tipo de conflicto con el ejercito mongol y con el territorio europeo, ahora bajo el control total de Napoleón. Aunque el territorio ruso ha sido reducido, Putin sigue estable, conservando todo el norte y noroeste del país bajo su dominio.";
  gm.ui.crearEscenarioSolo(232, pag85, Fondos.F_FACHADA, "233", "231");
  admin.getPlayer(key).setPuntoGuardado(232);
  admin.guardarPLayers();

 }

 public void pagina233() {

  String pag85 = "Te habías acercado al vidrio del local, sin poder dar crédito a lo que escuchabas. Mirabas las noticias en la pantalla y la fecha coincidía, 23 de noviembre de 2024. \n" +
          "¿Gengis Khan? ¿Napoleón? Solo se te ocurría un persona que podía estar atrás de todo. \n" +
          "Te tranquilizaba saber que Gabriel está vivo, pero claramente hay algo en todo esto que no está bien. \n" +
          "Tratando de ordenar un poco tus ideas y de procesar lo que pasa, te debatís sobre qué hacer a continuación, cuando reflejada en el vidrio del café, la ves a tu espalda sentada en un banco de la plaza. \n" +
          "Con un notable nerviosismo, cruzas la calle y tomas asiento a su lado.\n";
  gm.ui.crearEscenarioSolo(233, pag85, Fondos.F_FACHADA, "234", "232");
  admin.getPlayer(key).setPuntoGuardado(233);
  admin.guardarPLayers();

 }

 public void pagina234() {

  String pag85 = "—Sos quien creo que sos, ¿verdad?\n" +
          "—Esa pregunta es muy ambigua, incluso un poco tramposa diría yo. Pero sí, soy las dos personas que crees que soy— te respondió Mirtha Legrand, sentada a tu lado\n" +
          "—¿Y cómo prefiere que la llame? ¿Ojo de Las Eras, señora Legrand…?\n";
  gm.ui.crearEscenarioUnConquistador(234, pag85, Fondos.F_EXTERIOR, Libertadores.MIRTHA,"235", "233");
  admin.getPlayer(key).setPuntoGuardado(234);
  admin.guardarPLayers();

 }

 public void pagina235() {

  String pag85 = "—Mirtha está bien, querido. Pero no me des vueltas, yo sí tengo toda la eternidad para estar acá, pero vos no podés decir lo mismo. \n" +
          "Aprovecha tu tiempo.\n" +
          "—Si, señora Legrand… Mirtha— te corregiste rápidamente—. Yo, tengo muchas preguntas—dijiste, riéndote con nerviosismo— Dios, no sé por dónde empezar… ¿Qué es lo que está pasando? Siento que me estoy volviendo loco, ya no sé qué día es ni donde estoy.\n";
  gm.ui.crearEscenarioUnConquistador(235, pag85, Fondos.F_EXTERIOR, Libertadores.MIRTHA,"236", "234");
  admin.getPlayer(key).setPuntoGuardado(235);
  admin.guardarPLayers();

 }

 public void pagina236() {

  String pag85 = "—Mira a tu alrededor, ¿ves algo diferente? — hiciste lo que el Ojo te indico, echaste un vistazo a todo el lugar y negaste con la cabeza— Exacto, es igual a tu universo, salvo, claro por algunos detalles, ¿no?\n" +
          "—No existe la YTP, Gabriel sigue vivo y ahora, algunos de los conquistadores más famosos                           de la historia parecen haber vuelto. Es una línea alterna en mi universo.\n" +
          "—Muy bien, no lo podría haber dicho mejor.\n" +
          "—Okey, ¿y qué es todo el asunto de los conquistadores? \n";
  gm.ui.crearEscenarioUnConquistador(236, pag85, Fondos.F_EXTERIOR, Libertadores.MIRTHA,"237", "235");
  admin.getPlayer(key).setPuntoGuardado(236);
  admin.guardarPLayers();

 }

 public void pagina237() {

  String pag85 = "—Tu amigo, en su retorcida idea de cambiar el mundo, trajo del pasado a algunos de los mejores estrategas políticos y militares, por lo menos los que él creía se adaptarían mejor a su plan. \n" +
          "Los dividió en cuatro de los cinco continentes y todos responden a él, creó un imperio autoritario que diezmo paises enteros, le quitó a la gente lo más preciado que tiene, algo que nunca se aprecia lo suficiente hasta que se pierde; les robó su libertad. \n" +
          "Cualquiera que se oponga, cualquier mínimo indicio de revolución, es rápidamente sometido y arrasado. La gente vive con miedo, ya no le quedan fuerzas para pelear.\n";
  gm.ui.crearEscenarioUnConquistador(237, pag85, Fondos.F_EXTERIOR, Libertadores.MIRTHA,"238", "236");
  admin.getPlayer(key).setPuntoGuardado(237);
  admin.guardarPLayers();

 }

 public void pagina238() {

  String pag85 = "Las palabras de Mirtha se sintieron como un golpe directo al estómago. \n" +
          "Te negabas a creer todo esto, no querías que fuera cierto ¿esto era lo que la figura trataba de evitar? ¿estas eran las consecuencias de salvar a Gabriel?\n" +
          "—¿Es… es mi deber detenerlo? ¿Es por eso por lo que se me apareció?\n" +
          "Mirtha te miro, sonriendo levemente.\n";
  gm.ui.crearEscenarioUnConquistador(238, pag85, Fondos.F_EXTERIOR, Libertadores.MIRTHA,"239", "237");
  admin.getPlayer(key).setPuntoGuardado(238);
  admin.guardarPLayers();

 }

 public void pagina239() {

  String pag85 = "—Siempre con la misma historia. Lamento decirte que mi  “leyenda” fue malinterpretada. Siento desilusionarte, pero yo solamente soy una espectadora, una consejera cuanto mucho. No hay ninguna magia ni mística detrás de mi aparición, tan solo las personas que no me busquen, pero si me necesiten podrían encontrarme. No hay ningún elegido ni nadie especial. El mundo cambia cuando una persona tiene ganas de que las cosas sean diferentes. Cualquiera con la fuerza de voluntad para intentar un cambio puede verme. \n" +
          "Depende enteramente de esa persona lo que pase después.\n" +
          "—Entonces, así como soy yo el que llego acá ¿podría haber sido cualquier otro?\n";
  gm.ui.crearEscenarioUnConquistador(239, pag85, Fondos.F_EXTERIOR, Libertadores.MIRTHA,"240", "238");
  admin.getPlayer(key).setPuntoGuardado(239);
  admin.guardarPLayers();

 }

 public void pagina240() {

  String pag85 = "Mirtha asintió y te respondió.\n" +
          "—Exactamente. Pero fuiste vos, así que no desperdicies esta oportunidad.\n" +
          "Agarro su cartera y buscando entre su contenido, agarró una carta negra, muy similar a las que usabas con la YTP y te la entregó. \n" +
          "—Es lo máximo que puedo hacer por ayudarte, no la desaproveches. \n" +
          "Va a ser útil en su momento. Si te interesa conocer donde opera tu amigo, pensá en un lugar que pueda ser significativo para esta versión suya.\n";
  gm.ui.crearEscenarioUnConquistador(240, pag85, Fondos.F_EXTERIOR, Libertadores.MIRTHA,"241", "239");
  admin.getPlayer(key).setPuntoGuardado(240);
  admin.guardarPLayers();

 }

 public void pagina241() {

  String pag85 = "—Gracias, Mirtha— mientras guardas la carta, te dirigís a la anciana— le puedo preguntar ¿Qué tengo que hacer ahora?\n" +
          "—A mí no me preguntes. Siempre haces algo diferente.\n";
  gm.ui.crearEscenarioUnConquistador(241, pag85, Fondos.F_EXTERIOR, Libertadores.MIRTHA,"242", "240");
  admin.getPlayer(key).setPuntoGuardado(241);
  admin.guardarPLayers();

 }

 public void pagina242() {

  String pag85 = "Desconcertado, levantas la cabeza, pero el lugar que ocupaba Mirtha estaba ahora vacío y de su presencia no había quedado más rastro que la tarjeta que descansaba en tu bolsillo.\n" +
          "“Siempre haces algo diferente” esas palabras quedaron dando vueltas en tu mente ¿a qué podía referirse?\n";
  gm.ui.crearEscenarioSolo(242, pag85, Fondos.F_EXTERIOR,"243", "241");
  admin.getPlayer(key).setPuntoGuardado(242);
  admin.guardarPLayers();

 }

 public void pagina243() {

  String pag85 = "Ante la abrupta desaparición de Mirtha, intentas entender que puede ser eso que te dio, así que volves a tomarlo de tu bolsillo y la analizas detenidamente.  \n" +
          "Era de un negro oscuro como la noche, parecía lisa, pero moviéndola a contraluz, observas que tienen unas inscripciones en un gris oscuro\n" +
          "Es el dibujo de lo que a tu parecer es un ojo cerrado y debajo lleva grabada la inscripción “Altera Occasio”. Ojalá el traductor multiversal sirviera también para texto, pero ya era demasiado pedir.\n";
  gm.ui.crearEscenarioUnConquistador(243, pag85, Fondos.F_EXTERIOR, Varios.CARTA_NEGRA,"244", "242");
  admin.getPlayer(key).setPuntoGuardado(243);
  admin.guardarPLayers();

 }

 public void pagina244() {

  String pag85 = "Dejándote llevar por tus pensamientos, das vuelta la carta en tus manos, meditando acerca de lo hablado con el Ojo. Sabias que no podías perder tiempo, tenes que apresurarte a buscar a Gabriel.\n" +
          "Mirtha te había dado una pista, un lugar significativo para esta versión suya.\n" +
          " Descartaste varias opciones que no precian ser las acertadas, como su casa, la universidad. \n" +
          "No tuviste que pensar mucho más para que la opción más lógica surja rápidamente, así que decidís ir hacia ese lugar.\n";
  gm.ui.crearEscenarioSolo(244, pag85, Fondos.F_EXTERIOR,"245", "243");
  admin.getPlayer(key).setPuntoGuardado(244);
  admin.guardarPLayers();

 }

 public void pagina245() {

  String pag85 = "Tuviste que caminar un poco, pero llegas al edificio donde se realizó la COMIC CON hace ya un año. Aunque técnicamente habías estado ahí hace tan solo unos minutos, el exterior del edificio era completamente diferente a como lo recordabas.\n" +
          "Un estremecimiento recorrió todo tu cuerpo, tenías un mal presentimiento sobre esto.\n" +
          "Parado frente al lugar, te cuestionas si fue la mejor idea presentarse directamente a su puerta y sin ningún plan en mente. Un sudor frío recorrió tu cuerpo, tenias un mal presentimiento sobre esto.\n";
  gm.ui.crearEscenarioSolo(245, pag85, Fondos.F_EXTERIOR,"246", "244");
  admin.getPlayer(key).setPuntoGuardado(245);
  admin.guardarPLayers();

 }

 public void pagina246() {

  String pag85 = "Cuando intentaste dar media vuelta sobre tus pasos, un grupo de guardias que parecieron salidos de la nada cerraron tu camino.\n" +
          "—El Señor Gabriel te estaba esperando. Te solicitamos nos acompañes adentro.\n" +
          "Sin otra opción más que obedecerlos, sos escoltado hasta el interior del lugar.\n";
  gm.ui.crearEscenarioSolo(246, pag85, Fondos.F_EXTERIOR,"247", "245");
  admin.getPlayer(key).setPuntoGuardado(246);
  admin.guardarPLayers();

 }

 public void pagina247() {

  String pag85 = "Aunque la vista desde el exterior se sentía completamente diferente, por dentro era otra historia. \n" +
          "Se encontraba igual que aquella vez, parecía que había sido abandonada el mismo día de la convención, detenida en el tiempo, si pusieran algunas personas dentro, todo sería igual que aquella vez. \n" +
          "Pero esos pasillos, los stands que permanecían colocados, todo eso te revolvía el estomago y erizaba tu piel";
  gm.ui.crearEscenarioSolo(247, pag85, Fondos.F_COMICCON,"248", "246");
  admin.getPlayer(key).setPuntoGuardado(247);
  admin.guardarPLayers();

 }

 public void pagina248() {

  String pag85 = "Y justo ahí, en medio del camino, como si el destino fuera caprichoso y obsesivo, Gabriel te espera de pie junto a los baños al lado de ese pasillo que ya pareciera estar maldito.\n" +
          "Tu amigo te mira con una tranquilidad inquietante y le ordena al grupo que te escoltaba.\n" +
          "—Gracias, pueden irse— y una vez habían abandonado el lugar, se dirige a vos—. Perdona todo el show, pero así son, excelentes en lo que hacen. Que alegría por fin encontrarte Dami.\n";
  gm.ui.crearEscenarioUnPersonaje(248, pag85, Fondos.F_COMICCON,Principales.G_CHILL,"249", "247");
  admin.getPlayer(key).setPuntoGuardado(248);
  admin.guardarPLayers();

 }

 public void pagina249() {

  String pag85 = "Gabriel se acerca y te da un abrazo. Esto te deja un poco descolocado, pero luego de unos momentos, lo abrazas de vuelta.\n" +
          "Queres liberar todo lo acumulado por este día tan extraño, por los últimos 12 meses de esfuerzo incalculable. Queres liberar todo porque por fin, después de tanto sufrimiento, de tanto sacrificio, estaba pasando y no en un sueño.\n" +
          "Pero había algo que se sentia fuera de lugar.\n";
  gm.ui.crearEscenarioSolo(249, pag85, Fondos.F_COMICCON,"250", "248");
  admin.getPlayer(key).setPuntoGuardado(249);
  admin.guardarPLayers();

 }

 public void pagina250() {

  String pag85 = "El abrazo no se sentía como un saludo de dos hermanos del alma. \n" +
          "Era frio, vacío y carente de todo afecto o emoción. \n" +
          "No dejas que se prolongue mucho y te alejas un poco de Gabriel. \n" +
          "Tratas de retomar el plan original, charlar con tu amigo, sacarle algo de información, pero los nervios te traicionan.\n";
  gm.ui.crearEscenarioUnPersonaje(250, pag85, Fondos.F_COMICCON,Principales.G_CHILL,"251", "249");
  admin.getPlayer(key).setPuntoGuardado(250);
  admin.guardarPLayers();

 }

 public void pagina251() {

  String pag85 = "—Bueno, ¿y vos cómo vas? Que loco todo lo que está pasando, ¿no? ¿Viste eso de los conquistadores? ¿crees que realmente son ellos? — apenas terminas de hablar, pensas en lo que acabas de decir y te arrepentís inmediatamente de lo poco disimulada que era tu pregunta. Miras a Gabriel, esperando alguna reacción, pero siguen tu amigo seguía igual, sereno, inmutado. Incluso parecía alegre de que estes ahí.";
  gm.ui.crearEscenarioUnPersonaje(251, pag85, Fondos.F_COMICCON,Principales.G_CHILL,"252", "250");
  admin.getPlayer(key).setPuntoGuardado(251);
  admin.guardarPLayers();

 }

 public void pagina252() {

  String pag85 = "—Wow… digo, de verdad. Eso fue rápido, muy rápido sinceramente. Esperaba, no se… algo más de charla antes o algo. \n" +
          "Pero ¿sabes qué? Ya empezaba a preguntarme cuando ibas a aparecer por acá. \n" +
          "Incluso llegue a pensar que te había pasado algo.\n";
  gm.ui.crearEscenarioUnPersonaje(252, pag85, Fondos.F_COMICCON,Principales.G_CHILL,"253", "251");
  admin.getPlayer(key).setPuntoGuardado(252);
  admin.guardarPLayers();

 }

 public void pagina253() {

  String pag85 = "—Gabriel… ¿De qué hablas?\n" +
          "Tu piel se erizo y tus sentidos se agudizaron. Sentías una presión abrumadora contra tu pecho, se te dificultaba respirar y uno de tus ojos empezó a tener un tic nervioso. Te dabas una idea de lo que podía referirse Gabriel, y eso no te gustaba nada.\n";
  gm.ui.crearEscenarioUnPersonaje(253, pag85, Fondos.F_COMICCON,Principales.G_CHILL,"254", "252");
  admin.getPlayer(key).setPuntoGuardado(253);
  admin.guardarPLayers();

 }

 public void pagina254() {

  String pag85 = "—Dejame que te explique. Hace un año, el mismo día que vinimos acá, yo me quedé dormido ¿te acordás? ¿Sí? Bueno, antes de eso, durante varios días tenía este sueño recurrente. En ellos siempre estábamos acá, en la COMIC CON y todo lo que recuerdo aparte de eso, era que siempre te entregaba un pedazo de papel, solo eso.\n" +
          "Hasta ese día, poco antes de que me despertaras \n" +
          "La expresión tranquila que había mantenido hasta el momento se desdibujo en una mueca hostil.\n";
  gm.ui.crearEscenarioUnPersonaje(254, pag85, Fondos.F_COMICCON,Principales.G_ENOJADO,"255", "253");
  admin.getPlayer(key).setPuntoGuardado(254);
  admin.guardarPLayers();

 }

 public void pagina255() {

  String pag85 = "—Caminábamos por acá, por este mismo lugar, cuando te pido ir al stand de Alfaguara. Ahí, revolviendo un poco encuentro un libro, el “Atlas de los Grandes Conquistadores”.\n" +
          "Tus latidos aumentaban rápidamente. Las palabras de Gabriel y el bombeo de tu corazón perforaban tus oídos. Tus instintos más primitivos te preparaban para huir de aquella amenaza todavía invisible, pero de a poco tomaba forma frente a vos. \n";
  gm.ui.crearEscenarioUnPersonaje(255, pag85, Fondos.F_COMICCON,Principales.G_COSTADO,"256", "254");
  admin.getPlayer(key).setPuntoGuardado(255);
  admin.guardarPLayers();

 }

 public void pagina256() {

  String pag85 = "Aquí tienes una corrección de la puntuación para mayor claridad y fluidez:\n" +
          "\n" +
          "—No había escuchado nunca acerca de él, por lo que llamó mi atención. Empecé a ojearlo, primero por arriba, pero a medida que avanzaba entre las páginas, veía que era, en realidad, algo muy revelador, y le presté verdadera atención.\n" +
          "Y fue ahí, a medida que lo iba leyendo, cuando se abrieron mis ojos y tuve una revelación donde todo cobró sentido.\n" +
          "Como sabes, tengo un punto de vista político más radical. Incluso podemos decirle dictatorial, si querés. Siempre había tenido este sueño, la ilusión de poder convertirme en un líder mundial y enderezar a la humanidad, y por fin, ante mí, estaba la respuesta. Esos grandes conquistadores que supieron doblegar naciones serían la herramienta perfecta. Te conté todo mi plan y te entregué el libro, y en ese momento en el que desaparecías del sueño, pensé que estaba a punto de despertarme.";
  gm.ui.crearEscenarioUnPersonaje(256, pag85, Fondos.F_COMICCON,Principales.G_ENOJADO,"257", "255");
  admin.getPlayer(key).setPuntoGuardado(256);
  admin.guardarPLayers();

 }

 public void pagina257() {

  String pag85 = "—Lo vi todo, Damián. Vi las líneas donde me asesinabas,  tus intentos por salvarme, la YTP,  absolutamente todo. Y supe en ese momento que iba a ser diferente, sabía que era mi turno de imponerme. \n" +
          "Cuando llegué acá y te vi, supe que ignorabas todo lo que iba a pasar, que yo era el único que había presenciado todo esto, mientras que vos solo estabas molesto por cuanto tarde en llegar—dijo Gabriel, soltando una risa burlona— así que aproveché mi oportunidad y en el momento que me perdiste de vista, me escabullí por el pasillo y caminé hasta llegar a la réplica del Delorean, me subí e hice mi primer viaje.\n";
  gm.ui.crearEscenarioGabrielPoderos(257, pag85, Fondos.F_COMICCON,Principales.G_PODEROSO,"258", "256");
  admin.getPlayer(key).setPuntoGuardado(257);
  admin.guardarPLayers();

 }

 public void pagina258() {

  String pag85 = "No podías creer lo que escuchabas, estabas petrificado y te limitabas únicamente a ver a tu amigo hablar mientras daba el que parecía ser un monologo ensayado. \n" +
          "Todas esas extrañas conexiones en el sueño, los elementos que extrajiste ¿Gabriel había sido parte también? Tenía sentido tu comunicación con la figura, ¿pero esto?\n";
  gm.ui.crearEscenarioSolo(258, pag85, Fondos.F_COMICCON,"259", "257");
  admin.getPlayer(key).setPuntoGuardado(258);
  admin.guardarPLayers();

 }

 public void pagina259() {

  String pag85 = "—Mi primer destino fue la huelga del trabajador. Evitarla provocaría una precarización en las jornadas laborales, que desencadenaría en una sociedad más cansada y por lo tanto, con menos ánimos para pelear. Y así lo hice, pagué a un policía corrupto y se encargó de todo.\n" +
          "Tu cabeza empezaba a dolerte ante tanta información repentina. Habías resuelto ese caso hace unas semanas ¿Cómo podía Gabriel ser el responsable? Todavía no lo habías salvado, nada de esto había pasado aún.\n";
  gm.ui.crearEscenarioUnPersonaje(259, pag85, Fondos.F_COMICCON, Principales.G_COSTADO,"260", "258");
  admin.getPlayer(key).setPuntoGuardado(259);
  admin.guardarPLayers();

 }

 public void pagina260() {

  String pag85 = "—Y después de eso, cuando tuvo éxito, vi todas las posibilidades. Podía hacer lo que quisiera, modificar la historia, ir a cualquier lugar, era todopoderoso.\n" +
          "No existe fuerza humana capaz de combatir al tiempo, así que no perdí más tiempo y fui directamente a…\n" +
          "—A China. A buscar a Gengis.\n" +
          "Gabriel sonrió, asintiendo levemente con la cabeza.\n";
  gm.ui.crearEscenarioGabrielPoderos(260, pag85, Fondos.F_COMICCON, Principales.G_PODEROSO,"261", "259");
  admin.getPlayer(key).setPuntoGuardado(260);
  admin.guardarPLayers();

 }

 public void pagina261() {

  String pag85 = "—Lo convencí de que era una especie de dios, uno de los que encontré en el Atlas, y el pobre iluso me creyó y vino conmigo. Tan poderoso, pero tan supersticioso. \n" +
          "Pero hay algo, Dami, hay algo que todavía no puedo entender. Yo, completamente solo, conseguí hacer cosas como estas, únicamente con el poder del auto, mientras vos y los inútiles de tus amigos, con toda esa tecnología, todos esos avances, ¿Qué hacían? ¿Jugaban al poliladron?\n" +
          "Todo sucedió muy rápido.\n";
  gm.ui.crearEscenarioUnPersonaje(261, pag85, Fondos.F_COMICCON, Principales.G_ENOJADO,"262", "260");
  admin.getPlayer(key).setPuntoGuardado(261);
  admin.guardarPLayers();

 }

 public void pagina262() {

  String pag85 = "Gabriel escupió esas últimas palabras y en un instante, con un movimiento veloz, desenvainó una navaja y atacó directo a tu pecho.\n" +
          "Tus reflejos apenas te permitieron esquivar la afilada hoja plateada, que cortó el aire justo en el lugar donde habías estado. Trastabillaste hacia atrás, llevando una mano al rostro, donde sentías un ardor intenso. Tus dedos se empaparon de sangre; el arco ascendente trazado por la navaja había conseguido rozarte, dejándote un corte que cruzaba justo por encima de tu ojo.  \n" +
          "—Estas cartas, por ejemplo, son fantásticas. Y sus posibilidades son ilimitadas.\n";
  gm.ui.crearEscenarioUnPersonaje(262, pag85, Fondos.F_COMICCON, Principales.G_ENOJADO,"263", "261");
  admin.getPlayer(key).setPuntoGuardado(262);
  admin.guardarPLayers();

 }

 public void pagina263() {

  String pag85 = "Al igual que la figura, Gabriel uso dos UTN rojas para atravesar el espacio entre los dos y soltarte un golpe directo al estómago.\n" +
          "—Con el poder para tenerlo todo— mientras tratabas de levantarte, te pateo en las costillas, arrojandote hacia un costado— Pero muy débil para tomarlo.\n" +
          "Te levantaste lo mas rápido y buscas a Gabriel con la mirada, preparado.\n" +
          "No alcanzabas a verlo, pero escuchas un sonido tenue a tu lado";
  gm.ui.crearEscenarioGabrielPoderos(263, pag85, Fondos.F_COMICCON, Principales.G_PODEROSO, "264", "262");
  admin.getPlayer(key).setPuntoGuardado(263);
  admin.guardarPLayers();

 }

 public void pagina264() {

  String pag85 = "Soltaste un grito ahogado en el momento que el cuchillo atravesó tu carne, desgarrando tus tejidos, abriéndose paso, enterrándose hasta perforar tus intestinos. \n" +
          "En ese momento, ya no había dolor. Ni lo ocurrido más temprano con tus compañeros, ni el puñal clavado en tu vientre parecían importar. Todo a tu alrededor se volvió liviano, tranquilo. \n" +
          "No te preocupabas por nada de lo sucedido, porque de alguna manera sabías que todo iba a estar bien.\n";
  gm.ui.crearEscenarioSolo(264, pag85, Fondos.F_COMICCON,"265", "263");
  admin.getPlayer(key).setPuntoGuardado(264);
  admin.guardarPLayers();

 }

 public void pagina265() {

  String pag85 = "Con tus ultimas fuerzas miras a tu amigo, quien te sostiene todavía en pie y mirando directo a tus ojos, te dice.\n" +
          "—Pero yo no soy débil.\n" +
          "Tu cuerpo sin vida cae a los pies de Gabriel, quien con un movimiento indica a sus hombres que lo descarten.\n";
  gm.ui.crearEscenarioUnPersonaje(265, pag85, Fondos.F_COMICCON, Principales.G_COSTADO,"266", "264");
  admin.getPlayer(key).setPuntoGuardado(265);
  admin.guardarPLayers();

 }

 public void pagina266() {

  String pag85 = ".   .   .";
  gm.ui.crearEscenarioSolo(266, pag85, Fondos.F_NEGRO,"267", "263");
  admin.getPlayer(key).setPuntoGuardado(266);
  admin.guardarPLayers();

 }

 public void pagina267() {

  String pag85 = "Un tiempo después";
  gm.ui.crearEscenarioSolo(267, pag85, Fondos.F_NEGRO,"268", "266");
  admin.getPlayer(key).setPuntoGuardado(267);
  admin.guardarPLayers();

 }

 public void pagina268() {

  String pag85 = "La doctora en abogacía Paz Malaquistain bajo de su auto en dirección a la estación de Policía Federal Argentina. Dentro, el detective Manuel Lublo la esperaba para que se pongan al corriente del caso.";
  gm.ui.crearEscenarioSolo(268, pag85, Fondos.F_OFICINA,"269", "267");
  admin.getPlayer(key).setPuntoGuardado(268);
  admin.guardarPLayers();

 }

 public void pagina269() {

  String pag85 = "—Perdoname la demora, Manuel. No me quiero excusar, pero dormí muy mal y se me paso la alarma.\n" +
          "—Nada fuera de lo común para vos, Paz— le respondió el hombre, un poco en broma y otro tanto en serio—. La verdad es que hace un tiempo me está pasando lo mismo, estoy teniendo sueños muy extraños, casi como si fueran reales. Me despierto a la madrugada, agitado y perdido\n" +
          "Paz quedo sorprendida ante las palabras de Manuel, lo que describía perfectamente la situación que ella también atravesaba desde hace aproximadamente un año.\n";
  gm.ui.crearEscenarioUnConquistador(269, pag85, Fondos.F_OFICINA, Principales.M_Y_BUENO,"270", "268");
  admin.getPlayer(key).setPuntoGuardado(269);
  admin.guardarPLayers();

 }

 public void pagina270() {

  String pag85 = "—Estos sueños…—quiso preguntar Paz, pero se vieron interrumpidos por la llegada de un grupo de personas, hombres corpulentos que formaban un círculo, escoltando en medio de ellos a alguien que parecía importante.\n" +
          "—Eso mismo te quería avisar, Paz. El sospechoso nos honra con su visita.\n" +
          "De entre medio de los guardaespaldas surge un hombre narigón, de pelo oscuro y entradas prominentes. Era de edad avanzada, pero teñía sus canas para disimularlo.\n";
  gm.ui.crearEscenarioDosPersonajes(270, pag85, Fondos.F_OFICINA, Principales.P_FRENTE, Principales.M_SERIO, "271", "269");
  admin.getPlayer(key).setPuntoGuardado(270);
  admin.guardarPLayers();

 }

 public void pagina271() {

  String pag85 = "(N. del A.: La siguente conversación se desarrollo en inglés, pero por comodidad del escritor y simpleza para el jugador, sera traducida automáticamente al español)\n"+
          "\n —Doctora Malaquistain, detective Lublo— los saludo Richard Nixon—, que honrado me siento de volver a verlos.";
  gm.ui.crearEscenarioUnConquistador(271, pag85, Fondos.F_OFICINA, Conquistadores.NIXON_SIN_MANOS,"272", "270");
  admin.getPlayer(key).setPuntoGuardado(271);
  admin.guardarPLayers();

 }

 public void pagina272() {

  String pag85 = "Paz lo fulminó con la mirada, sin hacer el mínimo esfuerzo en disimular el odio que le generaba la mera existencia de aquel hombre. Manuel, por su parte, fue más protocolar.";
  gm.ui.crearEscenarioDosPersonajes(272, pag85, Fondos.F_OFICINA, Principales.P_NOJA_FRENTE, Principales.M_CEJA_ARQUEADA,"273", "271");
  admin.getPlayer(key).setPuntoGuardado(272);
  admin.guardarPLayers();

 }

 public void pagina273() {

  String pag85 = "—Presidente Nixon, ¿a qué se debe su aparición?\n" +
          "—Bueno detective, me sorprende la pregunta. Les pido que por un momento se pongan en mi lugar. Están en una gira por América del Sur, visitando importantes lideres y aliados políticos.\n";
  gm.ui.crearEscenarioConquistadorPersonajeUno(273, pag85, Fondos.F_OFICINA, Principales.M_CEJA_ARQUEADA, Conquistadores.NIXON_SIN_MANOS,"274", "272");
  admin.getPlayer(key).setPuntoGuardado(273);
  admin.guardarPLayers();

 }

 public void pagina274() {

  String pag85 = "—Títeres dictadores que responden a usted, querrá decir— argumentó Paz.\n" +
          "—Cuando de repente— prosiguió el presidente de Estados Unidos, haciendo caso omiso a la abogada— se encuentran con la noticia de que fueron acusados por corrupción, soborno, conspiración y complicidad en unos supuestos e ilógicos crímenes de lesa humanidad, que, según ustedes, son cometidos por los grandes lideres que tiene el país.\n";
  gm.ui.crearEscenarioConquistadorPersonajeUno(274, pag85, Fondos.F_OFICINA, Principales.P_NOJA_FRENTE, Conquistadores.NIXON_SIN_MANOS,"275", "273");
  admin.getPlayer(key).setPuntoGuardado(274);
  admin.guardarPLayers();

 }

 public void pagina275() {

  String pag85 = "—¡¿Cómo le da la cara para decir eso?! — exploto Paz en contra del mandatario estadounidense.\n" +
          "—Señor Lublo, le pido que controle a su colega. Soy un diplomático de una de las naciones más importantes, serpia apropiado que me traten con el respeto y el cuidado que eso merece.\n";
  gm.ui.crearEscenarioConquistadorPersonajeUno(275, pag85, Fondos.F_OFICINA, Principales.P_APUNTANDO, Conquistadores.NIXON_SIN_MANOS,"276", "274");
  admin.getPlayer(key).setPuntoGuardado(275);
  admin.guardarPLayers();

 }

 public void pagina276() {

  String pag85 = "——Yo no soy quién para decirle a la señorita Malaquistain que debe o no hacer, y usted tampoco— respondió tajante—. Ahora, vuelvo a preguntarle ¿Qué lo trae por acá?\n" +
          "—Increíble como se ha perdido el respeto en estos lugares. Vengo a dialogar con su superior, el Comisario Rodríguez. En unos días vuelvo a mi país y lamentaría mucho tener que acomodar mi ajustada agenda a una denuncia irrisoria como la que he sido acusado. Se que a diferencia de ustedes dos y sobre todo de ella— dijo, dando una mirada despectiva a Paz— es un hombre racional, que al escuchar lo que tengo para decir, desestimara la denuncia presentada por la PFA. \n" +
          "Y ahora, si me disculpan.\n";
  gm.ui.crearEscenarioConquistadorPersonajeUno(276, pag85, Fondos.F_OFICINA, Principales.M_SERIO, Conquistadores.NIXON_SIN_MANOS,"277", "275");
  admin.getPlayer(key).setPuntoGuardado(276);
  admin.guardarPLayers();

 }

 public void pagina277() {

  String pag85 = "Diciendo eso, Nixon se retiro y fue recibido por el superior de Manuel. Después de un rato, ambos hombres salieron de la oficina, riendo y estrechando sus manos.\n" +
          "Al pasar junto al agente y a la abogada, les echo una mirada amenazante, disculpándose con el presidente norteamericano por las molestias ocasionadas\n" +
          "Paz y Manuel se sentaron en la oficina del detective, abatidos ante la derrota que acababan de sufrir.\n";
  gm.ui.crearEscenarioSolo(277, pag85, Fondos.F_OFICINA, "278", "276");
  admin.getPlayer(key).setPuntoGuardado(277);
  admin.guardarPLayers();

 }

 public void pagina278() {

  String pag85 = "—Ni siquiera llego al juicio. Vino, soborno al Comisario y se fue. Así de sencillo, de rápido.\n" +
          "Manuel escuchaba a Paz en silencio, meditativo.\n" +
          "—Se que es tu jefe, pero estoy segura de que podemos conseguir probar el soborno. Lo hizo casi en nuestra cara, hay algo que tenemos que poder hacer.\n";
  gm.ui.crearEscenarioDosPersonajes(278, pag85, Fondos.F_OFICINA, Principales.M_SERIO, Principales.P_COSTADO, "279", "277");
  admin.getPlayer(key).setPuntoGuardado(278);
  admin.guardarPLayers();

 }

 public void pagina279() {

  String pag85 = "—No, Paz, que ni se te ocurra. Meterte con un agente de la Policía nunca sale bien, peor si es un comisario. Además, ¿en un momento como el que atraviesa el país? Podes hacer mucho más si vivís, créeme.\n" +
          "Aunque a Paz le molesto el rechazo de Manuel a su idea, sabia que el detective tenía razón.\n";
  gm.ui.crearEscenarioDosPersonajes(279, pag85, Fondos.F_OFICINA, Principales.M_NOJAU, Principales.P_COSTADO, "280", "278");
  admin.getPlayer(key).setPuntoGuardado(279);
  admin.guardarPLayers();

 }

 public void pagina280() {

  String pag85 = "—Por cierto— dijo cambiando el tema de conversación—. Hoy hablaste sobre esos sueños que no te dejan dormir ¿Te puedo preguntar cómo son?¿Hace cuanto los sufrís?\n" +
          "Manuel se encogió de hombros, divertido ante tu pregunta de la que todavía desconocía la importancia.\n";
  gm.ui.crearEscenarioConquistadorPersonajeUno(280, pag85, Fondos.F_OFICINA, Principales.M_Y_BUENO, Principales.P_FRENTE, "281", "279");
  admin.getPlayer(key).setPuntoGuardado(280);
  admin.guardarPLayers();

 }

 public void pagina281() {

  String pag85 = "—Un año, creo. Más o menos por ahí— suspiró y forzó una mueca en su cara, como si eso lo ayudase a recordar detalles—. Es como si siguiera siendo un policía, aunque en un sueño detengo a gente en Inglaterra en 1920 o cosas así. Incluso hay veces que aparecen Mr. Orange y Ender, también son detectives.\n";
  gm.ui.crearEscenarioDosPersonajes(281, pag85, Fondos.F_OFICINA, Principales.M_CEJA_ARQUEADA, Principales.P_COSTADO, "282", "280");
  admin.getPlayer(key).setPuntoGuardado(281);
  admin.guardarPLayers();

 }

 public void pagina282() {

  String pag85 = "Tras decir eso, se hizo silencio durante unos instantes. Manuel, extrañado, volteó a ver a Paz, pero ella no lo miraba a él. Su mirada se perdía en el fondo de la oficina, pensante.\n" +
          "—Son… son exactamente iguales a los que tengo. En muchos somos compañeros, investigamos casos juntos.\n" +
          "—¿De verdad me estás diciendo? Recuerdo que una vuelta había uno donde hablamos con una señora china— recordando, Manuel ríe un poco—. De hecho, yo hablaba un chino perfecto—hizo una pequeña pausa, tratando de darle alguna explicación lógica al asunto—. ¿Es posible eso? Dos personas, teniendo sueños idénticos entre si ¿Crees que signifique algo?\n" +
          "Paz tan solo movió sus cejas y levanto sus hombros, indicando que no tenía idea.\n";
  gm.ui.crearEscenarioDosPersonajes(282, pag85, Fondos.F_OFICINA, Principales.M_COSTADO, Principales.P_FRENTE, "283", "281");
  admin.getPlayer(key).setPuntoGuardado(282);
  admin.guardarPLayers();

 }

 public void pagina283() {

  String pag85 = "Empezaron a dar vuelta esa idea en su cabeza. Al trabajar juntos, podían ser sueños relacionados a las situaciones en las que se veían envueltos, sí. Pero todo esto era demasiado similar, más que una coincidencia o una consecuencia del subconsciente. \n" +
          "Era un mensaje, un recuerdo.\n";
  gm.ui.crearEscenarioSolo(283, pag85, Fondos.F_OFICINA, "284", "282");
  admin.getPlayer(key).setPuntoGuardado(283);
  admin.guardarPLayers();

 }

 public void pagina284() {

  String pag85 = "Empezaron a dar vuelta esa idea en su cabeza. Al trabajar juntos, podían ser sueños relacionados a las situaciones en las que se veían envueltos, sí. Pero todo esto era demasiado similar, más que una coincidencia o una consecuencia del subconsciente. \n" +
          "Era un mensaje, un recuerdo.\n";
  gm.ui.crearEscenarioDosPersonajes(284, pag85, Fondos.F_OFICINA, Principales.M_SERIO, Principales.P_FRENTE, "285", "283");
  admin.getPlayer(key).setPuntoGuardado(284);
  admin.guardarPLayers();

 }

 public void pagina285() {

  String pag85 = "Finalmente, Manuel rompió el silencio.\n" +
          "—En estos últimos días tuve un sueño muy recurrente. En ellos, estamos en la orilla del Río Yapeyú. Ahí, entre los matorrales, encontramos el cuerpo de un chico, algo más joven que vos. \n" +
          "Esta muerto, frío, sin signos vitales ni color en su piel. Pero sus ojos se mueven como si estuviera en un trance.\n";
  gm.ui.crearEscenarioDosPersonajes(285, pag85, Fondos.F_OFICINA, Principales.M_SERIO, Principales.P_FRENTE, "286", "284");
  admin.getPlayer(key).setPuntoGuardado(285);
  admin.guardarPLayers();

 }

 public void pagina286() {

  String pag85 = "Sin decir nada, Paz se levantó y empezó a caminar hacia la salida, dejando a Manuel sorprendido.\n" +
          "—¿Paz? ¿Qué te pasó?\n";
  gm.ui.crearEscenarioDosPersonajes(286, pag85, Fondos.F_OFICINA, Principales.P_ESPALDA, Principales.M_CEJA_ARQUEADA, "287", "285");
  admin.getPlayer(key).setPuntoGuardado(286);
  admin.guardarPLayers();

 }

 public void pagina287() {

  String pag85 = "—Es el mismo sueño que vengo teniendo hace una semana. Y creo que, frente a eso, lo mínimo que puedo hacer es acercarme a ver. Además, después de lo que paso me vendría bien despejar la mente un poco. A lo sumo que puede pasar ¿que no encontremos nada?\n" +
          "Y con eso dicho, se dio la vuelta y fue a su auto. \n" +
          "Manuel lo dudo un momento y sacudiendo su cabeza, como si ya se arrepintiera solo de pensar que esto era posible, se levantó y apuro el paso para alcanzar a su amiga.\n";
  gm.ui.crearEscenarioDosPersonajes(287, pag85, Fondos.F_OFICINA, Principales.P_DADA_VUELTA, Principales.M_CEJA_ARQUEADA, "288", "286");
  admin.getPlayer(key).setPuntoGuardado(287);
  admin.guardarPLayers();

 }

 public void pagina288() {

  String pag85 = "—Es el mismo sueño que vengo teniendo hace una semana. Y creo que, frente a eso, lo mínimo que puedo hacer es acercarme a ver. Además, después de lo que paso me vendría bien despejar la mente un poco. A lo sumo que puede pasar ¿que no encontremos nada?\n" +
          "Y con eso dicho, se dio la vuelta y fue a su auto. \n" +
          "Manuel lo dudo un momento y sacudiendo su cabeza, como si ya se arrepintiera solo de pensar que esto era posible, se levantó y apuro el paso para alcanzar a su amiga.\n";
  gm.ui.crearEscenarioSolo(287, pag85, Fondos.F_CIELO, "288", "286");
  admin.getPlayer(key).setPuntoGuardado(287);
  admin.guardarPLayers();

 }

 public void pagina289() {

 }

 public void pagina290() {

 }

 public void pagina291() {

 }

 public void pagina292() {

 }

 public void pagina293() {

 }

 public void pagina294() {

 }

 public void pagina295() {

 }

 public void pagina296() {

 }

 public void pagina297() {

 }

 public void pagina298() {

 }

 public void pagina299() {

 }

 public void pagina300() {

 }

 public void pagina301() {

 }

 public void pagina302() {

 }

 public void pagina303() {

 }

 public void pagina304() {

 }

 public void pagina305() {

 }

 public void pagina306() {

 }

 public void pagina307() {

 }

 public void pagina308() {

 }

 public void pagina309() {

 }

 public void pagina310() {

 }

 public void pagina311() {

 }

 public void pagina312() {

 }

 public void pagina313() {

 }

 public void pagina314() {

 }

 public void pagina315() {

 }

 public void pagina316() {

 }

 public void pagina317() {

 }

 public void pagina318() {

 }

 public void pagina319() {

 }

 public void pagina320() {

 }

 public void pagina321() {

 }

 public void pagina322() {

 }

 public void pagina323() {

 }

 public void pagina324() {

 }

 public void pagina325() {

 }

 public void pagina326() {

 }

 public void pagina327() {

 }

 public void pagina328() {

 }

 public void pagina329() {

 }

 public void pagina330() {

 }

 public void pagina331() {

 }

 public void pagina332() {

 }

 public void pagina333() {

 }

 public void pagina334() {

 }

 public void pagina335() {

 }

 public void pagina336() {

 }

 public void pagina337() {

 }

 public void pagina338() {

 }

 public void pagina339() {

 }

 public void pagina340() {

 }

 public void pagina341() {

 }

 public void pagina342() {

 }

 public void pagina343() {

 }

 public void pagina344() {

 }

 public void pagina345() {

 }

 public void pagina346() {

 }

 public void pagina347() {

 }

 public void pagina348() {

 }

 public void pagina349() {

 }

 public void pagina350() {

 }

 public void pagina351() {

 }

 public void pagina352() {

 }

 public void pagina353() {

 }

 public void pagina354() {

 }

 public void pagina355() {

 }

 public void pagina356() {

 }

 public void pagina357() {

 }

 public void pagina358() {

 }

 public void pagina359() {

 }

 public void pagina360() {

 }

 public void pagina361() {

 }

 public void pagina362() {

 }

 public void pagina363() {

 }

 public void pagina364() {

 }

 public void pagina365() {

 }

 public void pagina366() {

 }

 public void pagina367() {

 }

 public void pagina368() {

 }

 public void pagina369() {

 }

 public void pagina370() {

 }

 public void pagina371() {

 }

 public void pagina372() {

 }

 public void pagina373() {

 }

 public void pagina374() {

 }

 public void pagina375() {

 }

 public void pagina376() {

 }

 public void pagina377() {

 }

 public void pagina378() {

 }

 public void pagina379() {

 }

 public void pagina380() {

 }

 public void pagina381() {

 }

 public void pagina382() {

 }

 public void pagina383() {

 }

 public void pagina384() {

 }

 public void pagina385() {

 }

 public void pagina386() {

 }

 public void pagina387() {

 }

 public void pagina388() {

 }

 public void pagina389() {

 }

 public void pagina390() {

 }

 public void pagina391() {

 }

 public void pagina392() {

 }

 public void pagina393() {

 }

 public void pagina394() {

 }

 public void pagina395() {

 }

 public void pagina396() {

 }

 public void pagina397() {

 }

 public void pagina398() {

 }

 public void pagina399() {

 }

 public void pagina400() {

 }






}


