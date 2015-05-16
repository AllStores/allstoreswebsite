package com.home.allstores.common;

import java.util.HashMap;
import java.util.Map;

public class WebsiteConstants
{
	public static final Map<String, String> JS_VERSION_MAP = new HashMap<String, String>();
	public static final Map<String, String> CSS_VERSION_MAP = new HashMap<String, String>();

	public static final String JS_VERSION_STRING = "jsVersion";
	public static final String CSS_VERSION_STRING = "cssVersion";

	public static final String HOME_VIEW_NAME = "index";
	public static final String MERCHANTS_VIEW_NAME = "merchantsView";
	public static final String FAQS_VIEW_NAME = "faqsView";
	public static final String PRIVACY_VIEW_NAME = "PrivacyView";
	public static final String DEVELOPER_VIEW_NAME = "developerView";
	public static final String ABOUT_US_VIEW_NAME = "aboutUsView";
	public static final String FEATURES_VIEW_NAME = "featuresView";
	public static final String PROMOTIONS_VIEW_NAME = "promotionsView";
	public static final String FKTNC_VIEW_NAME = "fktncView";

	public static final String SITE_MAP_VIEW_NAME = "siteMap";
	public static final String PRICING_VIEW_NAME = "pricingView";
	public static final String MERCHANT_OVERVIEW_VIEW_NAME = "merchantOverviewView";
	public static final String SANDBOX_VIEW_NAME = "sandboxView";
	public static final String APIDOC_VIEW_NAME = "apiDocView";
	public static final String TERMS_VIEW_NAME = "TermsView";
	public static final String OFFERS_VIEW_NAME = "offersView";
	public static final String MMT_OFFERS_VIEW_NAME = "mmtOffersView";
	public static final String SELECT_MERCHANTS_VIEW_NAME = "selectMerchants";
	public static final String HASH_GEN_VIEW_NAME = "hashGeneration";
	public static final String TECH_GUIDE_VIEW_NAME = "techGuide";

	public static final String HOME_API_URL = "/home";
	public static final String SEARCH_RESULT_PAGE_URL = "/searchresults";
	public static final String FETCH_STORES_METADATA_URL = "/fetchStoresMetadata";
	public static final String SEARCH_BAR_URL = "/searchbar";
	public static final String LEFT_SIDE_BAR_VIEW = "/leftsidebar";
	public static final String RIGHT_SIDE_BAR_VIEW = "/rightsidebar";
	public static final String NO_SIDE_BAR_VIEW = "/nosidebar";
	public static final String INDEX_API_URL = "/";
	public static final String CONTACT_US_API_URL = "/contactusapi";
	public static final String MERCHANT_API_URL = "/merchant";
	public static final String FAQS_API_URL = "/faqs";
	public static final String PRIVACY_URL = "/privacypolicy";
	public static final String DEVELOPER_URL = "/developers";
	public static final String SITE_MAP_API_URL = "/sitemap.xml";
	public static final String PRICING_URL = "/pricing";
	public static final String MERCHANT_OVERVIEW_URL = "/merchants";
	public static final String SANDBOX_URL = "/sandbox";
	public static final String ABOUT_US_URL = "/aboutus";
	public static final String FEATURES_URL = "/features";
	public static final String APIDOC_URL = "/apidoc";
	public static final String TERMS_URL = "/tou";
	public static final String PROMOTIONS_URL = "/getstartednow";
	public static final String OFFERS_URL = "/offers";
	public static final String MMT_OFFERS = "/mmtoffers";
	public static final String FKTNC_URL = "/flipkartoffertnc";
	public static final String SELECT_MERCHANTS_URL = "/selectmerchants";
	public static final String HASH_GEN_URL = "/hashgeneration";
	public static final String TECH_GUIDE_URL = "/integrationfaqs";


	public static final String WEBSITE_TECHNICAL_ERROR = "Website Technical error.";
	public static final String DB_CONFIG_FILE = "DBConfig.properties";

	public static final String REGX_WHITELIST_NAME = "A-Za-z ";
	public static final String REGX_WHITELIST_EMAIL = "A-Za-z0-9_.\\@\\-";
	public static final String REGX_WHITELIST_MOBILE = "0-9 +.-";
	public static final String REGX_WHITELIST_URL = "A-Za-z0-9:.?_/\\-\\#\\=";
	public static final String REGX_WHITELIST_TEXTCHARACTERS = "A-Za-z0-9 ._\\-:\\#!@$^*()+=\\[\\]{}|;,?/'";

	public static final int MAX_LENGTH_15 = 15;
	public static final int MAX_LENGTH_50 = 50;
	public static final int MAX_LENGTH_100 = 100;
	public static final int MAX_LENGTH_400 = 400;
	public static final String XFRAME_OPTION = "XFRAME_OPTION";
	public static final String CSRF_TOKEN_KEY = "CSRF_TOKEN_KEY";

}
