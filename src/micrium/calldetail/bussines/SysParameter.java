package micrium.calldetail.bussines;

import java.util.Properties;
import micrium.calldetail.dato.ConectionManager;
import micrium.calldetail.model.TBolParametroDAO;
import micrium.calldetail.result.Result;

import org.apache.log4j.Logger;

public class SysParameter {

	public static final String MAIL = "mail";
//-----------------------------------------------------
	public static final String MAIL_SMTP_HOST = "ENVIO CORREO01";
	public static final String MAIL_SMTP_USER_NAME = "ENVIO CORREO02";
	public static final String MAIL_SMTP_PORT = "ENVIO CORREO03";
	public static final String MAIL_SMTP_AUTH = "ENVIO CORREO04";
	public static final String MAIL_SMTP_STARTTLS_ENABLE = "ENVIO CORREO05";
	public static final String MAIL_SMTP_SSL_ENABLE = "ENVIO CORREO06";
	public static final String MAIL_SMTP_USER = "ENVIO CORREO07";
	public static final String MAIL_SMTP_PASSWORD = "ENVIO CORREO08";
	public static final String MAIL_SMTP_FROM = "ENVIO CORREO09";
	public static final String MAIL_SEPARATOR = "ENVIO CORREO10";

	public static final String EXPRESION_LINEAX = "DETALLE LLAMADAS01";
	public static final String EXPRESION_EMAIL = "DETALLE LLAMADAS02";
	public static final String EXPRESION_IP = "DETALLE LLAMADAS03";

	public static final String WSDL_DETALLE = "DETALLE LLAMADAS04";
	public static final String WS_DETALLE_SSL = "DETALLE LLAMADAS05";
	public static final String WS_DETALLE_KEYSTORE = "DETALLE LLAMADAS06";
	public static final String WS_DETALLE_IP = "DETALLE LLAMADAS07";
	public static final String WS_DETALLE_PUERTO = "DETALLE LLAMADAS08";
	public static final String PATH_DETALLE_LLAMADAS = "DETALLE LLAMADAS09";
	public static final String PATH_DETALLE_SAC_PDF = "34";
	public static final String PATH_DETALLE_LEGAL_PDF = "35";
	public static final String PATH_DETALLE_TELEGROUP_PDF = "36";
	public static final String PATH_DETALLE_TELEGROUP_CONCOSTO_PDF = "37";

	public static final String TIPOSOLICITUD_QUINCENAL = "TIPO SOLICITUD JAVA01";
	public static final String TIPOSOLICITUD_WEEKLY = "TIPO SOLICITUD JAVA02";
	public static final String TIPOSOLICITUD_BIMONTHLY = "TIPO SOLICITUD JAVA03";
	public static final String TIPOSOLICITUD_MONTHLY = "TIPO SOLICITUD JAVA04";
	
	public static final String PATH_DETALLE_SAC_XLS = "42";
	public static final String PATH_DETALLE_LEGAL_XLS = "43";
	public static final String PATH_DETALLE_TELEGROUP_XLS = "44";
	public static final String PATH_DETALLE_TELEGROUP_CONCOSTO_XLS = "45";

	public static final String PARTICION_TAMANO = "DETALLE LLAMADAS10";
	public static final String COUNT_THREAD = "DETALLE LLAMADAS11";

	public static final String RPT_DETALLE_SAC_TITLE = "DETALLE LLAMADAS25";
	public static final String RPT_DETALLE_LEGAL_TITLE = "56";
	public static final String RPT_DETALLE_TELEGROUP_TITLE = "57";
	public static final String RPT_DETALLE_TELEGROUP_CONCOSTO_TITLE = "58";
	public static final String APP_USER = "DETALLE LLAMADAS12";
	public static final String APP_PASSWORD = "DETALLE LLAMADAS13";

	public static final String TIPO_DOCUMENTO = "DETALLE LLAMADAS24";
	public static final String ESTADO_PEN = "ESTADO DETALLEPEN";
	public static final String ESTADO_EPP = "ESTADO DETALLEEPP";
	public static final String ESTADO_ENV = "ESTADO DETALLEENV";
	public static final String ESTADO_EPR = "ESTADO DETALLEEPR";
	public static final String ESTADO_EPV = "ESTADO DETALLEEPV";
	public static final String ESTADO_EPM = "ESTADO DETALLEEPM";
	public static final String ESTADO_REN = "ESTADO DETALLEREN";
	public static final String ESTADO_EPVO = "ESTADO DETALLEEPVO";
	public static final String TEMPLATE_ENVIO = "DETALLE LLAMADAS29";
	public static final String PROGRAMACION_TAREA = "DETALLE LLAMADAS30";
	public static final String CONSOLIDADO_SAC_SLEEP = "DETALLE LLAMADAS14";
	public static final String CONSOLIDADO_SAC_TIMEOUT = "DETALLE LLAMADAS15";
	public static final String CONSOLIDADO_SAC_CANTIDAD_DETALLE_PAGINA = "DETALLE LLAMADAS16";
	
	public static final String TIPO_PERIODICIDAD_S = "TYPE TICKET1";
	public static final String TIPO_PERIODICIDAD_N = "TYPE TICKET2";

	public static final String DETALLE_OBTENER_CORREOS_PENDIENTES_SLEEP = "101";

	public static final String PATH_DETALLE_TAG = "{id}";

	public static Properties properties;

	private static final Logger log = Logger.getLogger(SysParameter.class);

	public static Result load(ConectionManager conectionManager) {
		log.info("Vamos a cargar los parametros del sistema al properties.");

		Result result = new Result();
		properties = TBolParametroDAO.findAll(conectionManager);

		if (properties.isEmpty()) {
			log.info("No hay parametros en la base de datos.");
			result.error("No hay parametros en la base de datos.");
		}

		log.info("Los paramaetros fueron cargados satisfactoriamente.");
		result.ok("Los paramaetros fueron cargados satisfactoriamente.");
		return result;
	}

	public static boolean isEmpty() {
		return properties.isEmpty();
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

}
