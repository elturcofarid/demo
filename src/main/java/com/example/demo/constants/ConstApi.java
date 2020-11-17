package com.example.demo.constants;

public class ConstApi {
	
	
	private ConstApi() {
		super();
	}
	
	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String G_PARAM_FTP = "HOST";
	public static final String G_PARAM_PORT = "PORT";
	public static final String G_STOCK_SECURITY = "STOCK_SECURITY";
	public static final String G_PARAM_CRON_JOB_FILE = "CRON_JOB_FILE";
	public static final String URL_FILE_RAPPI = "/resource/files/";
	public static final String URL_FILE_RAPPI_CONT = "/fileftp/";
	public static final String URL_FILE_SSH = "/resource/ssh/kalunga_co_pem";
	public static final String EXP_TOKEN_MS = "EXP_TOKEN_MS";
	public static final int EXP_TOKEN_MS_DEFAULT = 3600000;
	public static final String ONLINE_TOKEN = "ONLINE_TOKEN";
	public static final String ONLINE_ENDPOINT = "ONLINE_ENDPOINT";

	public static final String DEFAULT_ROLE = "PLANNER";
	public static final String ID_TOKEN = "REDI-GCO";
	public static final String AUTHORITIES = "authorities";
	private static final String [] HEADER_FILE_CSV  = {"Referencia_Aliado","Sku","Nombre","Descripcion","Marca","Stock","Tienda","Precio_Por_Tienda","Precio_con_Descuento","Descuento","Fecha_Inicio_Descuento","Fecha_Fin_Descuento","Categoria_Producto_1","Categoria_Producto_2","Categoria_Producto_3","Categoria_Producto_4","Imagen_de_Producto","Categoria_Combinacion","Nombre_Combinacion"};
	
	public static final String USER_API = "user/api";
	public static final String USER_API_GET = "/get";
	public static final String USER_API_POST = "/save";
	public static final String USER_API_DELETE = "/delete";
	public static final String USER_API_PUT = "/update";
	public static final String USER_API_LOGIN = "/auth";
	
	public static final String COMMERCIAL_CONDITION_API = "commercial/api";
	public static final String COMMERCIAL_CONDITION_API_GET = "/get";
	public static final String COMMERCIAL_CONDITION_API_POST = "/save";
	public static final String COMMERCIAL_CONDITION_API_DELETE = "/delete";
	public static final String COMMERCIAL_CONDITION_API_PUT = "/update";
	public static final String COMMERCIAL_CONDITION_API_GET_BY_BRAND_CODE = "/getByBrandCode";
	
	public static final String COMMERCIAL_CONDITION_AUDIT_API = "commercialAudit/api";
	public static final String COMMERCIAL_CONDITION_AUDIT_API_SAVE = "/save";
	
	public static final String PRODUCT_REDI_API = "product/api";
	public static final String PRODUCT_REDI_API_GET = "/get";
	public static final String PRODUCT_REDI_API_SAVE = "/save";
	public static final String PRODUCT_REDI_API_PUT = "/put";	
	public static final String PRODUCT_REDI_API_GET_PREVIEW = "/getPreview";
	public static final String PRODUCT_REDI_API_GET_PREVIEW_ALL = "/getPreviewAll";
	
	public static final String PRODUCT_Y2_API = "productY2/api";
	public static final String PRODUCT_Y2_API_GET_LIST = "/getList";
	
	public static final String PRODUCT_PUBLISH_API_SAVE = "/publish/save";
	public static final String PRODUCT_PUBLISH = "productPublish/api";
	public static final String PRODUCT_PUBLISH_LIST = "/getList";
	public static final String PRODUCT_PUBLISH_REF_LIST = "/getRefList";
	public static final String PRODUCT_PUBLISH_LIST_IS_PUBLISH = "/getListIsPublish";
	public static final String PRODUCT_PUBLISH_REF_LISTIS_PUBLISH = "/getRefListIsPublish";
	public static final String PRODUCT_REDI_API_GET_LIST = "/productRedi/getList";
	
	public static final String AUDIT_CREATE = "CREATE";
	public static final String AUDIT_UPDATE = "UPDATE";
	public static final String AUDIT_DELETE = "DELETE";
	
	public static String[] getHeaderFileCsv() {
		return HEADER_FILE_CSV;
	}

}
