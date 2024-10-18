
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorDeAcciones implements ActionListener {

    GameManager gm;

    public ControladorDeAcciones(GameManager gm) {
        this.gm = gm;
    }


    public void actionPerformed(ActionEvent e) {
        int opcion = Integer.parseInt(e.getActionCommand());
        System.out.println(e.getActionCommand());
        gm.ui.reproductorUI.detenerSonido();
        gm.ui.detenerAnimacion();
        switch (opcion) {
            case 2:
                gm.h.menu(2);
                break;
            case 3: {
                gm.h.menu(3);
                break;
            }
            case 4: {
                gm.h.menu(4);
                break;
            }
            case 5: {
                gm.h.menu(5);
                break;
            }
            case 6: {

                gm.h.menu(6);
            }
            break;
            case 7: {

                gm.h.menu(7);
            }
            break;
            case 8: {

                gm.h.menu(8);
            }
            break;
            case 9: {
                gm.h.menu(9);
            }
            break;
            case 10: {
                gm.h.menu(10);
            }
            break;
            case 11: {
                gm.h.menu(11);
            }
            break;
            case 12: {
                gm.h.menu(12);
            }
            break;
            case 13: {
                gm.h.menu(13);
            }
            break;
            case 14: {
                gm.h.menu(14);
            }
            break;
            case 15: {
                gm.h.menu(15);
            }
            break;

            case 16: {
                gm.h.menu(16);
            }
            break;
            case 17: {
                gm.h.menu(17);
            }
            break;
            case 18: {
                gm.h.menu(18);
            }
            break;
            case 19: {
                gm.h.menu(19);
            }
            break;
            case 20: {
                gm.h.menu(20);
            }
            break;
            case 21: {
                gm.h.menu(21);
            }
            break;

            case 22: {
                gm.h.menu(22);
            }
            break;
            case 23: {
                gm.h.menu(23);
            }
            break;
            case 24: {
                gm.h.menu(24);
            }
            break;
            case 25: {
                gm.h.menu(25);
            }
            break;
            case 26: {
                gm.h.menu(26);
            }
            break;
            case 27: {
                gm.h.menu(27);
            }
            break;
            case 28: {
                gm.h.menu(28);
            }
            break;
            case 29: {
                gm.h.menu(29);
            }
            break;
            case 30: {
                gm.h.menu(30);
            }
            break;
            case 31: {
                gm.h.menu(31);
            }
            break;
            case 32: {
                gm.h.menu(32);
            }
            break;

            case 33: {
                if (gm.ui.bgPanel[32] != null) {
                    gm.ui.bgPanel[32].setVisible(false);
                }
                gm.h.menu(33);
            }
            break;

            case 34: {
                if (gm.ui.bgPanel[32] != null) {
                    gm.ui.bgPanel[32].setVisible(false);
                }
                gm.h.menu(34);
            }
            break;
            case 35: {
                if (gm.ui.bgPanel[32] != null) {
                    gm.ui.bgPanel[32].setVisible(false);
                }
                gm.h.menu(35);
            }
            break;
            case 36: {

                if (gm.ui.bgPanel[33] != null) {

                    gm.ui.bgPanel[33].setVisible(false);
                } else if (gm.ui.bgPanel[34] != null) {
                    gm.ui.bgPanel[34].setVisible(false);

                }
                gm.h.menu(36);
            }
            break;
            case 37: {
                gm.h.menu(37);
            }
            break;
            case 38: {
                gm.h.menu(38);
            }
            break;

            case 39: {
                gm.h.menu(39);
            }
            break;

            case 40: {
                if (gm.ui.bgPanel[39] != null) {
                    gm.ui.bgPanel[39].setVisible(false);
                }
                gm.h.menu(40);
            }
            break;
            case 41: {
                if (gm.ui.bgPanel[39] != null) {
                    gm.ui.bgPanel[39].setVisible(false);
                }
                gm.h.menu(41);
            }
            break;
            case 42: {
                if (gm.ui.bgPanel[39] != null) {
                    gm.ui.bgPanel[39].setVisible(false);
                }
                gm.h.menu(42);
            }
            break;
            case 43: {
                if (gm.ui.bgPanel[40] != null) {

                    gm.ui.bgPanel[40].setVisible(false);
                } else if (gm.ui.bgPanel[41] != null) {
                    gm.ui.bgPanel[41].setVisible(false);

                }
                gm.h.menu(43);
            }
            break;
            case 44: {
                gm.h.menu(44);
            }
            break;

            case 45: {
                gm.h.menu(45);
            }
            break;

            case 46: {
                gm.h.menu(46);
            }
            break;

            case 47: {
                gm.h.menu(47);
            }
            break;
            case 48: {
                gm.h.menu(48);
            }
            break;
            case 49: {
                gm.h.menu(49);
            }
            break;
            case 50: {
                gm.h.menu(50);
            }
            break;

            case 51: {
                gm.h.menu(51);
            }
            break;

            case 52: {
                gm.h.menu(52);
            }
            break;
            case 53: {
                gm.h.menu(53);
            }
            break;
            case 54: {
                gm.h.menu(54);
            }
            break;
            case 55: {
                gm.h.menu(55);
            }
            break;
            case 56: {
                gm.h.menu(56);
            }
            break;

            case 57: {
                gm.h.menu(57);
            }
            break;
            case 58: {
                gm.h.menu(58);
            }
            break;
            case 59: {
                gm.h.menu(59);
            }
            break;
            case 60: {
                gm.h.menu(60);
            }
            break;
            case 61: {
                gm.h.menu(61);
            }
            break;

            case 62: {
                gm.h.menu(62);
            }
            break;

            case 63: {
                gm.h.menu(63);
            }
            break;
            case 64: {
                gm.h.menu(64);
            }
            break;
            case 65: {
                gm.h.menu(65);
            }
            break;
            case 66: {
                gm.h.menu(66);
            }
            break;
            case 67: {
                gm.h.menu(67);
            }
            break;

            case 68: {
                gm.h.menu(68);
            }
            break;

            case 69: {
                gm.h.menu(69);
            }
            break;
            case 70: {
                gm.h.menu(70);
            }
            break;
            case 71: {
                gm.h.menu(71);
            }
            break;
            case 72: {
                gm.h.menu(72);
            }
            break;
            case 73: {
                gm.h.menu(73);
            }
            break;

            case 74: {
                gm.h.menu(74);
            }
            break;

            case 75: {
                gm.h.menu(75);
            }
            break;
            case 76: {
                gm.h.menu(76);
            }
            break;
            case 77: {
                gm.h.menu(77);
            }
            break;
            case 78: {
                gm.h.menu(78);
            }
            break;

            case 79: {
                gm.h.menu(79);
            }
            break;

            case 80: {
                gm.h.menu(80);
            }
            break;
            case 81:
                gm.h.menu(81);
                break;
            case 82: {
                gm.h.menu(82);
            }
            break;
            case 83: {
                gm.h.menu(83);
            }
            break;
            case 84: {
                gm.h.menu(84);
            }
            break;
            case 85: {
                gm.h.menu(85);
            }
            break;

            case 86: {
                gm.h.menu(86);
            }
            break;

            case 87: {
                gm.h.menu(87);
            }
            break;
            case 88: {
                gm.h.menu(88);
            }
            break;
            case 89: {
                gm.h.menu(89);
            }
            break;
            case 90: {
                gm.h.menu(90);
            }
            break;
            case 91: {
                gm.h.menu(91);
            }
            break;

            case 92: {
                gm.h.menu(92);
            }
            break;

            case 93: {
                gm.h.menu(93);
            }
            break;
            case 94: {
                gm.h.menu(94);
            }
            break;
            case 95: {
                gm.h.menu(95);
            }
            break;
            case 96: {
                gm.h.menu(96);
            }
            break;
            case 97: {
                gm.h.menu(97);
            }
            break;

            case 98: {
                gm.h.menu(98);
            }
            break;

            case 99: {
                gm.h.menu(99);
            }
            break;
            case 100: {
                gm.h.menu(100);
            }
            break;
            case 101: {
                gm.h.menu(101);
            }
            break;
            case 102: {
                gm.h.menu(102);
            }
            break;
            case 103: {
                gm.h.menu(103);
            }
            break;
            case 104: {
                gm.h.menu(104);
            }
            break;
            case 105: {
                gm.h.menu(105);
            }
            break;
            case 106: {
                gm.h.menu(106);
            }
            break;
            case 107: {
                gm.h.menu(107);
            }
            break;
            case 108: {
                gm.h.menu(108);
            }
            break;
            case 109: {
                gm.h.menu(109);
            }
            break;
            case 110: {
                gm.h.menu(110);
            }
            break;
            case 111: {
                gm.h.menu(111);
            }
            break;
            case 112: {
                gm.h.menu(112);
            }
            break;
            case 113: {
                gm.h.menu(113);
            }
            break;
            case 114: {
                gm.h.menu(114);
            }
            break;
            case 115: {
                gm.h.menu(115);
            }
            break;
            case 116: {
                gm.h.menu(116);
            }
            break;
            case 117: {
                gm.h.menu(117);
            }
            break;
            case 118: {
                gm.h.menu(118);
            }
            break;
            case 119: {
                gm.h.menu(119);
            }
            break;
            case 120:
                gm.h.menu(120);
                break;
            case 121:
                gm.h.menu(121);
                break;
            case 122: {
                gm.h.menu(122);
            }
            break;
            case 123: {
                gm.h.menu(123);
            }
            break;
            case 124: {
                gm.h.menu(124);
            }
            break;
            case 125: {
                gm.h.menu(125);
            }
            break;
            case 126: {
                gm.h.menu(126);
            }
            break;
            case 127: {
                gm.h.menu(127);
            }
            break;
            case 128: {
                gm.h.menu(128);
            }
            break;
            case 129: {
                gm.h.menu(129);
            }
            break;
            case 130: {
                gm.h.menu(130);
            }
            break;
            case 131: {
                gm.h.menu(131);
            }
            break;
            case 132: {
                gm.h.menu(132);
            }
            break;
            case 133: {
                gm.h.menu(133);
            }
            break;
            case 134: {
                gm.h.menu(134);
            }
            break;
            case 135: {
                gm.h.menu(135);
            }
            break;
            case 136: {
                gm.h.menu(136);
            }
            break;
            case 137: {
                gm.h.menu(137);
            }
            break;
            case 138: {
                gm.h.menu(138);
            }
            break;
            case 139: {
                gm.h.menu(139);
            }
            break;
            case 140: {
                gm.h.menu(140);
            }
            break;
            case 141: {
                gm.h.menu(141);
            }
            break;
            case 142: {
                gm.h.menu(142);
            }
            break;
            case 143: {
                gm.h.menu(143);
            }
            break;
            case 144: {
                gm.h.menu(144);
            }
            break;
            case 145: {
                gm.h.menu(145);
            }
            break;
            case 146: {
                gm.h.menu(146);
            }
            break;
            case 147: {
                gm.h.menu(147);
            }
            break;
            case 148: {
                gm.h.menu(148);
            }
            break;
            case 149: {
                gm.h.menu(149);
            }
            break;
            case 150: {
                gm.h.menu(150);
            }
            break;
            case 151: {
                gm.h.menu(151);
            }
            break;
            case 152: {
                gm.h.menu(152);
            }
            break;
            case 153: {
                gm.h.menu(153);
            }
            break;
            case 154: {
                gm.h.menu(154);
            }
            break;
            case 155: {
                gm.h.menu(155);
            }
            break;
            case 156: {
                gm.h.menu(156);
            }
            break;
            case 157: {
                gm.h.menu(157);
            }
            break;
            case 158: {
                gm.h.menu(158);
            }
            break;
            case 159: {
                gm.h.menu(159);
            }
            break;
            case 160: {
                gm.h.menu(160);
            }
            break;
            case 161: {
                gm.h.menu(161);
            }
            break;
            case 162: {
                gm.h.menu(162);
            }
            break;
            case 163: {
                gm.h.menu(163);
            }
            break;
            case 164: {
                gm.h.menu(164);
            }
            break;
            case 165: {
                gm.h.menu(165);
            }
            break;
            case 166: {
                gm.h.menu(166);
            }
            break;
            case 167: {
                gm.h.menu(167);
            }
            break;
            case 168: {
                gm.h.menu(168);
            }
            break;
            case 169: {
                gm.h.menu(169);
            }
            break;
            case 170: {
                gm.h.menu(170);
            }
            break;
            case 171: {
                gm.h.menu(171);
            }
            break;
            case 172: {
                gm.h.menu(172);
            }
            break;
            case 173: {
                gm.h.menu(173);
            }
            break;
            case 174: {
                gm.h.menu(174);
            }
            break;
            case 175: {
                gm.h.menu(175);
            }
            break;
            case 176: {
                gm.h.menu(176);
            }
            break;
            case 177: {
                gm.h.menu(177);
            }
            break;
            case 178: {
                gm.h.menu(178);
            }
            break;
            case 179: {
                gm.h.menu(179);
            }
            break;
            case 180: {
                gm.h.menu(180);
            }
            break;
            case 181: {
                gm.h.menu(181);
            }
            break;
            case 182: {
                gm.h.menu(182);
            }
            break;
            case 183: {
                gm.h.menu(183);
            }
            break;
            case 184: {
                gm.h.menu(184);
            }
            break;
            case 185: {
                gm.h.menu(185);
            }
            break;
            case 186: {
                gm.h.menu(186);
            }
            break;
            case 187: {
                gm.h.menu(187);
            }
            break;
            case 188: {
                gm.h.menu(188);
            }
            break;
            case 189: {
                gm.h.menu(189);
            }
            break;
            case 190: {
                gm.h.menu(190);
            }
            break;
            case 191: {
                gm.h.menu(191);
            }
            break;
            case 192: {
                gm.h.menu(192);
            }
            break;
            case 193: {
                gm.h.menu(193);
            }
            break;
            case 194: {
                gm.h.menu(194);
            }
            break;
            case 195: {
                gm.h.menu(195);
            }
            break;
            case 196: {
                gm.h.menu(196);
            }
            break;
            case 197: {
                gm.h.menu(197);
            }
            break;
            case 198: {
                gm.h.menu(198);
            }
            break;
            case 199: {
                gm.h.menu(199);
            }
            break;
            case 200: {
                gm.h.menu(200);
            }
            break;
            case 201: {
                gm.h.menu(201);
            }
            break;
            case 202: {
                gm.h.menu(202);
            }
            break;
            case 203: {
                gm.h.menu(203);
            }
            break;
            case 204: {
                gm.h.menu(204);
            }
            break;
            case 205: {
                gm.h.menu(205);
            }
            break;
            case 206: {
                gm.h.menu(206);
            }
            break;
            case 207: {
                gm.h.menu(207);
            }
            break;
            case 208: {
                gm.h.menu(208);
            }
            break;
            case 209: {
                gm.h.menu(209);
            }
            break;
            case 210: {
                gm.h.menu(210);
            }
            break;
            case 211: {
                gm.h.menu(211);
            }
            break;
            case 212: {
                gm.h.menu(212);
            }
            break;
            case 213: {
                gm.h.menu(213);
            }
            break;
            case 214: {
                gm.h.menu(214);
            }
            break;
            case 215: {
                gm.h.menu(215);
            }
            break;
            case 216: {
                gm.h.menu(216);
            }
            break;
            case 217: {
                gm.h.menu(217);
            }
            break;
            case 218: {
                gm.h.menu(218);
            }
            break;
            case 219: {
                gm.h.menu(219);
            }
            break;
            case 220: {
                gm.h.menu(220);
            }
            break;
            case 221: {
                gm.h.menu(221);
            }
            break;
            case 222: {
                gm.h.menu(222);
            }
            break;
            case 223: {
                gm.h.menu(223);
            }
            break;
            case 224: {
                gm.h.menu(224);
            }
            break;
            case 225: {
                gm.h.menu(225);
            }
            break;
            case 226: {
                gm.h.menu(226);
            }
            break;
            case 227: {
                gm.h.menu(227);
            }
            break;
            case 228: {
                gm.h.menu(228);
            }
            break;
            case 229: {
                gm.h.menu(229);
            }
            break;
            case 230: {
                gm.h.menu(230);
            }
            break;
            case 231: {
                gm.h.menu(231);
            }
            break;
            case 232: {


                gm.h.menu(232);
            }
            break;
            case 233: {
                gm.h.menu(233);
            }
            break;
            case 234: {
                gm.h.menu(234);
            }
            break;
            case 235: {
                gm.h.menu(235);
            }
            break;
            case 236: {
                gm.h.menu(236);
            }
            break;
            case 237: {
                gm.h.menu(237);
            }
            break;
            case 238: {
                gm.h.menu(238);
            }
            break;
            case 239: {
                gm.h.menu(239);
            }
            break;
            case 240: {
                gm.h.menu(240);
            }
            break;
            case 241: {
                gm.h.menu(241);
            }
            break;
            case 242: {
                gm.h.menu(242);
            }
            break;
            case 243: {
                gm.h.menu(243);
            }
            break;
            case 244: {
                gm.h.menu(244);
            }
            break;
            case 245: {
                gm.h.menu(245);
            }
            break;
            case 246: {
                gm.h.menu(246);
            }
            break;
            case 247: {
                gm.h.menu(247);
            }
            break;
            case 248: {
                gm.h.menu(248);
            }
            break;
            case 249: {
                gm.h.menu(249);
            }
            break;
            case 250: {
                gm.h.menu(250);
            }
            break;
            case 251: {
                gm.h.menu(251);
            }
            break;
            case 252: {
                gm.h.menu(252);
            }
            break;
            case 253: {
                gm.h.menu(253);
            }
            break;
            case 254: {
                gm.h.menu(254);
            }
            break;
            case 255: {
                gm.h.menu(255);
            }
            break;
            case 256: {
                gm.h.menu(256);
            }
            break;
            case 257: {
                gm.h.menu(257);
            }
            break;
            case 258: {
                gm.h.menu(258);
            }
            break;
            case 259: {
                gm.h.menu(259);
            }
            break;
            case 260: {
                gm.h.menu(260);
            }
            break;
            case 261: {
                gm.h.menu(261);
            }
            break;
            case 262: {
                gm.h.menu(262);
            }
            break;
            case 263: {
                gm.h.menu(263);
            }
            break;
            case 264: {
                gm.h.menu(264);
            }
            break;
            case 265: {
                gm.h.menu(265);
            }
            break;
            case 266: {
                gm.h.menu(266);
            }
            break;
            case 267: {
                gm.h.menu(267);
            }
            break;
            case 268: {
                gm.h.menu(268);
            }
            break;
            case 269: {
                gm.h.menu(269);
            }
            break;
            case 270: {
                gm.h.menu(270);
            }
            break;
            case 271: {
                gm.h.menu(271);
            }
            break;
            case 272: {
                gm.h.menu(272);
            }
            break;
            case 273: {
                gm.h.menu(273);
            }
            break;
            case 274: {
                gm.h.menu(274);
            }
            break;
            case 275: {
                gm.h.menu(275);
            }
            break;
            case 276: {
                gm.h.menu(276);
            }
            break;
            case 277: {
                gm.h.menu(277);
            }
            break;
            case 278: {
                gm.h.menu(278);
            }
            break;
            case 279: {
                gm.h.menu(279);
            }
            break;
            case 280: {
                gm.h.menu(280);
            }
            break;
            case 281: {
                gm.h.menu(281);
            }
            break;
            case 282: {
                gm.h.menu(282);
            }
            break;
            case 283: {
                gm.h.menu(283);
            }
            break;
            case 284: {
                gm.h.menu(284);
            }
            break;
            case 285: {
                gm.h.menu(285);
            }
            break;
            case 286: {
                gm.h.menu(286);
            }
            break;
            case 287: {
                gm.h.menu(287);
            }
            break;
            case 288: {
                gm.h.menu(288);
            }
            break;
            case 289: {
                gm.h.menu(289);
            }
            break;
            case 290: {
                gm.h.menu(290);
            }
            break;
            case 291: {
                gm.h.menu(291);
            }
            break;
            case 292: {
                gm.h.menu(292);
            }
            break;
            case 293: {
                gm.h.menu(293);
            }
            break;
            case 294: {
                gm.h.menu(294);
            }
            break;
            case 295: {
                gm.h.menu(295);
            }
            break;
            case 296: {
                gm.h.menu(296);
            }
            break;
            case 297: {
                gm.h.menu(297);
            }
            break;
            case 298: {
                gm.h.menu(298);
            }
            break;
            case 299: {
                gm.h.menu(299);
            }
            break;
            case 300: {
                gm.h.menu(300);
            }
            break;
            case 301: {
                gm.h.menu(301);
            }
            break;
            case 302: {
                gm.h.menu(302);
            }
            break;
            case 303: {
                gm.h.menu(303);
            }
            break;
            case 304: {
                gm.h.menu(304);
            }
            break;
            case 305: {
                gm.h.menu(305);
            }
            break;
            case 306: {
                gm.h.menu(306);
            }
            break;
            case 307: {
                gm.h.menu(307);
            }
            break;
            case 308: {
                gm.h.menu(308);
            }
            break;
            case 309: {
                gm.h.menu(309);
            }
            break;
            case 310: {
                gm.h.menu(310);
            }
            break;
            case 311: {
                gm.h.menu(311);
            }
            break;
            case 312: {
                gm.h.menu(312);
            }
            break;
            case 313: {
                gm.h.menu(313);
            }
            break;
            case 314: {
                gm.h.menu(314);
            }
            break;
            case 315: {
                gm.h.menu(315);
            }
            break;
            case 316: {
                gm.h.menu(316);
            }
            break;
            case 317: {
                gm.h.menu(317);
            }
            break;
            case 318: {
                gm.h.menu(318);
            }
            break;
            case 319: {
                gm.h.menu(319);
            }
            break;
            case 320: {
                gm.h.menu(320);
            }
            break;
            case 321: {
                gm.h.menu(321);
            }
            break;
            case 322: {
                gm.h.menu(322);
            }
            break;
            case 323: {
                gm.h.menu(323);
            }
            break;
            case 324: {
                gm.h.menu(324);
            }
            break;
            case 325: {
                gm.h.menu(325);
            }
            break;
            case 326: {
                gm.h.menu(326);
            }
            break;
            case 327: {
                gm.h.menu(327);
            }
            break;
            case 328: {
                gm.h.menu(328);
            }
            break;
            case 329: {
                gm.h.menu(329);
            }
            break;
            case 330: {
                gm.h.menu(330);
            }
            break;
            case 331: {
                gm.h.menu(331);
            }
            break;
            case 332: {
                gm.h.menu(332);
            }
            break;
            case 333: {
                gm.h.menu(333);
            }
            break;
            case 334: {
                gm.h.menu(334);
            }
            break;
            case 335: {
                gm.h.menu(335);
            }
            break;
            case 336: {
                gm.h.menu(336);
            }
            break;
            case 337: {
                gm.h.menu(337);
            }
            break;
            case 338: {
                gm.h.menu(338);
            }
            break;
            case 339: {
                gm.h.menu(339);
            }
            break;
            case 340: {
                gm.h.menu(340);
            }
            break;
            case 341: {
                gm.h.menu(341);
            }
            break;
            case 342: {
                gm.h.menu(342);
            }
            break;
            case 343: {
                gm.h.menu(343);
            }
            break;
            case 344: {
                gm.h.menu(344);
            }
            break;
            case 345: {
                gm.h.menu(345);
            }
            break;
            case 346: {
                gm.h.menu(346);
            }
            break;
            case 347: {
                gm.h.menu(347);
            }
            break;
            case 348: {
                gm.h.menu(348);
            }
            break;
            case 349: {
                gm.h.menu(349);
            }
            break;
            case 350: {
                gm.h.menu(350);
            }
            break;
            case 351: {
                gm.h.menu(351);
            }
            break;
            case 352: {
                gm.h.menu(352);
            }
            break;
            case 353: {
                gm.h.menu(353);
            }
            break;
            case 354: {
                gm.h.menu(354);
            }
            break;
            case 355: {
                gm.h.menu(355);
            }
            break;
            case 356: {
                gm.h.menu(356);
            }
            break;
            case 357: {
                gm.h.menu(357);
            }
            break;
            case 358: {
                gm.h.menu(358);
            }
            break;
            case 359: {
                gm.h.menu(359);
            }
            break;
            case 360: {
                gm.h.menu(360);
            }
            break;
            case 361: {
                gm.h.menu(361);
            }
            break;
            case 362: {
                gm.h.menu(362);
            }
            break;
            case 363: {
                gm.h.menu(363);
            }
            break;
            case 364: {
                gm.h.menu(364);
            }
            break;
            case 365: {
                gm.h.menu(365);
            }
            break;
            case 366: {
                gm.h.menu(366);
            }
            break;
            case 367: {
                gm.h.menu(367);
            }
            break;
            case 368: {
                gm.h.menu(368);
            }
            break;
            case 369: {
                gm.h.menu(369);
            }
            break;
            case 370: {
                gm.h.menu(370);
            }
            break;
            case 371: {
                gm.h.menu(371);
            }
            break;
            case 372: {
                gm.h.menu(372);
            }
            break;
            case 373: {
                gm.h.menu(373);
            }
            break;
            case 374: {
                gm.h.menu(374);
            }
            break;
            case 375: {
                gm.h.menu(375);
            }
            break;
            case 376: {
                gm.h.menu(376);
            }
            break;
            case 377: {
                gm.h.menu(377);
            }
            break;
            case 378: {
                gm.h.menu(378);
            }
            break;
            case 379: {
                gm.h.menu(379);
            }
            break;
            case 380: {
                gm.h.menu(380);
            }
            break;
            case 381: {
                gm.h.menu(381);
            }
            break;
            case 382: {
                gm.h.menu(382);
            }
            break;
            case 383: {
                gm.h.menu(383);
            }
            break;
            case 384: {
                gm.h.menu(384);
            }
            break;
            case 385: {
                gm.h.menu(385);
            }
            break;
            case 386: {
                gm.h.menu(386);
            }
            break;
            case 387: {
                gm.h.menu(387);
            }
            break;
            case 388: {
                gm.h.menu(388);
            }
            break;
            case 389: {
                gm.h.menu(389);
            }
            break;
            case 390: {
                gm.h.menu(390);
            }
            break;
            case 391: {
                gm.h.menu(391);
            }
            break;
            case 392: {
                gm.h.menu(392);
            }
            break;
            case 393: {
                gm.h.menu(393);
            }
            break;
            case 394: {
                gm.h.menu(394);
            }
            break;
            case 395: {
                gm.h.menu(395);
            }
            break;
            case 396: {
                gm.h.menu(396);
            }
            break;
            case 397: {
                gm.h.menu(397);
            }
            break;
            case 398: {
                gm.h.menu(398);
            }
            break;
            case 399: {
                gm.h.menu(399);
            }
            break;
            case 400: {
                gm.h.menu(400);
            }
            break;
            case 401: {
                gm.h.menu(401);
            }
            break;
            case 402: {
                gm.h.menu(402);
            }
            break;
            case 403: {
                gm.h.menu(403);
            }
            break;
            case 404: {
                gm.h.menu(404);
            }
            break;
            case 405: {
                gm.h.menu(405);
            }
            break;
            case 406: {
                gm.h.menu(406);
            }
            break;
            case 407: {
                gm.h.menu(407);
            }
            break;
            case 408: {
                gm.h.menu(408);
            }
            break;
            case 409: {
                gm.h.menu(409);


            }


        }

    }
}
