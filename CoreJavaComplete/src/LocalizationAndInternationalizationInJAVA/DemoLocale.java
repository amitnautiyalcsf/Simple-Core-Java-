package LocalizationAndInternationalizationInJAVA;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoLocale {

	public static void main(String[] args) {

		// L10N => Localization // we have 10 character between L to N
		// I18N=> Internationalization // we have 18 character betwen I to N

		// We have to use two classes

		// 1.Locale
		// 2.ResourceBundle ==> Package = java.util.*;

//		String lang="en";
//		String country="US";
//		
		
//		String lang="ge";
//		String country="GE";
		
		String lang="hi";
		String country="IN";
		
		Locale l = new Locale(lang,country);
		ResourceBundle r = ResourceBundle.getBundle("LocalizationAndInternationalizationInJAVA/Resource", l);
		
	
		String str= r.getString("wish"); 
		System.out.println(str);

	}

}
