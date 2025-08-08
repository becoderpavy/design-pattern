package structural.adapter.currency_convert_app.adapter;

import structural.adapter.currency_convert_app.api.ThirdPartyCurrenyApiUsd;
import structural.adapter.currency_convert_app.service.CurrencyConverter;

public class InrToUsdAdapter implements CurrencyConverter {

	private final ThirdPartyCurrenyApiUsd usdApi;

	public InrToUsdAdapter(ThirdPartyCurrenyApiUsd usdApi) {
		super();
		this.usdApi = usdApi;
	}

	@Override
	public Double convert(Double amt) {
		double usd = usdApi.getUsd();
		System.out.println("Convert INR to USD =" + usd * amt);
		return usd * amt;
	}

}
