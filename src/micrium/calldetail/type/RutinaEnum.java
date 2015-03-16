package micrium.calldetail.type;

public enum RutinaEnum {
	DIA("día"), MENSUAL("mes");
	private String rutina;

	private RutinaEnum(String rutina) {
		this.rutina = rutina;
	}

	@Override
	public String toString() {
		return rutina;
	}

	public static void main(String[] args) {
		System.out.println(RutinaEnum.DIA);
		System.out.println(RutinaEnum.MENSUAL);
	}
}
