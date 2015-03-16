/*-*
 *
 * FILENAME  :
 *    TipoPapelEnum.java
 *
 * STATUS  :	
 *    2013 00:21:18  
 *
 *    
 * Copyright (c) 2012 SystemSoft Ltda. All rights reserved.
 *
 ****************************************************************/

package micrium.calldetail.type;

/**
 * 72 pixel -> 1 Inc
 * 
 * @author Mario
 */
public enum TipoPapelEnum {

	CARTA(1, 612, 792), MEDIA_CARTA(2, 612, 396), CARTA_HORIZONTAL(5, 792, 612), OFICIO(3, 612, 936), MEDIO_OFICIO(4, 612, 468), OFICIO_HORIZONTAL(6,
			936, 612);

	private final int tipoHojaId;

	private final int pageWidth;

	private final int pageHeight;

	private TipoPapelEnum(int tipoHojaId, int pageWidth, int pageHeight) {
		this.tipoHojaId = tipoHojaId;
		this.pageHeight = pageHeight;
		this.pageWidth = pageWidth;
	}

	public int getTipoHojaId() {
		return tipoHojaId;
	}

	public int getPageWidth() {
		return pageWidth;
	}

	public int getPageHeight() {
		return pageHeight;
	}

	public static TipoPapelEnum fromId(int tipoHojaId) {
		for (TipoPapelEnum tipoPapel : values()) {
			if (tipoPapel.tipoHojaId == tipoHojaId) {
				return tipoPapel;
			}
		}
		return CARTA;
	}

}
