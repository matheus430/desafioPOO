package iphone;

import desafioPOOiphone.functions.browser.BrowserInternet;
import desafioPOOiphone.functions.player.MusicPlayer;
import desafioPOOiphone.functions.telephone.Telephone;
import desafioPOOiphone.functions.multifunction.MultiFunction;

public class Iphone {
	public static void main(String[] args) {
		BrowserInternet safari = new BrowserInternet();
		MusicPlayer ipod = new MusicPlayer();
		Telephone tel = new Telephone();
		
		safari.openCloseBrowser();
		ipod.playStopMusic();
		tel.receiveSendCall();
		
		MultiFunction mf = new MultiFunction();
		
		MultiFunction mp = mf;
		MultiFunction bi = mf;
		MultiFunction tp = mf;
		
		mp.playStopMusic();
		bi.openCloseBrowser();
		tp.receiveSendCall();
		
	}
}
