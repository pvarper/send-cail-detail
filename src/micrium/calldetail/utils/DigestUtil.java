package micrium.calldetail.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

public class DigestUtil extends DigestUtils {

	public static String generarHash(String pathname) throws Exception {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(pathname));
			return DigestUtil.md5Hex(fis);
		} catch (Exception e) {
			throw new Exception("Error al generar el hash del archivo " + pathname, e);
		} finally {
			IOUtils.closeQuietly(fis);
		}
	}

	/**
	 * @soaparam args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 149eac80b09a62fd2a8b3d0390a012ae
		// 149eac80b09a62fd2a8b3d0390a012ae
	}
}
