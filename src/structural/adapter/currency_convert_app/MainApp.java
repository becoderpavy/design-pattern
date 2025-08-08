package structural.adapter.currency_convert_app;

import structural.adapter.currency_convert_app.adapter.InrToUsdAdapter;
import structural.adapter.currency_convert_app.api.ThirdPartyCurrenyApiUsd;
import structural.adapter.currency_convert_app.service.CurrencyConverter;

public class MainApp {
	public static void main(String[] args) {
		CurrencyConverter cc=new InrToUsdAdapter(new ThirdPartyCurrenyApiUsd());
		cc.convert(200.00);
	}
}
