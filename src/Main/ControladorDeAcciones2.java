package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorDeAcciones2 implements ActionListener {

    GameManager gm;

    public ControladorDeAcciones2(GameManager gm) {
        this.gm = gm;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int opcion = Integer.parseInt(e.getActionCommand());
        System.out.println(e.getActionCommand());
        gm.ui.reproductorUI.detenerSonido();
        gm.ui.detenerAnimacion();

        switch (opcion){

            case 1:
                gm.ui.bgPanel[2].setVisible(false);
                gm.h.menu(1);
                break;

            case 2:

                gm.ui.bgPanel[3].setVisible(false);
                gm.h.menu(2);

                break;


            case 3:
                gm.ui.bgPanel[4].setVisible(false);
                gm.h.menu(3);
                break;


            case 4:
                gm.ui.bgPanel[5].setVisible(false);
                gm.h.menu(4);
                break;

            case 5:

                if(gm.ui.bgPanel[6] == null)
                {
                    gm.ui.bgPanel[7].setVisible(false);
                }
                else
                {
                    gm.ui.bgPanel[6].setVisible(false);
                }
                gm.h.menu(5);
                break;

            case 6:
                gm.ui.bgPanel[7].setVisible(false);
                gm.h.menu(5);
                break;

            case 7:
                gm.ui.bgPanel[8].setVisible(false);
                gm.h.menu(7);
                break;

            case 8:
                gm.ui.bgPanel[9].setVisible(false);
                gm.h.menu(8);
                break;

            case 9:
                gm.ui.bgPanel[10].setVisible(false);
                gm.h.menu(9);
                break;

            case 10:
                gm.ui.bgPanel[11].setVisible(false);
                gm.h.menu(10);
                break;

            case 11:
                gm.ui.bgPanel[12].setVisible(false);
                gm.h.menu(11);
            break;
            case 12:
                gm.ui.bgPanel[13].setVisible(false);
                gm.h.menu(12);
                break;

            case 13:
                gm.ui.bgPanel[14].setVisible(false);
                gm.h.menu(13);
                break;

            case 14:
                gm.ui.bgPanel[15].setVisible(false);
                gm.h.menu(14);
                break;
            case 15:
                gm.ui.bgPanel[16].setVisible(false);
                gm.h.menu(15);
                break;
            case 16:
                gm.ui.bgPanel[17].setVisible(false);
                gm.h.menu(16);
                break;
            case 17:
                gm.ui.bgPanel[18].setVisible(false);
                gm.h.menu(17);
                break;
            case 18:
                gm.ui.bgPanel[19].setVisible(false);
                gm.h.menu(18);
                break;
            case 19:
                gm.ui.bgPanel[20].setVisible(false);
                gm.h.menu(19);
                break;
            case 20:
                gm.ui.bgPanel[21].setVisible(false);
                gm.h.menu(20);
                break;
            case 21:
                gm.ui.bgPanel[22].setVisible(false);
                gm.h.menu(21);
                break;
            case 22:
                gm.ui.bgPanel[23].setVisible(false);
                gm.h.menu(22);
                break;
            case 23:
                gm.ui.bgPanel[24].setVisible(false);
                gm.h.menu(23);
                break;
            case 24:
                gm.ui.bgPanel[25].setVisible(false);
                gm.h.menu(24);
                break;
            case 25:
                gm.ui.bgPanel[26].setVisible(false);
                gm.h.menu(25);
                break;
            case 26:
                gm.ui.bgPanel[27].setVisible(false);
                gm.h.menu(26);
                break;
            case 27:
                gm.ui.bgPanel[28].setVisible(false);
                gm.h.menu(27);
                break;
            case 28:
                gm.ui.bgPanel[29].setVisible(false);
                gm.h.menu(28);
                break;
            case 29:
                gm.ui.bgPanel[30].setVisible(false);
                gm.h.menu(29);
                break;
            case 30:
                gm.ui.bgPanel[31].setVisible(false);
                gm.h.menu(30);
                break;
            case 31:
                gm.ui.bgPanel[32].setVisible(false);
                gm.h.menu(31);
                break;
            case 32:
                gm.ui.bgPanel[33].setVisible(false);
                gm.h.menu(32);
                break;
            case 33:
                gm.ui.bgPanel[34].setVisible(false);
                gm.h.menu(33);
                break;
            case 34:
                gm.ui.bgPanel[35].setVisible(false);
                gm.h.menu(34);
                break;
            case 35:
                gm.ui.bgPanel[36].setVisible(false);
                gm.h.menu(35);
                break;
            case 36:
                gm.ui.bgPanel[37].setVisible(false);
                gm.h.menu(36);
                break;
            case 37:
                gm.ui.bgPanel[38].setVisible(false);
                gm.h.menu(37);
                break;
            case 38:
                gm.ui.bgPanel[39].setVisible(false);
                gm.h.menu(38);
                break;
            case 39:
                gm.ui.bgPanel[40].setVisible(false);
                gm.h.menu(39);
                break;
            case 40:
                gm.ui.bgPanel[41].setVisible(false);
                gm.h.menu(40);
                break;
            case 41:
                gm.ui.bgPanel[42].setVisible(false);
                gm.h.menu(41);
                break;
            case 42:
                gm.ui.bgPanel[43].setVisible(false);
                gm.h.menu(41);
                break;
            case 43:
                gm.ui.bgPanel[44].setVisible(false);
                gm.h.menu(43);
                break;
            case 44:
                gm.ui.bgPanel[45].setVisible(false);
                gm.h.menu(44);
                break;
            case 45:
                gm.ui.bgPanel[46].setVisible(false);
                gm.h.menu(45);
                break;
            case 46:
                gm.ui.bgPanel[47].setVisible(false);
                gm.h.menu(46);
                break;
            case 47:
                gm.ui.bgPanel[48].setVisible(false);
                gm.h.menu(47);
                break;
            case 48:
                gm.ui.bgPanel[49].setVisible(false);
                gm.h.menu(48);
                break;
            case 49:
                gm.ui.bgPanel[50].setVisible(false);
                gm.h.menu(49);
                break;
            case 50:
                gm.ui.bgPanel[51].setVisible(false);
                gm.h.menu(50);
                break;
            case 51:
                gm.ui.bgPanel[52].setVisible(false);
                gm.h.menu(51);
                break;
            case 52:
                gm.ui.bgPanel[53].setVisible(false);
                gm.h.menu(52);
                break;
            case 53:
                gm.ui.bgPanel[54].setVisible(false);
                gm.h.menu(53);
                break;
            case 54:
                gm.ui.bgPanel[55].setVisible(false);
                gm.h.menu(54);
                break;
            case 55:
                gm.ui.bgPanel[56].setVisible(false);
                gm.h.menu(55);
                break;
            case 56:
                gm.ui.bgPanel[57].setVisible(false);
                gm.h.menu(56);
                break;
            case 57:
                gm.ui.bgPanel[58].setVisible(false);
                gm.h.menu(57);
                break;
            case 58:
                gm.ui.bgPanel[59].setVisible(false);
                gm.h.menu(58);
                break;
            case 59:
                gm.ui.bgPanel[60].setVisible(false);
                gm.h.menu(59);
                break;
            case 60:
                gm.ui.bgPanel[61].setVisible(false);
                gm.h.menu(60);
                break;
            case 61:
                gm.ui.bgPanel[62].setVisible(false);
                gm.h.menu(61);
                break;
            case 62:
                gm.ui.bgPanel[63].setVisible(false);
                gm.h.menu(62);
                break;
            case 63:
                gm.ui.bgPanel[64].setVisible(false);
                gm.h.menu(63);
                break;
            case 64:
                gm.ui.bgPanel[65].setVisible(false);
                gm.h.menu(64);
                break;
            case 65:
                gm.ui.bgPanel[66].setVisible(false);
                gm.h.menu(65);
                break;
            case 66:
                gm.ui.bgPanel[67].setVisible(false);
                gm.h.menu(66);
                break;
            case 67:
                gm.ui.bgPanel[68].setVisible(false);
                gm.h.menu(67);
                break;
            case 68:
                gm.ui.bgPanel[69].setVisible(false);
                gm.h.menu(68);
                break;
            case 69:
                gm.ui.bgPanel[70].setVisible(false);
                gm.h.menu(69);
                break;
            case 70:
                gm.ui.bgPanel[71].setVisible(false);
                gm.h.menu(70);
                break;
            case 71:
                gm.ui.bgPanel[72].setVisible(false);
                gm.h.menu(71);
                break;
            case 72:
                gm.ui.bgPanel[73].setVisible(false);
                gm.h.menu(72);
                break;
            case 73:
                gm.ui.bgPanel[74].setVisible(false);
                gm.h.menu(73);
                break;
            case 74:
                gm.ui.bgPanel[75].setVisible(false);
                gm.h.menu(74);
                break;
            case 75:
                gm.ui.bgPanel[76].setVisible(false);
                gm.h.menu(75);
                break;
            case 76:
                gm.ui.bgPanel[77].setVisible(false);
                gm.h.menu(76);
                break;
            case 77:
                gm.ui.bgPanel[78].setVisible(false);
                gm.h.menu(77);
                break;
            case 78:
                gm.ui.bgPanel[79].setVisible(false);
                gm.h.menu(78);
                break;
            case 79:
                gm.ui.bgPanel[80].setVisible(false);
                gm.h.menu(79);
                break;
            case 80:
                gm.ui.bgPanel[81].setVisible(false);
                gm.h.menu(80);
                break;
            case 81:
                gm.ui.bgPanel[82].setVisible(false);
                gm.h.menu(81);
                break;
            case 82:
                gm.ui.bgPanel[83].setVisible(false);
                gm.h.menu(81);
                break;
            case 83:
                gm.ui.bgPanel[84].setVisible(false);
                gm.h.menu(83);
                break;
            case 84:
                gm.ui.bgPanel[85].setVisible(false);
                gm.h.menu(84);
                break;
            case 85:
                gm.ui.bgPanel[86].setVisible(false);
                gm.h.menu(85);
                break;
            case 86:
                gm.ui.bgPanel[87].setVisible(false);
                gm.h.menu(86);
                break;
            case 87:
                gm.ui.bgPanel[88].setVisible(false);
                gm.h.menu(87);
                break;
            case 88:
                gm.ui.bgPanel[89].setVisible(false);
                gm.h.menu(88);
                break;
            case 89:
                gm.ui.bgPanel[90].setVisible(false);
                gm.h.menu(89);
                break;
            case 90:
                gm.ui.bgPanel[91].setVisible(false);
                gm.h.menu(90);
                break;
            case 91:
                gm.ui.bgPanel[92].setVisible(false);
                gm.h.menu(91);
                break;
            case 92:
                gm.ui.bgPanel[93].setVisible(false);
                gm.h.menu(92);
                break;
            case 93:
                gm.ui.bgPanel[94].setVisible(false);
                gm.h.menu(93);
                break;
            case 94:
                gm.ui.bgPanel[95].setVisible(false);
                gm.h.menu(94);
                break;
            case 95:
                gm.ui.bgPanel[96].setVisible(false);
                gm.h.menu(95);
                break;
            case 96:
                gm.ui.bgPanel[97].setVisible(false);
                gm.h.menu(96);
                break;
            case 97:
                gm.ui.bgPanel[98].setVisible(false);
                gm.h.menu(97);
                break;
            case 98:
                gm.ui.bgPanel[99].setVisible(false);
                gm.h.menu(98);
                break;
            case 99:
                gm.ui.bgPanel[100].setVisible(false);
                gm.h.menu(99);
                break;
            case 100:
                gm.ui.bgPanel[101].setVisible(false);
                gm.h.menu(100);
                break;
            case 101:
                gm.ui.bgPanel[102].setVisible(false);
                gm.h.menu(101);
                break;
            case 102:
                gm.ui.bgPanel[103].setVisible(false);
                gm.h.menu(102);
                break;
            case 103:
                gm.ui.bgPanel[104].setVisible(false);
                gm.h.menu(103);
                break;
            case 104:
                gm.ui.bgPanel[105].setVisible(false);
                gm.h.menu(104);
                break;
            case 105:
                gm.ui.bgPanel[106].setVisible(false);
                gm.h.menu(105);
                break;
            case 106:
                gm.ui.bgPanel[107].setVisible(false);
                gm.h.menu(106);
                break;
            case 107:
                gm.ui.bgPanel[108].setVisible(false);
                gm.h.menu(107);
                break;
            case 108:
                gm.ui.bgPanel[109].setVisible(false);
                gm.h.menu(108);
                break;
            case 109:
                gm.ui.bgPanel[110].setVisible(false);
                gm.h.menu(109);
                break;
            case 110:
                gm.ui.bgPanel[111].setVisible(false);
                gm.h.menu(110);
                break;
            case 111:
                gm.ui.bgPanel[112].setVisible(false);
                gm.h.menu(111);
                break;
            case 112:
                gm.ui.bgPanel[113].setVisible(false);
                gm.h.menu(112);
                break;
            case 113:
                gm.ui.bgPanel[114].setVisible(false);
                gm.h.menu(113);
                break;
            case 114:
                gm.ui.bgPanel[115].setVisible(false);
                gm.h.menu(114);
                break;
            case 115:
                gm.ui.bgPanel[116].setVisible(false);
                gm.h.menu(115);
                break;
            case 116:
                gm.ui.bgPanel[117].setVisible(false);
                gm.h.menu(116);
                break;
            case 117:
                gm.ui.bgPanel[118].setVisible(false);
                gm.h.menu(117);
                break;
            case 118:
                gm.ui.bgPanel[119].setVisible(false);
                gm.h.menu(118);
                break;
            case 119:
                gm.ui.bgPanel[120].setVisible(false);
                gm.h.menu(119);
                break;
            case 120:
                gm.ui.bgPanel[121].setVisible(false);
                gm.h.menu(120);
                break;
            case 121:
                gm.ui.bgPanel[122].setVisible(false);
                gm.h.menu(121);
                break;
            case 122:
                gm.ui.bgPanel[123].setVisible(false);
                gm.h.menu(122);
                break;
            case 123:
                gm.ui.bgPanel[124].setVisible(false);
                gm.h.menu(123);
                break;
            case 124:
                gm.ui.bgPanel[125].setVisible(false);
                gm.h.menu(124);
                break;
            case 125:
                gm.ui.bgPanel[126].setVisible(false);
                gm.h.menu(125);
                break;
            case 126:
                gm.ui.bgPanel[127].setVisible(false);
                gm.h.menu(126);
                break;
            case 127:
                gm.ui.bgPanel[128].setVisible(false);
                gm.h.menu(127);
                break;
            case 128:
                gm.ui.bgPanel[129].setVisible(false);
                gm.h.menu(128);
                break;
            case 129:
                gm.ui.bgPanel[130].setVisible(false);
                gm.h.menu(129);
                break;
            case 130:
                gm.ui.bgPanel[131].setVisible(false);
                gm.h.menu(130);
                break;
            case 131:
                gm.ui.bgPanel[132].setVisible(false);
                gm.h.menu(131);
                break;
            case 132:
                gm.ui.bgPanel[133].setVisible(false);
                gm.h.menu(132);
                break;
            case 133:
                gm.ui.bgPanel[134].setVisible(false);
                gm.h.menu(133);
                break;
            case 134:
                gm.ui.bgPanel[135].setVisible(false);
                gm.h.menu(134);
                break;
            case 135:
                gm.ui.bgPanel[136].setVisible(false);
                gm.h.menu(135);
                break;
            case 136:
                gm.ui.bgPanel[137].setVisible(false);
                gm.h.menu(136);
                break;
            case 137:
                gm.ui.bgPanel[138].setVisible(false);
                gm.h.menu(137);
                break;
            case 138:
                gm.ui.bgPanel[139].setVisible(false);
                gm.h.menu(138);
                break;
            case 139:
                gm.ui.bgPanel[140].setVisible(false);
                gm.h.menu(139);
                break;
            case 140:
                gm.ui.bgPanel[141].setVisible(false);
                gm.h.menu(140);
                break;
            case 141:
                gm.ui.bgPanel[142].setVisible(false);
                gm.h.menu(141);
                break;
            case 142:
                gm.ui.bgPanel[143].setVisible(false);
                gm.h.menu(142);
                break;
            case 143:
                gm.ui.bgPanel[144].setVisible(false);
                gm.h.menu(143);
                break;
            case 144:
                gm.ui.bgPanel[145].setVisible(false);
                gm.h.menu(144);
                break;
            case 145:
                gm.ui.bgPanel[146].setVisible(false);
                gm.h.menu(145);
                break;
            case 146:
                gm.ui.bgPanel[147].setVisible(false);
                gm.h.menu(146);
                break;
            case 147:
                gm.ui.bgPanel[148].setVisible(false);
                gm.h.menu(147);
                break;
            case 148:
                gm.ui.bgPanel[149].setVisible(false);
                gm.h.menu(148);
                break;
            case 149:
                gm.ui.bgPanel[150].setVisible(false);
                gm.h.menu(149);
                break;
            case 150:
                gm.ui.bgPanel[151].setVisible(false);
                gm.h.menu(150);
                break;
            case 151:
                gm.ui.bgPanel[152].setVisible(false);
                gm.h.menu(151);
                break;
            case 152:
                gm.ui.bgPanel[153].setVisible(false);
                gm.h.menu(152);
                break;
            case 153:
                gm.ui.bgPanel[154].setVisible(false);
                gm.h.menu(153);
                break;
            case 154:
                gm.ui.bgPanel[155].setVisible(false);
                gm.h.menu(154);
                break;
            case 155:
                gm.ui.bgPanel[156].setVisible(false);
                gm.h.menu(155);
                break;
            case 156:
                gm.ui.bgPanel[157].setVisible(false);
                gm.h.menu(156);
                break;
            case 157:
                gm.ui.bgPanel[158].setVisible(false);
                gm.h.menu(157);
                break;
            case 158:
                gm.ui.bgPanel[159].setVisible(false);
                gm.h.menu(158);
                break;
            case 159:
                gm.ui.bgPanel[160].setVisible(false);
                gm.h.menu(159);
                break;
            case 160:
                gm.ui.bgPanel[161].setVisible(false);
                gm.h.menu(160);
                break;
            case 161:
                gm.ui.bgPanel[162].setVisible(false);
                gm.h.menu(161);
                break;
            case 162:
                gm.ui.bgPanel[163].setVisible(false);
                gm.h.menu(162);
                break;
            case 163:
                gm.ui.bgPanel[164].setVisible(false);
                gm.h.menu(163);
                break;
            case 164:
                gm.ui.bgPanel[165].setVisible(false);
                gm.h.menu(164);
                break;
            case 165:
                gm.ui.bgPanel[166].setVisible(false);
                gm.h.menu(165);
                break;
            case 166:
                gm.ui.bgPanel[167].setVisible(false);
                gm.h.menu(166);
                break;
            case 167:
                gm.ui.bgPanel[168].setVisible(false);
                gm.h.menu(167);
                break;
            case 168:
                gm.ui.bgPanel[169].setVisible(false);
                gm.h.menu(168);
                break;
            case 169:
                gm.ui.bgPanel[170].setVisible(false);
                gm.h.menu(169);
                break;
            case 170:
                gm.ui.bgPanel[171].setVisible(false);
                gm.h.menu(170);
                break;
            case 171:
                gm.ui.bgPanel[172].setVisible(false);
                gm.h.menu(171);
                break;
            case 172:
                gm.ui.bgPanel[173].setVisible(false);
                gm.h.menu(172);
                break;
            case 173:
                gm.ui.bgPanel[174].setVisible(false);
                gm.h.menu(173);
                break;
            case 174:
                gm.ui.bgPanel[175].setVisible(false);
                gm.h.menu(174);
                break;
            case 175:
                gm.ui.bgPanel[176].setVisible(false);
                gm.h.menu(175);
                break;
            case 176:
                gm.ui.bgPanel[177].setVisible(false);
                gm.h.menu(176);
                break;
            case 177:
                gm.ui.bgPanel[178].setVisible(false);
                gm.h.menu(177);
                break;
            case 178:
                gm.ui.bgPanel[179].setVisible(false);
                gm.h.menu(178);
                break;
            case 179:
                gm.ui.bgPanel[180].setVisible(false);
                gm.h.menu(179);
                break;
            case 180:
                gm.ui.bgPanel[181].setVisible(false);
                gm.h.menu(180);
                break;
            case 181:
                gm.ui.bgPanel[182].setVisible(false);
                gm.h.menu(181);
                break;
            case 182:
                gm.ui.bgPanel[183].setVisible(false);
                gm.h.menu(182);
                break;
            case 183:
                gm.ui.bgPanel[184].setVisible(false);
                gm.h.menu(183);
                break;
            case 184:
                gm.ui.bgPanel[185].setVisible(false);
                gm.h.menu(184);
                break;
            case 185:
                gm.ui.bgPanel[186].setVisible(false);
                gm.h.menu(185);
                break;
            case 186:
                gm.ui.bgPanel[187].setVisible(false);
                gm.h.menu(186);
                break;
            case 187:
                gm.ui.bgPanel[188].setVisible(false);
                gm.h.menu(187);
                break;
            case 188:
                gm.ui.bgPanel[189].setVisible(false);
                gm.h.menu(188);
                break;
            case 189:
                gm.ui.bgPanel[190].setVisible(false);
                gm.h.menu(189);
                break;
            case 190:
                gm.ui.bgPanel[191].setVisible(false);
                gm.h.menu(190);
                break;
            case 191:
                gm.ui.bgPanel[192].setVisible(false);
                gm.h.menu(191);
                break;
            case 192:
                gm.ui.bgPanel[193].setVisible(false);
                gm.h.menu(192);
                break;
            case 193:
                gm.ui.bgPanel[194].setVisible(false);
                gm.h.menu(193);
                break;
            case 194:
                gm.ui.bgPanel[195].setVisible(false);
                gm.h.menu(194);
                break;
            case 195:
                gm.ui.bgPanel[196].setVisible(false);
                gm.h.menu(195);
                break;
            case 196:
                gm.ui.bgPanel[197].setVisible(false);
                gm.h.menu(196);
                break;
            case 197:
                gm.ui.bgPanel[198].setVisible(false);
                gm.h.menu(197);
                break;
            case 198:
                gm.ui.bgPanel[199].setVisible(false);
                gm.h.menu(198);
                break;
            case 199:
                gm.ui.bgPanel[200].setVisible(false);
                gm.h.menu(199);
                break;
            case 200:
                gm.ui.bgPanel[201].setVisible(false);
                gm.h.menu(200);
                break;
            case 201:
                gm.ui.bgPanel[202].setVisible(false);
                gm.h.menu(201);
                break;
            case 202:
                gm.ui.bgPanel[203].setVisible(false);
                gm.h.menu(202);
                break;
            case 203:
                gm.ui.bgPanel[204].setVisible(false);
                gm.h.menu(203);
                break;
            case 204:
                gm.ui.bgPanel[205].setVisible(false);
                gm.h.menu(204);
                break;
            case 205:
                gm.ui.bgPanel[206].setVisible(false);
                gm.h.menu(205);
                break;
            case 206:
                gm.ui.bgPanel[207].setVisible(false);
                gm.h.menu(206);
                break;
            case 207:
                gm.ui.bgPanel[208].setVisible(false);
                gm.h.menu(207);
                break;
            case 208:
                gm.ui.bgPanel[209].setVisible(false);
                gm.h.menu(208);
                break;
            case 209:
                gm.ui.bgPanel[210].setVisible(false);
                gm.h.menu(209);
                break;
            case 210:
                gm.ui.bgPanel[211].setVisible(false);
                gm.h.menu(210);
                break;
            case 211:
                gm.ui.bgPanel[212].setVisible(false);
                gm.h.menu(211);
                break;
            case 212:
                gm.ui.bgPanel[213].setVisible(false);
                gm.h.menu(212);
                break;
            case 213:
                gm.ui.bgPanel[214].setVisible(false);
                gm.h.menu(213);
                break;
            case 214:
                gm.ui.bgPanel[215].setVisible(false);
                gm.h.menu(214);
                break;
            case 215:
                gm.ui.bgPanel[216].setVisible(false);
                gm.h.menu(215);
                break;
            case 216:
                gm.ui.bgPanel[217].setVisible(false);
                gm.h.menu(216);
                break;
            case 217:
                gm.ui.bgPanel[218].setVisible(false);
                gm.h.menu(217);
                break;
            case 218:
                gm.ui.bgPanel[219].setVisible(false);
                gm.h.menu(218);
                break;
            case 219:
                gm.ui.bgPanel[220].setVisible(false);
                gm.h.menu(219);
                break;
            case 220:
                gm.ui.bgPanel[221].setVisible(false);
                gm.h.menu(220);
                break;
            case 221:
                gm.ui.bgPanel[222].setVisible(false);
                gm.h.menu(221);
                break;
            case 222:
                gm.ui.bgPanel[223].setVisible(false);
                gm.h.menu(222);
                break;
            case 223:
                gm.ui.bgPanel[224].setVisible(false);
                gm.h.menu(223);
                break;
            case 224:
                gm.ui.bgPanel[225].setVisible(false);
                gm.h.menu(224);
                break;
            case 225:
                gm.ui.bgPanel[226].setVisible(false);
                gm.h.menu(225);
                break;
            case 226:
                gm.ui.bgPanel[227].setVisible(false);
                gm.h.menu(226);
                break;
            case 227:
                gm.ui.bgPanel[228].setVisible(false);
                gm.h.menu(227);
                break;
            case 228:
                gm.ui.bgPanel[229].setVisible(false);
                gm.h.menu(228);
                break;
            case 229:
                gm.ui.bgPanel[230].setVisible(false);
                gm.h.menu(229);
                break;
            case 230:
                gm.ui.bgPanel[231].setVisible(false);
                gm.h.menu(230);
                break;
            case 231:
                gm.ui.bgPanel[232].setVisible(false);
                gm.h.menu(231);
                break;
            case 232:
                gm.ui.bgPanel[233].setVisible(false);
                gm.h.menu(232);
                break;
            case 233:
                gm.ui.bgPanel[234].setVisible(false);
                gm.h.menu(233);
                break;
            case 234:
                gm.ui.bgPanel[235].setVisible(false);
                gm.h.menu(234);
                break;
            case 235:
                gm.ui.bgPanel[236].setVisible(false);
                gm.h.menu(235);
                break;
            case 236:
                gm.ui.bgPanel[237].setVisible(false);
                gm.h.menu(236);
                break;
            case 237:
                gm.ui.bgPanel[238].setVisible(false);
                gm.h.menu(237);
                break;
            case 238:
                gm.ui.bgPanel[239].setVisible(false);
                gm.h.menu(238);
                break;
            case 239:
                gm.ui.bgPanel[240].setVisible(false);
                gm.h.menu(239);
                break;
            case 240:
                gm.ui.bgPanel[241].setVisible(false);
                gm.h.menu(240);
                break;
            case 241:
                gm.ui.bgPanel[242].setVisible(false);
                gm.h.menu(241);
                break;
            case 242:
                gm.ui.bgPanel[243].setVisible(false);
                gm.h.menu(242);
                break;
            case 243:
                gm.ui.bgPanel[244].setVisible(false);
                gm.h.menu(243);
                break;
            case 244:
                gm.ui.bgPanel[245].setVisible(false);
                gm.h.menu(244);
                break;
            case 245:
                gm.ui.bgPanel[246].setVisible(false);
                gm.h.menu(245);
                break;
            case 246:
                gm.ui.bgPanel[247].setVisible(false);
                gm.h.menu(246);
                break;
            case 247:
                gm.ui.bgPanel[248].setVisible(false);
                gm.h.menu(247);
                break;
            case 248:
                gm.ui.bgPanel[249].setVisible(false);
                gm.h.menu(248);
                break;
            case 249:
                gm.ui.bgPanel[250].setVisible(false);
                gm.h.menu(249);
                break;
            case 250:
                gm.ui.bgPanel[251].setVisible(false);
                gm.h.menu(250);
                break;
            case 251:
                gm.ui.bgPanel[252].setVisible(false);
                gm.h.menu(251);
                break;
            case 252:
                gm.ui.bgPanel[253].setVisible(false);
                gm.h.menu(252);
                break;
            case 253:
                gm.ui.bgPanel[254].setVisible(false);
                gm.h.menu(253);
                break;
            case 254:
                gm.ui.bgPanel[255].setVisible(false);
                gm.h.menu(254);
                break;
            case 255:
                gm.ui.bgPanel[256].setVisible(false);
                gm.h.menu(255);
                break;
            case 256:
                gm.ui.bgPanel[257].setVisible(false);
                gm.h.menu(256);
                break;
            case 257:
                gm.ui.bgPanel[258].setVisible(false);
                gm.h.menu(257);
                break;
            case 258:
                gm.ui.bgPanel[259].setVisible(false);
                gm.h.menu(258);
                break;
            case 259:
                gm.ui.bgPanel[260].setVisible(false);
                gm.h.menu(259);
                break;
            case 260:
                gm.ui.bgPanel[261].setVisible(false);
                gm.h.menu(260);
                break;
            case 261:
                gm.ui.bgPanel[262].setVisible(false);
                gm.h.menu(261);
                break;
            case 262:
                gm.ui.bgPanel[263].setVisible(false);
                gm.h.menu(262);
                break;
            case 263:
                gm.ui.bgPanel[264].setVisible(false);
                gm.h.menu(263);
                break;
            case 264:
                gm.ui.bgPanel[265].setVisible(false);
                gm.h.menu(264);
                break;
            case 265:
                gm.ui.bgPanel[266].setVisible(false);
                gm.h.menu(265);
                break;
            case 266:
                gm.ui.bgPanel[267].setVisible(false);
                gm.h.menu(266);
                break;
            case 267:
                gm.ui.bgPanel[268].setVisible(false);
                gm.h.menu(267);
                break;
            case 268:
                gm.ui.bgPanel[269].setVisible(false);
                gm.h.menu(268);
                break;
            case 269:
                gm.ui.bgPanel[270].setVisible(false);
                gm.h.menu(269);
                break;
            case 270:
                gm.ui.bgPanel[271].setVisible(false);
                gm.h.menu(270);
                break;
            case 271:
                gm.ui.bgPanel[272].setVisible(false);
                gm.h.menu(271);
                break;
            case 272:
                gm.ui.bgPanel[273].setVisible(false);
                gm.h.menu(272);
                break;
            case 273:
                gm.ui.bgPanel[274].setVisible(false);
                gm.h.menu(273);
                break;
            case 274:
                gm.ui.bgPanel[275].setVisible(false);
                gm.h.menu(274);
                break;
            case 275:
                gm.ui.bgPanel[276].setVisible(false);
                gm.h.menu(275);
                break;
            case 276:
                gm.ui.bgPanel[277].setVisible(false);
                gm.h.menu(276);
                break;
            case 277:
                gm.ui.bgPanel[278].setVisible(false);
                gm.h.menu(277);
                break;
            case 278:
                gm.ui.bgPanel[279].setVisible(false);
                gm.h.menu(278);
                break;
            case 279:
                gm.ui.bgPanel[280].setVisible(false);
                gm.h.menu(279);
                break;
            case 280:
                gm.ui.bgPanel[281].setVisible(false);
                gm.h.menu(280);
                break;
            case 281:
                gm.ui.bgPanel[282].setVisible(false);
                gm.h.menu(281);
                break;
            case 282:
                gm.ui.bgPanel[283].setVisible(false);
                gm.h.menu(282);
                break;
            case 283:
                gm.ui.bgPanel[284].setVisible(false);
                gm.h.menu(283);
                break;
            case 284:
                gm.ui.bgPanel[285].setVisible(false);
                gm.h.menu(284);
                break;
            case 285:
                gm.ui.bgPanel[286].setVisible(false);
                gm.h.menu(285);
                break;
            case 286:
                gm.ui.bgPanel[287].setVisible(false);
                gm.h.menu(286);
                break;
            case 287:
                gm.ui.bgPanel[288].setVisible(false);
                gm.h.menu(287);
                break;
            case 288:
                gm.ui.bgPanel[289].setVisible(false);
                gm.h.menu(288);
                break;
            case 289:
                gm.ui.bgPanel[290].setVisible(false);
                gm.h.menu(289);
                break;
            case 290:
                gm.ui.bgPanel[291].setVisible(false);
                gm.h.menu(290);
                break;
            case 291:
                gm.ui.bgPanel[292].setVisible(false);
                gm.h.menu(291);
                break;
            case 292:
                gm.ui.bgPanel[293].setVisible(false);
                gm.h.menu(292);
                break;
            case 293:
                gm.ui.bgPanel[294].setVisible(false);
                gm.h.menu(293);
                break;
            case 294:
                gm.ui.bgPanel[295].setVisible(false);
                gm.h.menu(294);
                break;
            case 295:
                gm.ui.bgPanel[296].setVisible(false);
                gm.h.menu(295);
                break;
            case 296:
                gm.ui.bgPanel[297].setVisible(false);
                gm.h.menu(296);
                break;
            case 297:
                gm.ui.bgPanel[298].setVisible(false);
                gm.h.menu(297);
                break;
            case 298:
                gm.ui.bgPanel[299].setVisible(false);
                gm.h.menu(298);
                break;
            case 299:
                gm.ui.bgPanel[300].setVisible(false);
                gm.h.menu(299);
                break;
            case 300:
                gm.ui.bgPanel[301].setVisible(false);
                gm.h.menu(300);
                break;
            case 301:
                gm.ui.bgPanel[302].setVisible(false);
                gm.h.menu(301);
                break;
            case 302:
                gm.ui.bgPanel[303].setVisible(false);
                gm.h.menu(302);
                break;
            case 303:
                gm.ui.bgPanel[304].setVisible(false);
                gm.h.menu(303);
                break;
            case 304:
                gm.ui.bgPanel[305].setVisible(false);
                gm.h.menu(304);
                break;
            case 305:
                gm.ui.bgPanel[306].setVisible(false);
                gm.h.menu(305);
                break;
            case 306:
                gm.ui.bgPanel[307].setVisible(false);
                gm.h.menu(306);
                break;
            case 307:
                gm.ui.bgPanel[308].setVisible(false);
                gm.h.menu(307);
                break;
            case 308:
                gm.ui.bgPanel[309].setVisible(false);
                gm.h.menu(308);
                break;
            case 309:
                gm.ui.bgPanel[310].setVisible(false);
                gm.h.menu(309);
                break;
            case 310:
                gm.ui.bgPanel[311].setVisible(false);
                gm.h.menu(310);
                break;
            case 311:
                gm.ui.bgPanel[312].setVisible(false);
                gm.h.menu(311);
                break;
            case 312:
                gm.ui.bgPanel[313].setVisible(false);
                gm.h.menu(312);
                break;
            case 313:
                gm.ui.bgPanel[314].setVisible(false);
                gm.h.menu(313);
                break;
            case 314:
                gm.ui.bgPanel[315].setVisible(false);
                gm.h.menu(314);
                break;
            case 315:
                gm.ui.bgPanel[316].setVisible(false);
                gm.h.menu(315);
                break;
            case 316:
                gm.ui.bgPanel[317].setVisible(false);
                gm.h.menu(316);
                break;
            case 317:
                gm.ui.bgPanel[318].setVisible(false);
                gm.h.menu(317);
                break;
            case 318:
                gm.ui.bgPanel[319].setVisible(false);
                gm.h.menu(318);
                break;
            case 319:
                gm.ui.bgPanel[320].setVisible(false);
                gm.h.menu(319);
                break;
            case 320:
                gm.ui.bgPanel[321].setVisible(false);
                gm.h.menu(320);
                break;
            case 321:
                gm.ui.bgPanel[322].setVisible(false);
                gm.h.menu(321);
                break;
            case 322:
                gm.ui.bgPanel[323].setVisible(false);
                gm.h.menu(322);
                break;
            case 323:
                gm.ui.bgPanel[324].setVisible(false);
                gm.h.menu(323);
                break;
            case 324:
                gm.ui.bgPanel[325].setVisible(false);
                gm.h.menu(324);
                break;
            case 325:
                gm.ui.bgPanel[326].setVisible(false);
                gm.h.menu(325);
                break;
            case 326:
                gm.ui.bgPanel[327].setVisible(false);
                gm.h.menu(326);
                break;
            case 327:
                gm.ui.bgPanel[328].setVisible(false);
                gm.h.menu(327);
                break;
            case 328:
                gm.ui.bgPanel[329].setVisible(false);
                gm.h.menu(328);
                break;
            case 329:
                gm.ui.bgPanel[330].setVisible(false);
                gm.h.menu(329);
                break;
            case 330:
                gm.ui.bgPanel[331].setVisible(false);
                gm.h.menu(330);
                break;
            case 331:
                gm.ui.bgPanel[332].setVisible(false);
                gm.h.menu(331);
                break;
            case 332:
                gm.ui.bgPanel[333].setVisible(false);
                gm.h.menu(332);
                break;
            case 333:
                gm.ui.bgPanel[334].setVisible(false);
                gm.h.menu(333);
                break;
            case 334:
                gm.ui.bgPanel[335].setVisible(false);
                gm.h.menu(334);
                break;
            case 335:
                gm.ui.bgPanel[336].setVisible(false);
                gm.h.menu(335);
                break;
            case 336:
                gm.ui.bgPanel[337].setVisible(false);
                gm.h.menu(336);
                break;
            case 337:
                gm.ui.bgPanel[338].setVisible(false);
                gm.h.menu(337);
                break;
            case 338:
                gm.ui.bgPanel[339].setVisible(false);
                gm.h.menu(338);
                break;
            case 339:
                gm.ui.bgPanel[340].setVisible(false);
                gm.h.menu(339);
                break;
            case 340:
                gm.ui.bgPanel[341].setVisible(false);
                gm.h.menu(340);
                break;
            case 341:
                gm.ui.bgPanel[342].setVisible(false);
                gm.h.menu(341);
                break;
            case 342:
                gm.ui.bgPanel[343].setVisible(false);
                gm.h.menu(342);
                break;
            case 343:
                gm.ui.bgPanel[344].setVisible(false);
                gm.h.menu(343);
                break;
            case 344:
                gm.ui.bgPanel[345].setVisible(false);
                gm.h.menu(344);
                break;
            case 345:
                gm.ui.bgPanel[346].setVisible(false);
                gm.h.menu(345);
                break;
            case 346:
                gm.ui.bgPanel[347].setVisible(false);
                gm.h.menu(346);
                break;
            case 347:
                gm.ui.bgPanel[348].setVisible(false);
                gm.h.menu(347);
                break;
            case 348:
                gm.ui.bgPanel[349].setVisible(false);
                gm.h.menu(348);
                break;
            case 349:
                gm.ui.bgPanel[350].setVisible(false);
                gm.h.menu(349);
                break;
            case 350:
                gm.ui.bgPanel[351].setVisible(false);
                gm.h.menu(350);
                break;
            case 351:
                gm.ui.bgPanel[352].setVisible(false);
                gm.h.menu(351);
                break;
            case 352:
                gm.ui.bgPanel[353].setVisible(false);
                gm.h.menu(352);
                break;
            case 353:
                gm.ui.bgPanel[354].setVisible(false);
                gm.h.menu(353);
                break;
            case 354:
                gm.ui.bgPanel[355].setVisible(false);
                gm.h.menu(354);
                break;
            case 355:
                gm.ui.bgPanel[356].setVisible(false);
                gm.h.menu(355);
                break;
            case 356:
                gm.ui.bgPanel[357].setVisible(false);
                gm.h.menu(356);
                break;
            case 357:
                gm.ui.bgPanel[358].setVisible(false);
                gm.h.menu(357);
                break;
            case 358:
                gm.ui.bgPanel[359].setVisible(false);
                gm.h.menu(358);
                break;
            case 359:
                gm.ui.bgPanel[360].setVisible(false);
                gm.h.menu(359);
                break;
            case 360:
                gm.ui.bgPanel[361].setVisible(false);
                gm.h.menu(360);
                break;
            case 361:
                gm.ui.bgPanel[362].setVisible(false);
                gm.h.menu(361);
                break;
            case 362:
                gm.ui.bgPanel[363].setVisible(false);
                gm.h.menu(362);
                break;
            case 363:
                gm.ui.bgPanel[364].setVisible(false);
                gm.h.menu(363);
                break;
            case 364:
                gm.ui.bgPanel[365].setVisible(false);
                gm.h.menu(364);
                break;
            case 365:
                gm.ui.bgPanel[366].setVisible(false);
                gm.h.menu(365);
                break;
            case 366:
                gm.ui.bgPanel[367].setVisible(false);
                gm.h.menu(366);
                break;
            case 367:
                gm.ui.bgPanel[368].setVisible(false);
                gm.h.menu(367);
                break;
            case 368:
                gm.ui.bgPanel[369].setVisible(false);
                gm.h.menu(368);
                break;
            case 369:
                gm.ui.bgPanel[370].setVisible(false);
                gm.h.menu(369);
                break;
            case 370:
                gm.ui.bgPanel[371].setVisible(false);
                gm.h.menu(370);
                break;
            case 371:
                gm.ui.bgPanel[372].setVisible(false);
                gm.h.menu(371);
                break;
            case 372:
                gm.ui.bgPanel[373].setVisible(false);
                gm.h.menu(372);
                break;
            case 373:
                gm.ui.bgPanel[374].setVisible(false);
                gm.h.menu(373);
                break;
            case 374:
                gm.ui.bgPanel[375].setVisible(false);
                gm.h.menu(374);
                break;
            case 375:
                gm.ui.bgPanel[376].setVisible(false);
                gm.h.menu(375);
                break;
            case 376:
                gm.ui.bgPanel[377].setVisible(false);
                gm.h.menu(376);
                break;
            case 377:
                gm.ui.bgPanel[378].setVisible(false);
                gm.h.menu(377);
                break;
            case 378:
                gm.ui.bgPanel[379].setVisible(false);
                gm.h.menu(378);
                break;
            case 379:
                gm.ui.bgPanel[380].setVisible(false);
                gm.h.menu(379);
                break;
            case 380:
                gm.ui.bgPanel[381].setVisible(false);
                gm.h.menu(380);
                break;
            case 381:
                gm.ui.bgPanel[382].setVisible(false);
                gm.h.menu(381);
                break;
            case 382:
                gm.ui.bgPanel[383].setVisible(false);
                gm.h.menu(382);
                break;
            case 383:
                gm.ui.bgPanel[384].setVisible(false);
                gm.h.menu(383);
                break;
            case 384:
                gm.ui.bgPanel[385].setVisible(false);
                gm.h.menu(384);
                break;
            case 385:
                gm.ui.bgPanel[386].setVisible(false);
                gm.h.menu(385);
                break;
            case 386:
                gm.ui.bgPanel[387].setVisible(false);
                gm.h.menu(386);
                break;
            case 387:
                gm.ui.bgPanel[388].setVisible(false);
                gm.h.menu(387);
                break;
            case 388:
                gm.ui.bgPanel[389].setVisible(false);
                gm.h.menu(388);
                break;
            case 389:
                gm.ui.bgPanel[390].setVisible(false);
                gm.h.menu(389);
                break;
            case 390:
                gm.ui.bgPanel[391].setVisible(false);
                gm.h.menu(390);
                break;
            case 391:
                gm.ui.bgPanel[392].setVisible(false);
                gm.h.menu(391);
                break;
            case 392:
                gm.ui.bgPanel[393].setVisible(false);
                gm.h.menu(392);
                break;
            case 393:
                gm.ui.bgPanel[394].setVisible(false);
                gm.h.menu(393);
                break;
            case 394:
                gm.ui.bgPanel[395].setVisible(false);
                gm.h.menu(394);
                break;
            case 395:
                gm.ui.bgPanel[396].setVisible(false);
                gm.h.menu(395);
                break;
            case 396:
                gm.ui.bgPanel[397].setVisible(false);
                gm.h.menu(396);
                break;
            case 397:
                gm.ui.bgPanel[398].setVisible(false);
                gm.h.menu(397);
                break;
            case 398:
                gm.ui.bgPanel[399].setVisible(false);
                gm.h.menu(398);
                break;
            case 399:
                gm.ui.bgPanel[400].setVisible(false);
                gm.h.menu(399);
                break;
            case 400:
                gm.ui.bgPanel[401].setVisible(false);
                gm.h.menu(400);
                break;

        }
    }
}
